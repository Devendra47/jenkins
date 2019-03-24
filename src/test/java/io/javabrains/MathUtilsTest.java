package io.javabrains;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

class MathUtilsTest {
	
	MathUtils mathUtils;
	
	

	@Test
	@DisplayName("test Add method")
	void testAdd() {
    
		MathUtils mathUtils=new MathUtils();
		
		int expected=2;
		int actual=mathUtils.add(1, 1);
		
		assertEquals(expected, actual,"the test method return 2");
		}
	
	
	@Test
	@Disabled
	void  testDivide() {
		MathUtils mathUtils=new MathUtils();
		
		assertThrows(ArithmeticException.class, ()->mathUtils.divide(1, 0),"Dive by zero");
		
		
	}
	
	@Test
	void testComputeCircleArea() {
		double expected=314.1592653589793;
		
		MathUtils mathUtils=new MathUtils();
		
		assertEquals(expected, mathUtils.computeCircleArea(10),"should return right circle area");
		
	}

}
