import java.util.*;

public class Game
{
  public void play(Player p1, Player p2, TerrainBoard world, Unit[][] b1)
  {
    Unit[][] board = b1;
    ArrayList<Unit> moveOrder = world.moveOrder(p1, p2);
    Scanner in = new Scanner(System.in);
    while (p1.getUnits().size() > 0 || p2.getUnits().size() > 0)//keeps the game going until one player is out of units
    {
      int i = 0;
      while (i < moveOrder.size())//keeps going, in order, through all the units until all are dead
      {
        board = moveOrder.get(i).move(board);
        boolean attacked = false;
        System.out.println(moveOrder.get(i).canAttack(board).size());
        System.out.println(moveOrder.get(i).canAttack(board).size() > 0);
        if (moveOrder.get(i).canAttack(board).size() > 0)
        {
          while (attacked = false)
          {
            for (Unit k: moveOrder.get(i).canAttack(board))
            {
              System.out.println("Would you like to attack " + k.getName() + "(" + k.getJobMod() + ") ? ( yes/no)");
              if (in.next() == "yes")
              {
                moveOrder.get(i).attack(k);
                if (k.getHP() <= 0)
                {
                  k.death();
                }
                //attacked = true;
              }
            }
          }
        }
        i++;
      }
    }
    if (p1.getUnits().size() > 0)
    {
      System.out.println("Game Over: Player 1 won");
    }
    else
    {
      System.out.println("Game Over: Player 2 won");
    }
  }
}