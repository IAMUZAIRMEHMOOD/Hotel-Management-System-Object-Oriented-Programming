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
public class Canteen implements Serializable{
     private static final long serialVersionUID = 1L;
    private int burger_crunchychicken,burger_crunchybeef,burger_grilled_hunterbeef,beverages_softdrink,beverages_mineralwater,extras_cheese,extras_souces,barbq_chicken,
        barbq_malai,barbq_green,chickenmania_flamingwing,chickenmania_crunchyfriedchicken,chickenmania_chickenstripes,deals_crunchychickenburger_softdrink_chickenstripes,
        deals_crunchybeefburger_softdrink_crunchyfriedchicken;
   
     void Canteen()
    {
        burger_crunchychicken=0;
        burger_crunchybeef=0;
        burger_grilled_hunterbeef=0;
        beverages_softdrink=0;
        beverages_mineralwater=0;
        extras_cheese=0;
        extras_souces=0;
        barbq_chicken=0;
        barbq_malai=0;
        barbq_green=0;
        chickenmania_flamingwing=0;
        chickenmania_crunchyfriedchicken=0;
        chickenmania_chickenstripes=0;
        deals_crunchychickenburger_softdrink_chickenstripes=0;
        deals_crunchybeefburger_softdrink_crunchyfriedchicken=0;
    
    }
    
    public int getBurger_crunchychicken() {
		return burger_crunchychicken;
	}

	public void setBurger_crunchychicken(int burger_crunchychicken) {
		this.burger_crunchychicken = burger_crunchychicken;
	}

	public int getBurger_crunchybeef() {
		return burger_crunchybeef;
	}

	public void setBurger_crunchybeef(int burger_crunchybeef) {
		this.burger_crunchybeef = burger_crunchybeef;
	}

	public int getBurger_grilled_hunterbeef() {
		return burger_grilled_hunterbeef;
	}

	public void setBurger_grilled_hunterbeef(int burger_grilled_hunterbeef) {
		this.burger_grilled_hunterbeef = burger_grilled_hunterbeef;
	}

	public int getBeverages_softdrink() {
		return beverages_softdrink;
	}

	public void setBeverages_softdrink(int beverages_softdrink) {
		this.beverages_softdrink = beverages_softdrink;
	}

	public int getBeverages_mineralwater() {
		return beverages_mineralwater;
	}

	public void setBeverages_mineralwater(int beverages_mineralwater) {
		this.beverages_mineralwater = beverages_mineralwater;
	}

	public int getExtras_cheese() {
		return extras_cheese;
	}

	public void setExtras_cheese(int extras_cheese) {
		this.extras_cheese = extras_cheese;
	}

	public int getExtras_souces() {
		return extras_souces;
	}

	public void setExtras_souces(int extras_souces) {
		this.extras_souces = extras_souces;
	}

	public int getBarbq_chicken() {
		return barbq_chicken;
	}

	public void setBarbq_chicken(int barbq_chicken) {
		this.barbq_chicken = barbq_chicken;
	}

	public int getBarbq_malai() {
		return barbq_malai;
	}

	public void setBarbq_malai(int barbq_malai) {
		this.barbq_malai = barbq_malai;
	}

	public int getBarbq_green() {
		return barbq_green;
	}

	public void setBarbq_green(int barbq_green) {
		this.barbq_green = barbq_green;
	}

	public int getChickenmania_flamingwing() {
		return chickenmania_flamingwing;
	}

	public void setChickenmania_flamingwing(int chickenmania_flamingwing) {
		this.chickenmania_flamingwing = chickenmania_flamingwing;
	}

	public int getChickenmania_crunchyfriedchicken() {
		return chickenmania_crunchyfriedchicken;
	}

	public void setChickenmania_crunchyfriedchicken(int chickenmania_crunchyfriedchicken) {
		this.chickenmania_crunchyfriedchicken = chickenmania_crunchyfriedchicken;
	}

	public int getChickenmania_chickenstripes() {
		return chickenmania_chickenstripes;
	}

	public void setChickenmania_chickenstripes(int chickenmania_chickenstripes) {
		this.chickenmania_chickenstripes = chickenmania_chickenstripes;
	}

	public int getDeals_crunchychickenburger_softdrink_chickenstripes() {
		return deals_crunchychickenburger_softdrink_chickenstripes;
	}

	public void setDeals_crunchychickenburger_softdrink_chickenstripes(
			int deals_crunchychickenburger_softdrink_chickenstripes) {
		this.deals_crunchychickenburger_softdrink_chickenstripes = deals_crunchychickenburger_softdrink_chickenstripes;
	}

	public int getDeals_crunchybeefburger_softdrink_crunchyfriedchicken() {
		return deals_crunchybeefburger_softdrink_crunchyfriedchicken;
	}

	public void setDeals_crunchybeefburger_softdrink_crunchyfriedchicken(
			int deals_crunchybeefburger_softdrink_crunchyfriedchicken) {
		this.deals_crunchybeefburger_softdrink_crunchyfriedchicken = deals_crunchybeefburger_softdrink_crunchyfriedchicken;
	}

}
