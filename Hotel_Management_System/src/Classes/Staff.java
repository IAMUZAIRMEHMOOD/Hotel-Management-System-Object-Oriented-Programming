/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Classes;

import java.io.Serializable;

/**+
 *
 * @author Uzair
 */
public class Staff extends Person implements Serializable 
{ 
    private static final long serialVersionUID = 1L;
  private  String catagory;
  private  float salary,bonusprice;
   public static int no_of_staff = 1;
    
    
		public String getCatagory() {
			return catagory;
		}
		public void setCatagory(String catagory) {
			this.catagory = catagory;
		}
		public float getSalary() {
			return salary;
		}
		public void setSalary(float salary) {
			this.salary = salary;
		}
		public float getBonusprice() {
			return bonusprice;
		}
		public void setBonusprice(float bonusprice) {
			this.bonusprice = bonusprice;
		}
		public static int getNo_of_staff() {
			return no_of_staff;
		}
		public static void setNo_of_staff(int no_of_staff) {
			Staff.no_of_staff = no_of_staff;
		}
    
}
