 /**********************************************
 * Workshop 5 (Part 1-2) 
 * Course: JAC444 -summer 2021 
 * Last Name: Arslan
 * First Name: Gozde
 * ID: 150320190
 * Section: NCC
 * This assignment represents my own work in accordance with Seneca Academic Policy.
 * Signature G.A
 * Date: 07/07/2021
 * **********************************************/


package application;

import javafx.application.Application;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.stage.Stage;
import javafx.scene.layout.BorderPane;
import java.io.*;

public class Main extends Application {
	protected Controller pane = new Controller();
	protected int count = 0;
	private static final String dataFilePath = "src/application/data.txt";
	private static  final int firstName = 10; 
	private static  final int lastName = 10; 
	private static  final int cityP = 10; 
	private static  final int province = 2; 
	private static  final int postalCode = 9; 
	
	private void addButton() throws FileNotFoundException,IOException{
		try ( 
			RandomAccessFile data = 
				new RandomAccessFile(dataFilePath, "rw");
		) {
		System.out.println();
			data.seek(data.length());
			write(data);		 	
			data.close();
		}
		catch (Exception e) {
			System.out.println(e);
		}	
		
	}	
	
	
	
	
	private void firstButton() throws IOException{
		try ( 
			RandomAccessFile data =	new RandomAccessFile(dataFilePath, "rw");
		) {
			if (data.length() > 0) {
				data.seek(0);
				read(data);	
				count = 1;
				data.close();}	}
		catch (Exception e) {}}	
	private void nextButton() throws IOException{
		try (RandomAccessFile data = new RandomAccessFile(dataFilePath, "rw");) {
			if (count * 100< data.length()) {
				data.seek(count * 100);	
				read(data);
				count++;
				data.close();
			}		}
		catch (Exception e) {	System.out.println(e);	}	
	}	
	private void previous()throws IOException {
		try (RandomAccessFile data = new RandomAccessFile(dataFilePath, "rw");) {
			if (count > 1) 
				count--;
			else 
				count = 1;
			data.seek((count * 100) - 100);
	        read(data);
			data.close();		
		}
		catch (Exception e) {
		System.out.println(e);}
	}	
	private void last() throws IOException {
		try (RandomAccessFile data = new RandomAccessFile(dataFilePath, "rw");) {
			count = ((int)data.length()) / 100;
			data.seek((count * 100) - 100);
			data.read(null, 100, count);
			data.close();		
		}
		catch (Exception e) {}
	}
	private void update() throws FileNotFoundException,IOException{
		try (RandomAccessFile data = new RandomAccessFile(dataFilePath, "rw");		) {
		 	data.seek(count * 100 - 100);
		 	data.write(5);
		 	data.close();}
		catch (Exception e) {}	
	}


	private void write(RandomAccessFile data) throws IOException {		
	
		data.write(setLength(pane.fName.getText().getBytes(), firstName));
		
		data.write(setLength(pane.lastName.getText().getBytes(), lastName)); 
		
		data.write(setLength(pane.txCity.getText().getBytes(), cityP));
		
		
		data.write(setLength(pane.txPostal.getText().getBytes(), postalCode));
		
		data.write(setLength(pane.cbProvince.getValue().getBytes(), province ));
		
		data.write(setLength("\n"));		
	}

	private byte[] setLength(String string) {
		// TODO Auto-generated method stub
		return null;
	}


	private void read(RandomAccessFile data) throws IOException  {
		int position;
		byte[] fName = new byte[firstName];	
		position = data.read(fName);
		pane.fName.setText(new String(fName));
		

		byte[] city = new byte[cityP];	
		position += data.read(city);
		pane.txCity.setText(new String(city));

		byte[] prov = new byte[province];	
		position += data.read(prov);
		pane.cbProvince.setValue(new String(prov));

		byte[] zip = new byte[postalCode];	
		position += data.read(zip);
		pane.txPostal.setText(new String(zip));
	}


	private byte[] setLength(byte[] b, int size) {
		byte[] bt = new byte[size];
		for (int i = 0; i < b.length; i++) {
			bt[i] = b[i];		
		}
		return bt ;
	} 
	

	@Override 
	public void start(Stage primaryStage) {		
		pane.addBt.setOnAction(e -> {
			try {
				addButton();
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
			System.out.println(e1);
			} catch (IOException e2) {
				// TODO Auto-generated catch block
				System.out.println(e2);
			}
		});
		
		pane.firstBt.setOnAction(event-> {
			try {
				firstButton();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		pane.nextBt.setOnAction(event -> {
			try {
				nextButton();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		pane.previousBt.setOnAction(event -> {
			try {
				previous();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		pane.lastBt.setOnAction(event-> {
			try {
				last();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});
		pane.updateBt.setOnAction(event -> {
			try {
				update();
			} catch (FileNotFoundException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			} catch (IOException e1) {
				// TODO Auto-generated catch block
				e1.printStackTrace();
			}
		});	
		
		Image icon = new Image ("icon.png");
		primaryStage.getIcons().add(icon);
		Scene scene = new Scene(pane,370,210);
		primaryStage.setTitle("Adress Book"); 
		primaryStage.setScene(scene); 
		primaryStage.show(); 
	}
}

