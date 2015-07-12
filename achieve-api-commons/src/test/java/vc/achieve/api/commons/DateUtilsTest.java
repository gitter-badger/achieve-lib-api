package vc.achieve.api.commons;

import java.util.Calendar;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

/**
 * <p>Unit test class for {@link DateUtils}.</p>
 * 
 * @author Alberto Cerqueira
 * @since 1.0
 */
public class DateUtilsTest {
	
	private String[] patterns = new String[]{"dd/MM/yyyy", "MM/dd/yyyy", "yyyy/MM/dd", "dd-MM-yyyy", "MM-dd-yyyy", "yyyy-MM-dd", "ddMMyyyy", "MMddyyyy", 
			"yyyyMMdd", "dd/MM/yyyy hh:mm:ss", "MM/dd/yyyy hh:mm:ss", "yyyy/MM/dd hh:mm:ss", "ddMMyyyy hh:mm:ss", "MMddyyyy hh:mm:ss", "yyyyMMdd hh:mm:ss"};
	
	private String date;
	
	@Before
	public void setUp() {
		this.date = DateUtils.today("dd/MM/yyyy");
	}

	@After
	public void tearDown() {
		this.date = null;
	}
	
	@Test
	public void should_get_date_today_and_format_the_standard() {
		for (String pattern : patterns) {
			date = DateUtils.today(pattern);
			System.out.println(date);
		}
	}
	
	@Test
	public void should_get_calendar_to_string() {
		for (String pattern : patterns) {
			date = DateUtils.calendarToString(Calendar.getInstance(), pattern);
			System.out.println(date);
		}
	}
}