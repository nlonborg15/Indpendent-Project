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
  }