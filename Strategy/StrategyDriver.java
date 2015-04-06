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
    //Unit[] plyr1s = new Unit[numUnits];
    //Unit[] plyr2s = new Unit[numUnits];
    System.out.println("Player 1, of the " + numUnits + "units, how many would you like to be of each class?");
    System.out.print("Warriors: ");
    int numW1 = in.nextInt();
    System.out.print("Mages: ");
    int numM1 = in.nextInt();
    System.out.print("Archers: ");
    int numA1 = in.nextInt();
    while ((numW1 + numM1 + numA1) > numUnits)
    {
      System.out.println("Sorry the numbers don't match up");
      System.out.print("Warriors: ");
      numW1 = in.nextInt();
      System.out.print("Mages: ");
      numM1 = in.nextInt();
      System.out.print("Archers: ");
      numA1 = in.nextInt();
    }
    System.out.println("Player 1, of the " + numUnits + "units, how many would you like to be of each class?");
    System.out.print("Warriors: ");
    int numW2 = in.nextInt();
    System.out.print("Mages: ");
    int numM2 = in.nextInt();
    System.out.print("Archers: ");
    int numA2 = in.nextInt();
    while ((numW2 + numM2 + numA2) > numUnits)
    {
      System.out.println("Sorry the numbers don't match up");
      System.out.print("Warriors: ");
      numW2 = in.nextInt();
      System.out.print("Mages: ");
      numM2 = in.nextInt();
      System.out.print("Archers: ");
      numA2 = in.nextInt();
    }
  }
  public void createUnits(int wrrs, int mags, int achrs, int total)
  {
    Unit[] units = new Unit[total];
    Scanner in = new Scanner(System.in);
    for (int w = 0; w < wrrs; w++)
    {
      System.out.print("Unit name?");
      String name = in.next();
      units[w] = new Warrior(name, true);
    }
    for (int m = 0; m < mags; m++)
    {
      System.out.print("Unit name?");
      String name = in.next();
      units[m + wrrs] = new Mage(name, true);
    }
    for (int a = 0; a < achrs; a++)
    {
      System.out.print("Unit name?");
      String name = in.next();
      units[a + mags + wrrs] = new Archer(name, true);
    }
  }
} 