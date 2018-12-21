package Board;
import Rooms.Room;

public class Board {
    private Room[][] House;

    public Board(Room[][] House)
    {
        this.House=House;
    } //First constructor intended for the main house
    public void createHouse() //Prints the map for the main house
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

    public Board(Room[][] House, String name) //Second constructor intended for the pool house, which the player has to unlock
    {
     this.House=House;
    }
    public void createPoolhouse() //Prints the map for the pool house
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

