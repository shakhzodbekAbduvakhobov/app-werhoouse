package uz.pdp.appwerhouse.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import uz.pdp.appwerhousedemo.entity.Measurement;

public interface MeasurementRepository extends JpaRepository<Measurement, Integer> {

    boolean existsByName(String name);
}
