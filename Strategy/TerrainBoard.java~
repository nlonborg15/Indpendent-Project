import java.util.*;

public class TerrainBoard
{
  public Unit[][] createRandom()
  {
    Unit[][] board = new Unit[(int)(Math.random()*40 + 10)][(int)(Math.random()*40 + 10)];
    return board;
  }
  public Unit[][] createCustom (int rw, int col)
  {
    Unit[][] board = new Unit[rw][col];
    return board;
  }
  
  public Unit[][] createWParameters(int rowMax, int rowMin, int colMax, int colMin)
  {
    Unit[][] board = new Unit[(int)(Math.random()*(rowMax-rowMin) + rowMin)][(int)(Math.random()*(colMax-colMin) + colMin)];
    return board;
  }
  public void printDisplay(Unit[][] display)
  {
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
        else
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
  public ArrayList<Unit> moveOrder(Player plyr1, Player plyr2)
  {
    int greatest = 0;
    ArrayList<Unit> allUnits = new ArrayList<Unit>();
    for (Unit k : plyr1.getUnits())
    {
      allUnits.add(k);
    }
    for (Unit k : plyr2.getUnits())
    {
      allUnits.add(k);
    }
    for (int i = allUnits.size(); i >= 0; i--)
    {
      int k = 0;
      while (allUnits.get(i).getSpeed() < allUnits.get(k).getSpeed())
      {
        k++;
      }
      allUnits.add(k, allUnits.get(i));
      allUnits.remove(i);
    }
    return allUnits;
  }
}