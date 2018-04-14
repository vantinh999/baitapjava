import java.util.Calendar;

public class b_10 {
 
 public static void main(String[] args) { 
    Calendar c = Calendar.getInstance();
      System.out.println("Ngay va gio hien tai :"); 
      System.out.format("%tB %te, %tY%n", c, c, c);
      System.out.format("%tl:%tM %tp%n", c, c, c); 
   }
}