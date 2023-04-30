package department;
											///super //get set 6
public class Student extends User
{
	private int rollNo;
	private String major;
	private int grade;
	//private int fees;   //50
	//private int total;  //300

	public Student(int rollNo, String name, String major, int grade)
	{
		super(name);

		this.rollNo = rollNo;
		this.major = major;
		this.grade = grade;

	}

	public int getRollNo()
	{
		return rollNo;
	}

	public void setRollNo(int rollNo)
	{
		this.rollNo = rollNo;
	}

	public String getMajor()
	{
		return major;
	}

	public void setMajor(String major)
	{
		this.major = major;
	}

	public int getGrade()
	{
		return grade;
	}

	public void setGrade(int grade)
	{
		this.grade = grade;
	}

	public String toString()
	{
		return "Roll No: " + rollNo + ", " + super.toString() + ", Major: " + major + ", Grade: " + grade;
	}

}


