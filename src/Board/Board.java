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
    //public String toString() {
        //return "x";
    }
    //public String toString()
    //{
       // int x=0;
        //int y=0;
        //String result= "";
        //while(x<House.length)
       // {
            //while(y<House[x].length)
            //{
                //result=result + House[x][y].toString();
               // y=y+1;
            //}
            //if (y!=House[x].length-1)
            //{
           //    result= result+ "\n";
           // }
            //x=x+1;
            //y=0;
        //}
        //return result;
    //}
//}
