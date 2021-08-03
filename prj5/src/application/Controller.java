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
import javafx.scene.control.Button;
import javafx.scene.control.ComboBox;
import javafx.scene.control.Label;
import javafx.scene.control.TextField;
import javafx.scene.layout.HBox;
import javafx.scene.layout.FlowPane;
import javafx.scene.layout.BorderPane;
import javafx.geometry.Insets;
import javafx.geometry.Pos;

public class Controller extends BorderPane {	
	
	
	protected TextField fName = new TextField();
	protected TextField lastName = new TextField();
	protected TextField txCity = new TextField(); 
	protected TextField txPostal = new TextField(); 
	final ComboBox<String> cbProvince = new ComboBox<>();
	private final String[] provinces = {"ON", "QC", "NS", "NB", "MB", "BC", "PE", "SK", "AB", "NL"};
	protected Button addBt = new Button("Add");
	protected Button firstBt = new Button("First");
	protected Button nextBt = new Button("Next");
	protected Button previousBt = new Button("Previous");
	protected Button lastBt = new Button("Last");
	protected Button updateBt = new Button("Update");
	private FlowPane paneForInfo = new FlowPane(5, 5);
	private HBox paneForButtons = new HBox(15);
	
	
	
	public Controller() {
		addressBook();
	}
	private void addressBook() {
		fName.setPrefColumnCount(20);
		lastName.setPrefColumnCount(20);
		txCity.setPrefColumnCount(20);
		txPostal.setPrefColumnCount(20);
		paneForInfo.setPadding(new Insets(10, 10, 0, 10));
		
		cbProvince.getItems().addAll(provinces);
		paneForInfo.getChildren().addAll(new Label("First Name :"), fName,
				new Label("Last Name :"), lastName, 
			 new Label("City            :"), txCity,
			new Label("PostalCode :"), txPostal,
			new Label("Province"), cbProvince);		
		paneForButtons.getChildren().addAll(addBt, firstBt, nextBt, previousBt, lastBt, updateBt);
		paneForButtons.setAlignment(Pos.CENTER);		
		setCenter(paneForInfo);
		setBottom(paneForButtons);
	}
	
}