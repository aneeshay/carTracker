package io.egen.Entity;



import org.hibernate.annotations.NamedQueries;
import org.hibernate.annotations.NamedQuery;

import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.OneToOne;
import java.util.Date;

@Entity
@NamedQueries({
        @NamedQuery(name="Vehicle.findAll",query = "select veh from Vehicle veh")
//        @NamedQuery(name="Employee.findByEmail",query = "select veh from Vehicle veh where veh.email='jsmith@gmail.com'")
})
public class Vehicle {

    @Id
    private String  vin;

    private String  make;
    private String  model;
    private int     year;
    private int     edlineRpm;
    private int     maxFuelVolume;
    private Date    lastServiceDate;

    @OneToOne
    private Tires  tires;


    public Tires getTires() {
        return tires;
    }

    public void setTires(Tires tires) {
        this.tires = tires;
    }



    public String getVin() {
        return vin;
    }

    public void setVin(String vin) {
        this.vin = vin;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getYear() {
        return year;
    }

    public void setYear(int year) {
        this.year = year;
    }

    public int getEdlineRpm() {
        return edlineRpm;
    }

    public void setEdlineRpm(int edlineRpm) {
        this.edlineRpm = edlineRpm;
    }

    public int getMaxFuelVolume() {
        return maxFuelVolume;
    }

    public void setMaxFuelVolume(int maxFuelVolume) {
        this.maxFuelVolume = maxFuelVolume;
    }

    public Date getLastServiceDate() {
        return lastServiceDate;
    }

    public void setLastServiceDate(Date lastServiceDate) {
        this.lastServiceDate = lastServiceDate;
    }
}
