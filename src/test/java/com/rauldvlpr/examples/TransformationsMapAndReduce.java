package com.rauldvlpr.examples;

import com.rauldvlpr.beans.Car;
import com.rauldvlpr.beans.Person;
import com.rauldvlpr.beans.PersonDTO;
import com.rauldvlpr.mockdata.MockData;
import org.junit.jupiter.api.Test;

import java.io.IOException;
import java.util.List;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.stream.Collectors;

public class TransformationsMapAndReduce {

    @Test
    void yourFirstTransformationWithMap() throws IOException {
        List<Person> people = MockData.getPeople();

        Function<Person, PersonDTO> personPersonDTOFunction = person ->
                new PersonDTO(person.getId(),
                        person.getFirstName(),
                        person.getAge());
        Predicate<Person> personPredicate = person -> person.getAge() > 20;

        List<PersonDTO> dtos = people.stream()
                .filter(personPredicate)
                //.map(personPersonDTOFunction)
                .map(PersonDTO::map)
                .collect(Collectors.toList());

        //assertThat(people.size()).isEqualTo(dtos.size());

        dtos.forEach(System.out::println);
    }

    @Test
    void mapToDoubleAndFindAverageCarPrice() throws IOException {
        List<Car> cars = MockData.getCars();
    }

    @Test
    public void reduce() {
        int[] integers = {1, 2, 3, 4, 99, 100, 121, 1302, 199};
    }
}

