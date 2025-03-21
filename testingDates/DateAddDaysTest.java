package testingDates;
import org.junit.*;
import static org.junit.Assert.*;

public class DateAddDaysTest {
	
	//@Test
	//public void testMonth() {
	//	assertEquals(1, theDate.getMonth());
	//}
	
	@Test
	public void addOneDayWithoutChangingMonth()
	{
		Date date = new Date("March", 1, 2025);
		date.addOneDay(date);
		assertEquals(3, date.getMonth());
		assertEquals(2, date.getDay());
	}
	
	@Test
	public void addOneDayWithChangingMonth()
	{
		Date date = new Date("March", 31, 2025);
		date.addOneDay(date);
		assertEquals(4, date.getMonth());
		assertEquals(1, date.getDay());
	}
	
	@Test
	public void checkFebruaryToMarch()
	{
		Date date = new Date("February", 28, 2025);
		date.addOneDay(date);
		assertEquals(3, date.getMonth());
		assertEquals(1, date.getDay());
	}
	
	@Test
	public void checkDecemberToJanuaryAndYearChange()
	{
		Date date = new Date("December", 31, 2025);
		date.addOneDay(date);
		assertEquals(1, date.getMonth());
		assertEquals(2026, date.getYear());
	}
	
	@Test
	public void checkJuneToJuly()
	{
		Date date = new Date("June", 30, 2025);
		date.addOneDay(date);
		assertEquals(7, date.getMonth());
		assertEquals(1, date.getDay());
	}
	
    
}
