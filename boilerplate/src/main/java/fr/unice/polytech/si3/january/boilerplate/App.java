package fr.unice.polytech.si3.january.boilerplate;

import org.json.simple.JSONArray;
import org.json.simple.JSONObject;

import java.util.ArrayList;
import java.util.List;

/**
 * Hello world!
 */
public class App {
    public static void main(String[] args) {
        /*
            To get the command line arguments from the maven exec plugin,
            just run 'mvn exec:java -Dexec.args="arg1 arg2 arg3" '
         */
        System.out.println("Hello World! - You entered these arguments:");
        for (String s : args) {
            System.out.printf("%s ", s);
        }

        System.out.println("I am converting objects to JSON, to pass them to a JS code. Maybe this JS code convert json code into chart, or maybe not. Who knows?");
        AClass aClass = new AClass("a string to describe a thing", 1, 0);
        AClass anotherClass = new AClass("a string to describe another thing", 51, 51);

        List<AClass> aClassList = new ArrayList<AClass>();
        aClassList.add(aClass);
        aClassList.add(anotherClass);

        JSONObject result = new JSONObject();
        result.put("a-thing", AClassToJsonConverter.convert(aClass));
        result.put("another-thing", AClassToJsonConverter.convert(anotherClass));
        String jsonStrDescription = result.toJSONString();
        System.out.printf("Here are the corresponding JSON object:%s\n", jsonStrDescription);
    }
}
