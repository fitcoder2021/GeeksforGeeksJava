package GfgoutputExample;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

public class DateTimeFormat {

    public static void main(String[] args) throws ParseException {

        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("dd-mm-yyyy");

        String str = simpleDateFormat.format(new Date());

        System.out.println("formate date :"+str);

        str = "01/02/2023";

        simpleDateFormat = new SimpleDateFormat("dd-mm-yyyy");

        Date date = simpleDateFormat.parse(str);
        System.out.println("parse Date :"+date);

    }


}
