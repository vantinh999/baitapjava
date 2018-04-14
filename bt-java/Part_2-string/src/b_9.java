public class b_9 {
    
   public static void main(String[] args)
    {
        String str = "Co ay hat rat hay.";

        String new_str = str.replaceAll("hay", "do");
       
        System.out.println("Chuoi ban dau : " + str);
        System.out.println("Chuoi moi : " + new_str);
    }
}