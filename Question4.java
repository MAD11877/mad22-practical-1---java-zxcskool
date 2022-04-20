import java.util.Scanner;

public class Question4
{
  public static void main(String[] args)
  {
    /**
     * Prints a right angle triangle with *. The base of the triangle depends on the integer given.
     *    e.g.
     *     > 5
     *     *****
     *     ****
     *     ***
     *     **
     *     *
     * 
     * Hint: 2 loops are required. System.out.print(...) to print on single line.
     */
     
    System.out.print("Enter an integer: ");
    Scanner userinput = new Scanner(System.in);
    int userint = userinput.nextInt();

    int i = 0;
    while (i < userint){
      for (int j = userint; j != i; j--){
        System.out.print("*");
      }
      System.out.println();
      i++;
    }
    
  }
}
