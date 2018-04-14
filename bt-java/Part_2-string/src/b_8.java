public class b_8 {
    
   public static void main(String[] args)
    {
        String str1 = "Xin chao cac ban.";
        String str2 = "Minh la Chau.";


        String startStr = "Xin";

        boolean starts1 = str1.startsWith(startStr);
        boolean starts2 = str2.startsWith(startStr);

        System.out.println( str1 + " bat dau voi : " +
             startStr + "? " + starts1);
        System.out.println(str2 + " bat dau voi : " +
             startStr + "? " + starts2);
    }
}