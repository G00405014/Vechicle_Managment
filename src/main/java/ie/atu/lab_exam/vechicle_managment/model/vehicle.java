package ie.atu.lab_exam.vechicle_managment.model;

import jakarta.persistence.*;
//import jakarta.validation.constraints.vehicle;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
@Data
@NoArgsConstructor
@AllArgsConstructor

public class vehicle {
    private String vehicleName;
    private String vehicleType;
    private String registrationNumber;
    private float price;
    private int yearOfManufacture;
    private int mileage;
    @Id
    private Long id;

    public void setId(Long id) {
        this.id = id;
    }

    public Long getId() {
        return id;
    }
}
