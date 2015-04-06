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
          System.out.print("[" + s.getName() + "]");
          sInt++;
        }
        else
        {
          System.out.print("[" +kInt + "," + sInt + "]");
          sInt++;
        }
      }
      kInt++;
    }
  }
}