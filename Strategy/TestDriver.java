import java.util.*;

public class TestDriver
{
  public static void main (String[] args)
  {
    Player p1 = new Player("BeelBo");
    Player p2 = new Player("Meh");
    ArrayList<Unit> da = new ArrayList<Unit>();
    Warrior w1 = new Warrior("john", p1);
    da.add(w1);
    for (Unit l: da)
    {
      System.out.println(l.getName());
    }
    da.add(0, new Mage("Winston", p1));
    for (Unit l: da)
    {
      System.out.println(l.getName());
    }
    /*System.out.println(w1.getMove());
     System.out.println(w1.getMove());
     TerrainBoard terra = new TerrainBoard();
     Unit[][] b1 = terra.createCustom(7, 7);
     System.out.println(b1.length);
     System.out.println(b1[0].length);
     b1[4][2] = w1;
     w1.move(b1);*/
  }
}