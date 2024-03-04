package projekt.services;

import projekt.model.Departure;
import projekt.repositories.DepartureRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class DepartureService {

    @Autowired
    private DepartureRepository departureRepository;

    private boolean existsById(Long id) {
        return departureRepository.existsById(id);
    }

    public List<Departure> findAll() {
        return new ArrayList<>(departureRepository.findAll());
    }
}