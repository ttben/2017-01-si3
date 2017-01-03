# Boilerplate: an example of _mvn exec:java_

Your project has to build using the `mvn clean install` command. Your project also has to run using the `mvn exec:java` commands.
The `exec` plugin is used to *start a Java program using maven*. Your project also has to accept arguments as described in the subject.
This folder gives you an example of usage of the `mvn exec:java` and how to pass and handle command-line parameters.
To try this example, clone this repository, and run the following command : `mvn clean install && mvn exec:java -Dexec.args="arg1 arg2 arg3"`. (The `mvn clean install` part is here to update your local maven repository).

You should see "arg1 arg2 arg3 " on the terminal. Yeah, I know, this is kind of impressive.