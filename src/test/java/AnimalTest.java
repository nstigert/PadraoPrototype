import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class AnimalTest {

    @Test
    void testClone() throws CloneNotSupportedException {
        Pessoa tutor = new Pessoa("Nathalia", "99999999");
        Animal animal = new Animal("Marie", "Cachorro", tutor, "poodle");

        Animal animalClone = animal.clone();
        animalClone.setNome("Nina");
        animalClone.setRaca("SRD");

        assertEquals("Marie", animal.getNome());
        assertEquals("Cachorro", animal.getTipo());
        assertEquals("Nathalia", animal.getTutor().getNome());
        assertEquals("99999999", animal.getTutor().getTelefone());
        assertEquals("poodle", animal.getRaca());

        assertEquals("Nina", animalClone.getNome());
        assertEquals("Cachorro", animalClone.getTipo());
        assertEquals("Nathalia", animalClone.getTutor().getNome());
        assertEquals("99999999", animalClone.getTutor().getTelefone());
        assertEquals("SRD", animalClone.getRaca());
    }
}