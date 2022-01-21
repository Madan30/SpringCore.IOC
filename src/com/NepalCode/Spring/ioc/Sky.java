package com.NepalCode.Spring.ioc;

public class Sky implements Sim{

	@Override
	public void calling() {
		System.out.println("Calling from Sky sim");
		
	}

	@Override
	public void data() {
		System.out.println("Using sky data sim");
		
	}

}
