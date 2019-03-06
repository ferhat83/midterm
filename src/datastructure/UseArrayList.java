package datastructure;

import java.util.ArrayList;
import java.util.List;

public class UseArrayList {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use ArrayList that includes add,peek,remove,retrieve elements.
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 * Store all the sorted data into one of the databases.
		 *
		 */


			List<String> students = new ArrayList<>();


		students.add("Nacer");
		students.add("Ferhat");
		students.add("Samir");
		students.add("Youcef");
		students.add("alex");


		System.out.println("ArrayList before");
		System.out.println(students);

		students.add(2, "Cherif");
		students.remove(5);


		System.out.println("ArrayList after");
			System.out.println(students);

		}

	}

