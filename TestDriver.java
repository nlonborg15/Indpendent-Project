public class TestDriver
{
  public void printDisplay(Unit[][] display)
  {
    for (Unit[] k : display)
    {
      for (Unit s: k)
      {
        if (s != null)
        {
          System.out.print("[" + s + "]");
        }
        else
        {
          System.out.print("[" + "]");
        }
      }
    }
  }
  public static void main (String[] args)
  {
    Warrior w1 = new Warrior("john", true);
    System.out.println(w1.getMove());
    System.out.println(w1.getMove());
    TerrainBoard terra = new TerrainBoard();
    Unit[][] b1 = terra.createRandom();
    System.out.println(b1.length);
    System.out.println(b1[0].length);
    b1[4][13] = w1;
  }
}