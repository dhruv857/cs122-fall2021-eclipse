package classSamples.gui_panes_demo;

import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Separator;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

// Used only to generate screen shots for appendix.
public class VBoxDemo extends Application {
	public void start(Stage primaryStage) {
		RadioButton sepiaButton = new RadioButton("Sepia");
		RadioButton monoButton = new RadioButton("Monochrome");
		RadioButton colorButton = new RadioButton("Full Color");

		Separator sep = new Separator();
		Label colorLabel = new Label("Frame:");
		ColorPicker colorPicker = new ColorPicker(Color.ORANGE);

		VBox colorControls = new VBox(sepiaButton, monoButton, colorButton, sep, colorLabel, colorPicker);
		colorControls.setStyle("-fx-background-color: skyblue");
		colorControls.setPadding(new Insets(20, 10, 20, 10));
		colorControls.setSpacing(10);

		Scene scene = new Scene(colorControls, 600, 500);

		primaryStage.setTitle("VBox Demo");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
