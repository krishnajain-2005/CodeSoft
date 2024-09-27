package StudentGradeCalculator;
import java.util.*;
public class mainClass {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Please Enter your Name:");
		String name=sc.next();
		System.out.println("Now please Enter your Marks according to the subjects!");
		System.out.println();
		System.out.print("Maths: ");
		int mth=sc.nextInt();
		System.out.println();
		System.out.print("English: ");
		int eng=sc.nextInt();
		System.out.println();
		System.out.print("Hindi: ");
		int hin=sc.nextInt();
		System.out.println();
		System.out.print("Science: ");
		int sci= sc.nextInt();
		System.out.println();
		System.out.print("Social Studies: ");
		int soc=sc.nextInt();
		int total=Function.sum(mth, eng, hin, sci, soc);
		int average=Function.averageMarks(eng, hin, sci, soc, mth);
		
		System.out.println("-----------------");
		System.out.println("RESULT");
		System.out.println("Name: "+name);
		System.out.println("Total marks obtained: "+total);
		System.out.println("Average Percentage(%): "+average+"%");
		Function.grade(average);
	}

}
