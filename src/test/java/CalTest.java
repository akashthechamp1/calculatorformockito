import static org.junit.Assert.*;

import org.junit.Test;

public class CalTest {

	@Test
	public void testadd() {
    double expectedop=7,expectedop1=-1,expectedop2=2,expectedop3=2,expectedop4=1;
    double exp[]={4,-1};
		Cal c= new Cal();
	;
	assertEquals(expectedop,c.add(5, 2),0.0001);
	assertEquals(expectedop1,c.sub(1, 2),0.0001);
	assertEquals(expectedop2,c.mul(1, 2),0.0001);
	assertEquals(expectedop3,c.div(4, 2),0.0001);
	assertEquals(expectedop4,c.exp(1, 2),0.0001);
	assertArrayEquals(exp,c.root(1, -3, -4),0.0001);
	

	}

}
