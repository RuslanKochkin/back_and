package de.doubledecker.doubledecker.controller;

import de.doubledecker.doubledecker.controller.dto.TourDTO;
import de.doubledecker.doubledecker.service.CountryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/admin")
public class AdminController {

    @Autowired
    private CountryService countryService;

    @GetMapping("/tours")
    public List<TourDTO> getAllTours() {
        return countryService.findAll();
    }
}
