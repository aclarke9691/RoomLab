package People;

public  class Tool {
    public String name;
    public String function;
    public Tool(String name)
    {
       this.name=name;
    }
    public Tool(String name, String function) {this.name=name; this.function=function;}
    public String toString()
    {
        return name;
    }
    public String function()
    {
        return function;
    }



}
