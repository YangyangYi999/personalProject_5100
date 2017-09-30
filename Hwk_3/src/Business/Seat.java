/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Business;

/**
 *
 * @author yiyangyang
 */
public class Seat {
	
	private int row;
	private int col;
	private int price;
	private Customer customer;


	public Seat(Customer customer, int row, int col) {
		setRow(row);
		setCol(col);
		setCustomer(customer);
		setPrice();
	}
	
	public Seat() {
		
	}


	public Customer getCustomer() {
		return customer;
	}

	public void setCustomer(Customer customer) {
		this.customer = customer;
	}

	public int getRow() {
		return row;
	}

	public void setRow(int row) {
		this.row = row;
	}

	public int getCol() {
		return col;
	}

	public void setCol(int col) {
		this.col = col;
	}

	public int getPrice() {
		return price;
	}

	public void setPrice(int price) {
		this.price = price;
	}

	public void setPrice() {
		switch (this.col) {
		case 0:
		case 5:
			setPrice(200);
			break;
		case 1:
		case 4:
			setPrice(100);
			break;
		case 2:
		case 3:
			setPrice(80);
			break;
		default:
			break;
		}
	}


}
