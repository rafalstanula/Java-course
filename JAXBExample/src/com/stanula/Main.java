package com.stanula;

import javax.xml.bind.*;
import java.io.File;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class Main {

    public static void main(String[] args) throws IOException {

        try {
            List<Person> list1 = new ArrayList<Person>();

            list1.add(new Person("John", 77));
            list1.add(new Person("Mike", 33));
            list1.add(new Person("Dex", 53));

            ListPersons lp = new ListPersons();
            lp.setList(list1);

            File file = new File("C:\\Users\\Caldoris\\IdeaProjects\\JAXBExample\\file.xml");
            JAXBContext context = JAXBContext.newInstance(ListPersons.class);

//            read from file:
            Unmarshaller unmarshaller = context.createUnmarshaller();
            ListPersons listpersons = (ListPersons)unmarshaller.unmarshal(file);

            for(Person p : listpersons.getList())
            {
                System.out.println("Person name-->"+ p.getName());
                System.out.println("Person age-->"+ p.getAge());
            }

//            saving to file:
//            Marshaller marshaller = context.createMarshaller();
//            marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);
//            marshaller.marshal(lp, System.out);
//            marshaller.marshal(lp, file);
        } catch (JAXBException exception) {
            System.out.println("It doesn't work");
            exception.printStackTrace();
        }
    }
}
