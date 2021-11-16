import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class dateDemo {

   public dateDemo()
	{
		System.out.println("i am in constructor");
	} 
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub

		Date d = new Date(); // Date is an inbuilt method in java util class

		SimpleDateFormat sdf = new SimpleDateFormat("M/d/yyyy");
		System.out.println(sdf.format(d));
		
		System.out.println(d.toString()); // to make the object "d" readable we use "toString" method
		
		Calendar cal = Calendar.getInstance();
		
		SimpleDateFormat sd = new SimpleDateFormat("M/d/yyyy hh:mm:ss");
		System.out.println(sd.format(cal.getTime()));
		System.out.println(cal.get(Calendar.DAY_OF_MONTH));
		
		dateDemo dd = new dateDemo();
		
	}

}
