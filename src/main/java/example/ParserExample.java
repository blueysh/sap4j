package example;

import sap4j.Argument;
import sap4j.ArgumentList;
import sap4j.Parser;

public class ParserExample {
    // first, we create the Parser instance. our pattern here will be --.
    private static final Parser parser = new Parser("--");

    public static void main(String[] args) {
        // get a list of the parsed arguments
        ArgumentList al = parser.parseArguments(args);

        // prints if the argument "hello-world" is present
        System.out.println(al.argumentIsPresent("hello-world"));

        // if the argument "hello-world" is present and has a value, print its value.
        // if it doesn't have a value, say it doesn't.
        if (al.argumentIsPresent("hello-world")) {

            Argument helloWorldArgument = al.getArgument("hello-world");
            assert helloWorldArgument != null;

            if (helloWorldArgument.hasValue()) System.out.println(helloWorldArgument.getValue());
            else System.out.println("\"hello-world\" argument did not have a value.");
        }
    }
}
