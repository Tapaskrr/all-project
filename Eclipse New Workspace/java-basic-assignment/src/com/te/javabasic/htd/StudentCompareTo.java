package com.te.javabasic.htd;

import java.util.Comparator;

public class StudentCompareTo implements Comparator<Student> {

	int value;

	public StudentCompareTo(int choice) {
		value = choice;
	}

	@Override
	public int compare(Student o1, Student o2) {

		switch (value) {
		case 1:
			return o1.studentId - o2.studentId;

		case 2:
			return o1.studentAge - o2.studentAge;

		case 3:
			return (int) (o1.studentMarks - o2.studentMarks);

		case 4:
			return o1.studentName.compareTo(o2.studentName);

		}
		return value;

	}

}
