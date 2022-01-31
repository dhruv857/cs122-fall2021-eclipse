package classSamples.gui3.StyleOptions;

import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.control.CheckBox;
import javafx.scene.layout.HBox;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;

//************************************************************************
//  StyleOptionsPane.java       Author: Lewis/Loftus
//
//  Demonstrates the use of check boxes.
//************************************************************************

public class StyleOptionsPane extends VBox {
	private final Text phrase;
	private final CheckBox boldCheckBox;
    private final CheckBox italicCheckBox;

	// --------------------------------------------------------------------
	// Sets up this pane with a Text object and check boxes that
	// determine the style of the text font.
	// --------------------------------------------------------------------
	public StyleOptionsPane() {
		phrase = new Text("Say it with style!");
		phrase.setFont(new Font("Helvetica", 36));

		boldCheckBox = new CheckBox("Bold");
		boldCheckBox.setOnAction(this::processCheckBoxAction);
		italicCheckBox = new CheckBox("Italic");
		italicCheckBox.setOnAction(this::processCheckBoxAction);

		HBox options = new HBox(boldCheckBox, italicCheckBox);
		options.setAlignment(Pos.CENTER);
		options.setSpacing(20); // between the check boxes

		setSpacing(20); // between the text and the check boxes
		getChildren().addAll(phrase, options);
	}

	// --------------------------------------------------------------------
	// Updates the font style of the displayed text.
	// --------------------------------------------------------------------
	public void processCheckBoxAction(ActionEvent event) {
		FontWeight weight = FontWeight.NORMAL;
		FontPosture posture = FontPosture.REGULAR;

		if (boldCheckBox.isSelected())
			weight = FontWeight.BOLD;

		if (italicCheckBox.isSelected())
			posture = FontPosture.ITALIC;

		phrase.setFont(Font.font("Helvetica", weight, posture, 36));
	}
}
