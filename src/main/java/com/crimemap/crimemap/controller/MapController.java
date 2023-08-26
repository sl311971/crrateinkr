package com.crimemap.crimemap.controller;

import com.crimemap.crimemap.service.MapService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class MapController {

    @Autowired
    public MapService mapService;

    @GetMapping("/crimemap")
    public String crimeMapList() {
        return "map";
    }


    @GetMapping("/")
    public String indexList() {return "index"; }
}
