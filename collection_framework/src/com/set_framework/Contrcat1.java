package com.set_framework;

import java.util.Objects;

public class Contrcat1 {

	//contract betwean the equals() and hashcode() of object
	private int id;
	private String name;
	public Contrcat1(int id, String name) {
		super();
		this.id = id;
		this.name = name;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return id+" "+name;
	}

	@Override
	public int hashCode() {
		return Objects.hash(id, name);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Contrcat1 other = (Contrcat1) obj;
		return id == other.id && Objects.equals(name, other.name);
	}
	
	
}
