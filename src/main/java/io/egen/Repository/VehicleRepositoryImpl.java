package io.egen.Repository;

import io.egen.Entity.Vehicle;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;

import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import javax.persistence.*;
import java.util.List;


@Repository
public class VehicleRepositoryImpl implements VehicleRepository {



    @PersistenceContext
    private EntityManager em;

    @Override
    @Transactional(readOnly = true)
    public List<Vehicle> findAll() {

        TypedQuery<Vehicle> query = (TypedQuery<Vehicle>) em.createNamedQuery("Vehicle.findAll", Vehicle.class);

        return query.getResultList();
    }

    @Override
    @Transactional(readOnly = true)
    public Vehicle findOne(String vid) {
        return em.find(Vehicle.class,vid);
    }

    @Override
    public List<Vehicle> create(Vehicle veh) {

        em.persist(veh);

        return (List<Vehicle>) veh;
    }

    @Override
    public Vehicle update(Vehicle veh) {

        return  em.merge(veh);

    }

    @Override
    public void delete(Vehicle veh) {

        em.remove(veh);

    }
}
