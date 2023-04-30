import department.Student;
import java.util.HashMap;
import java.util.Scanner;
import java.io.FileWriter;
import java.io.IOException;
import java.time.LocalDateTime; //page 59-61  
import java.time.format.DateTimeFormatter;
import java.io.File;
import java.io.FileNotFoundException;

public class MainStudent
{
	private static HashMap<Integer, Student>studentMap = new HashMap<>();
	private static Scanner scanner = new Scanner(System.in);
	private static int action;
	private static int studentId = 1;

	public static void main(String[] d)
	{
		do{
			System.out.println("==== SCHOOL MANAGEMENT SYSTEM ====");
			System.out.println("1) Create");
			System.out.println("2) Read");
			System.out.println("3) Update");
			System.out.println("4) Delete");
			System.out.println("5) Read File");
			System.out.println("6) Print");
			System.out.println("7) Exit");

			System.out.print("Choose Action: ");
			action = scanner.nextInt();

			Line();

			switch(action)
			{
				case 1: create(); break;
				case 2: read(); break;
				case 3: update(); break;
				case 4: delete(); break;
				case 5: readFile(); break;
				case 6: print(); break;
				case 7: exit(); break;
			}

			Line();

		} while (action != 6);
	}

	public static void create()
	{
		System.out.print("Enter student roll number: ");
		int rollNo = scanner.nextInt();

		scanner.nextLine();

		System.out.println("Enter student name: ");
		String name = scanner.nextLine();

		System.out.println("Enter student major: ");
		String major = scanner.nextLine();

		System.out.println("Enter student grade: ");
		int grade = scanner.nextInt();

		Student student = new Student(rollNo, name, major,grade); //Create student object

		studentMap.put(studentId, student); //Add to Hashmap(studentMap)<-Student's object

		studentId++; //Increment
	}

	public static void read()
	{
		if(studentMap.size() == 0)
		{
			System.out.println("No enroll");
		}
		else
		{
			System.out.println("1) ID");
			System.out.println("2) List");

			System.out.print("choose action: ");
			action = scanner.nextInt();

			if(action == 1)
			{
				System.out.print("enter student id: ");
				int id = scanner.nextInt();

				System.out.println(studentMap.get(id));
			}
			else
			{
				//forEach loop
				//Temporary variable -> Data Type
				for(Student student : studentMap.values())
					System.out.println(student);
			}
		}
	}

	public static void update()
	{
		if(studentMap.size() == 0)
		{
			System.out.println("No entry!");
		}
		else
		{

			System.out.print("Enter student id:");
			int id = scanner.nextInt();

			System.out.println("1) Roll No");
			System.out.println("2) Name");
			System.out.println("3) Major");
			System.out.println("4) Grade");

			System.out.print("choose action: ");
			action = scanner.nextInt();

			switch(action)
			{
				case 1: 
					System.out.print("Enter student roll no:");
					int rollNo = scanner.nextInt();

					studentMap.get(id).setRollNo(rollNo);

					System.out.println("Updated student roll no."); break;

				case 2:
					System.out.print("enter student name: ");
					String name = scanner.nextLine();

					studentMap.get(id).setName(name);

					System.out.println("Updated student name. "); break;

				case 3:
					System.out.print("Enter student major: ");
					String major = scanner.nextLine();

					studentMap.get(id).setMajor(major);

					System.out.println("Updated student major. "); break;

				case 4:
					System.out.print("Enter student grade: ");
					int grade = scanner.nextInt();

					studentMap.get(id).setGrade(grade);

					System.out.println("Updated student grade. "); break;
			}
		}
	}

	public static void delete()
	{
		if(studentMap.size() == 0)
			{
				System.out.println("No enroll");
			}
			else
			{
				System.out.println("1) ID");
				System.out.println("2) List");

				System.out.print("choose action: ");
				action = scanner.nextInt();

				if(action == 1)
				{
					System.out.print("enter student id: ");
					int id = scanner.nextInt();

					System.out.println(studentMap.remove(id));
					System.out.println("Successful deleted student id " + id);
				}
				else
				{
					studentMap.clear();
					System.out.println("Successful removed all student list. ");
				}
			}	
	}

	public static void readFile()
	{
		try{
			File f = new File("student-list.txt");
			Scanner s = new Scanner(f);

			while(s.hasNextLine())
			{
				String str = s.nextLine();
				System.out.println(str);
			}

			s.close();

		} catch(FileNotFoundException e) {
			System.out.println("File not found! : " + e);
		}
	}

	public static void print()
	{
		try {
				FileWriter fw = new FileWriter("student-list.txt");

				fw.write("=== SCHOOL MANAGEMENT SYSTEM ===");
				fw.write("\n\n");

				//DateTime object
				LocalDateTime ldt = LocalDateTime.now();

				//Format Object
				DateTimeFormatter currentDate = DateTimeFormatter.ofPattern("dd/MM/yyyy");
				DateTimeFormatter currentTime = DateTimeFormatter.ofPattern("hh:mm a");

				fw.write("Date: " + currentDate.format(ldt));
				fw.write("\n");
				fw.write("Time: " + currentTime.format(ldt));
				fw.write("\n\n");

				int no = 1;
				for(Student student : studentMap.values())
				{
					fw.write("[" + no + "]" );
					fw.write(student + "\n");

					no++;
				}

				fw.close();

		} catch(IOException e) {
			System.out.println(e);
		}
	}

	public static void exit()
	{
		System.out.println("Thank you :-p");
	}

	public static void Line()
	{
		for(int x=0; x<50; x++)
			System.out.print("=");

		System.out.print("\n");
	}
}