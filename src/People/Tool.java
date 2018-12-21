package People;

public  class Tool { //A tool is an item that the player finds in one room and ends up using in another room
    public String name;
    public String function;
    public Tool(String name)
    {
       this.name=name;
    } //Enables the tool to have a name
    public Tool(String name, String function) {this.name=name; this.function=function;}
    public String toString() //Returns the name of the tool
    {
        return name;
    }
    public String function() //Returns what the tool (specifically, the master key) is supposed to be used for
    {
        return function;
    }



}
