import java.util.*;

class Question1 {

    public static void main(String[] args) {
        
        // storing the aruguments in a array list
        ArrayList<String> argumentList=new ArrayList<String>(Arrays.asList(args));


        // shuffeling the arraylist with randomness
        Collections.shuffle(argumentList,new Random(3));


        // Print out the elements using JDK 8 Streams
        System.out.print("Using new java 8 streams approach list is-> ");
        argumentList.stream()
        .forEach(listItem->System.out.format("%s ",listItem));


        // Print out the elements using for-each
        System.out.print("\nUsing traditional enhanced approach-> ");
        for (String listItem: argumentList) {
            System.out.format("%s ", listItem);
        }

        
    }
}
