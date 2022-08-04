package objToJSON;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.File;
import java.io.IOException;

public class Main {


    public static void main(String[] args) {
//        Person person=new Person("SARA","BABAEI",24);
//        List<Person>  people = new ArrayList<>();
//        people.add(person);
//        people.add(person);
        ObjectMapper objectMapper = new ObjectMapper();
//        String s = null;
//        try {
//            s = objectMapper.writeValueAsString(people);
//        } catch (JsonProcessingException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println(s);
//        Person person1;
//        try {
//             person1 = objectMapper.readValue(s, Person.class);
//        } catch (JsonProcessingException e) {
//            throw new RuntimeException(e);
//        }
//        System.out.println(person1);



        Person person2 = new Person("SARA","BABAEI",24);
        try {
            objectMapper.writeValue(new File("./person.json"), person2);
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }
}
