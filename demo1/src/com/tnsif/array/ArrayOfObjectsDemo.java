package com.tnsif.array;

public class ArrayOfObjectsDemo {
public static void main(String[] args) {
	Student[] arr;
	arr= new Student[5];
	arr[0]= new Student(101,"Dimple");
	arr[1]= new Student(102,"Student1");
	arr[2]= new Student(103,"Student2");
	arr[3]= new Student(104,"Student4");
	arr[4]= new Student(105,"Student3");
	
	
	for(int i=0;i<arr.length;i++) {
		System.out.println(arr[i].getRollNo()+arr[i].getName());
	}
	
}
}
