package fr.unice.polytech.si3.january._2017.boilerplate;

import org.json.simple.JSONObject;

import java.util.ArrayList;
import java.util.List;

public class App {
    public static void main(String[] args) {
        System.out.println("I am converting objects to JSON, to pass them to a JS code. Maybe this JS code convert json code into chart, or maybe not. Who knows?");
        AClass aClass = new AClass("a string to describe a thing", 1, 0);
        AClass anotherClass = new AClass("a string to describe another thing", 51, 51);

        List<AClass> aClassList = new ArrayList<>();
        aClassList.add(aClass);
        aClassList.add(anotherClass);

        JSONObject result = new JSONObject();
        result.put("a-thing", AClassToJsonConverter.convert(aClass));
        result.put("another-thing", AClassToJsonConverter.convert(anotherClass));
        String jsonStrDescription = result.toJSONString();
        System.out.printf("Here are the corresponding JSON object:\n%s\n", jsonStrDescription);
    }
}
