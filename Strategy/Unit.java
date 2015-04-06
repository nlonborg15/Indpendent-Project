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
  public int getHP()
  {
    return stats[0];
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
}