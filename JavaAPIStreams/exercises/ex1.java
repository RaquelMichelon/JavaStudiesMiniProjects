//source: https://blog.devgenius.io/15-practical-exercises-help-you-master-java-stream-api-3f9c86b1cf82
	
	//Exercise 1 — Obtain a list of products belongs to category “Books” with price > 100
	//filtering 1 - by "books"
	//filtering 2 - price > 100	
	List<Product> result = productRepo.findAll()
			.stream() //create a stream
			.filter(p -> p.getCategory().equalsIgnoreCase("Books")) //first filter by category "Book"
			.filter(p -> p.getPrice() > 100) //second filter by price
			.collect(Collectors.toList()); //terminal operation

	
	//Exercise 2 — Obtain a list of order with products belong to category “Baby”
	//start with order entities
	//filter by category "Baby"
	//in each order record check is there is anyMatch()
	List<Order> resultList = orderRepo.findAll().stream()
			.filter(order -> order.getProducts() //
					.stream()
					.anyMatch(p -> p.getCategory().equalsIgnoreCase("Baby")))
			.collect(Collectors.toList());
	
	
	
	//Exercise 3 — Obtain a list of product with category = “Toys” and then apply 10% discount
	//filter by category "Toys"
	//apply the discount by using map() - transform data
	List<Product> resultProducts = productRepo.findAll().stream()
			.filter(p -> p.getCategory().equalsIgnoreCase("Toys")) //filter by category
			.map(p -> p.withPrice(p.getPrice() * 0.9)) //apply discount to each product
			.collect(Collectors.toList());
