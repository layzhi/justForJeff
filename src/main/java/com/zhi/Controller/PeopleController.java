package com.zhi.Controller;

import com.zhi.Entity.Person;
import com.zhi.Service.PeopleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;

import java.util.Collection;

@RestController
@RequestMapping("/resource")
public class PeopleController {

    @Autowired
    private PeopleService peopleService;

    @RequestMapping(method = RequestMethod.GET)
    public Collection<Person> getEveryone() {
        return peopleService.getEveryone();
    }

    @RequestMapping(value = "/data/{id}", method = RequestMethod.GET)
    public Person getPersonById(@PathVariable("id") int id) {
        return peopleService.getPersonById(id);
    }

    @RequestMapping(value = "/data/{id}", method = RequestMethod.DELETE)
    public void deletePersonById(@PathVariable("id") int id) {
        peopleService.removePersonById(id);
    }

    @RequestMapping(value = "/data", method = RequestMethod.PUT, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void updatePerson(@RequestBody Person person) {
        peopleService.updatePerson(person);
    }

    @RequestMapping(value = "/data", method = RequestMethod.POST, consumes = MediaType.APPLICATION_JSON_VALUE)
    public void insertPerson(@RequestBody Person person) {
        peopleService.insertPerson(person);
    }

}
