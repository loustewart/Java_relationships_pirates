package com.codeclan.example.pirateservice_d1_starter.controllers;

import com.codeclan.example.pirateservice_d1_starter.repositories.ShipRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RestController;




@RestController

public class ShipController {

    @Autowired
    ShipRepository shipRepository;


}
