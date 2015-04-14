import java.util.*;

public class Game
{
  public void play(Player p1, Player p2, ArrayList<Unit> moveOrder, Unit[][] board)
  {
    while (p1.getUnits().size() > 0 || p2.getUnits().size() > 0)
    {
      int i = 0;
      while (i < moveOrder.size())
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