package classSamples.gui_6.JukeBox;

import java.io.File;
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.media.AudioClip;
import javafx.stage.Stage;

//************************************************************************
//  JukeBox.java       Author: Lewis/Loftus
//
//  Demonstrates the use of a combo box and audio clips.
//************************************************************************

public class JukeBox extends Application {
	private ChoiceBox<String> choice;
	private AudioClip[] tunes;
	private AudioClip current;
	private Button playButton, stopButton;

	// --------------------------------------------------------------------
	// Presents an interface that allows the user to select and play
	// a tune from a drop down box.
	// --------------------------------------------------------------------
	public void start(Stage primaryStage) {
		String[] names = { "Western Beat", "Classical Melody", "Jeopardy Theme", "Eighties Jam", "New Age Rythm",
				"Lullaby", "Alfred Hitchcock's Theme" };

		File[] audioFiles = { new File("westernBeat.wav"), new File("classical.wav"), new File("jeopardy.mp3"),
				new File("eightiesJam.wav"), new File("newAgeRythm.wav"), new File("lullaby.mp3"),
				new File("hitchcock.wav") };

		tunes = new AudioClip[audioFiles.length];
		for (int i = 0; i < audioFiles.length; i++)
			tunes[i] = new AudioClip(audioFiles[i].toURI().toString());

		current = tunes[0];

		Label label = new Label("Select a tune:");

		choice = new ChoiceBox<String>();
		choice.getItems().addAll(names);
		choice.getSelectionModel().selectFirst();
		choice.setOnAction(this::processChoice);

		playButton = new Button("Play");
		stopButton = new Button("Stop");
		HBox buttons = new HBox(playButton, stopButton);
		buttons.setSpacing(10);
		buttons.setPadding(new Insets(15, 0, 0, 0));
		buttons.setAlignment(Pos.CENTER);

		playButton.setOnAction(this::processButtonPush);
		stopButton.setOnAction(this::processButtonPush);

		VBox root = new VBox(label, choice, buttons);
		root.setPadding(new Insets(15, 15, 15, 25));
		root.setSpacing(10);
		root.setStyle("-fx-background-color: skyblue");

		Scene scene = new Scene(root, 300, 150);

		primaryStage.setTitle("Java Juke Box");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	// --------------------------------------------------------------------
	// When a choice box selection is made, stops the current clip (if
	// one was playing) and sets the current tune.
	// --------------------------------------------------------------------
	public void processChoice(ActionEvent event) {
		current.stop();
		current = tunes[choice.getSelectionModel().getSelectedIndex()];
	}

	// --------------------------------------------------------------------
	// Handles the play and stop buttons. Stops the current clip in
	// either case. If the play button was pressed, (re)starts the
	// current clip.
	// --------------------------------------------------------------------
	public void processButtonPush(ActionEvent event) {
		current.stop();

		if (event.getSource() == playButton)
			current.play();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
