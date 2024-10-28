import java.util.Scanner;
public class Voting
{
public static void main(String args[])
{
Scanner input = new Scanner(System.in);
int candidate1Votes = 0;
int candidate2Votes = 0;
int candidate3Votes = 0; 
System.out.print("Enter your name: ");
String userName = input.nextLine();
System.out.print("Enter your age: ");
int userAge = input.nextInt();
if (userAge >= 18)
{
System.out.println("Select a candidate to vote for:");
System.out.println("1. Candidate 1");
System.out.println("2. Candidate 2");
System.out.println("3. Candidate 3"); 
int userSelection = input.nextInt();
if (userSelection == 1)
{
candidate1Votes++;
}
else if (userSelection == 2)
{
candidate2Votes++;
}
else if (userSelection == 3)
{
candidate3Votes++;
}
System.out.println("Thank you for voting, " + userName + "!");
}
else
{
System.out.println(" you are not eligible for vote.");
}
System.out.println("Candidate 1: " + candidate1Votes + " votes");
System.out.println("Candidate 2: " + candidate2Votes + " votes");
System.out.println("Candidate 3: " + candidate3Votes + " votes"); 
}
}