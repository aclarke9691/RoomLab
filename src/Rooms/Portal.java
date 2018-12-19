package Rooms;
import People.Person;
import People.Tool;
import Game.Runner;

public class Portal extends Room{
    public Tool Tools[];
    public int i;

    public Portal (int xx, int yy)
    {
        super(xx, yy);
    }
    @Override
    public void enterRoom(Person p) {
        occupant = p;
        p.setxLoc(this.xLoc);
        p.setyLoc(this.yLoc);
        System.out.println("You have reached the portal!");//make it so that it switches to building 2, and can say if i entered room already
    Game.Runner.poolhouse[0][0].enterRoom(Person Player1);
    }


}
