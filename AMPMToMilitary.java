import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class ConvertToMilitaryTime {

    static String timeConversion(String s) {
        String hour   = findHour(s);
        String minute = findMinute(s);
        String second = findSecond(s);
        int hourInt = Integer.parseInt(hour);        
        if(addTwelveHours(s) && hourInt!=12){

            hourInt=hourInt+12;
            hour = String.valueOf(hourInt);
          
       
        }
        
        if(minusTwelveHours(s) && hourInt==12){
            hour="00";
        }
        
        String concat = hour+":"+minute+":"+second;
    return concat;

    }

    public static void main(String[] args) {
    	System.out.println("Enter a AM/PM Timestamp. \n For Example: \"07:05:45PM\"");
        Scanner in = new Scanner(System.in);
        String s = in.next();
        String result = timeConversion(s);
        System.out.println(result);
        

    }
    
    
    public static boolean addTwelveHours(String s){
        String PM = "PM";
        boolean bool = s.toLowerCase().contains(PM.toLowerCase());
        return bool;
    }
    public static boolean minusTwelveHours(String s){
        String AM = "AM";
        boolean bool = s.toLowerCase().contains(AM.toLowerCase());
        return bool;
    }    
    
    public static String findHour(String s){
        String hour = s.substring(0,2);
        return hour;
    }
    public static String findMinute(String s){
        String minute = s.substring(3,5);
        return minute;
    }
    public static String findSecond(String s){
        String second = s.substring(6,8);
        return second;
    }
    
    
    
}
