import java.util.Date;
import java.text.DateFormat;
import java.text.SimpleDateFormat;
import java.util.Calendar;


public class Receipt {
	private Calendar cal = Calendar.getInstance();
    private Date receipt;

    public Receipt() {
    	getReceipt();
    }


    public void getReceipt() {
    	receipt = new Date();
    	cal.setTime(receipt);
        cal.add(Calendar.DATE, 3);
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd MMMM yyyy");
        System.out.println(simpleDateFormat.format(cal.getTime()));

    }
    
    public static void main(String[] args) {
    	Receipt rec = new Receipt();
    }
    

    
}
