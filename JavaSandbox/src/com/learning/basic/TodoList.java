package com.learning.basic;

import java.util.ArrayList;
import java.util.Scanner;

public class TodoList {
	public static void main(String[] args) {
		ArrayList<String> todoList = new ArrayList<String>();
		Scanner scanner = new Scanner(System.in);

		while(true) {
			System.out.println("==============Todo List============");
			for (int i = 0; i < todoList.size(); i++) {
				System.out.println((i+1) + ". " + todoList.get(i));
			}

			System.out.println("==============");
			System.out.println("1. Enter an item\n2. Remove an item\n3. Exit\nEnter Choice:\n");
			
			int choice = scanner.nextInt();
			scanner.nextLine();
			
			if(choice == 1) {
				System.out.println("Enter your item:");
				String newItem = scanner.nextLine();
				todoList.add(newItem);
				System.out.println("Item added");
			} else if(choice == 2) {
				System.out.println("Enter item number to remove: ");
				int itemNum = scanner.nextInt();
				if(itemNum > 0 && itemNum <= todoList.size()) {
					todoList.remove(itemNum - 1);
					System.out.println("Item removed");
				}
			} else if(choice == 3) {
				break;
			} else {
				System.out.println("Invalid choice");
			}
		}
		
		System.out.println("Existing Todo List App");
		scanner.close();
	}
}
