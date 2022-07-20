package org.mavenexample.practice;

import org.testng.annotations.Test;

public class Practice1Test {
	
@Test
public void practice1Test() {
String URL = System.getProperty("url");
String USERNAME = System.getProperty("username");
String PASSWORD = System.getProperty("password");
System.out.println("url"+URL);
System.out.println("username"+USERNAME);
System.out.println("password"+PASSWORD);
System.out.println("Test1===>class1");
//hi

}


@Test
public void practice2Test() {
	System.out.println("Test1===>class1");
}

@Test
public void practice3Test() {
	System.out.println("Test1===>class1");
	System.out.println("Test2===>class1");
}
}
