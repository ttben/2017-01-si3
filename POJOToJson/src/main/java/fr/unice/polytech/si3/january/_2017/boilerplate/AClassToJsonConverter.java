package fr.unice.polytech.si3.january._2017.boilerplate;


import org.json.JSONArray;
import org.json.JSONObject;

import java.util.List;

public class AClassToJsonConverter {
    public static JSONObject convert(AClass AClass) {
        JSONObject jsonObject = new JSONObject();
        jsonObject.put("anAttribute", AClass.getAnAttribute());
        jsonObject.put("anotherAttribute", AClass.getAnotherAttribute());
        jsonObject.put("anotherOneAttribute", AClass.getAnotherOneAttribute());
        return jsonObject;
    }

    public static JSONArray convert(List<AClass> AClassList) {
        JSONArray jsonArray = new JSONArray();

        for (AClass currentAClass : AClassList) {
            JSONObject currentCommandConverted = convert(currentAClass);
            jsonArray.put(currentCommandConverted);
        }

        return jsonArray;
    }
}
