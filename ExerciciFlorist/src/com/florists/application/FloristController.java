package com.florists.application;

import com.florists.domain.Decoration;
import com.florists.domain.Florist;
import com.florists.domain.Flower;
import com.florists.domain.Tree;
import com.florists.utilities.Colour;
import com.florists.utilities.TypeMaterial;

public class FloristController {

	private Florist florist;

	public FloristController() {

	}

	public void createFlorist(String name) throws Exception {
		florist = new Florist(name);
	}

	public void addTree(double heigth, double price) throws Exception {
		Tree tree = new Tree(heigth, price);
		florist.addProduct(tree);
	}

	public void addFlower(Colour colour, double price) throws Exception {
		Flower flower = new Flower(colour, price);
		florist.addProduct(flower);
	}

	public void addDecoration(TypeMaterial material, double price) throws Exception {
		Decoration decoration = new Decoration(material, price);
		florist.addProduct(decoration);
	}

	public String getAllTree() {
		String allTree = "";
		for (Tree tree : florist.getAllTree()) {
			allTree += tree.toString() + " \n";
		}
		return allTree;
	}

	public String getAllFlower() {
		String allFlowers = "";
		for (Flower flower : florist.getAllFlower()) {
			allFlowers += flower.toString() + " \n";
		}
		return allFlowers;
	}

	public String getAllDecoration() {
		String allDecorations = "";
		for (Decoration decoration : florist.getAllDecoration()) {
			allDecorations += decoration.toString() + " \n";
		}
		return allDecorations;
	}

}
