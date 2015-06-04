public class Mage extends Unit
{
  public Mage(String giveName, Player boss)
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
    owner = boss;
    atkRange = 3;
    growthRates[0] = (int)(Math.random() * 60 + 20);//HP growth
    growthRates[1] = (int)(Math.random() * 55 + 40);//Strength growth
    growthRates[2] = (int)(Math.random() * 60 + 30);//Speed growth
    growthRates[3] = (int)(Math.random() * 55 + 40);//Skill growth
    growthRates[4] = (int)(Math.random() * 20 + 20);//Defense growth
  }
  public Mage(String giveName, int mvmnt, int[] stat, int lvl, int[] growths, Player boss) //creates special mage
  {
    name = giveName;
    job = "Mage";
    stats = stat;
    move = mvmnt;
    exp = 0;
    level = lvl;
    owner = boss;
    growthRates = growths;
  }
}