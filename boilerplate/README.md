# Boilerplate: an example of _mvn exec:java_

Your project has to build using the `mvn clean install` command. Your project also has to run using the `mvn exec:java` commands.
The `exec` plugin is used to start a Java program using maven. Your project also has to accept arguments as described in the subject.
This folder gives you an example of usage of the `mvn exec:java` and how to pass and handle command-line parameters.
To try this example, clone this repository, and run the following command : `mvn clean install && mvn exec:java -Dexec.args="arg1 arg2 arg3"`.

You should see "arg1 arg2 arg3 " on the terminal. Yeah, I know, this is kind of impressive.

# Boilerplate: an example of Plain Old Java Object (`POJO`) to `JSON` conversion

The Benchmark and Visualisation modules have to communicate. The benchmark has to give results of execution trace analysis to the Visualisation. This is done via a `JSON` object.
To convert the results of the analysis (a `POJO`) into a `JSON` object, you have to use a specific library. Differents libraries exist to handle `JSON` in the `Java` world, with [their own pros and cons](http://blog.takipi.com/the-ultimate-json-library-json-simple-vs-gson-vs-jackson-vs-json/).
In this folder, I choose to use `JSONSimple` library since it works the same way as an `HashMap` in Java (You remember `HashMap`, don't you?).
You will find an example converting `POJOs` into a `JSON` string representation, that can be given to the visualisation.
