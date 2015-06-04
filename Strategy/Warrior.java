public class Warrior extends Unit
{
  public Warrior(String giveName, Player boss)
  {
    name = giveName;
    job = "Warrior";
    stats[0] = (int)(Math.random() * 20 + 20);//HP
    stats[1] = (int)(Math.random() * 10 + 10);//Strength
    stats[2] = (int)(Math.random() * 5 + 5);//Speed
    stats[3] = (int)(Math.random() * 7 + 5);//Skill
    stats[4] = (int)(Math.random() * 10 + 5);//Defense
    move = 5;//how far the unit can move each round
    exp = 0;
    level = 1;
    owner = boss;//whether or not the unit is the player's unit
    atkRange = 1;
    growthRates[0] = (int)(Math.random() * 35 + 60);//HP growth
    growthRates[1] = (int)(Math.random() * 55 + 40);//Strength growth
    growthRates[2] = (int)(Math.random() * 60 + 20);//Speed growth
    growthRates[3] = (int)(Math.random() * 60 + 20);//Skill growth
    growthRates[4] = (int)(Math.random() * 55 + 40);//Defense growth
  }
  public Warrior(String giveName, int mvmnt, int[] stat, int lvl, int[] growths, Player boss) //creates special warrior
  {
    name = giveName;
    job = "Warrior";
    stats = stat;
    move = mvmnt;
    exp = 0;
    level = lvl;
    owner = boss;
    growthRates = growths;
  }
  
}