package classSamples.gui_4.Bullseye;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.stage.Stage;

//************************************************************************
//  Bullseye.java       Author: Lewis/Loftus
//
//  Demonstrates the use of loops and conditionals to draw.
//************************************************************************

public class Bullseye extends Application {
	// --------------------------------------------------------------------
	// Displays a target using concentric black and white circles
	// and a red center.
	// --------------------------------------------------------------------
	public void start(Stage primaryStage) {
		Group root = new Group();
		Color ringColor = Color.BLACK;
		Circle ring = null;
		int radius = 150;

		for (int count = 1; count <= 8; count++) {
			ring = new Circle(160, 160, radius);
			ring.setFill(ringColor);
			root.getChildren().add(ring);

			if (ringColor.equals(Color.BLACK))
				ringColor = Color.WHITE;
			else
				ringColor = Color.BLACK;

			radius = radius - 20;
		}

		ring.setFill(Color.RED);

		Scene scene = new Scene(root, 320, 320, Color.CYAN);

		primaryStage.setTitle("Bullseye");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
