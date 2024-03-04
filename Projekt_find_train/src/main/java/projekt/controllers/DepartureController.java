package projekt.controllers;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;
import projekt.model.Departure;
import projekt.repositories.DepartureRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin(origins = "http://localhost:4200")
@RestController
public class DepartureController {

    private final Logger logger = LoggerFactory.getLogger(this.getClass());


    @Autowired
    private DepartureRepository departureRepository;

    @RequestMapping(value = "/departures", method = RequestMethod.GET)
    @ResponseBody
    public List<Departure> getAllDepartures() {
        return departureRepository.findAll();
    }


}
