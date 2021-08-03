
/**********************************************
* Workshop 6 (Part 1-2) 
* Course: JAC444 -summer 2021 
* Last Name: Arslan
* First Name: Gozde
* ID: 150320190
* Section: NCC
* This assignment represents my own work in accordance with Seneca Academic Policy.
* Signature G.A
* Date: 13/07/2021
* **********************************************/
package application;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

public class Controller extends BorderPane {		
	private final String[] genders = {"Male", "Female"};
	private final String[] years = {"2009", "2010","2011","2012","2013","2014","2015","2016","2017","2018"};    
	Label yearF = new Label("Enter the Year: ");
	protected ChoiceBox<String> cboYear = new ChoiceBox<>();
	protected ChoiceBox<String> cboGender = new ChoiceBox<>();
	protected Button submitButton = new Button("Submit Query");
	protected Button exitButton = new Button("Exit");
	protected Button yesButton = new Button("Yes");
	protected Button noButton = new Button("No");
	BorderPane root = new BorderPane();
	GridPane grid = new GridPane();	
	Label genderF = new Label("Enter the Gender: ");
	Label nameF = new Label("Enter the Name: ");
	Scene scene = new Scene(grid, 600, 200);	
	TextField name = new TextField();	
	
	String nameTx = "";
	String genderTx = "";
	String yearTx = "";
	static String filePath = " "; 
	BabyName babyData = null;

	public Controller() {
		GenderFinder();
	}   
	private void GenderFinder() {		
	grid.setPadding(new Insets(10, 15, 15, 15));
	grid.setVgap(5.5);
	grid.setHgap(5.5);
	grid.setAlignment(Pos.CENTER);
	grid.setMinSize(200, 200);
	// features for properties
	name.setPromptText("Enter the Name");
	name.setPrefColumnCount(30);
	name.getText();
	cboYear.getItems().addAll(years);
	cboYear.setValue("Select the Year");
	cboGender.getItems().addAll(genders);
	cboGender.setValue("Select the Gender");	
	

	// settings for GridPane layout
	GridPane.setConstraints(cboYear, 1, 0);
	GridPane.setConstraints(yearF, 0, 0);	
	grid.getChildren().addAll(yearF, cboYear);
	GridPane.setConstraints(cboGender, 1, 4);
	GridPane.setConstraints(genderF, 0, 4);
	grid.getChildren().addAll(genderF, cboGender);
	GridPane.setConstraints(nameF, 0, 6);
	GridPane.setConstraints(name, 1, 6);
	grid.getChildren().addAll(nameF, name);
	// add buttons to the layout
	grid.add(submitButton, 0, 10, 3, 3);
	grid.add(exitButton, 1, 10, 1, 3);
	}
	

	void secondScene() {
		BabyName babyData= new BabyName();	  
		GridPane paneGrid = new GridPane();
		Label label2 = new Label("Do you want to search for another name?");
		Scene output = new Scene(paneGrid, 400, 200);
		Stage outputStage = new Stage();
		Text category = new Text();
		Text textField1 = new Text(" name ");
		Text nameToDisplay = new Text();
		Text textField2 = new Text(" is  ranked # ");
		Text rank = new Text();
		Text textField3 = new Text(" in ");
		Text yearToDisplay = new Text();
		Text textField4 = new Text(" year.");
		TextFlow textFlow = new TextFlow();
		// Formatting the GridPane pane
		outputStage.setTitle("Baby Name Ranking Application");
		paneGrid.setPrefSize(400, 200);
		paneGrid.getChildren().add(textFlow);
		paneGrid.add(label2, 0, 14, 2, 2);
		paneGrid.add(yesButton, 0, 17, 6, 6);
	    paneGrid.add(noButton, 1, 17, 6, 6);
		label2.getPrefHeight();
		label2.getPrefWidth();
		// Text Flow test fields defined and formatted
		category.setText(genderTx);
		rank.setText(babyData.orderNum);
		yearToDisplay.setText(yearTx);
		nameToDisplay.setText(babyData.name);
		textFlow.getChildren().addAll(category, textField1, nameToDisplay, textField2, rank, textField3, yearToDisplay, textField4);
	   yesButton.setOnAction(actionEvent -> outputStage.close());
	   noButton.setOnAction(actionEvent ->outputStage.close());
		outputStage.setScene(output);
		outputStage.show();
		}
	
	
	
}