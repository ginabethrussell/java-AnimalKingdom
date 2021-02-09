package animalkingdom;

public class Fish extends Animal
{
    public Fish(String name, int year)
    {
        super(name, year);
    }

    @Override
    public String getMove()
    {
        return "swim";
    }

    @Override
    public String getBreath()
    {
        return "gills";
    }

    @Override
    public String getReproduce()
    {
        return "eggs";
    }



}
