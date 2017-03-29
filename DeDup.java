import java.util.ArrayList;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class DeDup {

		 public int[] randomIntegers = {1,2,34,34,25,1,45,3,26,85,4,34,86,25,43,2,1,10000,11,16,19,1,18,4,9,3,
				 						20,17,8,15,6,2,5,10,14,12,13,7,8,9,1,2,15,12,18,10,14,20,17,16,3,6,19,
				 						13,5,11,4,7,19,16,5,9,12,3,20,7,15,17,10,6,1,8,18,4,14,13,2,11};

		 public static void main(String [] args) {

			 StringBuilder sb = new StringBuilder();
			 DeDup deDup = new DeDup();
			 
			 long start = System.nanoTime();
			 
			 sb.append("=>Solution 1: {");
			 int[] set1 = deDup.deDupUsingList();
			 boolean first = true;
			 for (Integer i : set1) {
				 if (!first) {
					 sb.append(",");
				 } else {
					 first = false;
				 }
				 sb.append(i.toString());
			 }
			 sb.append("} ");
			 long end = System.nanoTime();
			 long duration = end - start;
			 sb.append("Total time: ").append(duration).append("ns\n");

			 start = System.nanoTime();
			 sb.append("=>Solution 2: {");
			 int[] set3 = deDup.deDupUsingSet();
			 first = true;
			 for (Integer i : set3) {
				 if (!first) {
					 sb.append(",");
				 } else {
					 first = false;
				 }
				 sb.append(i.toString());
			 }
			 sb.append("} ");
			 end = System.nanoTime();
			 duration = end - start;
			 sb.append("Total time: ").append(duration).append("ns\n");

			 start = System.nanoTime();
			 sb.append("=>Solution 3: {");
			 int[] set2 = deDup.deDupOriginalOrder();
			 first = true;
			 for (Integer i : set2) {
				 if (!first) {
					 sb.append(",");
				 } else {
					 first = false;
				 }
				 sb.append(i.toString());
			 }
			 sb.append("} ");
			 end = System.nanoTime();
			 duration = end - start;
			 sb.append("Total time: ").append(duration).append("ns\n");

			 System.out.println(sb.toString());			 
		 }
		 
		 /**
		  * Use this solution to remove duplicates of an array of integers and retain the original order.
		  * 
		  * @return An array of distinct integer values, retaining the original order
		  */
		 private int[] deDupUsingList() {
			 
			 List<Integer> ret = new ArrayList<>();
			 
			 for (int i : randomIntegers) {
				 if (!ret.contains(i))
					 ret.add(i);
			 }
			 
			 int[] retVal = new int[ret.size()];
			 int i = 0;
			 for (int r : ret) {
				 retVal[i++] = r;
			 }
			 
			 return retVal;
		 }

		 /**
		  * Use this solution to remove duplicates of an array of integers if the order does not matter.
		  * 
		  * @return An array of distinct integer values
		  */
		 private int[] deDupUsingSet() {
			 
			 Set<Integer> ret = new HashSet<>();
			 
			 for (int i : randomIntegers) {
				 ret.add(i);
			 }
			 
			 int[] retVal = new int[ret.size()];
			 int i = 0;
			 for (int r : ret) {
				 retVal[i++] = r;
			 }
			 
			 return retVal;
		 }

		 /**
		  * Use this solution to remove duplicates of an array of integers and retain the original order.
		  * 
		  * @return An array of distinct integer values, retaining the original order
		  */
		 private int[] deDupOriginalOrder() {
			 
			 Set<Integer> ret = new LinkedHashSet<>();
			 
			 for (int i : randomIntegers) {
				 ret.add(i);
			 }
			 
			 int[] retVal = new int[ret.size()];
			 int i = 0;
			 for (int r : ret) {
				 retVal[i++] = r;
			 }
			 
			 return retVal;
		 }
		 
		 /**
		  * Use this solution to remove duplicates of an array of integers in numerical order.
		  * 
		  * @return An array of distinct integer values in numerical order
		  */
		 private int[] deDupNumericalOrder() {
			 
			 Set<Integer> ret = new TreeSet<>();
			 
			 for (int i : randomIntegers) {
				 ret.add(i);
			 }
			 
			 int[] retVal = new int[ret.size()];
			 int i = 0;
			 for (int r : ret) {
				 retVal[i++] = r;
			 }
			 
			 return retVal;
		 }

}
