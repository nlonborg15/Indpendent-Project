public class Unit
{
  String name;
  String job;
  int[] stats = new int[5];
  int health;
  int strength;
  int speed;
  int skill;
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
  public int getSpeed()
  {
    return speed;
  }
  public int getAttack(int weaponS)
  {
    return strength + weaponS;
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