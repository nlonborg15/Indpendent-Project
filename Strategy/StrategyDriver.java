import java.util.Scanner;

public class StrategyDriver
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    Player plyr1 = new Player();
    Player plyr2 = new Player();
    System.out.println("How many units would you like to use?");
    int numUnits = in.nextInt();
    Unit[] plyr1s = new Unit[numUnits];
    Unit[] plyr2s = new Unit[numUnits];
  }
} 