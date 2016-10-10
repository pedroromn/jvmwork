import java.util.ArrayList;

public class ArrayListCollection{

    public static void main(String[] args) {

        // create a new ArrayList of Strings with an initial capacity of 10
        ArrayList<String> items = new ArrayList<String>();

        items.add("red");
        items.add(0, "yellow");

        // header
        System.out.printf(
          "%nDisplay list contents with counter-controlled loop: ");

        // display the color in the list
        for(int i = 0 ; i < items.size() ; i++){
            System.out.printf(" %s", items.get(i));
        }

        // display colors using enhanced for in the display method
        display(items,
                "%nDisplay list contents with enhanced for statment: ");
        items.add("green");
        items.add("yellow");
        display(items, "List with two new elements");

        
    }
}
