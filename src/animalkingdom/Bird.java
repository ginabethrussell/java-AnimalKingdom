package animalkingdom;

public class Bird extends Animal
{
    public Bird(String name, int year)
    {
        super(name, year);
    }

    @Override
    public String getMove()
    {
        return "fly";
    }

    @Override
    public String getBreath()
    {
        return "lungs";
    }

    @Override
    public String getReproduce()
    {
        return "eggs";
    }

    
}