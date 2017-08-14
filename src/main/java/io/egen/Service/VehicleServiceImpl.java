package io.egen.Service;

import io.egen.Entity.Vehicle;
import io.egen.Exception.BadRequestException;
import io.egen.Exception.ResourceNotFoundException;
import io.egen.Repository.VehicleRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;


@Service
public class VehicleServiceImpl implements VehicleService {


    @Autowired
    VehicleRepository repository;

    @Override
    public List<Vehicle> findAll() {
        return repository.findAll();
    }

    @Override
    public Vehicle findOne(String vid) {

        Vehicle existing = repository.findOne(vid);
        if(existing==null){
            //exceptional handling
            throw new ResourceNotFoundException("Vehicle Id" +vid+ "Not Found");
        }

        return repository.findOne(vid);
    }

    @Override
    @Transactional
    public List<Vehicle> create(Vehicle veh) {

        Vehicle existing = repository.findOne(veh.getVin());

        if(existing!= null){
            //exceptional handling
            throw new BadRequestException("Vehicle Id" +veh.getVin()+ " Already Existing");
        }

        return repository.create(veh);
    }

    @Override
    @Transactional
    public Vehicle update(String vid, Vehicle veh) {

        Vehicle existing = repository.findOne(vid);

        if(existing == null){
            //exceptional handling
            throw new ResourceNotFoundException("Vehicle Id" +vid+ "Not Found");
        }

        return repository.update(veh);
    }

    @Override
    @Transactional
    public void delete(String vid) {


        Vehicle existing = repository.findOne(vid);

        if(existing == null){
            throw new ResourceNotFoundException("Vehicle Id" +vid+ "Not Found");
        }

        repository.delete(existing);

    }
}
