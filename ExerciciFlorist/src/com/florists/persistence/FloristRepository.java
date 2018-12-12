package com.florists.persistence;

import java.util.ArrayList;
import java.util.List;

import com.florists.domain.Decoration;
import com.florists.domain.Flower;
import com.florists.domain.Product;
import com.florists.domain.Tree;

public class FloristRepository {
	
	private List<Product> productList = new ArrayList<>();
	
	public FloristRepository() {
		
	}
	
	
	public List<Product> getAllProdutc() {
		return new ArrayList<>(productList);
	}

	public void addProduct(Product product) throws Exception {
		if (productList == null)
			throw new Exception();
		productList.add(product);
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
