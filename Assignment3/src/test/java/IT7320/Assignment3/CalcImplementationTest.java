package IT7320.Assignment3;

import static org.mockito.Mockito.*;
import junit.framework.TestCase;

public class CalcImplementationTest extends TestCase {

	
		CalcImplementation obj;
	int x;
	int y;
	
	protected void setUp() throws Exception {
		obj = new CalcImplementation();
		x = 5;
		y = 10;
		
		CalcInterface mockObj = mock(CalcInterface.class);
		when(mockObj.add(x, y)).thenReturn(x+y);
		obj.setIntObj(mockObj);
		
		when(mockObj.subtract(x, y)).thenReturn(x-y);
		obj.setIntObj(mockObj);
		
		when(mockObj.multiply(x, y)).thenReturn(x*y);
		obj.setIntObj(mockObj);
		
		when(mockObj.divide(x, y)).thenReturn((double) x/y);
		obj.setIntObj(mockObj);
		
	}

	protected void tearDown() throws Exception {
		obj = null;
		x = 0;
		y = 0;
	}

	public void testAddTwoNums() {
		assertEquals(15,obj.addTwoNums(x, y));
	}
	public void testSubtractTwoNums() {
		assertEquals(-5,obj.subtractTwoNums(x, y));
	}
	public void testMultiplyTwoNums() {
		assertEquals(50,obj.multiplyTwoNums(x, y));
	}
	public void testDivideTwoNums() {
		assertEquals(0.5,obj.divideTwoNums(x, y));
	}
	
	}


