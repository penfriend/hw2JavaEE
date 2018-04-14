package com.mycompany.app;

import java.util.List;

public class BeautySalon {
	
	private String name;
	private String address;
	public List<ServiceProvider> getServices() {
		return services;
	}

	public void setServices(List<ServiceProvider> services) {
		this.services = services;
	}
	private List<ServiceProvider> services;

	public String getAddress() {
		return address;
	}

	public void setAddress(String address) {
		this.address = address;
	}

	public BeautySalon(String name) {
		// TODO Auto-generated constructor stub
		this.name=name;
	}
	public void printSalon() {
		System.out.println("name= "+name);
		System.out.println("addresss= "+address);
		for (ServiceProvider item : services) {
		    item.provide();
		}
	}

}
