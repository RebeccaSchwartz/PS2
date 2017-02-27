package pkgNumbers;

import static org.junit.Assert.*;

import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Test;

public class TestMyInteger {

	@BeforeClass
	public static void setUpBeforeClass() throws Exception {
	}

	@AfterClass
	public static void tearDownAfterClass() throws Exception {
	}

	@Before
	public void setUp() throws Exception {
	}

	@After
	public void tearDown() throws Exception {
	}
 
	@Test
	public void TestIsEvenOddPrime() {
		MyInteger myint1 = new MyInteger(10);
		MyInteger myint2 = new MyInteger(3);
		
		boolean dExpectedEven1 = true;
		boolean dExpectedOdd1 = false;
		boolean dExpectedPrime1 = false;
		
		boolean dExpectedEven2 = false;
		boolean dExpectedOdd2 = true;
		boolean dExpectedPrime2 = true;
		
		assertEquals(dExpectedEven1,myint1.isEven());
		
		assertEquals(dExpectedOdd1,myint1.isOdd());
		
		assertEquals(dExpectedPrime1,myint1.isPrime());
		
		assertEquals(dExpectedEven2,myint2.isEven());
		
		assertEquals(dExpectedOdd2,myint2.isOdd());
		
		assertEquals(dExpectedPrime2,myint2.isPrime());
	}
	@Test
	public void TestIsEvenOddPrime2(){
		assertTrue(MyInteger.isEven(10));
		assertFalse(MyInteger.isEven(3));
		assertTrue(MyInteger.isOdd(3));
		assertFalse(MyInteger.isOdd(10));
		assertTrue(MyInteger.isPrime(3));
		assertFalse(MyInteger.isPrime(10));
	}
	@Test
	public void TestIsEvenOddPrime3(){
		MyInteger int1 = new MyInteger(10);
		MyInteger int2 = new MyInteger(3);
		
		boolean dExpectedEven1 = true;
		boolean dExpectedOdd1 = false;
		boolean dExpectedPrime1 = false;
		
		boolean dExpectedEven2 = false;
		boolean dExpectedOdd2 = true;
		boolean dExpectedPrime2 = true;
		
		assertEquals(dExpectedEven1,MyInteger.isEven(int1));
		
		assertEquals(dExpectedOdd1,MyInteger.isOdd(int1));
		
		assertEquals(dExpectedPrime1,MyInteger.isPrime(int1));
		
		assertEquals(dExpectedEven2,MyInteger.isEven(int2));
		
		assertEquals(dExpectedOdd2,MyInteger.isOdd(int2));
		
		assertEquals(dExpectedPrime2,MyInteger.isPrime(int2));
	}
	@Test 
	public void TestIsEqual(){
		MyInteger int1 = new MyInteger(10);
		MyInteger int2 = new MyInteger(3);
		
		assertTrue(int1.Equals(10));
		assertFalse(int2.Equals(10));
		
	}
	@Test
	public void TestIsEqual2(){
		MyInteger int1 = new MyInteger(10);
		MyInteger int2 = new MyInteger(3);
		
		assertFalse(int1.Equals(int2));
		assertTrue(int1.Equals(int1));
	}
}
