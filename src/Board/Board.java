package Board;
import Rooms.Room;

public class Board {
    private Room[][] House;

    public Board(Room[][] House)
    {
        this.House=House;
    }
    public void createHouse()
    {
        int i=0;
        int j=0;
        String row="";
        while(i<House.length)
        {
            while (j<House[i].length)
            {
                 row= row + House[i][j].toString();
                j=j+1;
            }
            row= row+ "\n";
            i=i+1;
            j=0;
        }
        System.out.println(row);
    }

    public Board(Room[][] House, String name)
    {
     this.House=House;
    }
    public void createPoolhouse()
    {
        int i=0;
        int j=0;
        String row="";
        while(i<2)
        {
            while (j<2)
            {
                row= row + House[i][j].toString("pool house");
                j=j+1;
            }
            row= row+ "\n";
            i=i+1;
            j=0;
        }
        System.out.println(row);
    }

    }

