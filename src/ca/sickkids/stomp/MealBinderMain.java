package ca.sickkids.stomp;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.ArrayList;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBException;
import javax.xml.bind.Unmarshaller;


public class MealBinderMain {

	private static final String MEALS_XML = "./dmp.xml";
	
	public static void main(String[] args) {
		
 		// create JAXB context and instantiate marshaller
		try {
			JAXBContext context = JAXBContext.newInstance(DietPlan.class);
			Unmarshaller um = context.createUnmarshaller();
			DietPlan plan = (DietPlan) um.unmarshal(new FileReader(MEALS_XML));
			
			ArrayList<Meal> list = plan.getMealList();
			
			for (Meal meal : list) {
				meal.printMeal();
				System.out.println();
			}
			
		} catch (JAXBException e) {
			e.printStackTrace();
		} catch (FileNotFoundException fne) {
			fne.printStackTrace();
		}
		
		
	}

}
