package mypetclinic.services;

import mypetclinic.model.Pet;

import java.util.Set;

public interface Vet {

    Pet findByLastName(String lastName);

    Pet findById(Long id);

    Pet save(Pet pet);

    Set<Pet> findAll();
}
