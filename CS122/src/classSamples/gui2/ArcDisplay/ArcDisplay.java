package classSamples.gui_2.ArcDisplay;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Arc;
import javafx.scene.shape.ArcType;
import javafx.scene.shape.Ellipse;
import javafx.stage.Stage;

//************************************************************************
//  ArcDisplay.java       Author: Lewis/Loftus
//
//  Demonstrates the use of the JavaFX Arc class.
//************************************************************************

public class ArcDisplay extends Application {
	// --------------------------------------------------------------------
	// Draws three arcs based on the same underlying ellipse.
	// --------------------------------------------------------------------
	public void start(Stage primaryStage) {
		Ellipse backgroundEllipse = new Ellipse(250, 150, 170, 100);
		backgroundEllipse.setFill(null);
		backgroundEllipse.setStroke(Color.GRAY);
		backgroundEllipse.getStrokeDashArray().addAll(5.0, 5.0);

		Arc arc1 = new Arc(250, 150, 170, 100, 90, 90);
		arc1.setType(ArcType.OPEN);
		arc1.setStroke(Color.RED);
		arc1.setFill(null);

		Arc arc2 = new Arc(250, 150, 170, 100, 20, 50);
		arc2.setType(ArcType.ROUND);
		arc2.setStroke(Color.GREEN);
		arc2.setFill(Color.GREEN);

		Arc arc3 = new Arc(250, 150, 170, 100, 230, 130);
		arc3.setType(ArcType.CHORD);
		arc3.setStroke(Color.BLUE);
		arc3.setFill(null);

		Group root = new Group(backgroundEllipse, arc1, arc2, arc3);
		Scene scene = new Scene(root, 500, 300, Color.LIGHTYELLOW);

		primaryStage.setTitle("Arc Display");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}