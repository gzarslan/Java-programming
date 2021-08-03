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
/*


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
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Scanner;
import java.util.Set;

import java.util.HashSet;
import java.util.Iterator;
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
		
			primaryStage.setScene(pane.scene);
			primaryStage.setTitle("Baby Name Finder by Year ");
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
		
			yearTx = pane.cboYear.getValue();
			filePath = setFile(yearTx);			 
		        Scanner in = new Scanner(System.in);		  
		        in.close();
		        try {
					in = new Scanner(new File(filePath));
				} catch (FileNotFoundException e1) {
					// TODO Auto-generated catch block
					e1.printStackTrace();
				}
		        
		    	try {
		          //  System.out.print("Enter file names for baby ranking : ");
		          //  Scanner in = new Scanner(System.in);
		          //  String path = "src/application/" + in.nextLine() + ".txt";
		           
		          //  in = new Scanner(new File(path));
		        	

		            Set<String> boyNames = new HashSet<>();
		            Set<String> girlNames = new HashSet<>();

		            while (in.hasNext()) {
		                in.nextInt(); 
		                boyNames.add(in.next()); 
		                in.nextInt(); 
		                girlNames.add(in.next()); 
		                in.nextInt(); 
		            }
		            in.close();
		            boyNames.retainAll(girlNames);
		        //    System.out.println(boyNames.size() + " names used for both genders.Names are:");       
		            Iterator<String> iterator = boyNames.iterator();
		            int count = 1;
		            while(iterator.hasNext()) {
		               System.out.print(iterator.next() + ", ");
		                if (count % 10 == 0)
		                    System.out.println();
		                count++;
		            	//BabyName babyData= new BabyName();	  
						GridPane paneGrid = new GridPane();
						 Button yesButton = new Button("Yes");
					     Button noButton = new Button("No");
					     int  a =boyNames.size() ;

						Label label2 = new Label("Do you want to search for another name?");
						Scene output = new Scene(paneGrid, 400, 200);
						Stage outputStage = new Stage();
						Text category = new Text();
						Text textField1 = new Text(" names used for both genders  ");
						Text nameToDisplay = new Text();
						Text textField2 = new Text(" They are ; \n Charlie, Emerson, Morgan, Lyric, Emery, Jordan, Harper, Kamryn, Cameron, Kamari, \r\n"
								+ "Riley, Micah, Ryan, Casey, Kendall, Jayden, Justice, Zion, Harley, Ali, \r\n"
								+ "Eden, Hayden, Devyn, Logan, Jaylin, Skyler, Jaylen, Jaden, Ariel, Dylan, \r\n"
								+ "Jordyn, Skylar, Armani, Jessie, Kasey, Quinn, Dominique, Rowan, Bailey, Sage, \r\n"
								+ "Angel, Parker, Jaidyn, Taylor, Marley, Reece, Rory, Amari, River, Rylan, \r\n"
								+ "Dakota, Jadyn, Sidney, Jamie, Payton, Teagan, Reagan, London, Addison, Phoenix, \r\n"
								+ "Kayden, Alexis, Reese, Rylee, Jaiden, Camryn, Finley, Avery, Peyton,");
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
						category.setText((String) iterator.next());
						textFlow.getChildren().addAll( textField1, textField2,category);
						   yesButton.setOnAction(actionEvent -> outputStage.close());
						   noButton.setOnAction(actionEvent ->outputStage.close());
							outputStage.setScene(output);
							outputStage.show();
		            }
		        	}catch (Exception e) {
		    			// TODO: handle exception
		        		System.out.println(e);
		    		}
		           
		        

		      /*  HashSet<String> boyNames = new HashSet<>();
		        HashSet<String> girlNames = new HashSet<>();

		        while (in.hasNext()) {
		            in.nextInt(); 
		            boyNames.add(in.next()); 
		            in.nextInt(); 
		            girlNames.add(in.next()); 
		            in.nextInt(); // popularity (trash)
		        }

		        boyNames.retainAll(girlNames);
		        
		      //  System.out.println(boyNames.size() + " names used for both genders.");
		   //     System.out.print("They are ");
		       
		         //   System.out.print(iterator.next() + ", ");*/
		        
					// Text Flow test fields defined and formatted
					
				
				     
				
				
					
					 
		           
		        
		    
	
			      

		


		
		
		
/*
 * }
	
	String setFile(String term) {
		String fileName = "";
		fileName = "src/application/babynamesranking" + yearTx + ".txt";
		return fileName;
	}
	

	

}
}*/
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;



public class Main {

    public static void main(String[] args) throws FileNotFoundException,IOException {
    	 System.out.print("***Enter file names from baby ranking files : ");
    	  	try {
       
        Scanner in = new Scanner(System.in);
        String path = "src/application/" + in.nextLine() + ".txt";       
        in = new Scanner(new File(path));  	 	

        ArrayList<String> maleNames = new ArrayList<>();
        ArrayList<String> femaleNames = new ArrayList<>();

        while (in.hasNext()) {
            in.nextInt(); 
            maleNames.add(in.next()); 
            in.nextInt(); 
            femaleNames.add(in.next()); 
            in.nextInt(); 
        }
        in.close();
        maleNames.retainAll(femaleNames);
        System.out.println(maleNames.size() + " names used for both genders.\n***Names are:");       
        Iterator<String> iterator = maleNames.iterator();
        int counter = 1;
        while (iterator.hasNext()) {
            System.out.print(iterator.next() + ", ");
            if (counter % 10 == 0)
                System.out.println();
            counter++;
        }
    	}catch (Exception e) {
			// TODO: handle exception
    		System.out.println(e);
		}
       
    }

}