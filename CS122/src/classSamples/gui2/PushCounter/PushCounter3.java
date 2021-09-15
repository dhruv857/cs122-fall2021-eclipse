package classSamples.gui_2.PushCounter;

import javafx.application.Application;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

//************************************************************************
//  PushCounter3.java       Author: Lewis/Loftus
//
//  A variation on the PushCounter program that uses a lambda expression
//  to define the event handler.
//************************************************************************

public class PushCounter3 extends Application {
	private int count;
	private Text countText;

	@Override
	public void start(Stage primaryStage) {
		count = 0;
		countText = new Text("Pushes: 0");

		Button push = new Button("Push Me!");
		push.setOnAction((event) -> {
			count++;
			countText.setText("Pushes: " + count);
		});

		FlowPane pane = new FlowPane(push, countText);
		pane.setAlignment(Pos.CENTER);
		pane.setHgap(20);
		pane.setStyle("-fx-background-color: cyan");

		Scene scene = new Scene(pane, 300, 100);

		primaryStage.setTitle("Push Counter 3");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
