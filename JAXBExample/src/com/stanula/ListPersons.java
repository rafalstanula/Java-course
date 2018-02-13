package com.stanula;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "persons")
public class ListPersons {

    private List<Person> list = new ArrayList<Person>();

    public List<Person> getList() {
        return list;
    }

    @XmlElement(name = "person")
    public void setList(List<Person> list) {
        this.list = list;
    }
}
