public class Warrior extends Unit
{
  public Warrior(String giveName, boolean plyrU)
  {
    name = giveName;
    job = "Warrior";
    stats[0] = (int)(Math.random() * 20 + 10);//HP
    stats[1] = (int)(Math.random() * 10 + 10);//Strength
    stats[2] = (int)(Math.random() * 5 + 5);//Speed
    stats[3] = (int)(Math.random() * 7 + 5);//Skill
    stats[4] = (int)(Math.random() * 10 + 5);//Defense
    move = 5;
    exp = 0;
    level = 1;
    speed = (int)(Math.random() * 10);
    playerUnit = plyrU;
    growthRates[0] = (int)(Math.random() * 35 + 60);//HP growth
    growthRates[1] = (int)(Math.random() * 55 + 40);//Strength growth
    growthRates[2] = (int)(Math.random() * 60 + 20);//Speed growth
    growthRates[3] = (int)(Math.random() * 60 + 20);//Skill growth
    growthRates[4] = (int)(Math.random() * 55 + 40);//Defense growth
  }
  public Warrior(String giveName, int mvmnt, int str, int lvl, int spd, int[] growths, boolean plyrU) //creates special warrior
  {
    name = giveName;
    job = "Warrior";
    strength = str;
    move = mvmnt;
    exp = 0;
    level = lvl;
    speed = spd;
    playerUnit = plyrU;
    growthRates = growths;
  }
  
}