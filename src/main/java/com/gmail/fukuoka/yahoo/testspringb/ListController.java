package com.gmail.fukuoka.yahoo.testspringb;

import java.util.ArrayList;
import java.util.List;

import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = {"http://localhost:3000"})
public class ListController {

    @RequestMapping("/getList") 
    public List<Person> greeting() {
        List<Person> result = new ArrayList<>();
        List<Pet> pets = new ArrayList<>();
        pets.add(new Pet("犬", "ポチ"));
        pets.add(new Pet("猫", "ミケ"));
        pets.add(new Pet("魚", "無名"));
        result.add(new Person("タケシ", "キシマ", "yahoo.fukuoka@gmail.com", pets));
        result.add(new Person("だれか", "だれかさん", "xxxx@example.com", null));
        return result;
    }

}
