import java.util.Scanner;

public class StrategyDriver
{
  public static void main(String[] args)
  {
    Scanner in = new Scanner(System.in);
    System.out.println("Player 1, what's your name?");
    Player plyr1 = new Player(in.next());
    System.out.println("Player 2, what's your name?");
    Player plyr2 = new Player(in.next());
    TerrainBoard terra = new TerrainBoard();
    Game log = new Game();
    System.out.println("How many units would you like to use?");
    int numUnits = in.nextInt();
    System.out.println( plyr1.getName() + ", of the " + numUnits + " units, how many would you like to be of each class?");
    System.out.print("Warriors: ");
    int numW1 = in.nextInt();
    int numM1 = 0;
    int numA1 = 0;
    if (numW1 < numUnits)
    {
      System.out.print("Mages: ");
      numM1 = in.nextInt();
      if (numW1 + numM1 < numUnits)
      {
        System.out.print("Archers: ");
        numA1 = in.nextInt();
      }
    }
    while ((numW1 + numM1 + numA1) > numUnits)
    {
      System.out.println("Sorry the numbers don't match up");
      System.out.print("Warriors: ");
      numW1 = in.nextInt();
      if (numW1 < numUnits)
      {
        System.out.print("Mages: ");
        numM1 = in.nextInt();
        if (numW1 + numM1 < numUnits)
        {
          System.out.print("Archers: ");
          numA1 = in.nextInt();
        }
      }
    }
    plyr1.createUnits(numW1, numM1, numA1, numUnits);
    System.out.println(plyr2.getName() + ", of the " + numUnits + " units, how many would you like to be of each class?");
    System.out.print("Warriors: ");
    int numW2 = in.nextInt();
    int numM2 = 0;
    int numA2 = 0;
    if (numW2 < numUnits)
    {
      System.out.print("Mages: ");
      numM2 = in.nextInt();
      if (numW2 + numM2 < numUnits)
      {
        System.out.print("Archers: ");
        numA2 = in.nextInt();
      }
    }
    while ((numW2 + numM2 + numA2) > numUnits)
    {
      System.out.println("Sorry the numbers don't match up");
      System.out.print("Warriors: ");
      numW2 = in.nextInt();
      if (numW2 < numUnits)
      {
        System.out.print("Mages: ");
        numM2 = in.nextInt();
        if (numW2 + numM2 < numUnits)
        {
          System.out.print("Archers: ");
          numA2 = in.nextInt();
        }
      }
    }
    plyr2.createUnits(numW2, numM2, numA2, numUnits);
    Unit[][] b1 = terra.createCustom((int)(numUnits * 1.5 + 5), (int)(numUnits * 1.5 + 5));
    int i = (int)((numUnits *1.5 +5)/3);
    for (Unit k: plyr1.getUnits())
    {
      b1[0][i] = k;
      i++;
    }
    i = (int)((numUnits *1.5 +5)/3);
    for (Unit k: plyr2.getUnits())
    {
      b1[(b1[0].length -1)][i] = k;
      i++;
    }
    log.play(plyr1, plyr2, terra, b1);
  }
} 