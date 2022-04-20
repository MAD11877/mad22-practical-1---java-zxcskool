import java.util.Scanner;
import java.util.ArrayList;

public class Question5
{
  public static void main(String[] args)
  {
    /**
     * Prompt the user for number. This input indicates the number of integers the user will be entering next. 
     * Print out the mode (highest occurrence) from the set of integers. 
     *    e.g.
     *     > 5
     *     > 2
     *     > 4
     *     > 1
     *     > 3
     *     > 4
     *     4
     * 
     *    e.g.
     *     > 4
     *     > 2
     *     > 2
     *     > 3
     *     > 3
     *     2
     * Hint: Use a loop to get input. Use another 2 loops to find the mode
     */
     
    Scanner in = new Scanner(System.in);
    /*System.out.print("Enter max number of integer: ");*/
    int amtofno = in.nextInt();

    int i = 0;
    ArrayList<Integer> numblist = new ArrayList<>();
    while (i < amtofno){
      /*System.out.print("Enter an integer: ");*/
      int numbs = in.nextInt();
      numblist.add(numbs);
      i++;
    }

    int mode = numblist.get(0);
    int countmode = 0;
    for (int j = 0; j < numblist.size(); j ++){
      int intvalue = numblist.get(j);
      int count = 0;
      for (int k = 0; k < numblist.size(); k++){
        if (numblist.get(k) == intvalue){
          count++;
        }
        if (count > countmode){
          mode = numblist.get(k);
          countmode = count;
        }
      }
    }
    System.out.println(/*"Mode is "*/ + mode);
  }
}
