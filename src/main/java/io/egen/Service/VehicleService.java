package io.egen.Service;

import io.egen.Entity.Vehicle;

import java.util.List;

public interface VehicleService {

    List<Vehicle> findAll();
    Vehicle findOne(String vid);
    List<Vehicle> create(Vehicle veh);
    Vehicle update(String vid, Vehicle veh);
    void delete(String vid);


}
