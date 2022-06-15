import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String message = "Welcome to Java!" ;

        System.out.println(" The length of the message is " + message.length());

        System.out.println( "The First character in the message is"
                + message.charAt(0));
        System.out.println(" The last character in message is " + message.charAt(message.length() -1) );


        String phrase = "The chosen number is " + 15 ;
        phrase +="."; // phrase = phrase + ".";
        System.out.println(phrase);


        // did no use variables
        System.out.println("Welcome" .toUpperCase());
        System.out.println("Welcome" .toLowerCase());
        System.out.println("\t Welcome \n." .trim());

        // read character fom the console

        Scanner input = new Scanner(System.in);
        System.out.println(" Please enter a word:" );
        System.out.println( input.next());

        input.nextLine();
        // print next line method
        System.out.println(" Please enter a statement :" );
        System.out.println(input.nextLine());

        // request a yes or no selection , we only care for Y OR N

        System.out.println(" Please enter a Yes or No :" );
        System.out.println(input.nextLine().charAt(0));
        // user inputs “Welcome to Java”
        //String word = input.next(); // “Welcome”
       // String phrase = input.nextLine(); // “Welcome to Java” print on the next line


        //String message = “Welcome to Java”;
        //message = message.substring(0, 11) + “HTML”; “Welcome to ” + “HTML”
        System.out.println(" Please enter a Yes or No :" );


        System.out.println(message.substring(0 ,11) + "HTML");

        String name = "Jone Doe";
        int index = name.indexOf( ' ' );
        String firstName = name.substring(0,index );
        String lastName = name.substring() index +1 ;
        System.out.println(firstName );
        System.out.println(lastName );

        /// 2/16


        System.out.println(lastName);
        String intString = "25" ;
        System.out.println("The sum is "+ (intString +5 ));
        int intValue = Integer.parseInt(intString);
        System.out.println("The sume is " + (intVlaue + 5));

        String fullName = " JOHN DOE";
        String person = " John Doe";

        // Error this obejects are different
        if ( fullName == person.toUpperCase())

            /// case disitinto  ignore the cases of the letters if ( fullName.equealsIgnoreCase())
            System.out.println(" These referances  are the same") ;
        else
            System.out.println(" These referances are different") ;

            System.out.println(person.compareTo(fullName)) ;
            /// what prints is value of each charater substracted '0' - '0' => 32

            if System.out.println(person.compareTo(person)<0 );
            // comapre this with zero if we comare it with Jane Smith


            System.out.println(fullName + " comes before "+  person) ;
            System.out.println(person + " comes before "+  fullName) ;

    }

}
