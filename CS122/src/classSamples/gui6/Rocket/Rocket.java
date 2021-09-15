package classSamples.gui_6.Rocket;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Polygon;
import javafx.scene.shape.Polyline;
import javafx.stage.Stage;

//************************************************************************
//  Rocket.java       Author: Lewis/Loftus
//
//  Demonstrates the use of polygons and polylines.
//************************************************************************

public class Rocket extends Application {
	// --------------------------------------------------------------------
	// Displays a rocket lifting off. The rocket and hatch are polygons
	// and the flame is a polyline.
	// --------------------------------------------------------------------
	public void start(Stage primaryStage) {
		double[] hullPoints = { 200, 25, 240, 60, 240, 230, 270, 260, 270, 300, 140, 300, 140, 260, 160, 230, 160, 60 };

		Polygon rocket = new Polygon(hullPoints);
		rocket.setFill(Color.BEIGE);

		double[] hatchPoints = { 185, 70, 215, 70, 220, 120, 180, 120 };

		Polygon hatch = new Polygon(hatchPoints);
		hatch.setFill(Color.MAROON);

		double[] flamePoints = { 142, 310, 142, 330, 150, 325, 155, 380, 165, 340, 175, 360, 190, 350, 200, 375, 215,
				330, 220, 360, 225, 355, 230, 370, 240, 340, 255, 370, 260, 335, 268, 340, 268, 310 };

		Polyline flame = new Polyline(flamePoints);
		flame.setStroke(Color.RED);
		flame.setStrokeWidth(3);

		Group root = new Group(rocket, hatch, flame);

		Scene scene = new Scene(root, 400, 400, Color.BLACK);

		primaryStage.setTitle("Rocket");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
