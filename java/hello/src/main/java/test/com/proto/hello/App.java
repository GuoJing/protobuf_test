package test.com.proto.hello;

import com.google.protobuf.TextFormat;
import com.googlecode.protobuf.format.JsonFormat;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
        // to string
        String str = "id: \"10\";name: \"guojing\"";
        Person.Builder builder = Person.newBuilder();
  
        // load from string
        try {
        	TextFormat.getParser().merge(str, builder);
        	System.out.println(builder.build());
        } catch (TextFormat.ParseException exc1) {
        	System.out.println("error");
        }
        
        // load from json
        Person p = Person.newBuilder().setId("123").build();
        System.out.println(JsonFormat.printToString(p));
        
        String json = "{\"id\": \"1234\"}";
        Person.Builder builder2 = Person.newBuilder();
        try {
        	JsonFormat.merge(json, builder2);
        	Person p2 = builder2.build();
        	System.out.println(p2);
        } catch (JsonFormat.ParseException exc2) {
        	System.out.println("error");
        }
    }
}
