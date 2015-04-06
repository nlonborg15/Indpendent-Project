public class Warrior extends Unit
{
  public Warrior(String giveName, boolean plyrU)
  {
    health = (int)(Math.random()*100);
    name = giveName;
    job = "Warrior";
    strength = (int)(Math.random() * 10);
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