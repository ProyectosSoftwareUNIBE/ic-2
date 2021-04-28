package unibe.edu.ec;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class FraccionTests {
	
	private Fraccion p1;
	
	@Before
	public void before() {
		this.p1 = new Fraccion(7, 3);
	}
	
	@Test
	public void Suma() {
		assertEquals(10, this.p1.Suma());
	}
	
	@Test
	public void Resta() {
		assertEquals(4, this.p1.Resta());
	}

}
