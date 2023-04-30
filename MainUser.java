import department.User;

public class MainUser
{
	public static void main(String[] d)
	{
		//Create User Object
		User user1 = new User("John Doe");
		User user2 = new User("Ronaldo");
		User user3 = new User("Messi");
		User user4 = new User("Tom Cruise");

		//Before user2 name
		System.out.println("Before update name: " + user2.getName());

		//Update user2's name
		user2.setName("Doe John");

		//After user2's name
		System.out.println("After update name: " + user2.getName());

		System.out.println("==========");

		User[] users = new User[4];
		users[0] = user1;
		users[1] = user2;
		users[2] = user3;
		users[3] = user4;

		for(int x=0; x<users.length; x++)
		{
			System.out.println( users[x].getName() );
		}
	}
}