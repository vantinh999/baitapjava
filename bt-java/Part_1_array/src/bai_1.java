
public class bai_1 {

	  public static boolean contains(int[] arr, int item) {
	      for (int n : arr) {
	         if (item == n) {
	            return true;
	         }
	      }
	      return false;
	   }
	   public static void main(String[] args) {
	          int[] my_array1 = {
	            1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 12, 15};
	      System.out.println(contains(my_array1, 10));
	      System.out.println(contains(my_array1, 20));
	   }
}