 /**********************************************
 * Workshop 3 (Part 1-2) 
 * Course: JAC444 -summer 2021 
 * Last Name: Arslan
 * First Name: Gozde
 * ID: 150320190
 * Section: NCC
 * This assignment represents my own work in accordance with Seneca Academic Policy.
 * Signature G.A
 * Date:08/06/2021
 * **********************************************/


package ca.senecacollege.workshop3;
public class Invoice implements Payable {
	private String partNumber;
	private String partDescription;
	private int quantity;
	private double pricePerItem;
	public String getPartNumber() {
		return partNumber;
	}
	public void setPartNumber(String partNumber) {
		this.partNumber = partNumber;
	}
	public String getPartDescription() {
		return partDescription;
	}
	public void setPartDescription(String partDescription) {
		this.partDescription = partDescription;
	}
	public int getQuantity() {
		return quantity;
	}
	public void setQuantity(int quantity) {
		this.quantity = quantity;
	}
	public double getPricePerItem() {
		return pricePerItem;
	}
	public void setPricePerItem(double pricePerItem) {
		this.pricePerItem = pricePerItem;
	}	
	@Override
	public String toString() {
		return String.format("Invoice: \n {Part number: %s,Part description: %s, Quantity :%d,Price: %.2f}", getPartNumber(),
				getPartDescription(), getQuantity(), getPricePerItem());
	}
	@Override
	public double getPaymentAmount() {
		return getQuantity() * getPricePerItem();
	}

}
