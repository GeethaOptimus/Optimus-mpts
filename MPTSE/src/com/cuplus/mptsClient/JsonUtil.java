package com.cuplus.mptsClient;

import java.io.IOException;
import java.io.StringWriter;
import java.util.HashMap;
import java.util.Map;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

/**
 *
 * @author Pawel
 */
public class JsonUtil {
    
    /**
     * Converts Map object to JSON string
     * @param result
     * @return
     * @throws IOException 
     */
    public static String convertToJson(Map<String, String> result) throws IOException {
        String jsonStr;
        StringWriter writer = new StringWriter();
        (new ObjectMapper()).writeValue(writer, result);
        jsonStr = writer.toString();
        if (jsonStr == null) {
            jsonStr = "";
        }

        return jsonStr;
    }
    
   
  
        
    /**
     * Parses provided JSON into HashMap
     * @param json
     * @return
     * @throws IOException 
     */
    public static HashMap<String, Object> parseJson(String json) throws IOException {
            HashMap<String, Object> jsonMap = new ObjectMapper().readValue(json, HashMap.class);
            return jsonMap;            
    }
    
    /**
     * Bind JSON to the object of class passed as argument.
     * @param <T>
     * @param json
     * @param clazz
     * @return
     * @throws IOException 
     
    public static <T>T parseJsonToObject(String json, Class<T> clazz) throws IOException {
        JaxbAnnotationModule module = new JaxbAnnotationModule();
        ObjectMapper objectMapper = new ObjectMapper();
        objectMapper.registerModule(module);        
        T mappedObject = objectMapper.readValue(json, clazz);
        return mappedObject;
    }*/
    
    /**
     * Get JSON token value.
     * @param json
     * @param token
     * @return
     * @throws IOException 
     */
    public static String getJsonTokenValue(JsonNode jsonNode, String token) {
        String tokenValue = null;
        JsonNode tokenNode = jsonNode.get(token);
    
        if (tokenNode != null) {
        
            tokenValue = tokenNode.toString();
            tokenValue = tokenValue.replaceAll("^\"|\"$", "");
            tokenValue = tokenValue.replaceAll("\\\\\"", "\"");
        }
        return tokenValue;
        
    }
    
}
