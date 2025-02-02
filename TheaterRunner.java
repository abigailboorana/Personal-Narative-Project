import org.code.theater.*;
import org.code.media.*;

public class TheaterRunner {
  public static void main(String[] args) {

  

    // 2D Array
    String[][] names = {
      {"thailand", "roblox"},
      {"chipotle", "watermelon"}
    };

    ImageFilter[][] images = {
      { new ImageFilter("thailand.png"), new ImageFilter("roblox.png") },
      { new ImageFilter("chipotle.png"), new ImageFilter("watermelon.png") }
    };

    // MyStory object
    MyStory scene = new MyStory(names, images);
    
    // Call drawScene
    scene.drawScene();
    
    // Play scene in Theater
    Theater.playScenes(scene);
    
  }
}
