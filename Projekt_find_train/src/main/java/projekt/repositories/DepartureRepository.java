package projekt.repositories;

import projekt.model.Departure;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface DepartureRepository extends JpaRepository<Departure, Long> {


        List<Departure> findAll();
        Departure findById(int id);

}

