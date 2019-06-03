package com.zhi.Dao;

import com.zhi.Entity.Person;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

import java.util.Collection;
import java.util.HashMap;
import java.util.Map;

// Refactor into an interface when hooking up a real DB and have the new <DB>impl.java implement this interface

@Repository
@Qualifier("fakeData")
public class PersonDao {

    private static Map<Integer, Person> person;

    static {
        person = new HashMap<Integer, Person>() {

            {
                put(1, new Person(1, "Steve B", 15, "Boston"));
                put(2, new Person(2, "John D", 19, "New York"));
                put(3, new Person(3, "Alex F", 20, "Boston"));
                put(4, new Person(4, "Bob B", 30, "Connecticut"));
                put(5, new Person(5, "John F", 11, "California"));
            }
        };
    }

    public Collection<Person> getEveryone(){
        return this.person.values();
    }

    public Person getPersonById(int id) {
        return this.person.get(id);
    }

    public void removePersonById(int id) {
        this.person.remove(id);
    }

    public void updatePerson(Person inputPerson) {
        Person p = person.get(inputPerson.getId());
        p.setAge(inputPerson.getAge());
        p.setName(inputPerson.getName());
        p.setLocale(inputPerson.getLocale());
        person.put(inputPerson.getId(),inputPerson);
    }

    public void insertPersonDB(Person person) {
        this.person.put(person.getId(), person);
    }
}
