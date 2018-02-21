import javax.xml.bind.Element;
import java.util.*;

public class Question2 {
    public static void main(String[] args) {

        // Test 0: answer is 4
        ArrayList<Integer> test0 = new ArrayList<Integer>();
        test0.add(3);
        test0.add(2);
        test0.add(6);
        test0.add(4);
        test0.add(5);
        test0.add(1);

        System.out.println(test0);
        int length0 = longest(test0);
        System.out.println(length0);

        // Test 1: answer is 4
        ArrayList<Integer> test = new ArrayList<Integer>();
        test.add(56);
        test.add(-12);
        test.add(4);
        test.add(34);
        test.add(-3);
        test.add(5);
        test.add(35);

        System.out.println(test);
        int length = longest(test);
        System.out.println(length);

//         Test 2: answer is 6
        ArrayList<Integer> test2 = new ArrayList<Integer>();
        test2.add(15);
        test2.add(27);
        test2.add(14);
        test2.add(38);
        test2.add(26);
        test2.add(55);
        test2.add(46);
        test2.add(65);
        test2.add(85);

        System.out.println(test2);
        int length2 = longest(test2);
        System.out.println(length2);
    }


    public static int longest(ArrayList<Integer> array) {

        // Use Dynamic Programming
        // Break down the problem into smaller sub-problems

        // If we have an empty integer array then the longest length is 0
        if(array==null || array.size()==0)
            return 0;

        // Create a new integer array which holds the length of the longest sub-sequence so far
        int[] max = new int[array.size()];
        Arrays.fill(max, 1);

        int result = 1;
        for(int i=0; i<array.size(); i++){  // N time
            for(int j=0; j<i; j++){         // N time - therefore total is N^2
                if(array.get(i)>array.get(j)){
                    max[i]= Math.max(max[i], max[j]+1);

                }
            }
            result = Math.max(max[i], result);
        }

        return result;
    }


//
//
//        Vector<Vector<Integer>> sequence = new Vector<Vector<Integer>>();
//
//        // Initialise the first element of the new array to the first element of our passed in array
//        Vector<Integer> current = new Vector<Integer>();
//        Vector<Integer> temp = new Vector<Integer>();
//        current.add(array.get(0));
//
//        sequence.add(0,current);
//
//        current.removeAllElements();
//
////        // Now find every entry of sequence
////        for (int i = 1; i<array.size(); i++) {   // N time
//// current.removeAllElements();
//// current.add(array.get(i));
////            for (int j=0; j<i; j++) {            // N time
////                if (array.get(j) < array.get(i)) {
////                    current.add(0,array.get(j));
////                }
////            }
////            System.out.println(current);
////            sequence.add(i,current);
////
////        }
////
//        for (int z=0; z<array.size(); z++) {
//            System.out.println(sequence.get(z));
//        }

//        return 2;
//
//
//    }
}
