package ie.atu.lab_exam.vechicle_managment.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.vehicle;
import jakarta.validation.constraints.NotEmpty;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class Vehicle {
    private String vehicleName;
    private String vehicleType;
    private String registrationNumber;
    private float price;
    private int yearOfManufacture;
    private int mileage;

}
