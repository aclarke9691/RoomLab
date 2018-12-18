package Rooms;

import People.Person;
import People.Tool;

public class DangerRoom3 extends Room implements DangerRoom {
    public DangerRoom3(int xx, int yy)
    {
        super(xx, yy);
    }
    public void enterRoom(Person p) {
        occupant = p;
        p.setxLoc(this.xLoc);
        p.setyLoc(this.yLoc);
    }
    public void ghostAttack(Tool Tools[], int health, String term)
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
            System.out.println("You used holy water to fight off a ghost! You didn't get hurt at all.");
        }
        else
        {
            System.out.println("You got attacked by a ghost! Your health has decreased by 25 points.");
            health=health-25;
        }
        People.Person.checkHealth(health);
    }


}
