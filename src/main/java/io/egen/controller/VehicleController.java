package io.egen.controller;

import io.egen.Entity.Vehicle;

import io.egen.Service.VehicleService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.web.bind.annotation.*;


import java.util.List;


@RestController
@RequestMapping(value = "/vehicles")
public class VehicleController {

    @Autowired
    VehicleService service;

    //FindAll
    @RequestMapping(method = RequestMethod.GET, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public List<Vehicle> findAll(){
        return service.findAll();
    }

    //FindById
    @RequestMapping(method = RequestMethod.GET, value= "/{vin}",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public  Vehicle  findOne(@PathVariable("vin") String vid) {
        return service.findOne(vid);

    }

    //Create
    @RequestMapping(method = RequestMethod.PUT, produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public  Vehicle  create(@RequestBody Vehicle veh){
        return service.create(veh);
    }

    //Update
    @RequestMapping(method = RequestMethod.PUT, value= "/{vin}",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public  Vehicle  update(@PathVariable("vin")String vid , @RequestBody Vehicle veh){
        return service.update(vid,veh);
    }

    //Delete
    @RequestMapping(method = RequestMethod.DELETE, value= "/{vin}",produces = MediaType.APPLICATION_JSON_UTF8_VALUE)
    public void delete(@PathVariable("vin") String vid){
        service.delete(vid);

    }

}
