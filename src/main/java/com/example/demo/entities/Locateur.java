package com.example.demo.entities;






import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;

import jakarta.persistence.Entity;


@Entity
public class Locateur extends Personne {
	
	
	private long tele;	
	private String type;	
	private int depense;	
	
	
	public Locateur() {
		super();
		this.setRole("Locateur");
	}
	

	public Locateur(long tele, String type, int depense, String password) {
		super();
		
		this.tele = tele;
		this.type = type;
		this.depense = depense;
		 // Hash the password using BCrypt
        BCryptPasswordEncoder passwordEncoder = new BCryptPasswordEncoder();
        this.setPassword(passwordEncoder.encode(password));

        // Set the default role
        this.setRole("Locateur");
		
	}
	
	
	
	public long getTele() {
		return tele;
	}
	public void setTele(long tele) {
		this.tele = tele;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public int getDepense() {
		return depense;
	}
	public void setDepense(int depense) {
		this.depense = depense;
	}
	
	
	

	
	

}
