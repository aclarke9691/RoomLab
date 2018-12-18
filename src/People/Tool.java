package People;

public  class Tool {
    public String name;
    public Tool(String name)
    {
       this.name=name;
    }
    public static void useKey()
    {
        System.out.println("You used the key to unlock the poolhouse!");
    }

    public static void useWater()
    {
        System.out.println("You used the holy water to kill off a ghost!");
    }

    public static void useGem()
    {
        System.out.println("You have found the secret gem- an emerald. A fairy appears out of the air and casts you back to your home. You are free, at last!");
    }

    public static void usePhone(int num)
    {
        if (num==1)
        {
            System.out.println("You press the first button and a magic fairy answers the phone. He tells you that a dangerous room is at 4,1.");
        }
        else
        {
            if (num==2)
            {
                System.out.println("You press the first button and a magic fairy answers the phone. She tells you that you're ugly. ");
            }
        }
    }
    public String toString()
    {
        return name;
    }



}
