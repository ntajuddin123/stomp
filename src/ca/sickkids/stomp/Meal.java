package ca.sickkids.stomp;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.StringTokenizer;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;

@XmlRootElement(name = "meal")
@XmlType(propOrder = { "category", "name", "description", "ingredients", 
		"legend", "green", "yellow", "blue", "red", "printTotal", 
		"instructions", "url" })
public class Meal {

	// public enum Category { BREAKFAST, LUNCH, DINNER, SNACK };
	// public enum Legend { F, HH, S, HM, C, FF }
	
	private String category;
	private String name;
	private String description;
	private String ingredients;
	private String legend;
	private int green;
	private int blue;
	private int red;
	private int yellow;
	private int printTotal;
	private String instructions;
	private String url;
	
	@XmlElement(name = "category")
	public String getCategory() {
		return category;
	}
	
	public void setCategory(String category) {		
		this.category = category;
	}

	@XmlElement(name = "name")
	public String getName() {
		return name;
	}
	
	public void setName(String name) {
		this.name = name;
	}
	
	@XmlElement(name = "description")
	public String getDescription() {
		return description;
	}
	
	public void setDescription(String description) {
		this.description = description;
	}
	
	@XmlElement(name = "ingredients")
	public String getIngredients() {
		return ingredients;
	}
	
	public void setIngredients(String ingredients) {
		this.ingredients = ingredients;
	}
	
	@XmlElement(name = "legend")
	public String getLegend() {
		return legend;
	}
	
	public void setLegend(String legend) {
		this.legend = legend;
//		StringTokenizer st = new StringTokenizer(legend, ";");
//		while(st.hasMoreTokens()) {
//			this.legend.add(st.nextToken());
//		}		
	}
	
	@XmlElement(name = "green")
	public int getGreen() {
		return green;
	}
	
	public void setGreen(int green) {
		this.green = green;
	}
	
	@XmlElement(name = "blue")
	public int getBlue() {
		return blue;
	}
	
	public void setBlue(int blue) {
		this.blue = blue;
	}
	
	@XmlElement(name = "red")
	public int getRed() {
		return red;
	}
	
	public void setRed(int red) {
		this.red = red;
	}
	
	@XmlElement(name = "Total Yellow Prints")
	public int getYellow() {
		return yellow;
	}
	
	public void setYellow(int yellow) {
		this.yellow = yellow;
	}
	
	public int getPrintTotal() {
		return printTotal;
	}
	
	@XmlElement(name = "total")
	public void setPrintTotal(int printTotal) {
		this.printTotal = printTotal;
	}
	
	@XmlElement(name = "instructions")
	public String getInstructions() {
		return instructions;
	}
	
	public void setInstructions(String instructions) {
		this.instructions = instructions;
	}
	
	@XmlElement(name = "url")
	public String getUrl() {
		return url;
	}
	
	public void setUrl(String url) {
		this.url = url;
	}
	
	public void printMeal() {
		System.out.println(category);
		System.out.println(name);
		System.out.println(description);
		System.out.println(ingredients);
		System.out.println(legend);
		System.out.println(green);
		System.out.println(blue);
		System.out.println(red);
		System.out.println(yellow);
		System.out.println(printTotal);
		System.out.print(instructions);
		System.out.println(url);
		System.out.println(Arrays.toString(getAsList(legend).toArray()));
		System.out.println(Arrays.toString(getAsList(ingredients).toArray()));
		System.out.println(Arrays.toString(getAsList(instructions).toArray()));
	}
	
	public ArrayList<String> getAsList(String str) {		
		ArrayList<String> list = new ArrayList<String>();
		StringTokenizer st = new StringTokenizer(str, ";");
		while (st.hasMoreTokens()) {
			list.add(st.nextToken().trim());
		}
		
		return list;
	}
}
