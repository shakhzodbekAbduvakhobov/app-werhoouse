package uz.pdp.appwerhouse.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import uz.pdp.appwerhouse.entity.Measurement;
import uz.pdp.appwerhouse.payload.Result;
import uz.pdp.appwerhouse.service.MeasurementService;

@RestController
@RequestMapping("/measurement")
public class MeasurementController {

    @Autowired
    MeasurementService measurementService;

    @PostMapping
    public Result addMeasurementController(@RequestBody Measurement measurement){

        return measurementService.addMeasurementService(measurement);
    }

    //EDIT, GET list, GET one, DELETE; qoshib qoyish
}
