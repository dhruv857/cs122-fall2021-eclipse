package classSamples.gui_4.Robots;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

//************************************************************************
//  Robots.java       Author: Lewis/Loftus
//
//  Demonstrates graphical transformations.
//************************************************************************

public class Robots extends Application {
	// --------------------------------------------------------------------
	// Displays three robot faces, applying various transformations.
	// --------------------------------------------------------------------
	public void start(Stage primaryStage) {
		RobotFace robot1 = new RobotFace();
		robot1.setTranslateX(70);
		robot1.setTranslateY(40);

		RobotFace robot2 = new RobotFace();
		robot2.setTranslateX(300);
		robot2.setTranslateY(40);
		robot2.setRotate(20);

		RobotFace robot3 = new RobotFace();
		robot3.setTranslateX(200);
		robot3.setTranslateY(200);
		robot3.setScaleX(2.5);
		robot3.setScaleY(2.5);

		Group root = new Group(robot1, robot2, robot3);

		Scene scene = new Scene(root, 500, 380, Color.WHITE);

		primaryStage.setTitle("Robots");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
