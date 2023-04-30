package department;

public class User
{
	//Atrributes
	protected String name;

	//Constructor
	public User(String name)
	{
		this.name = name;
	}

	//Get User's name
	public String getName()
	{
		return name;
	}

	//Update user's name
	public void setName(String name)
	{
		this.name = name;
	}

	//toString
	public String toString()
	{
		return "Name: " + name;
	}
}