import java.util.Scanner;

public class Question3
{
  public static void main(String[] args)
  {
    /**
     * Reads integer entered by the user, multiplies the integer by itself and print out the result.
     * 
     * Hint: in.nextInt() to read integer
     */
     
    System.out.print("Enter an integer: ");
    Scanner intinput = new Scanner(System.in);
    int int1 = intinput.nextInt();

    for (int i = int1; i < 1000000 && i > 1; i = i * i){
      System.out.println(i);
    }
    
  }
}
