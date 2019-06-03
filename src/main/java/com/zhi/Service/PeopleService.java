package com.zhi.Service;

import com.zhi.Dao.PersonDao;
import com.zhi.Entity.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

import java.util.Collection;

@Service
public class PeopleService {

    @Autowired
    @Qualifier("fakeData")
    private PersonDao personDao;

    public Collection<Person> getEveryone() {
        return this.personDao.getEveryone();
    }

    public Person getPersonById(int id) {
        // add checks later
        return this.personDao.getPersonById(id);
    }

    public void removePersonById(int id) {
        this.personDao.removePersonById(id);
    }

    public void updatePerson(Person inputPerson) {
        this.personDao.updatePerson(inputPerson);
    }

    public void insertPerson(Person person) {
        this.personDao.insertPersonDB(person);
    }
}
