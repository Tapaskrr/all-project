package com.te.javabasic.htd;

public class Student implements Comparable<Student> {

	static int temp;
	int studentId;
	String studentName;
	int studentAge;
	double studentMarks;

	public Student(int studentId, int studentAge, double studentMarks, String studentName) {
		this.studentId = studentId;
		this.studentAge = studentAge;
		this.studentMarks = studentMarks;
		this.studentName = studentName;
	}

	@Override
	public boolean equals(Object obj) {
		Student objStudent = (Student) obj;
		return (this.studentId == (objStudent.studentId));
	}

	@Override
	public int hashCode() {
		return this.studentId;
	}

	@Override
	public String toString() {
		return "Student [studentId=" + studentId + ", studentName=" + studentName + ", studentAge=" + studentAge
				+ ", studentMarks=" + studentMarks + "]";
	}

	Comparable<Student> comparable = (student1) -> {
		return this.studentId - student1.studentId;
	};

	@Override
	public int compareTo(Student o) {

		switch (temp) {
		case 1:
			return this.studentId - o.studentId;

		case 2:
			return this.studentAge - o.studentAge;

		case 3:
			return (int) (this.studentMarks - o.studentMarks);

		case 4:
			return this.studentName.compareTo(this.studentName);

		default:
			return 0;

		}

	}

}
