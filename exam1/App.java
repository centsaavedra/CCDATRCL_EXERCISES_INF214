import java.util.Stack;
import java.util.LinkedList;
public class App {
    /**
     * @param args
     * @throws Exception
     */
    public static void main(String[] args) throws Exception {
        
        System.out.println("======================================================");
        System.out.println("ARRAY");
    //Create an array of characters of your SURNAME.
           char[] SurName = { 'S', 'A', 'A', 'V', 'E', 'D', 'R', 'A' };

    //Print each character of your SURNAME on each line.
            System.out.println("My Surname.");
        for (int i = 0; i < SurName.length; i++) {
            System.out.println(SurName[i]);
        }

    //Print the first character of your SURNAME.
        System.out.println("The First Character of my Surname.");
        System.out.println(SurName[0]);

    //Print the last character of your SURNAME.
        System.out.println("The Last Character of my Surname.");
        System.out.println(SurName[7]);

    //Print the character of your SURNAME in reverse order.
        System.out.println("My Surname in reverse order." );
        for (int i = SurName.length - 1; i >= 0; i--) {
        System.out.println(SurName[i]);
        }
        
        System.out.println("======================================================");
        System.out.println("LINKED LIST");
    //Create a Linked list of the last six numbers of your STUDENT NUMBER.
    LinkedList<String> StudentNumber = new LinkedList<>();

        StudentNumber.add("1");
        StudentNumber.add("0");
        StudentNumber.add("9");
        StudentNumber.add("6");
        StudentNumber.add("3");
        StudentNumber.add("4");

        System.out.println("My Student Number.");
        System.out.println(StudentNumber);

    //Add an asterisk (*) to the head/front of the Linked list.
        StudentNumber.addFirst("*");

    //Add an asterisk (*) to the tail/end of the Linked list.
        StudentNumber.addLast("*");
        
    //Print the last character of the Linked list.
        System.out.println("My StudentNumber Add (*) to head/front and tail/end.");
        System.out.println(StudentNumber);

    //Print the last character of the Linked list.
        System.out.println("My Last Charcter");
        System.out.println(StudentNumber.get(7));

    //Replace the last character of the Linked list with the exclamation symbol (!).
        StudentNumber.set(7, "!");   
        StudentNumber.remove(0);
    
    //Print The LinkedList.
        System.out.println("Removed First Charcter and Replace the Last character of My StudentNumber.");
        System.out.println(StudentNumber);
    

        System.out.println("======================================================");   
        System.out.println("STACK");
    //Create a Stack of characters of your SURNAME.
        Stack<String> SURNAME = new Stack<>();

        SURNAME.push("S");
        SURNAME.push("A");
        SURNAME.push("A");
        SURNAME.push("V");
        SURNAME.push("E");
        SURNAME.push("D");
        SURNAME.push("R");
        SURNAME.push("A");

    //Print the Stack
        System.out.println("My SURNAME.");
        System.out.println(SURNAME);

    //Add a "INF214" to the stack
    System.out.println("My SURNAME Add INF214.");
        SURNAME.push(" ");
        SURNAME.push("I");
        SURNAME.push("N");
        SURNAME.push("F");
        SURNAME.push("2");
        SURNAME.push("1");
        SURNAME.push("4");

    //Print the Stack
        System.out.println(SURNAME);

    //Remove "INF214". and add "CCDATRCL-INF214"
        SURNAME.pop();
        SURNAME.pop();
        SURNAME.pop();
        SURNAME.pop();
        SURNAME.pop();
        SURNAME.pop();

        SURNAME.push("C");
        SURNAME.push("C");
        SURNAME.push("D");
        SURNAME.push("A");
        SURNAME.push("T");
        SURNAME.push("R");
        SURNAME.push("C");
        SURNAME.push("L");
        SURNAME.push("-");
        SURNAME.push("I");
        SURNAME.push("N");
        SURNAME.push("F");
        SURNAME.push("2");
        SURNAME.push("1");
        SURNAME.push("4");

    //Print the Stack
    System.out.println("My SURNAME Removed INF214 and Add CCDATRCL-INF214.");
        System.out.println(SURNAME);

    }
}
