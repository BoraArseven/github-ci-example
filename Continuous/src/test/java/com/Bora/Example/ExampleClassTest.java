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
	public void SayhelloNameShouldSayHelloName() {
		assertEquals("HelloBora", ex.sayHello("Bora"));
	}
}
