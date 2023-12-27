package de.doubledecker.doubledecker.controller;


import de.doubledecker.doubledecker.controller.dto.CountryDTO;
import de.doubledecker.doubledecker.domain.Country;
import de.doubledecker.doubledecker.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/tours")
public class AdminController {

    @Autowired
    private CountryService countryService;

    @GetMapping("/all")
    public List<CountryDTO> getAllTours() {
        return countryService.findAll();
    }

    @PostMapping("/add")
    public ResponseEntity<CountryDTO> addCountry(@RequestBody CountryDTO countryDTO) {
        try {
            CountryDTO addedCountry = countryService.addCountry(countryDTO);
            return new ResponseEntity<>(addedCountry, HttpStatus.CREATED);
        } catch (Exception e) {
            return new ResponseEntity<>(HttpStatus.INTERNAL_SERVER_ERROR);
        }
    }


}
