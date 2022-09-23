package com.praktikum;

public class Students {
	int NPM;
	String FullName;
	String ClassName;
	int Semester;
	double GPA;

	int GetNPM(int val) {
		NPM = val ;
		return NPM;
	}
	String GetFullName(String val ) {
		FullName = val ;
		return FullName;
	}
	String GetClassName(String val ) {
		ClassName = val;
		return ClassName;
	}
	int GetSemester(int val) {
		Semester =val ;
		return Semester;
	}
	double GetGPA(double val) {
		GPA = val;
		return GPA;
	}
}