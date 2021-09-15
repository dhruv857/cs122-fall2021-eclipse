package classSamples.gui_5.RubberLines;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Line;
import javafx.stage.Stage;

//************************************************************************
//  RubberLines.java       Author: Lewis/Loftus
//
//  Demonstrates the handling of mouse press and mouse drag events.
//************************************************************************

public class RubberLines extends Application {
	private Line currentLine;
	private Group root;

	// --------------------------------------------------------------------
	// Displays an initially empty scene, waiting for the user to
	// draw lines with the mouse.
	// --------------------------------------------------------------------
	public void start(Stage primaryStage) {
		root = new Group();

		Scene scene = new Scene(root, 500, 300, Color.BLACK);

		scene.setOnMousePressed(this::processMousePress);
		scene.setOnMouseDragged(this::processMouseDrag);

		primaryStage.setTitle("Rubber Lines");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	// --------------------------------------------------------------------
	// Adds a new line to the scene when the mouse button is pressed.
	// --------------------------------------------------------------------
	public void processMousePress(MouseEvent event) {
		currentLine = new Line(event.getX(), event.getY(), event.getX(), event.getY());
		currentLine.setStroke(Color.CYAN);
		currentLine.setStrokeWidth(3);
		root.getChildren().add(currentLine);
	}

	// --------------------------------------------------------------------
	// Updates the end point of the current line as the mouse is
	// dragged, creating the rubber band effect.
	// --------------------------------------------------------------------
	public void processMouseDrag(MouseEvent event) {
		currentLine.setEndX(event.getX());
		currentLine.setEndY(event.getY());
	}

	public static void main(String[] args) {
		launch(args);
	}
}
