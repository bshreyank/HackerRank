import java.time.LocalDate;

public class YearCompletionPercentage {
   public static void main(String[] args) {
      // Get the current date
      LocalDate currentDate = LocalDate.now();
      
      // Get the number of days elapsed since the start of the year
      int dayOfYear = currentDate.getDayOfYear();
      
      // Calculate the total number of days in the year
      int totalDays = currentDate.isLeapYear() ? 366 : 365;
      
      // Calculate the percentage of the year completed
      double percentageCompleted = (double) dayOfYear / totalDays * 100;
      
      // Print the result
      System.out.printf("The percentage of the year completed is: %.1f%%", percentageCompleted);
   }
}
