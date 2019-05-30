package mycat;

import io.mycat.route.function.PartitionByString;

public class SplitStringHash {

	public static void main(String[] args) {
	      PartitionByString rule = new PartitionByString();
	      String idVal=null;
	      rule.setPartitionLength("512");
	      rule.setPartitionCount("2");
	      rule.init();
	      rule.setHashSlice("0:2");
	    idVal = "0";
	    System.out.println(0 == rule.calculate(idVal));
	    idVal = "45a";
//	    Assert.assertEquals(true, 1 == rule.calculate(idVal));

	}
}
