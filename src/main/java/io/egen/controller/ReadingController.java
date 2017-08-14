package io.egen.controller;

import io.egen.Entity.Reading;
import io.egen.Entity.Vehicle;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class ReadingController {


    //FindAll
    @RequestMapping(method = RequestMethod.GET, value= "/readings")
    public List<Reading> findAll(){
        return null;
    }

    //FindById
    @RequestMapping(method = RequestMethod.GET, value= "/readings/{vin}")
    public  Vehicle  findOne(@PathVariable("vin") String vid) {
        return null;

    }



}
