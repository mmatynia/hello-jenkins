public class Hello
{
    //Attributes
    String greeting;

    // Constructors
    public Hello(String name)
    {
	if (!(name.equals(null)))
	    {
		this.greeting = "Hello " + name;
	    }
	else
	    {
		this.greeting = "Hello World";
	    }
    }

    public Hello()
    {
	new Hello("World");
    }

    //Methods
    public String getGreeting()
    {
	return this.greeting;
    }
}
