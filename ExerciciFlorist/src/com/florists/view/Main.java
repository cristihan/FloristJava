package com.florists.view;

import com.florists.application.FloristController;
import com.florists.utilities.Colour;
import com.florists.utilities.TypeMaterial;

public class Main {
	
	private static FloristController controller = new FloristController();

	public static void main(String[] args) throws Exception {
		
		controller.createFlorist("Floristeria Manolito");
		
		controller.addTree(12, 3.5);
		controller.addTree(10, 2.8);
		
		controller.addFlower(Colour.BLACK, 23.45);
		controller.addFlower(Colour.BLUE,  18.78);
		controller.addFlower(Colour.GRAY,  13.90);
		controller.addFlower(Colour.GREEN, 9.89);
		controller.addFlower(Colour.RED,   15.30);
		
		controller.addDecoration(TypeMaterial.PLASTIC, 45.78);
		controller.addDecoration(TypeMaterial.WOOD, 95.18);
		
		
		String allTree= controller.getAllTree();
        System.out.println("TREE: \n" +  allTree);
        
        String allFlower = controller.getAllFlower();
        System.out.println("FLOWER: \n" +  allFlower);
        
        String allDecoration = controller.getAllDecoration();
        System.out.println("DECORATION: \n" +  allDecoration);

		
		
	}

}
