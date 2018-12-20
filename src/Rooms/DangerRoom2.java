package Rooms;
import Game.Runner;
import People.Person;
import People.Tool;

public class DangerRoom2 extends Room implements DangerRoom {
    public DangerRoom2(int xx, int yy)
    {
        super(xx, yy);
    }
    public Tool[] Tools;
    public int health;

    public void enterRoom(Person p) {
        occupant = p;
        p.setxLoc(this.xLoc);
        p.setyLoc(this.yLoc);
        Tools=p.getTools();
        health=p.getHealth();
        System.out.println("Uh oh! You have come upon a room with a flying ghost in it!");
        System.out.println(ghostAttack( "spray"));
    }
    public String ghostAttack(  String term)
    //{if (Tools[0].name != "") ;
    {
        if (Tools[0]!=null) {

            int a = -1;
            for (int j = 0; j < 5; j++) {

                if (Tools[j]!=null &&Tools[j].toString().equals(term)){
                    a = 0;
                    break;
                }

            }
            {
                if (a == 0) {
                    return "You used ghost repellent spray to kill the ghost! You didn't get hurt at all.";
                } else {
                    health = health - 25;
                    return "You got attacked by a flying ghost! Your health has decreased by 25 points.";

                }

                //People.Person.checkHealth(health);
            }
        } else {
            return "You got attacked by a flying ghost! Your health has decreased by 25 points.";
        }


    }
}
