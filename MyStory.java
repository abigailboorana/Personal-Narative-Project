import org.code.theater.*;
import org.code.media.*;

public class MyStory extends Scene {

    private String[][] names;
    private ImageFilter[][] images;

    // Constructor that initializes the names and images arrays
    public MyStory(String[][] names, ImageFilter[][] images) {
        this.names = names;
        this.images = images;
    }

    public void drawScene() {
        drawTemplateScene();
    }

    // Method that handles the drawing of the scene
    public void drawTemplateScene() {
        int count = 0; // This will track the filters applied
        for (int row = 0; row < names.length; row++) {
            for (int col = 0; col < names[row].length; col++) {
                count++; // Increment count for each image

                // 1. Clear the scene / draw background
                clear("pink");

                // 2. Set any style (text size, font, font style, etc.)
                setTextHeight(35);
                setTextColor("white");
               
              

                // 3. Draw the text and images, play sounds
                drawText("Things I like: " + names[row][col], 20, 60);
                playSound("CHEERING_AND_CLAPPING_cct.wav"); // Ensure this file exists

                // Access the image from the 2D array of images
                ImageFilter currentImage = images[row][col]; // Access image filter object

                // Apply the filter based on the count
                if (count == 1) {
                    drawImage(currentImage, 100, 100, 200);
                    pause(1);
                    currentImage.blackAndWhite(); 
                } else if (count == 2) {
                    drawImage(currentImage, 100, 100, 200);
                    pause(1);
                    currentImage.thermal(); 
                } else if (count == 3) {
                    drawImage(currentImage, 100, 100, 200);
                    pause(1);
                    currentImage.contrast(50); 
                } else if (count == 4) {
                    drawImage(currentImage, 100, 100, 200);
                    pause(1);
                    currentImage.colorShift(50); 
                }

                // Draw the filtered image (ensure proper image size and position)
                drawImage(currentImage, 100, 100, 200); 
                pause(1); // Pause for 1 second before transitioning to the next filter/image
            }
        }
    }
}
