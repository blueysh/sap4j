package sap4j;

public class Argument {
    private final String name;
    private String value;

    /**
     * An Argument is targeted by the {@link Parser}.
     * @param name The name the {@link Parser} will use to recognize this argument.
     */
    Argument(String name) {
        this.name = name;
    }

    /**
     * Sets a value for the argument.
     * @param value The new value of the argument.
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     *
     * @return The name of the argument
     */
    public String getName() {
        return this.name;
    }

    /**
     *
     * @return The value of this argument
     */
    public String getValue() {
        return this.value;
    }

    /**
     *
     * @return Whether the argument has a value
     */
    public boolean hasValue() {
        return this.value != null;
    }

    @Override
    public String toString() {
        return name;
    }
}
