package com.lxj.patten;

public interface bookSubject {
	public void registerListener(Obserber o);
	public void deleteListener(Obserber o);
	public void notifyAllListener();
	
}
