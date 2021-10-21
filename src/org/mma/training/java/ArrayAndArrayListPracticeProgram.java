package org.mma.training.java;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayAndArrayListPracticeProgram {

	public static void main(String[] args) {

		//Creating an Array
		String[] AnimalsArray = {"Horse", "Lion", "Cat", "Dog"};

		//Get an element from Array
		System.out.println(AnimalsArray[2]);

		//Creating an ArrayList

		ArrayList<String> AnimalsArrayList = new ArrayList<>(Arrays.asList("Horse", "Lion", "Cat", "Dog"));

		//Get an element from ArrayList 
		System.out.println(AnimalsArrayList.get(2));

		//Add an elemnent to Array
		//We can't bc an Array has a fixed length

		//Add an element to ArrayList
		AnimalsArrayList.add(2," Rabbit");
		System.out.println(AnimalsArrayList.get(2));
		System.out.println(AnimalsArrayList.get(3));

		//Remove an element from Array
		//We can't bc an Array has fixed length


		//Remove an element from ArrayList
		AnimalsArrayList.remove(2);
		System.out.println(AnimalsArrayList.get(2));

		//Printing a size of an Array
		System.out.println(AnimalsArray.length);

		//Printing a size of an ArrayList

		System.out.println(AnimalsArrayList.size());






	}

}
