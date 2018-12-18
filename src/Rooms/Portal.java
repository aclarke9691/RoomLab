package Rooms;
import People.Person;
import People.Tool;

public class Portal extends Room{
    public Tool Tools[];
    public int i;

    public Portal (int xx, int yy)
    {
        super(xx, yy);
    }
    public void enterRoom(Person p) {
        occupant = p;
        p.setxLoc(this.xLoc);
        p.setyLoc(this.yLoc); //make it so that it switches to building 2, and can say if i entered room already
    }
}
