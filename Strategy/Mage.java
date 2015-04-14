public class Mage extends Unit
{
  public Mage(String giveName, boolean plyrU)
  {
    name = giveName;
    job = "Mage";
    stats[0] = (int)(Math.random() * 10 + 15);//HP
    stats[1] = (int)(Math.random() * 10 + 10);//Strength
    stats[2] = (int)(Math.random() * 7 + 10);//Speed
    stats[3] = (int)(Math.random() * 7 + 10);//Skill
    stats[4] = (int)(Math.random() * 3 + 3);//Defense
    move = 4;
    exp = 0;
    level = 1;
    playerUnit = plyrU;
    atkRange = 5;
    growthRates[0] = (int)(Math.random() * 60 + 20);//HP growth
    growthRates[1] = (int)(Math.random() * 55 + 40);//Strength growth
    growthRates[2] = (int)(Math.random() * 60 + 30);//Speed growth
    growthRates[3] = (int)(Math.random() * 55 + 40);//Skill growth
    growthRates[4] = (int)(Math.random() * 20 + 20);//Defense growth
  }
  public Mage(String giveName, int mvmnt, int[] stat, int lvl, int[] growths, boolean plyrU) //creates special mage
  {
    name = giveName;
    job = "Mage";
    stats = stat;
    move = mvmnt;
    exp = 0;
    level = lvl;
    playerUnit = plyrU;
    growthRates = growths;
  }
}