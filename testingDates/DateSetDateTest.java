package testingDates;
import org.junit.*;
import static org.junit.Assert.*;

public class DateSetDateTest {

	@Test
	public void setValidDateInFebruary()
	{
		Date date = new Date(1, 1, 2025);
		date.setDate("February", 28, 2025);
		assertEquals(2, date.getMonth());
		assertEquals(28, date.getDay());
	}
	
	@Test
	public void setInvalidDateInFebruary()
	{
		Date date = new Date(1, 1, 2025);
		date.setDate("February", 29, 2025);
		assertEquals(1, date.getMonth());
		assertEquals(1, date.getDay());
	}
	
	@Test
	public void setValidDateInMarch()
	{
		Date date = new Date(1, 1, 2025);
		date.setDate("March", 31, 2025);
		assertEquals(3, date.getMonth());
		assertEquals(31, date.getDay());
	}
	
	@Test
	public void setInvalidDateInMarch()
	{
		Date date = new Date(1, 1, 2025);
		date.setDate("March", 32, 2025);
		assertEquals(1, date.getMonth());
		assertEquals(1, date.getDay());
	}
	
	@Test
	public void setValidDateInApril()
	{
		Date date = new Date(1, 1, 2025);
		date.setDate("April", 30, 2025);
		assertEquals(4, date.getMonth());
		assertEquals(30, date.getDay());
	}
	
	@Test
	public void setInvalidDateInApril()
	{
		Date date = new Date(1, 1, 2025);
		date.setDate("April", 31, 2025);
		assertEquals(1, date.getMonth());
		assertEquals(1, date.getDay());
	}
	
	
	
}
