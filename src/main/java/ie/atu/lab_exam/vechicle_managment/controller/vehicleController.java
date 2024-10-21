package ie.atu.lab_exam.vechicle_managment.controller;
import ie.atu.lab_exam.vechicle_managment.model.Vehicle;
import ie.atu.lab_exam.vechicle_managment.service.vehicleService;

import jakarta.validation.Valid;
import lombok.RequiredArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.http.RequestEntity.*;
import Java.util.List;


public class vehicleController {

    private final VechicleService vechicleService;

    @GetMapping
    public List<vehicle>getAllvehicles(){
        return vehicleService.getAllvechicle();
    }

    @PostMapping
    public ResponseEntity<VechicleService>addVehicle(@Valid @ResponseBody Vehicle vehicle){
        return ResponseEntity.ok(vehicleService.addVehicle(vehicle));
    }
    @PutMapping("/updateVehicle")
    public ResponseEntity<vehicle>updatevehicle(@PathVariable Long id,@Valid @ResponseBody Vehicle vehicle)
        return ResponseEntity.ok(vehicleService.addVehicle(vehicle));

    @DeleteMapping("/{deleteVehicle}")
    public ResponseEntity<void> deletevehicle(@PathVariable Long id){
        reurn vehicleService.deleteVehicle(vehicle) ? ResponseEntity.ok().build(): ResponseEntity.notFound().build();
    }

}

