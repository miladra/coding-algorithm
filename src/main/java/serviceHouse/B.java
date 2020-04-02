package serviceHouse;

/*
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import javax.persistence.*;
import javax.transaction.Transactional;
import java.util.HashSet;
import java.util.Set;

@Entity
class Person {

    @Id
    @GeneratedValue
    private Long id;

    private String firstName;

    @OneToMany(
            mappedBy = "person",
            cascade = CascadeType.ALL
    )
    private Set<Pet> pets;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public void setPets(Set<Pet> pets) {
        this.pets = pets;
    }

    public Set<Pet> getPets() {

        if(pets == null)
            return new HashSet<Pet>();
        else
            return pets;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}

@Entity
class Pet {

    @Id
    @GeneratedValue
    private Long id;

    private String name;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "owner_id")
    private Person person;

    public String getOwnerName() {
        if(person == null)
            return "";
        else
            return person.getFirstName();
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setPerson(Person person){
        this.person = person;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Person getPerson() {
        return person;
    }
}

class PersonNotFoundException extends RuntimeException {

}

@Service
@Transactional
class PersonService {

    private final EntityManager entityManager;

    @Autowired
    PersonService(EntityManager entityManager) {
        this.entityManager = entityManager;
    }

    public void addPet(Long personId, String petName){

        Person person = entityManager.find(Person.class, personId);
        if(person == null || person.getId() == 0){
            throw new PersonNotFoundException();
        }

        Person person1 = new Person();
        person1.setId(personId);
        Pet pet = new Pet();
        pet.setName(petName);
        pet.setPerson(person1);

        entityManager.persist(pet);
        entityManager.flush();


    }
}
*/
