
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

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.scene.layout.GridPane;
import java.io.*;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.scene.control.*;
import javafx.scene.text.Text;
import javafx.scene.text.TextFlow;

import java.util.Scanner;
public class Main extends Application {

	protected Controller pane = new Controller();
	String nameTx = "";
	String genderTx = "";
	String yearTx = "";
	static String filePath = " "; 
	BabyName babyData = null;

	public static void main(String[] args) {
		launch(args);
	}
      
	@Override
	public void start(Stage primaryStage) {
		try {	
			Image icon = new Image("icon.png");
			primaryStage.getIcons().add(icon);
			primaryStage.setScene(pane.scene);
			primaryStage.setTitle("Baby Name Ranking Finder ");
			// Pane settings
			pane.submitButton.setOnAction(new findRanking());
			pane.exitButton.setOnAction(actionEvent -> primaryStage.close());

			primaryStage.show();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
	
	class findRanking implements EventHandler<ActionEvent> {
		@Override
		public void handle(ActionEvent arg0) {
			nameTx = pane.name.getText();
			genderTx = pane.cboGender.getValue();
			yearTx = pane.cboYear.getValue();
			filePath = setFile(yearTx);					
			
			try (BufferedReader br = new BufferedReader(new FileReader (filePath))){			
			   String str = "";			   
			   while((str=br.readLine())!=null) {
				   BabyName bN = BabyName.parseLine(str)[genderTx=="M"?0:1];
				   if(nameTx.equals(bN.name)) {
						babyData=bN;
						break;					}				   
			   }
				
				
			} catch (Exception e) {
				System.out.println(e);
				e.printStackTrace();
			}
			
				     
			pane.secondScene();         

		}
		
		

	}
	String setFile(String term) {
		String fileName = "";
		fileName = "src/application/babynamesranking" + yearTx + ".txt";
		return fileName;
	}
	

	

}


