package Rooms;

import People.Person;
import People.Tool;

public class DangerRoom2 extends Room implements DangerRoom {
    public DangerRoom2(int xx, int yy)
    {
        super(xx, yy);
    }
    public Tool[] Tools;
    public void enterRoom(Person p) {
        occupant = p;
        p.setxLoc(this.xLoc);
        p.setyLoc(this.yLoc);
        Tools=p.getTools();
    }
    public String ghostAttack( int health, String term)
    {
        int a=-1;
        for (int j=0; j<5; j++)
        {
            if (Tools[j].toString()==term)
            {
                a=0;
            }
        }
        if (a==0)
        {
            return "You used holy water to fight off a ghost! You didn't get hurt at all.";
        }
        else
        {
            health=health-25;
            return "You got attacked by a ghost! Your health has decreased by 25 points.";

        }
        //People.Person.checkHealth(health);
    }


}
