package io.egen.Repository;

import io.egen.Entity.Vehicle;

import java.util.List;

public interface VehicleRepository {

    List<Vehicle> findAll();
    Vehicle findOne(String vid);
    List<Vehicle> create(Vehicle veh);
    Vehicle update(Vehicle veh);
    void delete(Vehicle veh);
}
