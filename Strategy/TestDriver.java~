public class TestDriver
{
  public static void main (String[] args)
  {
    Warrior w1 = new Warrior("john", true);
    System.out.println(w1.getMove());
    System.out.println(w1.getMove());
    TerrainBoard terra = new TerrainBoard();
    Unit[][] b1 = terra.createCustom(15, 15);
    System.out.println(b1.length);
    System.out.println(b1[0].length);
    b1[4][13] = w1;
    terra.printDisplay(b1);
  }
}