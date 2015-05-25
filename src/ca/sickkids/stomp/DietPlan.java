package ca.sickkids.stomp;
import java.util.ArrayList;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

@XmlRootElement(name = "stomp")
public class DietPlan {

	private ArrayList<Meal> mealList;
	
	public void setMealList(ArrayList<Meal> mealList) {
		this.mealList = mealList;
	}
	
	@XmlElement(name = "meal")
	public ArrayList<Meal> getMealList() {
		return mealList;
	}
	
}
