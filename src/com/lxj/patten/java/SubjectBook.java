package com.lxj.patten.java;

import java.util.Observable;
import java.util.Observer;

public class SubjectBook extends Observable {

	private String msg;

	public String getMsg() {
		return msg;
	}

	public void setMsg(String msg) {
		this.msg = msg;
		this.setChanged();
		this.notifyObservers();
	}
	
}
