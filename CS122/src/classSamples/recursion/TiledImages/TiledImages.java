package classSamples.recursions.TiledImages;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.effect.ColorAdjust;
import javafx.scene.effect.SepiaTone;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

//************************************************************************
//  TiledImages.java       Author: Lewis/Loftus
//
//  Demonstrates the use of recursion.
//************************************************************************

public class TiledImages extends Application {
	private final static int MIN = 20;

	private Image image;
	private ColorAdjust monochrome;
	private SepiaTone sepia;
	private Group root;

	// --------------------------------------------------------------------
	// Sets up the display of a series of tiled images.
	// --------------------------------------------------------------------
	public void start(Stage primaryStage) {
		image = new Image("girl.jpg");

		monochrome = new ColorAdjust(0, -1, 0, 0);
		sepia = new SepiaTone();

		root = new Group();
		addPictures(300);

		Scene scene = new Scene(root, 600, 600, Color.WHITE);

		primaryStage.setTitle("Tiled Images");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	// --------------------------------------------------------------------
	// Uses the parameter to specify the size and position of an image.
	// Displays the image in full color, monochrome, and sepia tone,
	// then repeats the display recursively in the upper left quadrant.
	// --------------------------------------------------------------------
	private void addPictures(double size) {
		ImageView colorView = new ImageView(image);
		colorView.setFitWidth(size);
		colorView.setFitHeight(size);
		colorView.setX(size);
		colorView.setY(size);

		ImageView monochromeView = new ImageView(image);
		monochromeView.setEffect(monochrome);
		monochromeView.setFitWidth(size);
		monochromeView.setFitHeight(size);
		monochromeView.setX(0);
		monochromeView.setY(size);

		ImageView sepiaView = new ImageView(image);
		sepiaView.setEffect(sepia);
		sepiaView.setFitWidth(size);
		sepiaView.setFitHeight(size);
		sepiaView.setX(size);
		sepiaView.setY(0);

		root.getChildren().addAll(sepiaView, colorView, monochromeView);

		if (size > MIN)
			addPictures(size / 2);
	}

	public static void main(String[] args) {
		launch(args);
	}
}