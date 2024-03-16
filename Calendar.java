import java.util.Scanner;
public class Calendar {

    public static void main(String[] args) {
         Scanner in = new Scanner(System.in);
         int month,date,year;
         
         while(true) {
        	 System.out.println("Enter Month:");
             month = in.nextInt();
             if(month < 1 || month >12) {
            	 System.out.println("Invalid Month");
             }else {
            	 break;
             }
         }
        
         while(true) {
        	 System.out.println("Enter Date");
             date = in.nextInt();
             if(month ==2) {
            	 if(date <1 && date >29) {
            		 System.out.println("Invalid Date");
            	 }else {
            		 break;
            	 }
            	 
             }else {
            	 if(date <1 && date >31) {
            		 System.out.println("Invalid Date");
            	 }else {
            		 break;
            	 }
             }
         }

         while(true) {
        	 System.out.println("Enter Year");
             year = in.nextInt(); 
             if(year<0) {
            	 System.out.println("Invalid Year");
             }else {
            	 break;
             }
         }
         
        for(int i = 1; i < 50; i++) {
            if( year > (400 * i) && year < (400 * (i+1))) {
                countOddDays(i,year,month,date);
                break;
            }
        }
        
    }
    
    static void countOddDays(int number,int year, int month, int date) {
        int odd=0;
        int difference = year - (400 * number);
        int century = difference / 100;
        if(century == 1) {
            odd +=5;
        }else if(century == 2) {
            odd += 3;
        }else if(century == 3) {
            odd +=1;
        }
        int diffYear = (year - ((century * 100)+(400*number)) -1);
        int leapYear = diffYear / 4;
        int normalYear = diffYear - leapYear;
        int leapOddDays = leapYear * 2;
        int normalOddDays = normalYear;
        odd = odd + leapOddDays + normalOddDays;
        
        for ( int j = 1; j < month; j++) {
            int oddDays = getOddDays(diffYear+1,j);
            odd += oddDays;
        }
        odd =  (odd + (date %7))%7;
        System.out.println("Day of the Week:"+ getDay(odd));
    }
    
    static int getOddDays(int diffYear, int month) {
        switch(month) {
        case 1: case 3: case 5: case 7: case 8: case 10:case 12:
                return 3;
        case 4: case 6: case 9: case 11:
            return 2;
        case 2:
            if(diffYear % 4 == 0) {
                return 1;
            }else {
                return 0;
            }
        }
        return 0;
    }
    
    static String getDay(int odd) {
        switch(odd) {
        case 0: return "Sunday";
        case 1: return "Monday";
        case 2: return "Tuesday";
        case 3: return "Wednesday";
        case 4: return "Thursday";
        case 5: return "Friday";
        case 6: return "Saturday";
        default: return "Invalid";
        }
    }
}