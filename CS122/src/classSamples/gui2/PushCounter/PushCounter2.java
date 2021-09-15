package classSamples.gui_2.PushCounter;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.text.Text;
import javafx.scene.layout.FlowPane;
import javafx.stage.Stage;

//************************************************************************
//  PushCounter2.java       Author: Lewis/Loftus
//
//  A variation on the PushCounter program that uses a full EventHandler
//  class.
//************************************************************************

public class PushCounter2 extends Application {
	private int count;
	private Text countText;

	@Override
	public void start(Stage primaryStage) {
		count = 0;
		countText = new Text("Pushes: 0");

		Button push = new Button("Push Me!");
		push.setOnAction(new ButtonHandler());

		FlowPane pane = new FlowPane(push, countText);
		pane.setAlignment(Pos.CENTER);
		pane.setHgap(20);
		pane.setStyle("-fx-background-color: cyan");

		Scene scene = new Scene(pane, 300, 100);

		primaryStage.setTitle("Push Counter 2");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}

	private class ButtonHandler implements EventHandler<ActionEvent> {
		@Override
		public void handle(ActionEvent event) {
			count++;
			countText.setText("Pushes: " + count);
		}
	}
}
