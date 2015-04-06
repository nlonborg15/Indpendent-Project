public class Mage extends Unit
{
  public Mage(String giveName, boolean plyrU)
  {
    health = (int)(Math.random()*100);
    name = giveName;
    job = "Mage";
    strength = (int)(Math.random() * 10);
    move = 4;
    exp = 0;
    level = 1;
    speed = (int)(Math.random() * 10);
    playerUnit = plyrU;
    growthRates[0] = (int)(Math.random() * 60 + 20);//HP growth
    growthRates[1] = (int)(Math.random() * 55 + 40);//Strength growth
    growthRates[2] = (int)(Math.random() * 60 + 30);//Speed growth
    growthRates[3] = (int)(Math.random() * 55 + 40);//Skill growth
    growthRates[4] = (int)(Math.random() * 20 + 20);//Defense growth
  }
  public Mage(String giveName, int mvmnt, int str, int lvl, int spd, int[] growths, boolean plyrU) //creates special mage
  {
    name = giveName;
    job = "Mage";
    strength = str;
    move = mvmnt;
    exp = 0;
    level = lvl;
    speed = spd;
    playerUnit = plyrU;
    growthRates = growths;
  }
}