package classSamples.gui_2.FahrenheitConverter;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.stage.Stage;

//************************************************************************
//  FahrenheitConverter.java       Author: Lewis/Loftus
//
//  Demonstrates the use of a TextField and a GridPane.
//************************************************************************

public class FahrenheitConverter extends Application {
	// --------------------------------------------------------------------
	// Launches the temperature converter application.
	// --------------------------------------------------------------------
	public void start(Stage primaryStage) {
		Scene scene = new Scene(new FahrenheitPane(), 300, 150);

		primaryStage.setTitle("Fahrenheit Converter");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
