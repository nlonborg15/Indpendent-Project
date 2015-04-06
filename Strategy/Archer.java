public class Archer extends Unit
{
  public Archer (String giveName, boolean plyrU)
  {
    health = (int)(Math.random()*100);
    name = giveName;
    job = "Archer";
    strength = (int)(Math.random() * 10);
    move = 4;
    exp = 0;
    level = 1;
    speed = (int)(Math.random() * 10);
    playerUnit = plyrU;
    growthRates[0] = (int)(Math.random() * 30 + 40);//HP growth
    growthRates[1] = (int)(Math.random() * 20 + 50);//Strength growth
    growthRates[2] = (int)(Math.random() * 30 + 50);//Speed growth
    growthRates[3] = (int)(Math.random() * 55 + 40);//Skill growth
    growthRates[4] = (int)(Math.random() * 30 + 20);//Defense growth
  }
  public Archer (String giveName, int mvmnt, int str, int lvl, int spd, int[] growths, boolean plyrU) //creates special mage
  {
    name = giveName;
    job = "Archer";
    strength = str;
    move = mvmnt;
    exp = 0;
    level = lvl;
    speed = spd;
    playerUnit = plyrU;
    growthRates = growths;
  }
}