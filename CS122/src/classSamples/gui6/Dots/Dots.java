package classSamples.gui_6.Dots;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.input.MouseEvent;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

//************************************************************************
//  Dots.java       Author: Lewis/Loftus
//
//  Demonstrates the use of an array of Color objects and the capture of
//  a double mouse click.
//************************************************************************

public class Dots extends Application {
	private final Color[] colorList = { Color.RED, Color.CYAN, Color.MAGENTA, Color.YELLOW, Color.LIME, Color.WHITE };

	private int colorIndex = 0;
	private int count = 0;
	private Text countText;
	private Group root;

	// --------------------------------------------------------------------
	// Displays a scene on which the user can add colored dots with
	// mouse clicks.
	// --------------------------------------------------------------------
	public void start(Stage primaryStage) {
		countText = new Text(20, 30, "Count: 0");
		countText.setFont(new Font(18));
		countText.setFill(Color.WHITE);

		root = new Group(countText);

		Scene scene = new Scene(root, 400, 300, Color.BLACK);
		scene.setOnMouseClicked(this::processMouseClick);

		primaryStage.setTitle("Dots");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	// --------------------------------------------------------------------
	// Process a mouse click by adding a circle to that location. Circle
	// colors rotate through a set list of colors. A double click clears
	// the dots and resets the counter.
	// --------------------------------------------------------------------
	public void processMouseClick(MouseEvent event) {
		if (event.getClickCount() == 2) // double click
		{
			count = 0;
			colorIndex = 0;
			root.getChildren().clear();
			countText.setText("Count: 0");
			root.getChildren().add(countText);
		} else {
			Circle circle = new Circle(event.getX(), event.getY(), 10);
			circle.setFill(colorList[colorIndex]);
			root.getChildren().add(circle);

			colorIndex = (colorIndex + 1) % colorList.length;

			count++;
			countText.setText("Count: " + count);
		}
	}

	public static void main(String[] args) {
		launch(args);
	}
}
