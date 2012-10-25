/**
 * 
 */
package firstPackage;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;

public class Firstclass {
	/**
	 * **************************************************
	 * Student Name: Tirthankar Bhaumik
	 * Student ID: 12815482
	 * Course: MSc Computing for Financial Services
	 * Assignment: ISE Assignment 1
	 * **************************************************
	 */

	public static void main(String[] args) {
		DateFormat dateFormat = new SimpleDateFormat ("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		System.out.println(dateFormat.format(date));
		


	}

}
