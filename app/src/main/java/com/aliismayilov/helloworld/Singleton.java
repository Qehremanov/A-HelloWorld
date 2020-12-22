package com.aliismayilov.helloworld;

import android.graphics.Bitmap;

public class Singleton {
    private Bitmap image1;
    private Bitmap image2;
    private static Singleton singleton;

    private Singleton(){}

    public Bitmap getImage1(){
        return image1;
    }

    public Bitmap getImage2(){
        return image2;
    }

    public void setImage1(Bitmap bitmap){
        image1 = bitmap;
    }
    public void setImage2(Bitmap bitmap){
        image2 = bitmap;
    }

    public static Singleton getInstance(){
        if ( singleton == null ){
            singleton = new Singleton();
        }
        return singleton;
    }


}
