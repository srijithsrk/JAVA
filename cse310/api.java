import.java.time.*
public class Api {

   public static void main(String args[]) {
      Api Api = new Java8Tester();
      Api.testLocalDateTime();
   }
	
   public void testLocalDateTime() {
      // Get the current date and time
      LocalDateTime currentTime = LocalDateTime.now();
      System.out.println("Current DateTime: " + currentTime);
		
      LocalDate date1 = currentTime.toLocalDate();
      System.out.println("date1: " + date1);
		
      Month month = currentTime.getMonth();
      int day = currentTime.getDayOfMonth();
      int seconds = currentTime.getSecond();
		
      System.out.println("Month: " + month +"day: " + day +"seconds: " + seconds);
		
      LocalDateTime date2 = currentTime.withDayOfMonth(02).withYear(2018);
      System.out.println("date2: " + date2);
		
      //27 february 2018
      LocalDate date3 = LocalDate.of(2018, Month.FEBRUARY, 27);
      System.out.println("date3: " + date3);
		
      //11 hour 45 minutes
      LocalTime date4 = LocalTime.of(11, 45);
      System.out.println("date4: " + date4);
		
      //parse a string
      LocalTime date5 = LocalTime.parse("20:15:30");
      System.out.println("date5: " + date5);
   }
}