public class Archer extends Unit
{
  public Archer (String giveName, Player boss)
  {
    name = giveName;
    job = "Archer";
    stats[0] = (int)(Math.random() * 10 + 20);//HP
    stats[1] = (int)(Math.random() * 5 + 10);//Strength
    stats[2] = (int)(Math.random() * 7 + 7);//Speed
    stats[3] = (int)(Math.random() * 7 + 7);//Skill
    stats[4] = (int)(Math.random() * 5 + 5);//Defense
    move = 4;
    exp = 0;
    level = 1;
    owner = boss;
    atkRange = 4;
    growthRates[0] = (int)(Math.random() * 30 + 40);//HP growth
    growthRates[1] = (int)(Math.random() * 20 + 50);//Strength growth
    growthRates[2] = (int)(Math.random() * 30 + 50);//Speed growth
    growthRates[3] = (int)(Math.random() * 55 + 40);//Skill growth
    growthRates[4] = (int)(Math.random() * 30 + 20);//Defense growth
  }
  public Archer (String giveName, int mvmnt, int[] stat, int lvl, int[] growths, Player boss) //creates special mage
  {
    name = giveName;
    job = "Archer";
    stats = stat;
    move = mvmnt;
    exp = 0;
    level = lvl;
    owner = boss;
    growthRates = growths;
  }
}