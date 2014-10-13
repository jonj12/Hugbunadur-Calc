package hugbunadur;
import static org.junit.Assert.assertEquals;
import org.junit.Test;

public class CalculatorTest {

	public class CalcTest{

		public void main(String[] args)
		{
			org.junit.runner.JUnitCore.main("CalcTest");
		}

		@Test
		public void test(){
			assertEquals(0, Calculator.add(""));
		}
	}
}
