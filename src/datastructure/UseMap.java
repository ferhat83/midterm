package datastructure;

import com.sun.scenario.effect.impl.sw.sse.SSEBlend_SRC_OUTPeer;
import databases.ConnectToSqlDB;

import java.sql.Connection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class UseMap {

	public static void main(String[] args) {
		/*
		 * Demonstrate how to use Map that includes storing and retrieving elements.
		 * Add List<String> into a Map. Like, Map<String, List<string>> list = new HashMap<String, List<String>>();
		 * Use For Each loop and while loop with Iterator to retrieve data.
		 *
		 * Use any databases[MongoDB, Oracle, MySql] to store data and retrieve data.
		 */
		Map<String, Integer> map1 = new HashMap<String, Integer>();
		map1.put("TIZI OUZOU", 15);
		map1.put("BEJAIA", 6);
		map1.put("ALGERS", 16);
		map1.put("BOUMERDES", 35);

		System.out.println("1-Cities of ALGERIA with reference number:");

		for (Map.Entry<String, Integer> country : map1.entrySet()) {
			System.out.println(country.getKey() + " " + country.getValue());
		}
		System.out.println();


		int array[]= {8,10,9,10,5,1,7};

		int sum=0;
		for (int i=0; i<array.length; i++) {
			sum+=array[i];

		}

		List<String>favoritePlayers = new ArrayList<String>();

		favoritePlayers.add("gerard");
		favoritePlayers.add("salah");
		favoritePlayers.add("ferminho");

		List<String>favoritePlayers2 = new ArrayList<String>();
		favoritePlayers2.add("messi");
		favoritePlayers2.add("iniesta");
		favoritePlayers2.add("xavi");


		Map<String, List<String>> teams = new HashMap<String, List<String>>();
		teams.put("LIVERPOOL", favoritePlayers);
		teams.put("BARCELONA",favoritePlayers2);


		System.out.println("2-MY FAVORITES TEAMS WITH BEST PLAYERS");
		for(Map.Entry<String,List<String>> country:teams.entrySet())
		{
			System.out.println(country.getKey()+" "+country.getValue());
		}
		ConnectToSqlDB connect = new ConnectToSqlDB();
		connect.insertDataFromArrayToSqlTable(array,"numbers","numb");



	}
}
