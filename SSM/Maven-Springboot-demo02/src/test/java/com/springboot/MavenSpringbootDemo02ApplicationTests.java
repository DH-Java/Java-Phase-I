package com.springboot;

import org.junit.jupiter.api.Test;
import com.springboot.Pojo.Person;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;

@SpringBootTest
class MavenSpringbootDemo02ApplicationTests {

    @Autowired
    private Person person;

    @Test
    void contextLoads() {
        System.out.println(person);
    }
}
