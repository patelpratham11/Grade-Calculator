import java.util.*;


public class RNG{
  public static void main(String[]args){
    Scanner input = new Scanner(System.in);
    System.out.println("How many numbers do you want to generate?");
    int numGen = input.nextInt();
    int [] values = new int [numGen];
    System.out.println("What is the maximum?");
    int max = input.nextInt();
    for(int i = 0; i < numGen; i++){
      int num = (int)(Math.random() * max)+1;
      for(int j = 0; j < numGen; j++){
        if(values[j] == num){
          i--;
          break;
        }
      }//end of inner for
      values[i] = num;
    }//end of for numGen
    Arrays.sort(values);
    System.out.println("---------");
    for(int i = 0; i < numGen; i++){
      System.out.println(values[i]);
    }
  }

}
