# `sap4j`
A simple Java library for parsing command-line arguments.

![build](https://img.shields.io/github/workflow/status/itstotallyjan/sap4j/Tests) ![last commit](https://img.shields.io/github/last-commit/itstotallyjan/sap4j)

### [`how to use`](#how-to-use-it) **|** [`adding to your project`](#adding-sap4j-to-your-project) **|** [`contributing`](#contributing)

### `how to use it`
sap4j is very simple to use. to start, make a `Parser` instance, passing the pattern you want to look for in arguments.
```java
// this parser will use the pattern '--', so it will find arguments starting with '--'.
private static final Parser parser = new Parser("--");
```
next, parse arguments from a String array.
```java
// you can use the 'args' from a 'main' method, for example.
ArgumentList aList = parser.parseArguments(args);
```
now, you can check if an argument is present:
```java
// don't include the pattern your parser uses! just include the name of the argument you're looking for.
boolean hasUsername = aList.argumentIsPresent("username");
```
if it's present, you can get it's value:
```java
// use 'getArgument()' to get an Argument
Argument usernameArg = aList.getArgument("username");
// use this assertion if you've already checked that the argument is present.
assert usernameArg != null;

String username;
// you can use 'hasValue()' to check if an argument has a value. use 'getValue()' to get the String value of an Argument.
if (usernameArg.hasValue()) username = usernameArg.getValue();
else // ... do something else if there's no value
```

### `adding sap4j to your project`
Add the appropriate dependency info to your project:
#### `maven`
Jitpack repository
```xml
<repository>
  <id>jitpack.io</id>
  <url>https://jitpack.io</url>
</repository>
```
sap4j Dependency
```xml
  <dependency>
    <groupId>com.github.itstotallyjan</groupId>
    <artifactId>sap4j</artifactId>
    <version>{VERSION}</version>
  </dependency>
```
#### `gradle`
Jitpack Repository
```gradle
repositories {
  maven { url 'https://jitpack.io' }
}
```
sap4j Dependency
```gradle
dependencies {
  implementation 'com.github.itstotallyjan:sap4j:-SNAPSHOT'
}
```

### `contributing`
Pull requests are accepted! As long as your contribution does not largely change the functionality of the library, I'll probably accept it.
