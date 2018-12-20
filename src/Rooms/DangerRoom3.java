package Rooms;
import Game.Runner;
import People.Person;
import People.Tool;

public class DangerRoom3 extends Room implements DangerRoom {
    public DangerRoom3(int xx, int yy)
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
        System.out.println("Uh oh! You have come upon a room with a ghost in it!");
      //
        System.out.println(ghostAttack("holy water"));

    }
    public String ghostAttack( String term)
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
                        return "You used holy water to fight off a ghost! You didn't get hurt at all.";
                    } else {
                        health = health - 25;
                        return "You got attacked by a ghost! Your health has decreased by 25 points.";

                    }

                    //People.Person.checkHealth(health);
                }
            } else {
                return "You got attacked by a ghost! Your health has decreased by 25 points.";
            }


        }
    }
