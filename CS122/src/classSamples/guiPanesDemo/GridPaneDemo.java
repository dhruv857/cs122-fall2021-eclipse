package classSamples.gui_panes_demo;

import javafx.application.Application;
import javafx.geometry.HPos;
import javafx.geometry.Pos;
import javafx.scene.Scene;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Font;
import javafx.scene.text.Text;
import javafx.stage.Stage;

// Used only to generate screen shots for appendix.
public class GridPaneDemo extends Application {
	public void start(Stage primaryStage) {
		GridPane gridPane = new GridPane();
		gridPane.setStyle("-fx-background-color: lemonchiffon");
		gridPane.setAlignment(Pos.CENTER);
		gridPane.setHgap(20);
		gridPane.setVgap(10);
		// gridPane.setGridLinesVisible(true);

		ImageView logo = new ImageView(new Image("mascot.png"));
		gridPane.add(logo, 0, 0, 1, 3);

		Text title = new Text("Welcome to Emotiful!");
		title.setFont(new Font(24));
		gridPane.add(title, 1, 0, 2, 1);

		Label userLabel = new Label("User name:");
		userLabel.setFont(new Font(18));
		GridPane.setHalignment(userLabel, HPos.RIGHT);
		gridPane.add(userLabel, 1, 1);

		TextField userName = new TextField();
		gridPane.add(userName, 2, 1);

		Label pwLabel = new Label("Password:");
		pwLabel.setFont(new Font(18));
		GridPane.setHalignment(pwLabel, HPos.RIGHT);
		gridPane.add(pwLabel, 1, 2);

		TextField password = new TextField();
		gridPane.add(password, 2, 2);

		Text greeting = new Text("Have an emotiful day!");
		greeting.setFont(new Font(18));
		GridPane.setHalignment(greeting, HPos.CENTER);
		gridPane.add(greeting, 0, 3, 3, 1);

		Scene scene = new Scene(gridPane, 550, 250);

		primaryStage.setTitle("Grid Pane Demo");
		primaryStage.setScene(scene);
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
