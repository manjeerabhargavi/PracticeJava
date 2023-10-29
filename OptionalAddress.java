package com.java8.practicejava.implementation;

import java.util.Optional;

public class OptionalAddress {
	private String street;
	
	public Optional<String> getStreet(){
		return Optional.ofNullable(street);
	}
	public void setStreet(String street) {
		this.street = street;
	}

}
