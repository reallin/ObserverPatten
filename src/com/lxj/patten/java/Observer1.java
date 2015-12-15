package com.lxj.patten.java;

import java.util.Observable;
import java.util.Observer;

import javax.security.auth.Subject;

public class Observer1 implements Observer {
	public void registerSubject(Observable observable)  
    {  
        observable.addObserver(this);  
    }  

	@Override
	public void update(Observable o, Object arg) {
		// TODO Auto-generated method stub
		if(o instanceof SubjectBook){
			SubjectBook suject = (SubjectBook)o;
			 System.out.println( suject.getMsg());  
		}
		
	}

}
