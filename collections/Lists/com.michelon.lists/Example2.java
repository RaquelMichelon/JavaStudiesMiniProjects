package com.michelon.lists;

import java.util.ArrayList;
import java.util.List;

public class Example2 {

	public static void main(String[] args) {
		List<Client> clientList = new ArrayList<>();
		
		clientList.add(new Client(1L, "Raquel"));
		clientList.add(new Client(2L, "Carlos"));
		clientList.add(new Client(3L, "Sarah"));
		
		clientList.forEach(client -> System.out.printf("ID: %d , Name: %s%n", client.getId(), client.getName()));
		//ID: 1 , Name: Raquel
		//ID: 2 , Name: Carlos
		//ID: 3 , Name: Sarah

	}

}
