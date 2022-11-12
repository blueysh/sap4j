package sap4j;

import java.util.List;

public final class ArgumentList {
    private final List<Argument> arguments;

    ArgumentList(List<Argument> arguments) {
        this.arguments = arguments;
    }

    /**
     * Returns whether an argument is present in a list of parsed arguments.
     * @param name The name of the argument to find
     * @return {@code true} if the argument is present, {@code false} if the argument is not present.
     */
    public boolean argumentIsPresent(String name) {
       for (Argument a:arguments) {
           if (a.getName().equals(name)) return true;
       }
       return false;
    }

    /**
     * Finds an argument and returns it.
     * @param name The name of the argument to find
     * @return The argument if present, {@code null} if not present.
     */
    public Argument getArgument(String name) {
        for (Argument a:arguments) {
            if (a.getName().equals(name)) return a;
        }
        return null;
    }
}
