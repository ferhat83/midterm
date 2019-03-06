package datastructure;

import databases.ConnectToSqlDB;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.List;

import static algorithm.Numbers.printValue;

public class DataReader {

	public static void main(String[] args) throws Exception {
		/*
		 * User API to read the below textFile and print to console.
		 * Use BufferedReader class.
		 * Use try....catch block to handle Exception.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 *
		 * After reading from file using BufferedReader API, store each word into Stack and LinkedList. So each word
		 * should construct a node in LinkedList.Then iterate/traverse through the list to retrieve as FIFO
		 * order from LinkedList and retrieve as FILO order from Stack.
		 *
		 * Demonstrate how to use Stack that includes push,peek,search,pop elements.
		 * Use For Each loop/while loop/Iterator to retrieve data.
		 */

		//String textFile = System.getProperty("user.dir") + "/src/data/self-driving-car";

		String array1[] = new String[11];
		int counter =0;

		FileReader fr = null;
		BufferedReader br = null;
		String path = "D:\\testing\\midterm\\MidtermJanuary2019\\src\\data\\self-driving-car";
		try {
			fr = new FileReader(path);
			br = new BufferedReader(fr);
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		String st = "";
		try {
			while ((st = br.readLine()) != null) {
				array1[counter]=st;
				counter ++;
				System.out.println(st);
			}
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if (fr != null) {
				fr = null;
			}
			if (br != null) {
				br = null;
			}

		}

		System.out.println(counter);


		ConnectToSqlDB connectToSqlDB = new ConnectToSqlDB();


		connectToSqlDB.insertDataFromArrayToSqlTable2(array1, "datareader1", "SortingNumbers");
		List<String> number10 = connectToSqlDB.readDataBase("datareader1", "SortingNumbers");
		printValue(number10);

	}
}
