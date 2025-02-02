# Unit 4 - Personal Narrative

## Introduction

Images are often used to portray our personal experiences and interests. We also use image filters and effects to change or enhance the mood of an image. When combined into collages and presentations, these images tell a story about who we are and what is important to us. Your goal is to create a personal narrative using The Theater that consists of images of your personal experiences and/or interests, incorporates data related to these experiences and/or interests that can be organized in a 2D array, and uses image filters and effects to change or enhance the mood of your images.

## Requirements

Use your knowledge of object-oriented programming, two-dimensional (2D) arrays, and algorithms to create your personal narrative collage or animation:

- **Create at least two 2D arrays** – Create at least two 2D arrays to store the data that will make up your visualization.
- **Implement one or more algorithms** – Implement one or more algorithms that use loops and two-way or multi-selection statements with compound Boolean expressions to analyze the data.
- **Use Image Filters** - Include multiple image filters learned from this unit, and additionally create new ones of your own.
- **Use methods in the String class** – Use one or more methods in the String class in your program, such as to determine whether the name of an image file contains specific characters.
- **Create a visualization** – Create an image or animation that conveys the story of the data by illustrating the patterns or relationships in the data.
- **Document your code** – Use comments to explain the purpose of the methods and code segments and note any preconditions and postconditions.

## UML Diagram

![UML Diagram for my project](https://github.com/user-attachments/assets/f807365d-7814-4654-9530-1dc6dc655af5)

## Video

Click on the thumbnail below to watch a video of my project!

[![Thumbnail for my projet](https://github.com/user-attachments/assets/0e320038-5c95-4444-a5ea-3a46f34540ca)](https://youtu.be/VRfnwNJa-Rw?si=tQk3NGN213UzrE4G)

## Story Description

In my Personal Narrative Project, the animation highlights four things that I enjoy. The first image shows the flag of Thailand, representing my nationality (Thai). After it appears, a filter is applied to change the flag's colors from red, blue, and white to black and white. The second image is of my favorite game, Roblox, and the filter used here is a thermal effect, which displays varying heat differences in the image. The third image is of my favorite place to eat, Chipotle, with a contrast filter applied. This filter adjusts the difference between the light and dark areas of the image. Finally, the fourth image features my favorite fruit, watermelon, and it has a color shift filter applied. This filter alters the image's colors to give it a new aesthetic and color.

The data in my project represented by 2D arrays includes (String[][] names) and (ImageFilter[][] images). The names array stores the names of the things I like. The text is organized in rows and columns, allowing the program to cycle through them, directly relating to the story of my animation by visually showcasing my favorite things. The images array holds different images, each processed through various filters, creating an appealing visual effect. This array directly ties to the animation's story, as each image is enhanced with a unique filter, enriching the visual experience.

## Image Filter Analysis

# Black and White Filter
The black and white filter (which I created myself) converts an image to a grayscale by adjusting the RGB values of each pixel based on the weighted average. The process of creating this filter was first starting by accessing the pixels. To do this, I used hte getPixelsFromImage() method that provides a 2D array of the Pixel object. This contains the values of each of the three colors. After, I converted the RGB to a grayscale value by using the weighted average of each color. Then, I set each current color to the gray value. Overall, this filters results in the images with no color whatsoever. The darkers areas of the image will become black while the lighter areas of the image will become white or gray depending on how light/dark it is.

# Thermal Filter
The thermal filter is from lesson 8 (3C). This filter modifies the colors of the pixels to show a representation of heat differences. For example, the cooler areas would show up as blue and the warmer areas would show up as red. This filter works by converting the grayscale of each value to a specific color based on the outcome of the formula given in the program. In comparison to the black and white filter, I began by using the getPixelsFromImage() method to the the 2d array of Pixel objects. Then, I started to calculate the grayscale of each RGB value by adding all the values of the color up and dividing it by 3. If the grayValue is less than 85, the pixel's color would be set to red. If the grayValue is greater than to 85 and less that 170, the pixel's color would be set to green. Any value above 170 would result in the pixel being set to blue. In conclusion, the image transform into an image with a thermal filter.
