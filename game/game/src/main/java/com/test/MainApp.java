package com.test;

import com.almasb.fxgl.app.GameApplication;
import com.almasb.fxgl.app.GameSettings;
import com.almasb.fxgl.dsl.FXGL;

import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;


public class MainApp extends GameApplication{
    @Override
    protected void initSettings(GameSettings settings)
    {
        settings.setWidth(800);
        settings.setHeight(600);
        settings.setTitle("My First FXGL Game");
        settings.setVersion("1.0");

    }
    @Override
    protected void initGame() {
        FXGL.entityBuilder()
        .at(100,100)
        .view(new Rectangle(40,40,Color.BLUE))
        .buildAndAttach();
    }
    public static void main(String[] args) {
        launch(args);
        
    }
    
}
