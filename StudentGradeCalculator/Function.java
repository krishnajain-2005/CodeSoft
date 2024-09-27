package StudentGradeCalculator;

public class Function {
	static int averageMarks(int sub1,int sub2, int sub3,int sub4, int sub5) {
		int averageScore=(sub1+sub2+sub3+sub4+sub5)/5;
		return averageScore;
	}
	static int sum(int sub1,int sub2, int sub3,int sub4, int sub5) {
		int totalSum=sub1+sub2+sub3+sub4+sub5;
		return totalSum;
	}
	static void grade(int avg) {
		if(avg>=80)
        {
            System.out.print("GRADE : A");
        }
        else if(avg>=60 && avg<80)
        {
           System.out.print("GRADE : B");
        } 
        else if(avg>=40 && avg<60)
        {
            System.out.print("GRADE : C");
        }
        else
        {
            System.out.print("GRADE : D");
        }
	}
}
