package Generics;

import java.util.Arrays;
import java.util.Comparator;

public class Student implements Comparable<Student> {
    int rollno;
    float marks;
    
    public Student(int rollno,float marks) {
    	this.rollno=rollno;
    	this.marks=marks;
    }
	@Override
	public int compareTo(Student o) {
		int diff=(int)(this.marks-o.marks);
		return diff;
	}
	
	@Override
	public String toString() {
		return "Student [rollno=" + rollno + ", marks=" + marks + "]";
	}
	public static void main(String[] args) {
		Student kunal=new Student(1,78.88f);
		Student rahul=new Student(2,98.88f);
		Student a=new Student(4,90.88f);
		Student b=new Student(2,66.88f);
//		if(kunal.compareTo(rahul)<0) {
//			System.out.println("rahil has more marks");
//		}
		Student [] arr= {kunal,rahul,a,b};
		System.out.println(Arrays.toString(arr));
		Arrays.sort(arr,new Comparator<Student>(){

			@Override
			public int compare(Student o1, Student o2) {
				// TODO Auto-generated method stub
				return (int)(o1.marks - o2.marks);
			}
			
		});
		System.out.println(Arrays.toString(arr));
		
	}
  
}
