package utils;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

public class PictureUtil {
    String path;
   public BufferedImage getPicture(String path) throws IOException {
        this.path = path;
        File file = new File(this.path);
        BufferedImage input = ImageIO.read(file);
        return input;
    }

    public void writePicture(BufferedImage picture) throws IOException {
File output = new File("files/photo.png");
ImageIO.write(picture, "png",output);

    }

    public static float[] getRGBfromPixel(int pixel){
       Color color = new Color(pixel);
       return color.getRGBComponents(null);
    }

    public static int getIntFromRGB (float[] pixel) throws Exception {
       Color color = null;
       if(pixel.length == 3){
           color = new Color(pixel[0],pixel[1],pixel[2]);
       } else if(pixel.length==4){
           color = new Color (pixel[0],pixel[1],pixel[2], pixel[3]);
       }if(color!=null) {
            return color.getRGB();
        }
       throw new Exception("invalid color");

    }
}
