package classSamples.gui_4.Robots;

import javafx.scene.Group;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;

//************************************************************************
//  RobotFace.java       Author: Lewis/Loftus
//
//  Presents the face of a robot.
//************************************************************************

public class RobotFace extends Group {
	// --------------------------------------------------------------------
	// Sets up the elements that make up the robots face, positioned
	// in the upper left corner of the coordinate system.
	// --------------------------------------------------------------------
	public RobotFace() {
		Rectangle head = new Rectangle(5, 0, 100, 70);
		head.setFill(Color.SILVER);
		head.setArcHeight(10);
		head.setArcWidth(10);

		Rectangle ears = new Rectangle(0, 20, 110, 30);
		ears.setFill(Color.DARKBLUE);
		ears.setArcHeight(10);
		ears.setArcWidth(10);

		Rectangle eye1 = new Rectangle(25, 15, 20, 10);
		eye1.setFill(Color.GOLD);

		Rectangle eye2 = new Rectangle(65, 15, 20, 10);
		eye2.setFill(Color.GOLD);

		Rectangle nose = new Rectangle(52, 25, 6, 15);
		nose.setFill(Color.BLACK);

		Rectangle mouth = new Rectangle(35, 45, 40, 10);
		mouth.setFill(Color.RED);

		getChildren().addAll(ears, head, eye1, eye2, nose, mouth);
	}
}
