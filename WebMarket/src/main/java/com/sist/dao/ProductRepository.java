package com.sist.dao;

import java.util.ArrayList;

import com.sist.vo.Product;

public class ProductRepository {
	
	public static ProductRepository dao = null;
	
	
	//외부에게 ProductRepository 객체를 반환하는 메소드를 static으로 만듬
	public static ProductRepository getInstance() {
		if(dao == null) {
			dao = new ProductRepository();
		}
		return dao;
		
	}
	
	
	//상품목록을 담을 ArrayList를 맴버변수로 선언
	private ArrayList<Product> listOfProducts = new ArrayList<Product>();
	
	
	//리스트에 상품을 등록하는 메소드
	public void addProduct(Product product) {
		listOfProducts.add(product);
	}
	
	
	
	//상품 상세 정보를 반환하는 메소드
	public Product getProductById(String productId) {
		Product productById = null;
		for(int i=0;i<listOfProducts.size(); i++) {
			Product product = listOfProducts.get(i);
			if(product != null &&
				product.getProductId() != null &&
				product.getProductId().equals(productId)) {
				productById = product;
				break;
			}
		}
		
		return productById;
	}
	
	
	//외부에서 사용할 수 없도록
	//생성자, 모든 상품목록을 반환하는 메소드
	private ProductRepository() {
		//매개변수 3개만 가지니까 vo의 생성자에도 있어야 함
		Product phone = new Product("P1234", "iPhone 6s", 800000);
		phone.setDescription("4.7-inch, 1334X750 Renina HD display, "
				+ "8-megapixel iSight Camera");
		phone.setCategory("Smart Phone");
		phone.setManufacturer("Apple");
		phone.setUnitInStock(1000);
		phone.setCondition("New");
		phone.setFilename("P1234.png");
		
		Product notebook = new Product("P1235", "LG PC 그램", 1500000);
		notebook.setDescription("13.3-inch, IPS LED display, 5rd Generation "
				+ "Intel Core processor");
		notebook.setCategory("Notebook");
		notebook.setManufacturer("LG");
		notebook.setUnitInStock(1000);
		notebook.setCondition("Refurbished");
		notebook.setFilename("P1235.png");
		
		Product tablet = new Product("P1236", "Galaxy Tab S", 900000);
		tablet.setDescription("212.8*125.6*6.6mm, Super AMOLED display, "
				+ "Octa-Core processor");
		tablet.setCategory("Tablet");
		tablet.setManufacturer("Samsung");
		tablet.setUnitInStock(1000);
		tablet.setCondition("Old");
		tablet.setFilename("P1236.png");
		
		listOfProducts.add(phone);
		listOfProducts.add(notebook);
		listOfProducts.add(tablet);
	}
	
	public ArrayList<Product> getAllProducts(){
		return listOfProducts;
	}
}
