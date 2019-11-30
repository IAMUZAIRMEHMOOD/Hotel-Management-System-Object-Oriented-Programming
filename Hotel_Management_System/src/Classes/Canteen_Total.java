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
public class Canteen_Total extends Canteen implements Serializable{
    private static final long serialVersionUID = 1L;
    private int cost_burger,cost_beverages,cost_extras,cost_barbq,cost_chickenmania,cost_deals,total;
    void Canteen_Total()
    {
     cost_burger = 0;
     cost_beverages = 0;
     cost_extras = 0;
     cost_barbq = 0;
     cost_chickenmania = 0;
     cost_deals = 0;
     total = 0;
    }
    
    	public int getCost_burger() {
		return cost_burger;
	}


	public void setCost_burger(int cost_burger) {
		this.cost_burger = cost_burger;
	}


	public int getCost_beverages() {
		return cost_beverages;
	}


	public void setCost_beverages(int cost_beverages) {
		this.cost_beverages = cost_beverages;
	}


	public int getCost_extras() {
		return cost_extras;
	}


	public void setCost_extras(int cost_extras) {
		this.cost_extras = cost_extras;
	}


	public int getCost_barbq() {
		return cost_barbq;
	}


	public void setCost_barbq(int cost_barbq) {
		this.cost_barbq = cost_barbq;
	}


	public int getCost_chickenmania() {
		return cost_chickenmania;
	}


	public void setCost_chickenmania(int cost_chickenmania) {
		this.cost_chickenmania = cost_chickenmania;
	}


	public int getCost_deals() {
		return cost_deals;
	}


	public void setCost_deals(int cost_deals) {
		this.cost_deals = cost_deals;
	}


	public int getTotal() {
		return total;
	}


	public void setTotal(int total) {
		this.total = total;
	}	 
}
