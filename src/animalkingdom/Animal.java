package animalkingdom;

abstract class Animal 
{
    // shared fields
    protected static int maxId = 0;
    protected int id;
    protected int food;
    protected String name;
    protected int year;

    // constructor for all child classes
    public Animal(String name, int year)
    {
        maxId ++;
        id = maxId;
        this.name = name;
        this.year = year;
    }

    // abstract methods
    abstract String getMove();
    abstract String getBreath();
    abstract String getReproduce();

    // shared methods implemented for all child classes
    void eat(int amount) 
    {
        food += amount;
    }

    int getId()
    {
        return id;
    }

    String getName()
    {
        return name;
    }

    int getYear() 
    {
        return year;
    }

    void setYear(int year)
    {
        this.year = year;
    }

    int getFood()
    {
        return food;
    }

    void setFood(int amount)
    {
        eat(amount);
    }
    
    String printDescription()
    {
        return name + " " + getReproduce() + " " + getMove() + " " + getBreath() + " " + year;
    }

    @Override
    public String toString()
    {
        return "Animals{id=" + id + ", name='" + name + "', yearNamed=" + year + "}";
    }
}