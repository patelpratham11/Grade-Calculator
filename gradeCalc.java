//begin import statements
import java.util.*;

public class gradeCalc{
  static Scanner input = new Scanner(System.in); //global scanner object
  public static void main(String[] args){
    System.out.println("Will this be a weighted grade? If YES then type 1, else type 0");
    int weighted = input.nextInt();
    if(weighted == 1){
      weightedCalc();
    } else{
      unweightedCalc();
    }
  }//end of the main method

  static void weightedCalc(){
    System.out.println("How many weighted sections do you have? Note: You can only calculate one section at a time");
    int sections = input.nextInt();
    double [] weightedGrades = new double[sections];
    System.out.println("Please be sure to enter the category you want to calculate first");
    double catWeighted = 0;
    for(int i = 0; i < sections; i++){
      System.out.println("Please enter the percent");
      double percent = input.nextDouble();
      System.out.println("Please enter the weightage for this section");
      double weightage = input.nextDouble();
      if(i == 0){
        catWeighted = weightage;
      }
      weightedGrades[i] = percent * weightage;
    }
    System.out.println("Please enter the percentage you would like");
    double wanted = input.nextDouble();
    double needed = wanted;
    for(int i = 0; i < sections; i++){
      if(i != 0){
        needed -= weightedGrades[i];
      }
      System.out.println("Category "+i+" percent (weighted) is: "+weightedGrades[i]+"%");
    }
    needed /= catWeighted;
    System.out.println("In order for you to get your desired grade of: "+wanted+", you will need "+needed+" ");
  }//end of method weightedCalc

  static void unweightedCalc(){
    System.out.println("Please enter the percentage you would like");
    double wanted = input.nextDouble();
    System.out.println("Please enter your current percentage");
    double current = input.nextDouble();
    double needed = (wanted * 2) - current;
    System.out.println("In order for you to get your desired grade of: "+wanted+", you will need "+needed+"\n on the next assignment");
  }//end of method unweightedCalc
}//end of class gradeCalc
