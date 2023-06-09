package uz.pdp.appwerhouse.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import uz.pdp.appwerhousedemo.entity.Measurement;
import uz.pdp.appwerhousedemo.payload.Result;
import uz.pdp.appwerhousedemo.repository.MeasurementRepository;

@Service
public class MeasurementService {

    @Autowired
    MeasurementRepository measurementRepository;

    public Result addMeasurementService(Measurement measurement){

        boolean existsByName = measurementRepository.existsByName(measurement.getName());
        if (existsByName)
            return new Result("Bunday measurement avval qo'shilgan", false);

        measurementRepository.save(measurement);
        return new Result("Muvvafaqiyatli saqlandi", true);
    }
}
