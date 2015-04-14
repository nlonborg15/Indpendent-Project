import java.util.*;

public class Game
{
  public void play(Player p1, Player p2, ArrayList<Unit> moveOrder, Unit[][] board)
  {
    while (p1.getUnits().size() > 0 || p2.getUnits().size() > 0)//keeps the game going until one player is out of units
    {
      int i = 0;
      while (i < moveOrder.size())//keeps going, in order, through all the units until all are dead
      {
        moveOrder.get(i).move(board);
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