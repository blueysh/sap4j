package sap4j;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Parser {
    private final String pattern;
    private final List<Argument> arguments;

    /**
     * The Parser parses expected arguments from a list of targets and their values.
     * @param pattern The pattern the parser will use to recognize arguments.
     */
    public Parser(String pattern) {
        this.pattern = pattern;
        arguments = new ArrayList<>();
    }

    /**
     * Parses arguments from a given list of strings. This can be given from a {@code main} method, for example.
     * To retrieve arguments, you can use the {@code getParsedArguments()} method after {@code parseArguments()}.
     * @param args The list of strings the parser will get arguments from.
     * @return The parser instance with newly parsed arguments.
     */
    public ArgumentList parseArguments(String[] args) {
        for (String s:args) {
            Argument argument = new Argument(s.replace(pattern, ""));
            try {
                if (args[Arrays.stream(args).toList().indexOf(s)].startsWith(pattern)) argument.setValue(args[Arrays.stream(args).toList().indexOf(s) + 1]);
                else argument.setValue(null);
            } catch (IndexOutOfBoundsException e) {
                argument.setValue(null);
            }
            arguments.add(argument);
        }
        return new ArgumentList(arguments);
    }
}