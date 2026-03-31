package functionalinterface;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;

interface DateUtils {

    static String format(LocalDate date, String pattern) {
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(pattern);
        return date.format(formatter);
    }
}

public class DateValidator{
	public static void main(String[] args) {
		LocalDate invoiceDate = LocalDate.now();

        String format1 = DateUtils.format(invoiceDate, "dd-MM-yyyy");
        String format2 = DateUtils.format(invoiceDate, "yyyy/MM/dd");
        String format3 = DateUtils.format(invoiceDate, "MMM dd, yyyy");

        System.out.println(format1);
        System.out.println(format2);
        System.out.println(format3);
	}
}


