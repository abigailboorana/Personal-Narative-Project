import org.code.theater.*;
import org.code.media.*;

public class ImageFilter extends ImagePlus {

    public ImageFilter(String filename) {
        super(filename);
    }

  // thermal filter that makes the picture look like different colors
  public void thermal() {
        Pixel[][] pixels = getImagePixels(); 
        for (int row = 0; row < pixels.length; row++) {
            for (int col = 0; col < pixels[0].length; col++) {
                Pixel currentPixel = pixels[row][col];
                
                int grayValue = currentPixel.getRed() + currentPixel.getGreen() + currentPixel.getBlue();
                grayValue /= 3;

                
                if (grayValue < 85) {
                    currentPixel.setRed(255); 
                    currentPixel.setBlue(0);
                } else if (grayValue < 170) {
                    currentPixel.setRed(0);
                    currentPixel.setGreen(255); 
                    currentPixel.setBlue(0);
                } else {
                    currentPixel.setRed(0);
                    currentPixel.setGreen(0);
                    currentPixel.setBlue(255); 
                }
            }
        }
    }

    // shifts the color of the picture to make it look saturated
    public void colorShift(int value) {
        Pixel[][] pixels = getPixelsFromImage(); 
        for (int row = 0; row < pixels.length; row++) {
            for (int col = 0; col < pixels[0].length; col++) {
                Pixel currentPixel = pixels[row][col];

                
                int newRed = currentPixel.getRed() + value;
                int newGreen = currentPixel.getGreen() + value;
                int newBlue = currentPixel.getBlue() + value;

                
                newRed = Math.min(Math.max(newRed, 0), 255);
                newGreen = Math.min(Math.max(newGreen, 0), 255);
                newBlue = Math.min(Math.max(newBlue, 0), 255);

                
                currentPixel.setRed(newRed);
                currentPixel.setGreen(newGreen);
                currentPixel.setBlue(newBlue);
            }
        }
    }

    // makes the image have a contrasted filter on top
    public void contrast(int multiplier) {
        Pixel[][] pixels = getPixelsFromImage(); 
        
        for (int row = 0; row < pixels.length; row++) {
            for (int col = 0; col < pixels[row].length; col++) {
                Pixel currentPixel = pixels[row][col];

            
                int newRed = currentPixel.getRed() * multiplier;
                int newGreen = currentPixel.getGreen() * multiplier;
                int newBlue = currentPixel.getBlue() * multiplier;

                
                newRed = Math.min(Math.max(newRed, 0), 255);
                newGreen = Math.min(Math.max(newGreen, 0), 255);
                newBlue = Math.min(Math.max(newBlue, 0), 255);

                
                currentPixel.setRed(newRed);
                currentPixel.setGreen(newGreen);
                currentPixel.setBlue(newBlue);
            }
        }
    }

    // turn the image to black and white method
    public void blackAndWhite() {
        Pixel[][] pixels = getPixelsFromImage(); 
        for (int row = 0; row < pixels.length; row++) {
            for (int col = 0; col < pixels[row].length; col++) {
                Pixel currentPixel = pixels[row][col];

                
                int red = currentPixel.getRed();
                int green = currentPixel.getGreen();
                int blue = currentPixel.getBlue();

                // calculates the grayscale value using a weighted average
                int grayValue = (int) (0.299 * red + 0.587 * green + 0.114 * blue);

                currentPixel.setRed(grayValue);
                currentPixel.setGreen(grayValue);
                currentPixel.setBlue(grayValue);
            }
        }
    }
}
