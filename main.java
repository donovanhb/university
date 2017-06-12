import java.util.Scanner;
import java.util.ArrayList;
 
/**
 * Write a description of class main here.
 * 
 * @author (your name) 
 * @version (a version number or a date)
 */
public class main
{
    public static void main(String args[]){
        University myUni = new University(50, "mit", "usa", "a level");
        System.out.println(myUni.getRanking());    
        
        Scanner input = new Scanner(System.in);
        
        System.out.println("name");
        String name = input.nextLine();
        
        System.out.println("country");
        String country = input.nextLine();
        
        System.out.println("requirments");
        String req = input.nextLine();
        
        System.out.println("ranking");
        int ranking = input.nextInt();
        
        
        
        
    }
}
