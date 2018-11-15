import java.util.Scanner;
public class BadSubscriptCaught
{
   public static void main(String[] args)
   {
       String firstNames[] = {"Bob", "Rockers", "Love", "Bibek", "Logan", "Roy", "Kevin", "Gupta", "Jacob", "Angel"};
      
       Scanner input = new Scanner(System.in);
      
       try
       {
           System.out.print("Enter an index in the array: ");
           int index = input.nextInt();
          
           System.out.println("The first name at the index " + index + ": " + firstNames[index]);
       }
       catch(ArrayIndexOutOfBoundsException e)
       {          
           System.out.println(e.getMessage() + " is an invalid index");
           System.out.println("The index entered by the user is out of range. So the ArrayIndexOutOfBoundsException is occurred.");
           e.printStackTrace();
       }
   }
}