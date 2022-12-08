package com.jojuskills;
import java.util.ArrayList;
import java.util.List;
public class CollectionTest1 {
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		List<String> games=new ArrayList<String>();
		games.add("Football");
		games.add("Basketball");
		games.add("Cricket");
		games.add("chess");
		games.add("kabadi");
		games.forEach(gamenames-> System.out.println(gamenames));  
		//games.stream().forEachOrdered(System.out::println);
	}
}
