import actions.Action;
import actions.Filters;
import utils.PictureUtil;

import java.awt.image.BufferedImage;

public class Main {
    public static void main(String[] args) throws Exception {
        PictureUtil pictureUtil = new PictureUtil();
       BufferedImage input = pictureUtil.getPicture("files/TrifidrecortesRGB1024.jpg");
Action action = new Action();
action.getRGBInt(input);
Filters filters = new Filters();
action.changeImage(filters::sepiaFilter);

pictureUtil.writePicture(input);
    }
}