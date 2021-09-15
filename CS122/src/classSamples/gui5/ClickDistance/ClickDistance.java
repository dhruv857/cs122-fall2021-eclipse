package classSamples.gui_5.ClickDistance;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.scene.text.Text;
import javafx.stage.Stage;

//************************************************************************
//  ClickDistance.java       Author: Lewis/Loftus
//
//  Demonstrates the handling of a mouse click event.
//************************************************************************

public class ClickDistance extends Application {
	private Line line;
	private Text distanceText;

	// --------------------------------------------------------------------
	// Shows the distance between the origin (0, 0) and the point where
	// the mouse is clicked.
	// --------------------------------------------------------------------
	public void start(Stage primaryStage) {
		line = new Line(0, 0, 0, 0);
		distanceText = new Text(150, 30, "Distance:  --");

		Group root = new Group(distanceText, line);

		Scene scene = new Scene(root, 400, 300, Color.LIGHTYELLOW);

		scene.setOnMouseClicked(this::processMouseClick);

		primaryStage.setTitle("Click Distance");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	// --------------------------------------------------------------------
	// Resets the end point of the line to the location of the mouse
	// click event and updates the distance displayed.
	// --------------------------------------------------------------------
	public void processMouseClick(MouseEvent event) {
		double clickX = event.getX();
		double clickY = event.getY();

		line.setEndX(clickX);
		line.setEndY(clickY);

		double distance = Math.sqrt(clickX * clickX + clickY * clickY);

		String distanceStr = String.format("%.2f", distance);
		distanceText.setText("Distance:  " + distanceStr);
	}

	public static void main(String[] args) {
		launch(args);
	}
}
