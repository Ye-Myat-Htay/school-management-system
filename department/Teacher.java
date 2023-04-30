package department;

public class Teacher extends User
{
	private String subject;

	public Teacher(String name, String subject)
	{
		super(name);
		this.subject = subject;
	}

	public String getSubject()
	{
		return subject;
	}

	public void setSubject(String subject)
	{
		this.subject = subject;
	}

	public String toString()
	{
		return super.toString() + ", Subject: " + subject;
	}
}