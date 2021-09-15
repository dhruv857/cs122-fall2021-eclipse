package classSamples.gui_7.DisplayFile;

import java.io.File;
import java.io.IOException;
import java.util.Scanner;
import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.TextArea;
import javafx.scene.text.Font;
import javafx.stage.FileChooser;
import javafx.stage.Stage;

//************************************************************************
//  DisplayFile.java       Author: Lewis/Loftus
//
//  Demonstrates the use of a file chooser dialog box and a text area.
//************************************************************************

public class DisplayFile extends Application {
	// --------------------------------------------------------------------
	// Presents a file chooser dialog, reads the selected file and
	// loads it into a text area.
	// --------------------------------------------------------------------
	public void start(Stage primaryStage) throws IOException {
		FileChooser chooser = new FileChooser();
		File selectedFile = chooser.showOpenDialog(primaryStage);

		TextArea content = new TextArea();
		content.setFont(new Font("Courier", 12));
		content.setEditable(false);

		if (selectedFile == null)
			content.setText("No file chosen.");
		else {
			Scanner scan = new Scanner(selectedFile);

			String info = "";
			while (scan.hasNext())
				info += scan.nextLine() + "\n";

			content.setText(info);
		}

		Scene scene = new Scene(content, 500, 500);

		primaryStage.setTitle("Display File");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
