package com.simulation;

import javafx.animation.ScaleTransition;
import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.stage.Stage;
import javafx.util.Duration;

import java.net.URL;

public class forces extends Application {
    ImageView mSpring;
    Rectangle mRectangle;

    double mBaseLength = 200;
    double mK = 10;

    @Override
    public void init() throws Exception {
        super.init();

        Image image = new Image(getClass().getResource("Sprezyna.png").toString());

        mSpring = new ImageView(image);
        mSpring.setFitWidth(100);
        mSpring.setFitHeight(mBaseLength);

        mSpring.setTranslateX(70);

        mRectangle = new Rectangle();

        mRectangle.setFill(Color.BISQUE);
        mRectangle.setWidth(200);
        mRectangle.setHeight(150);

        mRectangle.setTranslateX(20);

        mRectangle.setTranslateY(mSpring.getFitHeight());
    }

    @Override
    public void start(Stage primaryStage) throws Exception {
        Group group = new Group();

        Scene scene = new Scene(group,640,480);

        group.getChildren().add(mSpring);
        group.getChildren().add(mRectangle);


        mRectangle.setOnMouseClicked(event -> {
            setForce(10);
        });

        primaryStage.setScene(scene);
        primaryStage.show();
    }

    private void setForce(double force){

        double newHeight = mBaseLength+mK*force;
        mSpring.setFitHeight(newHeight);

        mRectangle.setTranslateY(mSpring.getFitHeight());

    }
}
