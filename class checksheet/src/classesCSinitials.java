import java.util.Scanner;

public class classesCSinitials {

	static Scanner input = new Scanner(System.in);
	public static void main(String[] args) {
		CourseInitials MyCourse = new CourseInitials();
		CourseInitials Course2 = new CourseInitials("cs1020",4,20,"BP111",3);
		
		courseinput(MyCourse);
		System.err.println();
		courseoutput(MyCourse);
		courseoutput(Course2);
		System.out.println();
		System.out.println(MyCourse.toString());
		
	}

	private static void courseoutput(CourseInitials mycourse) {
		System.out.println("course number: " + mycourse.getCnum());
		System.out.println("minimum students: " + mycourse.getMinS());
		System.out.println("maximum students: " + mycourse.getMaxS());
		System.out.println("room number: " + mycourse.getRNum());
		System.out.println("credit value: " + mycourse.getCredits());
		System.out.println();
		
	}

	private static void courseinput(CourseInitials MyCourse) {
		System.out.println("whats the course number?");
		String cnum = input.next();
		System.out.println("whats the minimum number of students?");
		int minS = input.nextInt();
		System.out.println("whats the maximum number of students?");
		int maxS = input.nextInt();
		System.out.println("what room is the class in?");
		String RNum = input.next();
		System.out.println("how many credits will the class be worth?");
		int credits = input.nextInt();
		
		MyCourse.setCnum(cnum);
		MyCourse.setMinS(minS);
		MyCourse.setMaxS(maxS);
		MyCourse.setRNum(RNum);
		MyCourse.setCredits(credits);
		
	}
	
	
	
}
