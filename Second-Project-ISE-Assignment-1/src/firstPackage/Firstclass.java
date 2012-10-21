/**
 * 
 */
package firstPackage;
import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;


/**
 * @author TBhaumik
 *
 */
public class Firstclass {

	public static void main(String[] args) {
		DateFormat dateFormat = new SimpleDateFormat ("yyyy/MM/dd HH:mm:ss");
		Date date = new Date();
		System.out.println(dateFormat.format(date));
		


	}

}
