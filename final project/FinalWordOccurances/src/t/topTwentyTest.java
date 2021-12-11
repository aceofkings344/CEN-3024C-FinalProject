package t;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class topTwentyTest {
	
	private List<List<String>> te = new ArrayList<List<String>>();

	private String re = "twenty\t\t\t20\n" + "nineteen\t\t\t19\n" + "eighteen\t\t\t18\n" + "seventeen\t\t\t17\n" + 
			"sixteen\t\t\t16\n" + "fifteen\t\t\t15\n" + "fourteen\t\t\t14\n" + "thirteen\t\t\t13\n" + 
			"twelve\t\t\t12\n" + "eleven\t\t\t11\n" + "ten\t\t\t10\n" + "nine\t\t\t9\n" + 
			"eight\t\t\t8\n" + 	"seven\t\t\t7\n" + "six\t\t\t6\n" + "five\t\t\t5\n" + 
			"four\t\t\t4\n" + "three\t\t\t3\n" + "two\t\t\t2\n" + "one\t\t\t1\n";
	
	public void teAdd() {
		ArrayList<String> t1 = new ArrayList<>(Arrays.asList("twenty", "20"));
		ArrayList<String> t2 = new ArrayList<>(Arrays.asList("nineteen", "19"));
		ArrayList<String> t3 = new ArrayList<>(Arrays.asList("eighteen", "18"));
		ArrayList<String> t4 = new ArrayList<>(Arrays.asList("seventeen", "17"));
		ArrayList<String> t5 = new ArrayList<>(Arrays.asList("sixteen", "16"));
		ArrayList<String> t6 = new ArrayList<>(Arrays.asList("fifteen", "15"));
		ArrayList<String> t7 = new ArrayList<>(Arrays.asList("fourteen", "14"));
		ArrayList<String> t8 = new ArrayList<>(Arrays.asList("thirteen", "13"));
		ArrayList<String> t9 = new ArrayList<>(Arrays.asList("twelve", "12"));
		ArrayList<String> t10 = new ArrayList<>(Arrays.asList("eleven", "11"));
		ArrayList<String> t11 = new ArrayList<>(Arrays.asList("ten", "10"));
		ArrayList<String> t12 = new ArrayList<>(Arrays.asList("nine", "9"));
		ArrayList<String> t13 = new ArrayList<>(Arrays.asList("eight", "8"));
		ArrayList<String> t14 = new ArrayList<>(Arrays.asList("seven", "7"));
		ArrayList<String> t15 = new ArrayList<>(Arrays.asList("six", "6"));
		ArrayList<String> t16 = new ArrayList<>(Arrays.asList("five", "5"));
		ArrayList<String> t17 = new ArrayList<>(Arrays.asList("four", "4"));
		ArrayList<String> t18 = new ArrayList<>(Arrays.asList("three", "3"));
		ArrayList<String> t19 = new ArrayList<>(Arrays.asList("two", "2"));
		ArrayList<String> t20 = new ArrayList<>(Arrays.asList("one", "1"));
		
		te.add(new ArrayList<String>(t1));
		te.add(new ArrayList<String>(t2));
		te.add(new ArrayList<String>(t3));
		te.add(new ArrayList<String>(t4));
		te.add(new ArrayList<String>(t5));
		te.add(new ArrayList<String>(t6));
		te.add(new ArrayList<String>(t7));
		te.add(new ArrayList<String>(t8));
		te.add(new ArrayList<String>(t9));
		te.add(new ArrayList<String>(t10));
		te.add(new ArrayList<String>(t11));
		te.add(new ArrayList<String>(t12));
		te.add(new ArrayList<String>(t13));
		te.add(new ArrayList<String>(t14));
		te.add(new ArrayList<String>(t15));
		te.add(new ArrayList<String>(t16));
		te.add(new ArrayList<String>(t17));
		te.add(new ArrayList<String>(t18));
		te.add(new ArrayList<String>(t19));
		te.add(new ArrayList<String>(t20));
	}
	
	@Test
	public void test() throws Exception {
		teAdd();
		String output = Organize.topTwenty(te);
		assertEquals(re, output);
	}
}
