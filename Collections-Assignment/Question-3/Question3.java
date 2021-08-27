import java.util.*;

public class Question3 {

    static void trimItems(List<String> stringsList) {
        //using iterator to traverse over the list 
        for (ListIterator<String> list = stringsList.listIterator(); list.hasNext(); ) {
            list.set(list.next().trim());
        }
    }

    public static void main(String[] args) {
        //list of items
        List<String> listOfStrings = Arrays.asList(" Hii", " hello ", "where","why ");
        
        //calling fucntion to apply trim
        trimItems(listOfStrings);

        //printing the trimmed list items
        for (String item : listOfStrings) {
            System.out.format("\"%s\"%n", item);
        }
    }
}