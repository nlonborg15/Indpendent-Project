import java.util.*;

public class Unit
{
  TerrainBoard terra = new TerrainBoard();
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
  Player owner;
  
  int xCoord = 0;
  int yCoord = 0; //these two ints for the whereAmI? class so it can actually discover the unit's own location
  
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
  public Unit[][] move(Unit[][] board)//moves the unit to another spot within its movement range
  {
    Scanner in = new Scanner(System.in);
    terra.printDisplay(board);
    this.whereAmI(board);
    System.out.println(owner.getName() + ", please enter the coordinates of the point you'd like to move " + this.getName() + " to.");
    System.out.println(this.getName() + " is a " + this.getJob() + " and so can move " + this.getMove() + " spaces.");
    System.out.print("x-value (right number):");
    int xVal = in.nextInt() - 1;
    System.out.print("y-value (left number):");
    int yVal = in.nextInt() - 1;
    if (xVal > board.length || xVal < 0 || yVal > board[0].length || yVal < 0)
    {
      System.out.println("Sorry, that space is not on the board. Please choose again");
      move(board);
    }
    else if ((Math.abs(xVal-xCoord) + Math.abs(yVal-yCoord)) > move)
    {
      System.out.println("Sorry, that space is outside " + this.getName() + "'s movement gange. Please choose again");
      move(board);
    }
    else if (board[xVal][yVal] != null)
    {
      System.out.println("Sorry, that space is occupied. Please choose again");
      move(board);
    }
    else
    {
      this.whereAmI(board);
      board[xCoord][yCoord] = null;
      board[xVal][yVal] = this;
    }
    return board;
  }
  
  public void death()//removes the unit from the ArrayList of the player who controls it
  {
    owner.getUnits().remove(this);
  }
  
  public void whereAmI(Unit[][] board)
  {
    for (int i = 0; i < board.length; i++)
    {
      for (int p = 0; p < board[0].length; p++)
      {
        if (board[i][p] == this)
        {
          xCoord = i;
          yCoord = p;
        }
      }
    }
  }
  
  public ArrayList<Unit> canAttack(Unit[][] board)//meant to produce a list of the units within this units attack range
  {         
    this.whereAmI(board);
    ArrayList<Unit> canAtk = new ArrayList<Unit>();
    for (int i = 0; Math.abs(i - xCoord) < atkRange; i++)
    {
      for (int k = 0; Math.abs(k - yCoord) < atkRange; k++)
      {
        if (board[i][k] != null && board[i][k] != this)
        {
          if ((Math.abs(i-xCoord) + Math.abs(k-yCoord)) <= atkRange)
          {
            canAtk.add(board[i][k]);
          }
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