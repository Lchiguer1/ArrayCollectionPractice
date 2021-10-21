package org.mma.training.java;

import java.util.ArrayList;
import java.util.Arrays;

public class ArrayCollectionPracticeProgram {

	public static void main(String[] args) {
		String car = " Tesla";
		String car1 = "BMW";

		//Array is used to store multiple values in a single variable
		//Creati

		//Creating an Array
		String[] friendsArray = {"Fatima","Asto","Atiqa"," Kethoom"};

		ArrayList<String>  friendsArrayList =new ArrayList<>(Arrays.asList("Fatima", "Asto", "Atiqa", "Kelthoom"));

		//get element
		System.out.println(friendsArray[1]);
		System.out.println(friendsArrayList.get(1));

		//Arrays have fixed size
		//ArrayList have a dynamiq size
		//Arrays can hold anything, primitive data type(int, bool, long, etc) or objet like string or any other objet
		//ArrayList can only hold objects, it can not hold primitives

		//Printing a size of an Array and of an ArrayList

		System.out.println(friendsArray.length);//field call
		System.out.println(friendsArrayList.size());//a method call

		//How to add an elemnt to the end of An Array or ArrayList
		//We can't add a new element to Array but We can add it to an ArrayList
		//Add an element
		friendsArrayList.add("Roqayyah");
		System.out.println(friendsArrayList.get(4));

		//set an element
		friendsArray[0] =" Souad";
		System.out.println(friendsArray[0]);

		friendsArrayList.set(0,"Souad");
		System.out.println(friendsArrayList.get(0));

		//Remove an element from an Array or ArrayList
		//We can't do it with Arrays bc We have fixed length with an Array

		friendsArrayList.remove(1);
		System.out.println(friendsArrayList.get(1));

		//print the size of the ArrayList
		System.out.println(friendsArrayList.size());
		
		//Print an Array and ArrayList
		System.out.println(friendsArray); //this will print the memory address of that array
		System.out.println(friendsArrayList); //will print all the elements
		
		//ArrayList is part of java collection, easy to add, easy to remove, easy to print, easy to call an object or a methos











	}
}