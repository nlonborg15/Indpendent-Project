import java.util.*;

public class Player
{
  ArrayList<Unit> playersUnits = new ArrayList<Unit>();
  
  public ArrayList<Unit> getUnits()
  {
    return playersUnits;
  }
  
  public void createUnits(int wrrs, int mags, int achrs, int total)
  {
    Unit[] units = new Unit[total];
    Scanner in = new Scanner(System.in);
    for (int w = 0; w < wrrs; w++)
    {
      System.out.print("Warrior(" + (w+1) + ") name?");
      String name = in.next();
      playersUnits.add(new Warrior(name, true));
    }
    for (int m = 0; m < mags; m++)
    {
      System.out.print("Mage(" + (m+1) + ") name?");
      String name = in.next();
      playersUnits.add(new Mage(name, true));
    }
    for (int a = 0; a < achrs; a++)
    {
      System.out.print("Archer(" + (a+1) + ") name?");
      String name = in.next();
      playersUnits.add(new Archer(name, true));
    }
  }
}

