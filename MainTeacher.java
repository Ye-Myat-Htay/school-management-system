import department.Teacher;
import java.util.ArrayList;

public class MainTeacher
{
	public static void main(String[] args)
	{
		Teacher teacher1 = new Teacher("John Doe" , "Java");
		Teacher teacher2 = new Teacher("Bob" , "HTML");
		Teacher teacher3 = new Teacher("Alice" , "Python");

		//ArrayList(class)
		//Teacher's class -> Teacher's Object(teacherList)
		//add(), get(), remove(),clear
		ArrayList<Teacher>  teacherList = new ArrayList<Teacher>();

		//Add teachers object in arraylist //index
		teacherList.add(teacher1);         //0
		teacherList.add(teacher2);         //1
		teacherList.add(teacher3);         //2

		//Update teacher's subject
		teacherList.get(2).setSubject("C, C++");

		//Get teacher's subject
		System.out.println(teacherList.get(2).getSubject());

		System.out.println("============");

		
	
		Teacher[] teachers = new Teacher[3];
		teachers[0] = teacher1;
		teachers[1] = teacher2;
		teachers[2] = teacher3;


		for(int x=0; x<teachers.length; x++)
		{
			System.out.println( teachers[x].getName());
		}
	}
}