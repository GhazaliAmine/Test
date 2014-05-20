package test1;


import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ClassTest {
	
	private Classe classe;
	
	@Before
	public void setUp() throws Exception {

		classe = new Classe();
	}
	
	@Test
	public void itShouldReturnString()
	{
		
		assertEquals("how are you", classe.sayHello("hi"));
	}

}
