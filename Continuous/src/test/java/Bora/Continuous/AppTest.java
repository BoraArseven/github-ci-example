package Bora.Continuous;

import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;

import org.junit.Before;
import org.junit.Test;

/**
 * Unit test for simple App.
 */
public class AppTest 
{
	private App app;
	@Before
	
	public void setup() {
		app = new App();
	}
    /**
     * Rigorous Test :-)
     */
    @Test
    public void shouldAnswerWithHello()
    {
        assertEquals("Hello", app.sayHello());
    }
    @Test
    public void testSayHelloWithName() {
    assertEquals("Hello World", app.sayHello("World"));
    }
    @Test
    public void FunctionTwoShouldGiveNull()
    {
        assertEquals("Coveralls helps to fix our errors", app.Function2());
    }
    
}
