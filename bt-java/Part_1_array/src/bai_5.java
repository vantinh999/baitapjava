import java.util.Arrays; 
public class bai_5 {
public static void main(String[] args){   
    
    int[] my_array1 = {
            3, 6, 34, 8, 0 , 12, 20, 64};
            
    String[] my_array2 = {
            "Nhat",
            "Loc",
            "Cuong",
            "Nguyen",
            "Chau",
            "Hanh"
        };        
    System.out.println("Mang so nguyen goc : "+Arrays.toString(my_array1));
    Arrays.sort(my_array1);
    System.out.println("Mang so sap xep tang dan : "+Arrays.toString(my_array1));
    
    System.out.println("Mang chu goc : "+Arrays.toString(my_array2));
    Arrays.sort(my_array2);
    System.out.println("Mang chu sap xep theo chu cai : "+Arrays.toString(my_array2));
    }
}