package Board;
import Rooms.Room;
//import Board.Board;

public class ToString {
    public String toString(Room[][] House)
    {
        int x=0;
        int y=0;
        String result= "";
        while(x<House.length)
        {
            while(y<House[x].length)
            {
                result=result + House[x][y];
                y=y+1;
            }
            if (y!=House[x].length-1)
            {
                result= result+ "\n";
            }
            x=x+1;
            y=0;
        }
        return result;
    }
}
