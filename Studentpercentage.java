import java.util.Scanner;
public class Studentpercentage {
    public static void main(String[] args){
    
    Scanner sc = new Scanner (System.in);
    System.out.println("Taking input form the user");
    System.out.println("Enter marks of subject 1 (Out of 100)");
    int Subject1 = sc.nextInt();
    System.out.println("Enter marks of subject 2 (Out of 100");
    int Subject2 = sc.nextInt();
     System.out.println("Enter marks of subject 3 (Out of 100)");
    int Subject3 = sc.nextInt();
     System.out.println("Enter marks of subject 4 (Out of 100)");
    int Subject4 = sc.nextInt();
     System.out.println("Enter marks of subject 5 (Out of 100)");
    int Subject5 = sc.nextInt();
    //Calculate total numbers
    int totalMarks = Subject1 + Subject2 + Subject3 + Subject4 + Subject5;
    //Maximum Marks 
    int maxMarks = 5 * 100;
    //Calculate percentage 
    double percentage = (double) totalMarks / maxMarks * 100;
    System.out.println("Percentage" + percentage + "%");
    sc.close();
}
  } 

