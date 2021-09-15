package classSamples.gui_panes_demo;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.Label;
import javafx.scene.control.RadioButton;
import javafx.scene.control.Separator;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.AnchorPane;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Rectangle;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

// Used only to generate screen shots for appendix.
public class BorderPaneDemo extends Application {
	public void start(Stage primaryStage) {
		Text title = new Text("Image Viewer");
		title.setFont(Font.font(24));
		title.setFill(Color.YELLOW);
		StackPane titlePane = new StackPane(title);
		titlePane.setStyle("-fx-padding: 20px; -fx-background-color: black");

		ImageView imageView = new ImageView(new Image("tiger.jpg"));

		Rectangle rect = new Rectangle(350, 300, null);
		rect.setStroke(Color.ORANGE);
		rect.setStrokeWidth(6);

		StackPane imagePane = new StackPane(imageView, rect);
		imagePane.setStyle("-fx-background-color: beige");

		RadioButton sepiaButton = new RadioButton("Sepia");
		RadioButton monoButton = new RadioButton("Monochrome");
		RadioButton colorButton = new RadioButton("Full Color");

		Separator sep = new Separator();
		Label colorLabel = new Label("Frame:");
		ColorPicker colorPicker = new ColorPicker(Color.ORANGE);

		VBox colorControls = new VBox(sepiaButton, monoButton, colorButton, sep, colorLabel, colorPicker);
		colorControls.setStyle("-fx-padding: 20px 10px; " + "-fx-background-color: skyblue");
		colorControls.setSpacing(10);

		Button prev = new Button("Prev");
		Button next = new Button("Next");

		AnchorPane navPane = new AnchorPane(prev, next);
		navPane.setStyle("-fx-background-color: black");
		navPane.setPrefHeight(70);

		AnchorPane.setBottomAnchor(prev, 20.0);
		AnchorPane.setLeftAnchor(prev, 30.0);
		AnchorPane.setBottomAnchor(next, 20.0);
		AnchorPane.setRightAnchor(next, 30.0);

		BorderPane borderPane = new BorderPane();
		borderPane.setTop(titlePane);
		borderPane.setLeft(colorControls);
		borderPane.setCenter(imagePane);
		borderPane.setBottom(navPane);

		Scene scene = new Scene(borderPane, 600, 500);

		primaryStage.setTitle("Border Pane Demo");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
