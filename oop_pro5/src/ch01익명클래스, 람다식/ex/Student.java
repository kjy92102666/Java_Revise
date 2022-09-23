package ch01.ex;

import java.util.ArrayList;

public class Student {
	private String name;
	//private Subject subject;
	private ArrayList<Subject> arr;
	
	public Student(String name) {
		this.name = name;
		arr = new ArrayList<>();
	}
	
	private class Subject {
		String subjectName;
		int subjectScore;
		
		private Subject(String subjectName, int subjectScore) {
			this.subjectName = subjectName;
			this.subjectScore = subjectScore;
		}

		@Override
		public String toString() {
			return "Subject [subjectName=" + subjectName + ", subjectScore=" + subjectScore + "]";
		}
		
	}
	
	public void setSubject(String subjectName, int subjectScore) {
		Subject subject = new Subject(subjectName,subjectScore);
		arr.add(subject);
	}

	public void Info() {
		for(Subject s : arr) {
			System.out.println(s);
		}
	}
	
	
}
