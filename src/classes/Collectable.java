package classes;

import java.util.ArrayList;

public class Collectable {
	
	/**
	 * Number to identify a figure. All ids should be unique.
	 */
	// TODO: Create id (number) attribute.
	public int id;
	/**
	 * Name of the figure.
	 */
	// TODO: Create name attribute
	public String name;
	
	/**
	 * Brand that published/released the figure.
	 */
	// TODO: Create brand attribute
	public String brand;
	/**
	 * Collection score [0,10]
	 * If a figure already has a score over 0.0, just change the value.
	 */
	private double score;
	
	/**
	 * List of figure imperfections (text).
	 */
	private ArrayList<String> imperfections;
	
	/**
	 * Constructor
	 * @param nId - Figure id
	 * @param nName - Figure name
	 * @param nBrand - Figure brand
	 */
	public Collectable(int nId, String nName, String nBrand) {
		
		
		id = nId;
		name = nName;
		brand = nBrand;
		score = 0.0;
		imperfections = new ArrayList<>();
		// TODO: assign id
		// TODO: assign name
		// TODO: assign brand
		// TODO: initialize score as 0.0
		// TODO: initialize list as empty ArrayList
	} 
	
	// TODO: Getters/Setters
	
	public int getId() {
		return id;
	}
	
	public void setId(int id) {
		this.id = id;
	}
	
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	public String getBrand() {
		return brand;
	}
	
	public void setBrand(String brand) {
		this.brand = brand;
	}
	
	public double getScore() {
		return score;
	}
	
	public void setScore (double score) {
		this.score = score;
	}
	
	
	
	public void addImperfection(String imperfection) {
		this.imperfections.add(imperfection);
	}
	
	public String toString() {
		String desc = "Id: %d - Name: %s - Brand: %s - Score: %,f\n";
		return String.format(desc, this.id, this.name, this.brand, this.score);
	}

}
