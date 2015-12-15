package com.lxj.patten.imp;

import java.util.ArrayList;
import java.util.Observer;

import com.lxj.patten.Obserber;
import com.lxj.patten.bookSubject;

public  class BookSubjectImp implements bookSubject {
	ArrayList<Obserber> arrayList = new ArrayList<Obserber>();
	private String msg;
	private Obserber obserber;
	@Override
	public void registerListener(Obserber o) {
		// TODO Auto-generated method stub
		arrayList.add(o);
		this.obserber = o;
	}

	@Override
	public void deleteListener(Obserber o) {
		// TODO Auto-generated method stub
		if(arrayList.contains(o)){
			int i = arrayList.indexOf(o);
			arrayList.remove(i);
		}
	}

	@Override
	public void notifyAllListener() {
		// TODO Auto-generated method stub
		for(Obserber obserber:arrayList){
			obserber.update(msg);
		}
	}

	public synchronized void setMsg(String msg){
			this.msg = msg+"\n";
	}


}
