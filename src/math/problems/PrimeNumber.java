package math.problems;

import databases.ConnectToSqlDB;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class PrimeNumber {

	public static void main(String[] args) {
		/*
		 * Find list of Prime numbers from number 2 to 1 million.
		 * Try the best solution as possible.Which will take less CPU life cycle.
		 * Out put number of Prime numbers on the given range.
		 *
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 */

		int counter =0;
		int upToNumber =100;
		List<Integer> list = new ArrayList<Integer>();
		for(int i=2;i<upToNumber;i++) {
			if(i==2) {
				System.out.print(i+",");
				counter++;
				list.add(i);

			}else {
				if(isPrime(i)) {
					System.out.print(i+",");
					counter++;
					list.add(i);
				}
			}

		}



       // ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();
	//	connectToSqlDB.insertDataFromArrayListToSqlTable(list, "selection_sort", "SortingNumbers");
//		List<Integer> numbers = connectToSqlDB.readDataBase("selection_sort", "SortingNumbers");


		System.out.println("Total prime numbers as of "+ upToNumber+ " is "+counter);

		System.out.println("the list of prime numbers is: ");
		for (Integer it : list){
			System.out.print(it+",");
		}
	}

	public static boolean isPrime(int n) {
		if(n%2==0) return false;
		for(int i=3;i*i<=n;i=i+2) {

			if(n%i==0) return false;
		}
		return true;

	}



}

