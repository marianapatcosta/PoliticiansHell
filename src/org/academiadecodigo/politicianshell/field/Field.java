package org.academiadecodigo.politicianshell.field;


import org.academiadecodigo.simplegraphics.graphics.Canvas;
import org.academiadecodigo.simplegraphics.graphics.Color;
import org.academiadecodigo.simplegraphics.graphics.Rectangle;
import org.academiadecodigo.simplegraphics.pictures.Picture;

import java.awt.event.KeyListener;

public class Field {

    public static final int WIDTH = 500;
    public static final int HEIGHT = 700;
    public static final int MARGIN_BOTTOM = 50;
    private Picture grid;


    public Field(){

        Canvas.getInstance().setWidth(WIDTH);
        Canvas.getInstance().setHeight(HEIGHT);

        grid = new Picture(0, 0, "resources/Hellbg1.png");
        //grid.setColor(Color.BLACK);
        //grid.draw();

    }

    public void init(){
        //grid.fill();
        grid.draw();
    }



}
