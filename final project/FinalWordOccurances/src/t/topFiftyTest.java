package t;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class topFiftyTest {
	
	private List<List<String>> te = new ArrayList<List<String>>();
	
	private String re = "fifty\t\t\t50\n" + "forty-nine\t\t\t49\n" +"forty-eight\t\t\t48\n" + "forty-seven\t\t\t47\n" +	"forty-six\t\t\t46\n" +
			"forty-five\t\t\t45\n" + "forty-four\t\t\t44\n" + "forty-three\t\t\t43\n" +	"forty-two\t\t\t42\n" +	"forty-one\t\t\t41\n" +
			"forty\t\t\t40\n" +	"thirty-nine\t\t\t39\n" + "thirty-eight\t\t\t38\n" + "thirty-seven\t\t\t37\n" + "thirty-six\t\t\t36\n" +
			"thirty-five\t\t\t35\n" + "thirty-four\t\t\t34\n" + "thirty-three\t\t\t33\n" + "thirty-two\t\t\t32\n" + "thirty-one\t\t\t31\n" +
			"thirty\t\t\t30\n" + "twenty-nine\t\t\t29\n" + "twenty-eight\t\t\t28\n" + "twenty-seven\t\t\t27\n" + "twenty-six\t\t\t26\n" +
			"twenty-five\t\t\t25\n" + "twenty-four\t\t\t24\n" + "twenty-three\t\t\t23\n" + "twenty-two\t\t\t22\n" + "twenty-one\t\t\t21\n" +
			"twenty\t\t\t20\n" + "nineteen\t\t\t19\n" + "eighteen\t\t\t18\n" + "seventeen\t\t\t17\n" + "sixteen\t\t\t16\n" + "fifteen\t\t\t15\n" +
			"fourteen\t\t\t14\n" + "thirteen\t\t\t13\n" + "twelve\t\t\t12\n" + "eleven\t\t\t11\n" + "ten\t\t\t10\n" + "nine\t\t\t9\n" +
			"eight\t\t\t8\n" + "seven\t\t\t7\n" + "six\t\t\t6\n" + "five\t\t\t5\n" + "four\t\t\t4\n" + "three\t\t\t3\n" + "two\t\t\t2\n" + "one\t\t\t1\n";
	
	public void teAdd() {
		ArrayList<String> t1 = new ArrayList<>(Arrays.asList("fifty", "50"));
		ArrayList<String> t2 = new ArrayList<>(Arrays.asList("forty-nine", "49"));
		ArrayList<String> t3 = new ArrayList<>(Arrays.asList("forty-eight", "48"));
		ArrayList<String> t4 = new ArrayList<>(Arrays.asList("forty-seven", "47"));
		ArrayList<String> t5 = new ArrayList<>(Arrays.asList("forty-six", "46"));
		ArrayList<String> t6 = new ArrayList<>(Arrays.asList("forty-five", "45"));
		ArrayList<String> t7 = new ArrayList<>(Arrays.asList("forty-four", "44"));
		ArrayList<String> t8 = new ArrayList<>(Arrays.asList("forty-three", "43"));
		ArrayList<String> t9 = new ArrayList<>(Arrays.asList("forty-two", "42"));
		ArrayList<String> t10 = new ArrayList<>(Arrays.asList("forty-one", "41"));
		ArrayList<String> t11 = new ArrayList<>(Arrays.asList("forty", "40"));
		ArrayList<String> t12 = new ArrayList<>(Arrays.asList("thirty-nine", "39"));
		ArrayList<String> t13 = new ArrayList<>(Arrays.asList("thirty-eight", "38"));
		ArrayList<String> t14 = new ArrayList<>(Arrays.asList("thirty-seven", "37"));
		ArrayList<String> t15 = new ArrayList<>(Arrays.asList("thirty-six", "36"));
		ArrayList<String> t16 = new ArrayList<>(Arrays.asList("thirty-five", "35"));
		ArrayList<String> t17 = new ArrayList<>(Arrays.asList("thirty-four", "34"));
		ArrayList<String> t18 = new ArrayList<>(Arrays.asList("thirty-three", "33"));
		ArrayList<String> t19 = new ArrayList<>(Arrays.asList("thirty-two", "32"));
		ArrayList<String> t20 = new ArrayList<>(Arrays.asList("thirty-one", "31"));
		ArrayList<String> t21 = new ArrayList<>(Arrays.asList("thirty", "30"));
		ArrayList<String> t22 = new ArrayList<>(Arrays.asList("twenty-nine", "29"));
		ArrayList<String> t23 = new ArrayList<>(Arrays.asList("twenty-eight", "28"));
		ArrayList<String> t24 = new ArrayList<>(Arrays.asList("twenty-seven", "27"));
		ArrayList<String> t25 = new ArrayList<>(Arrays.asList("twenty-six", "26"));
		ArrayList<String> t26 = new ArrayList<>(Arrays.asList("twenty-five", "25"));
		ArrayList<String> t27 = new ArrayList<>(Arrays.asList("twenty-four", "24"));
		ArrayList<String> t28 = new ArrayList<>(Arrays.asList("twenty-three", "23"));
		ArrayList<String> t29 = new ArrayList<>(Arrays.asList("twenty-two", "22"));
		ArrayList<String> t30 = new ArrayList<>(Arrays.asList("twenty-one", "21"));
		ArrayList<String> t31 = new ArrayList<>(Arrays.asList("twenty", "20"));
		ArrayList<String> t32 = new ArrayList<>(Arrays.asList("nineteen", "19"));
		ArrayList<String> t33 = new ArrayList<>(Arrays.asList("eighteen", "18"));
		ArrayList<String> t34 = new ArrayList<>(Arrays.asList("seventeen", "17"));
		ArrayList<String> t35 = new ArrayList<>(Arrays.asList("sixteen", "16"));
		ArrayList<String> t36 = new ArrayList<>(Arrays.asList("fifteen", "15"));
		ArrayList<String> t37 = new ArrayList<>(Arrays.asList("fourteen", "14"));
		ArrayList<String> t38 = new ArrayList<>(Arrays.asList("thirteen", "13"));
		ArrayList<String> t39 = new ArrayList<>(Arrays.asList("twelve", "12"));
		ArrayList<String> t40 = new ArrayList<>(Arrays.asList("eleven", "11"));
		ArrayList<String> t41 = new ArrayList<>(Arrays.asList("ten", "10"));
		ArrayList<String> t42 = new ArrayList<>(Arrays.asList("nine", "9"));
		ArrayList<String> t43 = new ArrayList<>(Arrays.asList("eight", "8"));
		ArrayList<String> t44 = new ArrayList<>(Arrays.asList("seven", "7"));
		ArrayList<String> t45 = new ArrayList<>(Arrays.asList("six", "6"));
		ArrayList<String> t46 = new ArrayList<>(Arrays.asList("five", "5"));
		ArrayList<String> t47 = new ArrayList<>(Arrays.asList("four", "4"));
		ArrayList<String> t48 = new ArrayList<>(Arrays.asList("three", "3"));
		ArrayList<String> t49 = new ArrayList<>(Arrays.asList("two", "2"));
		ArrayList<String> t50 = new ArrayList<>(Arrays.asList("one", "1"));
		
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
		te.add(new ArrayList<String>(t21));
		te.add(new ArrayList<String>(t22));
		te.add(new ArrayList<String>(t23));
		te.add(new ArrayList<String>(t24));
		te.add(new ArrayList<String>(t25));
		te.add(new ArrayList<String>(t26));
		te.add(new ArrayList<String>(t27));
		te.add(new ArrayList<String>(t28));
		te.add(new ArrayList<String>(t29));
		te.add(new ArrayList<String>(t30));
		te.add(new ArrayList<String>(t31));
		te.add(new ArrayList<String>(t32));
		te.add(new ArrayList<String>(t33));
		te.add(new ArrayList<String>(t34));
		te.add(new ArrayList<String>(t35));
		te.add(new ArrayList<String>(t36));
		te.add(new ArrayList<String>(t37));
		te.add(new ArrayList<String>(t38));
		te.add(new ArrayList<String>(t39));
		te.add(new ArrayList<String>(t40));
		te.add(new ArrayList<String>(t41));
		te.add(new ArrayList<String>(t42));
		te.add(new ArrayList<String>(t43));
		te.add(new ArrayList<String>(t44));
		te.add(new ArrayList<String>(t45));
		te.add(new ArrayList<String>(t46));
		te.add(new ArrayList<String>(t47));
		te.add(new ArrayList<String>(t48));
		te.add(new ArrayList<String>(t49));
		te.add(new ArrayList<String>(t50));
	}


	@Test
	public void test() throws Exception {
		teAdd();
		String output = Organize.topFifty(te);
		assertEquals(re, output);
	}

}
