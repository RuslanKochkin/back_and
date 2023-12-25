package de.doubledecker.doubledecker.controller;

import de.doubledecker.doubledecker.controller.dto.CountryDTO;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/tours")
public class AdminController {
    @Autowired

    @GetMapping("/all")
    public List<CountryDTO> getAll(3){
        return null;
    }
}
