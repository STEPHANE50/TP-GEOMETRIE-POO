package co.simplon.poo.s2;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class CarreTest {

	@Test
	public void test() {
	Carre testc = new Carre(5) 	;
	
	double perimetre = testc.perimetre();
	
	assertEquals( 20, perimetre,0);
	
	}
}
