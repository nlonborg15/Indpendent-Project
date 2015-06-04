import java.util.*;

public class Player
{
  private String name;
  public Player(String nombre)
  {
    name = nombre;
  }
  ArrayList<Unit> playersUnits = new ArrayList<Unit>();//stores all the units the player currently has at this point
  
  public ArrayList<Unit> getUnits()//gives all the units a given player has
  {
    return playersUnits;
  }
  
  public void createUnits(int wrrs, int mags, int achrs, int total)//takes the number of warrios, mages, and archers the player wants add creates and adds
  {//them to the playersUnits ArrayList
    Unit[] units = new Unit[total];
    Scanner in = new Scanner(System.in);
    for (int w = 0; w < wrrs; w++)
    {
      System.out.print("Warrior(" + (w+1) + ") name?");
      String name = in.next();
      playersUnits.add(new Warrior(name, this));
    }
    for (int m = 0; m < mags; m++)
    {
      System.out.print("Mage(" + (m+1) + ") name?");
      String name = in.next();
      playersUnits.add(new Mage(name, this));
    }
    for (int a = 0; a < achrs; a++)
    {
      System.out.print("Archer(" + (a+1) + ") name?");
      String name = in.next();
      playersUnits.add(new Archer(name, this));
    }
  }
  
  public String getName()
  {
    return name;
  }
}

