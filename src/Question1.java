import java.util.ArrayList;
import java.util.Set;
import java.util.HashSet;

public class Question1 {
    public static void main(String[] args) {

        ArrayList<Integer> test = new ArrayList<Integer>();
        int array_size = 1000000;
        for (int i=0; i<array_size; i++) {
            test.add(i);
        }

        boolean distinct = distinctON(test);
        System.out.print(distinct);


    }

    // Question 1a
    public static boolean distinctON2(ArrayList<Integer> array){
        for (int i = 0; i < array.size()-1; i++) {  // N time
            for (int j = i+1; j < array.size(); j++) {  // N time - therefore total N^2 time
                if (array.get(i) == array.get(j)) {
                    return false;
                }
            }
        }
        return true;
    }

    public static boolean distinctON(ArrayList<Integer> array){
        Set<Integer> foundNumbers = new HashSet<Integer>();
        for (int number:array) { // N time
            if(foundNumbers.contains(number)) {
                return false;
            }
            foundNumbers.add(number);
        }
        return true;
    }

}