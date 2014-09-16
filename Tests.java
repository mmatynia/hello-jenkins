public class Tests
{
    public static void main(String[] args)
    {
	Hello test_greeting = new Hello("Bob");
	
	// Test 1
	if (test_greeting.getGreeting().equals("Hello Sam"))
	    {
		System.out.println("PASS!");
	    }
	else
	    {
		System.out.println("FAIL!");
	    }
    }
}
