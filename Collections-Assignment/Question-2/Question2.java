import java.util.*;

class FindDups {
    public static void main(String[] args) {
        //given solution with set
        // Set<String> s = new HashSet<String>();
        // for (String a : args)
        //        s.add(a);
        // System.out.println(s.size() + " distinct words: " + s);


        // required solution with SortedSet and comparator

        // comparator for ignoring the case
        final Comparator<String> IGNORE_CASE_ORDER= new Comparator<String>() {
                public int compare(String s1, String s2) {
                    return s1.compareToIgnoreCase(s2);
            }
        };
        
        //creating the sorted set
        SortedSet<String> sortedSetOfArguments = new TreeSet<String>(IGNORE_CASE_ORDER);

        // adding all arguments to the sorted set
        Collections.addAll(sortedSetOfArguments, args);

        System.out.println(sortedSetOfArguments.size() + " distinct words: " + sortedSetOfArguments);
        }
}