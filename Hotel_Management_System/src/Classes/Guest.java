/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.Serializable;

/**
 *
 * @author Uzair
 */
public class Guest extends Person implements Serializable{
    private static final long serialVersionUID = 1L;
   private char catagory;
   private float bill,roomrent,others,discount;
   private int no_of_guest = 1;
   
     public char getCatagory() {
		return catagory;
	}
	public void setCatagory(char catagory) {
		this.catagory = catagory;
	}
	public float getBill() {
		return bill;
	}
	public void setBill(float bill) {
		this.bill = bill;
	}
	public float getRoomrent() {
		return roomrent;
	}
	public void setRoomrent(float roomrent) {
		this.roomrent = roomrent;
	}
	public float getOthers() {
		return others;
	}
	public void setOthers(float others) {
		this.others = others;
	}
	public float getDiscount() {
		return discount;
	}
	public void setDiscount(float discount) {
		this.discount = discount;
	}
	public int getNo_of_guest() {
		return no_of_guest;
	}
	public void setNo_of_guest(int no_of_guest) {
		no_of_guest = no_of_guest;
	}
    
}
