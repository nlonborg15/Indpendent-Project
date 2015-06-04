import java.util.*;

public class TerrainBoard
{
  public Unit[][] createRandom()//creates a randomized board of Units
  {
    Unit[][] board = new Unit[(int)(Math.random()*40 + 10)][(int)(Math.random()*40 + 10)];
    return board;
  }
  public Unit[][] createCustom (int rw, int col)//creates a customized board
  {
    Unit[][] board = new Unit[rw][col];
    return board;
  }
  
  public Unit[][] createWParameters(int rowMax, int rowMin, int colMax, int colMin)//creates a board that is randomized but not completely random
  {//but instead created within given parameters
    Unit[][] board = new Unit[(int)(Math.random()*(rowMax-rowMin) + rowMin)][(int)(Math.random()*(colMax-colMin) + colMin)];
    return board;
  }
  public void printDisplay(Unit[][] display)//prints out the board by printing unit names and the first letter of its class in brackets.
  {//if there is no unit in the space then it prints out the points coordinates in brackets
    int kInt = 1;
    for (Unit[] k : display)
    {
      int sInt = 1;
      for (Unit s: k)
      {
        if (s != null)
        {
          System.out.print("[" + s.getName() + "(" + s.getJobMod() + ")" + "]");
          sInt++;
        }
        else//this section is all about trying to get the board to come out as even and symmetrical as possible
        {
          if (kInt < 10 && sInt < 10)
          {
            System.out.print("[0" +kInt + ",0" + sInt + "]");
            sInt++;
          }
          else if (kInt < 10 && sInt >= 10)
          {
            System.out.print("[0" +kInt + "," + sInt + "]");
            sInt++;
          }
          else if (kInt >= 10 && sInt < 10)
          {
            System.out.print("[" +kInt + ",0" + sInt + "]");
            sInt++;
          }
          else
          {
            System.out.print("[" +kInt + "," + sInt + "]");
            sInt++;
          }
        }
      }
       System.out.println();
        kInt++;
    }
  }
  
  public ArrayList<Unit> moveOrder(Player plyr1, Player plyr2)//creates the order in which all units will move based on the units' speed
  {
    ArrayList<Unit> allUnits = new ArrayList<Unit>();
    for (Unit k : plyr1.getUnits())
    {
      allUnits.add(k);
    }
    for (Unit k : plyr2.getUnits())
    {
      allUnits.add(k);
    }
    for (int i = allUnits.size()-1; i >= 0; i--)
    {
      int k = 0;
      while (allUnits.get(i).getSpeed() < allUnits.get(k).getSpeed())
      {
        k++;
      }
      allUnits.add(k, allUnits.get(i));
      allUnits.remove(i + 1);
    }
    return allUnits;
  }
}
