package actions;

import java.util.Random;

public class Filters {
    public float[] greyFilter (float[] rgb){
        float mean = (rgb[0]+rgb[1]+rgb[2])/3;
        rgb[0]=mean;
        rgb[1]=mean;
        rgb[2]=mean;
        return rgb;
    }
    public float[] redFilter (float[] rgb){
        rgb[1]= 0;
        rgb[2]= 0;
        return rgb;
    }
    public float[] greenFilter (float[] rgb){
        rgb[0]= 0;
        rgb[2]= 0;
        return rgb;
    }
    public float[] blueFilter (float[] rgb){
        rgb[0]= 0;
        rgb[1]= 0;
        return rgb;
    }
    public float[] sepiaFilter (float[] rgb){
        Random random = new Random();

        rgb[0] += random.nextFloat()*20/255;
        rgb[1]+= random.nextFloat()*20/255;
        rgb[2]= random.nextFloat()*20/255;
        for(int i=0; i<rgb.length;i++){
            if(rgb[i]>1){
                rgb[i]=1;
            }
        }
        return rgb;
    }
}
