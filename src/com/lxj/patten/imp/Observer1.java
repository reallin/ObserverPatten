package com.lxj.patten.imp;

import com.lxj.patten.Obserber;
import com.lxj.patten.bookSubject;

public class Observer1 implements Obserber {
	private bookSubject  subject;

	public Observer1(bookSubject b){
		subject = b;
		subject.registerListener(this);
	}
	@Override
	public void update(String msg) {
		// TODO Auto-generated method stub
		System.out.println(msg+" 我是observer1,马上去还");
	}

}
