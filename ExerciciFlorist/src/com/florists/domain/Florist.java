package com.florists.domain;

import java.util.ArrayList;
import java.util.List;

public class Florist {

	private String name;
	private List<Product> productList = new ArrayList<>();

	public Florist(String name) throws Exception {
		if (name.equals(""))
			throw new Exception();

		this.name = name;
	}

	public List<Product> getAllProdutc() {
		return new ArrayList<>(productList);
	}

	public void addProduct(Product product) throws Exception {
		if (productList == null)
			throw new Exception();
		productList.add(product);
	}

	public String getName() {
		return name;
	}

	public List<Product> getProductList() {
		return productList;
	}

	public List<Tree> getAllTree() {
		List<Tree> allTree = new ArrayList<>();
		for (Product p : productList) {
			if (p instanceof Tree) {
				allTree.add((Tree)p);
			}

		}
		return allTree;
	}

	public List<Flower> getAllFlower() {
		List<Flower> allFlower = new ArrayList<>();
		for (Product p : productList) {
			if (p instanceof Flower) {
				allFlower.add((Flower) p);
			}

		}
		return allFlower;
	}

	public List<Decoration> getAllDecoration() {
		List<Decoration> allDecoration = new ArrayList<>();
		for (Product p : productList) {
			if (p instanceof Decoration) {
				allDecoration.add((Decoration) p);
			}

		}
		return allDecoration;
	}

}
