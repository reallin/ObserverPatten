package com.lxj.patten.java;

import com.lxj.patten.imp.BookSubjectImp;


public class Main {
	public static void main(String args[]){
		SubjectBook subjectImp = new SubjectBook();
		
		Observer1 o1 = new Observer1();
		o1.registerSubject(subjectImp);
		
		subjectImp.setMsg("有新书来啦！");
		
	}
}
