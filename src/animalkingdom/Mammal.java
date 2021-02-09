package animalkingdom;

public class Mammal extends Animal
{
    public Mammal(String name, int year)
    {
        super(name, year);
    }

    @Override
    public String getMove()
    {
        return "walk";
    }

    @Override
    public String getBreath()
    {
        return "lungs";
    }

    @Override
    public String getReproduce()
    {
        return "live births";
    }

    
    
}