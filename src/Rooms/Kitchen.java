package Rooms;
import Game.Runner;
import People.Person;

public class Kitchen extends Room {

    public Kitchen(int xx, int yy)
    {
        super(xx,yy);
    }

    public void enterRoom(Person p)
    {
        occupant=p;
        p.setxLoc(this.xLoc);
        p.setyLoc(this.yLoc);
        System.out.println("You are now in the kitchen. Move anywhere to leave the kitchen.");

    }

}
