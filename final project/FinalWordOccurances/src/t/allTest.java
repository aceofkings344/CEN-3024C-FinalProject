package t;

import static org.junit.jupiter.api.Assertions.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

import org.junit.jupiter.api.Test;

class allTest {
	
	private List<List<String>> te = new ArrayList<List<String>>();
	
	private String re = "one hundred\t\t\t100\n" + "ninety-nine\t\t\t99\n" + "ninety-eight\t\t\t98\n" + "ninety-seven\t\t\t97\n" + "ninety-six\t\t\t96\n" +
	"ninety-five\t\t\t95\n" + "ninety-four\t\t\t94\n" + "ninety-three\t\t\t93\n" + "ninety-two\t\t\t92\n" + "ninety-one\t\t\t91\n" + "ninety\t\t\t90\n" +
	"eighty-nine\t\t\t89\n" + "eighty-eight\t\t\t88\n" + "eighty-seven\t\t\t87\n" + "eighty-six\t\t\t86\n" + "eighty-five\t\t\t85\n" + "eighty-four\t\t\t84\n" +
	"eighty-three\t\t\t83\n" + "eighty-two\t\t\t82\n" + "eighty-one\t\t\t81\n" + "eighty\t\t\t80\n" + "seventy-nine\t\t\t79\n" + "seventy-eight\t\t\t78\n" +
	"seventy-seven\t\t\t77\n" + "seventy-six\t\t\t76\n" + "seventy-five\t\t\t75\n" + "seventy-four\t\t\t74\n" + "seventy-three\t\t\t73\n" + "seventy-two\t\t\t72\n" +
	"seventy-one\t\t\t71\n" + "seventy\t\t\t70\n" + "sixty-nine\t\t\t69\n" + "sixty-eight\t\t\t68\n" + "sixty-seven\t\t\t67\n" + "sixty-six\t\t\t66\n" +
	"sixty-five\t\t\t65\n" + "sixty-four\t\t\t64\n" + "sixty-three\t\t\t63\n" + "sixty-two\t\t\t62\n" + "sixty-one\t\t\t61\n" + "sixty\t\t\t60\n" +
	"fifty-nine\t\t\t59\n" + "fifty-eight\t\t\t58\n" + "fifty-seven\t\t\t57\n" + "fifty-six\t\t\t56\n" + "fifty-five\t\t\t55\n" + "fifty-four\t\t\t54\n" +
	"fifty-three\t\t\t53\n" + "fifty-two\t\t\t52\n" + "fifty-one\t\t\t51\n" + "fifty\t\t\t50\n" + "forty-nine\t\t\t49\n" +"forty-eight\t\t\t48\n" + "forty-seven\t\t\t47\n" +	
	"forty-six\t\t\t46\n" + "forty-five\t\t\t45\n" + "forty-four\t\t\t44\n" + "forty-three\t\t\t43\n" +	"forty-two\t\t\t42\n" +	"forty-one\t\t\t41\n" +
	"forty\t\t\t40\n" +	"thirty-nine\t\t\t39\n" + "thirty-eight\t\t\t38\n" + "thirty-seven\t\t\t37\n" + "thirty-six\t\t\t36\n" +
	"thirty-five\t\t\t35\n" + "thirty-four\t\t\t34\n" + "thirty-three\t\t\t33\n" + "thirty-two\t\t\t32\n" + "thirty-one\t\t\t31\n" +
	"thirty\t\t\t30\n" + "twenty-nine\t\t\t29\n" + "twenty-eight\t\t\t28\n" + "twenty-seven\t\t\t27\n" + "twenty-six\t\t\t26\n" +
	"twenty-five\t\t\t25\n" + "twenty-four\t\t\t24\n" + "twenty-three\t\t\t23\n" + "twenty-two\t\t\t22\n" + "twenty-one\t\t\t21\n" +
	"twenty\t\t\t20\n" + "nineteen\t\t\t19\n" + "eighteen\t\t\t18\n" + "seventeen\t\t\t17\n" + "sixteen\t\t\t16\n" + "fifteen\t\t\t15\n" +
	"fourteen\t\t\t14\n" + "thirteen\t\t\t13\n" + "twelve\t\t\t12\n" + "eleven\t\t\t11\n" + "ten\t\t\t10\n" + "nine\t\t\t9\n" +
	"eight\t\t\t8\n" + "seven\t\t\t7\n" + "six\t\t\t6\n" + "five\t\t\t5\n" + "four\t\t\t4\n" + "three\t\t\t3\n" + "two\t\t\t2\n" + "one\t\t\t1\n";
	
	public void teAdd() {
		ArrayList<String> t1 = new ArrayList<>(Arrays.asList("one hundred", "100"));
		ArrayList<String> t2 = new ArrayList<>(Arrays.asList("ninety-nine", "99"));
		ArrayList<String> t3 = new ArrayList<>(Arrays.asList("ninety-eight", "98"));
		ArrayList<String> t4 = new ArrayList<>(Arrays.asList("ninety-seven", "97"));
		ArrayList<String> t5 = new ArrayList<>(Arrays.asList("ninety-six", "96"));
		ArrayList<String> t6 = new ArrayList<>(Arrays.asList("ninety-five", "95"));
		ArrayList<String> t7 = new ArrayList<>(Arrays.asList("ninety-four", "94"));
		ArrayList<String> t8 = new ArrayList<>(Arrays.asList("ninety-three", "93"));
		ArrayList<String> t9 = new ArrayList<>(Arrays.asList("ninety-two", "92"));
		ArrayList<String> t10 = new ArrayList<>(Arrays.asList("ninety-one", "91"));
		ArrayList<String> t11 = new ArrayList<>(Arrays.asList("ninety", "90"));
		ArrayList<String> t12 = new ArrayList<>(Arrays.asList("eighty-nine", "89"));
		ArrayList<String> t13 = new ArrayList<>(Arrays.asList("eighty-eight", "88"));
		ArrayList<String> t14 = new ArrayList<>(Arrays.asList("eighty-seven", "87"));
		ArrayList<String> t15 = new ArrayList<>(Arrays.asList("eighty-six", "86"));
		ArrayList<String> t16 = new ArrayList<>(Arrays.asList("eighty-five", "85"));
		ArrayList<String> t17 = new ArrayList<>(Arrays.asList("eighty-four", "84"));
		ArrayList<String> t18 = new ArrayList<>(Arrays.asList("eighty-three", "83"));
		ArrayList<String> t19 = new ArrayList<>(Arrays.asList("eighty-two", "82"));
		ArrayList<String> t20 = new ArrayList<>(Arrays.asList("eighty-one", "81"));
		ArrayList<String> t21 = new ArrayList<>(Arrays.asList("eighty", "80"));
		ArrayList<String> t22 = new ArrayList<>(Arrays.asList("seventy-nine", "79"));
		ArrayList<String> t23 = new ArrayList<>(Arrays.asList("seventy-eight", "78"));
		ArrayList<String> t24 = new ArrayList<>(Arrays.asList("seventy-seven", "77"));
		ArrayList<String> t25 = new ArrayList<>(Arrays.asList("seventy-six", "76"));
		ArrayList<String> t26 = new ArrayList<>(Arrays.asList("seventy-five", "75"));
		ArrayList<String> t27 = new ArrayList<>(Arrays.asList("seventy-four", "74"));
		ArrayList<String> t28 = new ArrayList<>(Arrays.asList("seventy-three", "73"));
		ArrayList<String> t29 = new ArrayList<>(Arrays.asList("seventy-two", "72"));
		ArrayList<String> t30 = new ArrayList<>(Arrays.asList("seventy-one", "71"));
		ArrayList<String> t31 = new ArrayList<>(Arrays.asList("seventy", "70"));
		ArrayList<String> t32 = new ArrayList<>(Arrays.asList("sixty-nine", "69"));
		ArrayList<String> t33 = new ArrayList<>(Arrays.asList("sixty-eight", "68"));
		ArrayList<String> t34 = new ArrayList<>(Arrays.asList("sixty-seven", "67"));
		ArrayList<String> t35 = new ArrayList<>(Arrays.asList("sixty-six", "66"));
		ArrayList<String> t36 = new ArrayList<>(Arrays.asList("sixty-five", "65"));
		ArrayList<String> t37 = new ArrayList<>(Arrays.asList("sixty-four", "64"));
		ArrayList<String> t38 = new ArrayList<>(Arrays.asList("sixty-three", "63"));
		ArrayList<String> t39 = new ArrayList<>(Arrays.asList("sixty-two", "62"));
		ArrayList<String> t40 = new ArrayList<>(Arrays.asList("sixty-one", "61"));
		ArrayList<String> t41 = new ArrayList<>(Arrays.asList("sixty", "60"));
		ArrayList<String> t42 = new ArrayList<>(Arrays.asList("fifty-nine", "59"));
		ArrayList<String> t43 = new ArrayList<>(Arrays.asList("fifty-eight", "58"));
		ArrayList<String> t44 = new ArrayList<>(Arrays.asList("fifty-seven", "57"));
		ArrayList<String> t45 = new ArrayList<>(Arrays.asList("fifty-six", "56"));
		ArrayList<String> t46 = new ArrayList<>(Arrays.asList("fifty-five", "55"));
		ArrayList<String> t47 = new ArrayList<>(Arrays.asList("fifty-four", "54"));
		ArrayList<String> t48 = new ArrayList<>(Arrays.asList("fifty-three", "53"));
		ArrayList<String> t49 = new ArrayList<>(Arrays.asList("fifty-two", "52"));
		ArrayList<String> t50 = new ArrayList<>(Arrays.asList("fifty-one", "51"));
		ArrayList<String> t51 = new ArrayList<>(Arrays.asList("fifty", "50"));
		ArrayList<String> t52 = new ArrayList<>(Arrays.asList("forty-nine", "49"));
		ArrayList<String> t53 = new ArrayList<>(Arrays.asList("forty-eight", "48"));
		ArrayList<String> t54 = new ArrayList<>(Arrays.asList("forty-seven", "47"));
		ArrayList<String> t55 = new ArrayList<>(Arrays.asList("forty-six", "46"));
		ArrayList<String> t56 = new ArrayList<>(Arrays.asList("forty-five", "45"));
		ArrayList<String> t57 = new ArrayList<>(Arrays.asList("forty-four", "44"));
		ArrayList<String> t58 = new ArrayList<>(Arrays.asList("forty-three", "43"));
		ArrayList<String> t59 = new ArrayList<>(Arrays.asList("forty-two", "42"));
		ArrayList<String> t60 = new ArrayList<>(Arrays.asList("forty-one", "41"));
		ArrayList<String> t61 = new ArrayList<>(Arrays.asList("forty", "40"));
		ArrayList<String> t62 = new ArrayList<>(Arrays.asList("thirty-nine", "39"));
		ArrayList<String> t63 = new ArrayList<>(Arrays.asList("thirty-eight", "38"));
		ArrayList<String> t64 = new ArrayList<>(Arrays.asList("thirty-seven", "37"));
		ArrayList<String> t65 = new ArrayList<>(Arrays.asList("thirty-six", "36"));
		ArrayList<String> t66 = new ArrayList<>(Arrays.asList("thirty-five", "35"));
		ArrayList<String> t67 = new ArrayList<>(Arrays.asList("thirty-four", "34"));
		ArrayList<String> t68 = new ArrayList<>(Arrays.asList("thirty-three", "33"));
		ArrayList<String> t69 = new ArrayList<>(Arrays.asList("thirty-two", "32"));
		ArrayList<String> t70 = new ArrayList<>(Arrays.asList("thirty-one", "31"));
		ArrayList<String> t71 = new ArrayList<>(Arrays.asList("thirty", "30"));
		ArrayList<String> t72 = new ArrayList<>(Arrays.asList("twenty-nine", "29"));
		ArrayList<String> t73 = new ArrayList<>(Arrays.asList("twenty-eight", "28"));
		ArrayList<String> t74 = new ArrayList<>(Arrays.asList("twenty-seven", "27"));
		ArrayList<String> t75 = new ArrayList<>(Arrays.asList("twenty-six", "26"));
		ArrayList<String> t76 = new ArrayList<>(Arrays.asList("twenty-five", "25"));
		ArrayList<String> t77 = new ArrayList<>(Arrays.asList("twenty-four", "24"));
		ArrayList<String> t78 = new ArrayList<>(Arrays.asList("twenty-three", "23"));
		ArrayList<String> t79 = new ArrayList<>(Arrays.asList("twenty-two", "22"));
		ArrayList<String> t80 = new ArrayList<>(Arrays.asList("twenty-one", "21"));
		ArrayList<String> t81 = new ArrayList<>(Arrays.asList("twenty", "20"));
		ArrayList<String> t82 = new ArrayList<>(Arrays.asList("nineteen", "19"));
		ArrayList<String> t83 = new ArrayList<>(Arrays.asList("eighteen", "18"));
		ArrayList<String> t84 = new ArrayList<>(Arrays.asList("seventeen", "17"));
		ArrayList<String> t85 = new ArrayList<>(Arrays.asList("sixteen", "16"));
		ArrayList<String> t86 = new ArrayList<>(Arrays.asList("fifteen", "15"));
		ArrayList<String> t87 = new ArrayList<>(Arrays.asList("fourteen", "14"));
		ArrayList<String> t88 = new ArrayList<>(Arrays.asList("thirteen", "13"));
		ArrayList<String> t89 = new ArrayList<>(Arrays.asList("twelve", "12"));
		ArrayList<String> t90 = new ArrayList<>(Arrays.asList("eleven", "11"));
		ArrayList<String> t91 = new ArrayList<>(Arrays.asList("ten", "10"));
		ArrayList<String> t92 = new ArrayList<>(Arrays.asList("nine", "9"));
		ArrayList<String> t93 = new ArrayList<>(Arrays.asList("eight", "8"));
		ArrayList<String> t94 = new ArrayList<>(Arrays.asList("seven", "7"));
		ArrayList<String> t95 = new ArrayList<>(Arrays.asList("six", "6"));
		ArrayList<String> t96 = new ArrayList<>(Arrays.asList("five", "5"));
		ArrayList<String> t97 = new ArrayList<>(Arrays.asList("four", "4"));
		ArrayList<String> t98 = new ArrayList<>(Arrays.asList("three", "3"));
		ArrayList<String> t99 = new ArrayList<>(Arrays.asList("two", "2"));
		ArrayList<String> t100 = new ArrayList<>(Arrays.asList("one", "1"));
		
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
		te.add(new ArrayList<String>(t51));
		te.add(new ArrayList<String>(t52));
		te.add(new ArrayList<String>(t53));
		te.add(new ArrayList<String>(t54));
		te.add(new ArrayList<String>(t55));
		te.add(new ArrayList<String>(t56));
		te.add(new ArrayList<String>(t57));
		te.add(new ArrayList<String>(t58));
		te.add(new ArrayList<String>(t59));
		te.add(new ArrayList<String>(t60));
		te.add(new ArrayList<String>(t61));
		te.add(new ArrayList<String>(t62));
		te.add(new ArrayList<String>(t63));
		te.add(new ArrayList<String>(t64));
		te.add(new ArrayList<String>(t65));
		te.add(new ArrayList<String>(t66));
		te.add(new ArrayList<String>(t67));
		te.add(new ArrayList<String>(t68));
		te.add(new ArrayList<String>(t69));
		te.add(new ArrayList<String>(t70));
		te.add(new ArrayList<String>(t71));
		te.add(new ArrayList<String>(t72));
		te.add(new ArrayList<String>(t73));
		te.add(new ArrayList<String>(t74));
		te.add(new ArrayList<String>(t75));
		te.add(new ArrayList<String>(t76));
		te.add(new ArrayList<String>(t77));
		te.add(new ArrayList<String>(t78));
		te.add(new ArrayList<String>(t79));
		te.add(new ArrayList<String>(t80));
		te.add(new ArrayList<String>(t81));
		te.add(new ArrayList<String>(t82));
		te.add(new ArrayList<String>(t83));
		te.add(new ArrayList<String>(t84));
		te.add(new ArrayList<String>(t85));
		te.add(new ArrayList<String>(t86));
		te.add(new ArrayList<String>(t87));
		te.add(new ArrayList<String>(t88));
		te.add(new ArrayList<String>(t89));
		te.add(new ArrayList<String>(t90));
		te.add(new ArrayList<String>(t91));
		te.add(new ArrayList<String>(t92));
		te.add(new ArrayList<String>(t93));
		te.add(new ArrayList<String>(t94));
		te.add(new ArrayList<String>(t95));
		te.add(new ArrayList<String>(t96));
		te.add(new ArrayList<String>(t97));
		te.add(new ArrayList<String>(t98));
		te.add(new ArrayList<String>(t99));
		te.add(new ArrayList<String>(t100));
	}


	@Test
	public void test() throws Exception{
		teAdd();
		String output = Organize.all(te);
		assertEquals(re, output);
	}

}
