import java.util.*;

public class Unit
{
  String name;
  String job;
  int[] stats = new int[5];
  //int will;--stretch goal stat
  //int stamina;--stretch goal stat
  int exp;
  int level;
  int move;
  int atkRange;
  int[] growthRates = new int[5];
  boolean playerUnit;
  public String getName()
  {
    return name;
  }
  public String getJob() //unit's job. Can be mage, warrior, or archer
  {
    return job;
  }
  public String getJobMod()//returns first letter of job
  {
    return job.substring(0,1);
  }
  public int getHP()
  {
    return stats[0];
  }
  public void recieveDam(int dam)//resets HP based on condition
  {
    stats[0] -= dam;
  }
  public int getAttack()
  {
    return stats[1];
  }
  public int getSpeed()
  {
    return stats[2];
  }
  public int getSkill()
  {
    return stats[3];
  }
  public int getDef()
  {
    return stats[4];
  }
  public boolean getPlayers() //keeps track of whether or not it's the player's unit
  {
    return playerUnit;
  }
  public void lvlUp()//levels unit up
  {
    level++;
    exp = exp-100;
    for (int i = 0; i < growthRates.length; i++)
    {
      if (Math.random() * 100 <= growthRates[i])
      {
        stats[i]++;
      }
    }
  }
  public int getMove()
  {
    return move;
  }
  public int[] getGrowths()
  {
    return growthRates;
  }
  public void move(Unit[][] board)//moves the unit to another spot within its movement range
  {
    Scanner in = new Scanner(System.in);
    System.out.println("Please enter the coordinates of the point you'd like to move this unit to.");
    System.out.print("x-value (right number):");
    int xVal = in.nextInt();
    System.out.print("y-value (left number):");
    int yVal = in.nextInt();
    if (board[xVal-1][yVal-1] != null)
    {
      System.out.println("Sorry, that space is occupied. Please choose again");
      move(board);
    }
    else
    {
      board[xVal][yVal] = this;
    }
  }
  
  public void death(Player p1, Player p2)//removes the unit from the ArrayList of the player who controls it
  {
    for (Unit k : p1.getUnits())
    {
      if (k == this)
      {
        p1.getUnits().remove(k);
      }
    }
    for (Unit k : p2.getUnits())
    {
      if (k == this)
      {
        p2.getUnits().remove(k);
      }
    }
  }
  
  public ArrayList<Unit> canAttack(Unit[][] board)//meant to produce a list of the units within this units attack range
  {
    int x = 0;
    int y = 0;
    for (int i = 0; i < board.length; i++)
    {
      for (int p = 0; i < board[0].length; p++)
      {
        if (board[i][p] == this)
        {
          x = i;
          y = p;
        }
      }
    }
    
    ArrayList<Unit> canAtk = new ArrayList<Unit>();
    int k = y;
    for (int i = x; (i + k) - (x+y) < atkRange; x++)
    {
      for (k = y; (i + k) - (x+y) < atkRange; y++)
      {
        if (board[i][k] != null)
        {
          canAtk.add(board[i][k]);
        }
      }
    }
    return canAtk;
  }
  
  public void attack(Unit victim)//deals damage to unit based on strength and victim's defense
  {
    if (Math.random() * 100 <= stats[3] * 5)
    {
      victim.recieveDam(stats[4] - victim.getDef());
    }
  }
}