package classSamples.gui_4.TransformationDemo;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.scene.transform.Shear;
import javafx.stage.Stage;

//********************************************************************
//  TransformationDemo.java       Author: Lewis/Loftus
//
//  Demonstrates graphic transformations. Not shown in full in
//  textbook.
//********************************************************************

public class TransformationDemo extends Application {
	@Override
	public void start(Stage primaryStage) {
		// TRANSLATION
		Rectangle rec1 = new Rectangle(100, 100, 200, 50);
		rec1.setFill(Color.STEELBLUE);

		Rectangle rec2 = new Rectangle(100, 100, 200, 50);
		rec2.setFill(Color.ORANGE);
		rec2.setTranslateX(70);
		rec2.setTranslateY(10);

// SCALING
//        Image img = new Image("water lily.jpg");
//        ImageView imgView1 = new ImageView(img);
//
//        ImageView imgView2 = new ImageView(img);
//        imgView2.setX(300);
//        imgView2.setScaleX(0.7);
//        imgView2.setScaleY(0.7);

// ROTATION
//        Rectangle rec = new Rectangle(50, 100, 200, 50);
//        rec.setFill(Color.STEELBLUE);
//        rec.setRotate(40);
//        
//        Text text = new Text(270, 125, "Tilted Text!");
//        text.setFont(new Font("Courier", 24));
//        text.setRotate(-15);

// SHEARING
//      Image img = new Image("duck.jpg");
//      ImageView imgView = new ImageView(img);
//      imgView.getTransforms().add(new Shear(0.4, 0.2));

		Group root = new Group(rec1, rec2);
		Scene scene = new Scene(root, 500, 250);

		primaryStage.setTitle("Transformation Demo");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}