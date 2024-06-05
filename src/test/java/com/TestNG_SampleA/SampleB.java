package com.TestNG_SampleA;

import org.testng.annotations.Test;

public class SampleB {
	
	@Test  (priority=5)
	public static void Test5 () {
		
		System.out.println("Number : 5");
		
		
	}
	
	@Test  (priority=8)
	public static void Test6 () {
		
		System.out.println("Number : 6");}
	
	@Test  (priority=2)
	public static void Test3 () {
		
		System.out.println("Number : 3");
	}
	
	@Test  (priority=4)
	public static void Test4 () {
		
		System.out.println("Number : 4");}
	
	@Test  (priority=-5)
	public static void Test1 () {
		
		System.out.println("Number : 1");}
	
	@Test  (priority=0)
	public static void Test2 () {
		
		System.out.println("Number : 2");}
	
	
}
