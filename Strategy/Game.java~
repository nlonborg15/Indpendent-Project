import java.util.*;

public class Game
{
  public void play(Player p1, Player p2, ArrayList<Unit> moveOrder, Unit[][] board)
  {
    Scanner in = new Scanner(System.in);
    while (p1.getUnits().size() > 0 || p2.getUnits().size() > 0)//keeps the game going until one player is out of units
    {
      int i = 0;
      while (i < moveOrder.size())//keeps going, in order, through all the units until all are dead
      {
        moveOrder.get(i).move(board);
        boolean attacked = false;
        while (attacked = false)
        {
          for (int l = 0; l < moveOrder.get(i).canAttack(board).size(); l++)
          {
            System.out.println("Would you like to attack " + moveOrder.get(i).getName() + "(" + moveOrder.get(i).getJobMod() + ") ? ( yes/no)");
            if (in.next() == "yes")
            {
              moveOrder.get(i).attack(moveOrder.get(i).canAttack(board).get(l));
              attacked = true;
            }
          }
          for (Unit k : moveOrder)
          {
            if (k.getHP() <= 0)
            {
              k.death(p1, p2);
            }
          }
          i++;
        }
      }
    }
  }
}