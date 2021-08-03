/**********************************************
 * Workshop 7 (Task 1-2) 
 * Course: JAC444 -summer 2021 
 * Last Name: Arslan
 * First Name: Gozde
 * ID: 150320190
 * Section: NCC
 * This assignment represents my own work in accordance with Seneca Academic Policy.
 * Signature G.A
 * Date: 20/07/2021
 * **********************************************/
package application;

import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.ChoiceBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.BorderPane;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

public class Controller extends BorderPane {		
	
	private final String[] years = {"2009", "2010","2011","2012","2013","2014","2015","2016","2017","2018"};    
	Label yearF = new Label("Select Year: ");
	protected ChoiceBox<String> cboYear = new ChoiceBox<>();
	protected ChoiceBox<String> cboGender = new ChoiceBox<>();
	protected Button submitButton = new Button("Submit Query");
	protected Button exitButton = new Button("Exit");
	
	BorderPane root = new BorderPane();
	GridPane grid = new GridPane();	
	
	Scene scene = new Scene(grid, 600, 200);	
	TextField name = new TextField();	
	
	String nameTx = "";
	String genderTx = "";
	String yearTx = "";
	static String filePath = " "; 
//	BabyName babyData = null;

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
	//cboGender.getItems().addAll(genders);
	cboGender.setValue("Select the Gender");	
	

	// settings for GridPane layout
	GridPane.setConstraints(cboYear, 1, 0);
	GridPane.setConstraints(yearF, 0, 0);	
	grid.getChildren().addAll(yearF, cboYear);
	GridPane.setConstraints(cboGender, 1, 4);
	//GridPane.setConstraints(genderF, 0, 4);
	//grid.getChildren().addAll(genderF, cboGender);
	//GridPane.setConstraints(nameF, 0, 6);
	GridPane.setConstraints(name, 1, 6);
	//grid.getChildren().addAll(nameF, name);
	// add buttons to the layout
	grid.add(submitButton, 0, 10, 3, 3);
	grid.add(exitButton, 2, 10, 1, 3);
	}
	
}