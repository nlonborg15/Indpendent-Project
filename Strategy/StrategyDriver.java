import java.util.Scanner;

public class StrategyDriver
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    Player plyr1 = new Player();
    Player plyr2 = new Player();
    TerrainBoard terra = new TerrainBoard();
    Game log = new Game();
    System.out.println("How many units would you like to use?");
    int numUnits = in.nextInt();
    System.out.println("Player 1, of the " + numUnits + " units, how many would you like to be of each class?");
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
    plyr1.createUnits(numW1, numM1, numA1, numUnits);
    System.out.println("Player 2, of the " + numUnits + " units, how many would you like to be of each class?");
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
    plyr2.createUnits(numW2, numM2, numA2, numUnits);
    Unit[][] b1 = terra.createCustom((int)(numUnits * 1.5 + 5), (int)(numUnits * 1.5 + 5));
    for (Unit k: plyr1.getUnits())
    {
      for (int i = (int)((numUnits *1.5 +5)/3); i< plyr1.getUnits().size(); i++)
      {
        b1[0][i] = k;
      }
    }
    for (Unit k: plyr2.getUnits())
    {
      for (int i = (int)((numUnits *1.5 +5)/3); i< plyr2.getUnits().size(); i++)
      {
        b1[(int)(numUnits * 1.5 + 4)][i] = k;
      }
    }
    log.play(plyr1, plyr2, terra.moveOrder(plyr1, plyr2), b1);
  }
} 