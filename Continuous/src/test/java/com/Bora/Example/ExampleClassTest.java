package com.Bora.Example;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ExampleClassTest {
	ExampleClass ex;
	@Before
	public void Setup() {
    ex = new ExampleClass();
	}
	@Test
	public void SayhelloNullShouldSayHello() {
		assertEquals("Hello", ex.sayHello(null));
	}
	@Test
	public void SayhelloNameShouldSayHelloName() {
		assertEquals("Hello Bora", ex.sayHello("Bora"));
	}
}
