package com.example;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
public class CalculatorTest{
	Calculator calculator= null;
	@Before
	public void init(){
		calculator=new Calculator();
		//System.out.println("Init");
	}
	@After
	public void destroy(){
		calculator=null;
	}
	
	@Test
	public void testsum(){
	//Calculator calculator= new Calculator();
	int rs= calculator.sum(10,20);
	Assert.assertEquals(30,rs);
	return;
 }
	@Test
	public void negativetestsum(){
	//Calculator calculator= new Calculator();
	int rs= calculator.sum(20,-5);
	Assert.assertEquals(15,rs);
	return;
 }
}
