package pkg;
import java.util.Scanner;
import java.util.Random;


public class Course {
	public String teacher;
	public int grade;
	public int credit;
	public Course (){
		teacher = "Mr.Poole";
		grade = 100;
	}
	public Course (String teacher, int grade){
		this.teacher = teacher;
		this.grade = grade;
		this.credit = credit;
	}
	public int calcCredit() {
		if (grade >=90) {
			credit = 4;
		}
		else if (grade >=80 && grade <90){
			credit = 3;
		}
		else if ((grade >=70) && (grade <80)){
			credit = 2;
		}
		else if ((grade >=60) && (grade <70)) {
			credit = 1;
		}
		else {
			credit = 0;
		}
		return credit;
	}
	public int getCredit (){
		return credit;
	}
	public String toString (){
		System.out.println ("Teacher name: " + teacher);
		System.out.println ("Credit: " + credit);
		return teacher;
	}
	public boolean equals (Object other) {
		return this.teacher== ((Course)other).teacher;
	}
}