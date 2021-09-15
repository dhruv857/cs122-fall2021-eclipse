package classSamples.gui_3.QuoteOptions;

import javafx.event.ActionEvent;
import javafx.geometry.Pos;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.HBox;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.scene.text.Text;
import javafx.scene.text.Font;

//************************************************************************
//  QuoteOptionsPane.java       Author: Lewis/Loftus
//
//  Demonstrates the use of radio buttons.
//************************************************************************

public class QuoteOptionsPane extends HBox {
	private final Text quote;
	private final String philosophyQuote;
    private final String carpentryQuote;
    private final String comedyQuote;
	private final RadioButton philosophyButton;
    private final RadioButton carpentryButton;
    private final RadioButton comedyButton;

	// --------------------------------------------------------------------
	// Sets up this pane with a Text object and radio buttons that
	// determine which phrase is displayed.
	// --------------------------------------------------------------------
	public QuoteOptionsPane() {
		philosophyQuote = "I think, therefore I am.";
		carpentryQuote = "Measure twice. Cut once.";
		comedyQuote = "Take my wife, please.";

		quote = new Text(philosophyQuote);
		quote.setFont(new Font("Helvetica", 24));

		StackPane quotePane = new StackPane(quote);
		quotePane.setPrefSize(300, 100);

		ToggleGroup group = new ToggleGroup();

		philosophyButton = new RadioButton("Philosophy");
		philosophyButton.setSelected(true);
		philosophyButton.setToggleGroup(group);
		philosophyButton.setOnAction(this::processRadioButtonAction);

		carpentryButton = new RadioButton("Carpentry");
		carpentryButton.setToggleGroup(group);
		carpentryButton.setOnAction(this::processRadioButtonAction);

		comedyButton = new RadioButton("Comedy");
		comedyButton.setToggleGroup(group);
		comedyButton.setOnAction(this::processRadioButtonAction);

		VBox options = new VBox(philosophyButton, carpentryButton, comedyButton);
		options.setAlignment(Pos.CENTER_LEFT);
		options.setSpacing(10);

		setSpacing(20);
		getChildren().addAll(options, quotePane);
	}

	// --------------------------------------------------------------------
	// Updates the content of the displayed text.
	// --------------------------------------------------------------------
	public void processRadioButtonAction(ActionEvent event) {
		if (philosophyButton.isSelected())
			quote.setText(philosophyQuote);
		else if (carpentryButton.isSelected())
			quote.setText(carpentryQuote);
		else
			quote.setText(comedyQuote);
	}
}
