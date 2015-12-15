package com.lxj.patten.imp;

import com.lxj.patten.bookSubject;

public class Main {
	public static void main(String args[]){
		BookSubjectImp subjectImp = new BookSubjectImp();
		
		Observer1 o1 = new Observer1(subjectImp);
		Observer2 o2 = new Observer2(subjectImp);
		
		subjectImp.setMsg("你书超期了，快来还书");
		subjectImp.notifyAllListener();
	}
}
