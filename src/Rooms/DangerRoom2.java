package Rooms;

import People.Person;
import People.Tool;

public class DangerRoom2 extends Room implements DangerRoom {
    public DangerRoom2(int xx, int yy)
    {
        super(xx, yy);
    }
    public void enterRoom(Person p) {
        occupant = p;
        p.setxLoc(this.xLoc);
        p.setyLoc(this.yLoc);
    }
    public String ghostAttack(Tool Tools[], int health, String term)
    {
        int a=-1;
        for (int j=0; j<5; j++)
        {
            if (Tools[j].name==term)
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
