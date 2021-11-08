package com.rauldvlpr.examples;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Stream;

public class WorkingWithStreams {

    @Test
    void steams() {

        List<String> names = List.of("Amigoscode", "Raul", "Renata");
        Stream<String> stream = names.stream();

        Stream<String> namesStream = Stream.of("Amigoscode", "Raul", "Renata");

        String[] namesArray = {};
        Arrays.stream(namesArray).count();

    }
}
