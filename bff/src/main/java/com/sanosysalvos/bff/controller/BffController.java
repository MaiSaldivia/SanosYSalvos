package com.sanosysalvos.bff.controller;

import com.sanosysalvos.bff.service.GeoService;
import com.sanosysalvos.bff.service.MatchService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/api/bff")
public class BffController {

    @Autowired
    private GeoService geoService;

    @Autowired
    private MatchService matchService;

    @GetMapping("/home")
    public String getHomeData() {
        String geoData = geoService.getGeoData();
        String matchData = matchService.getMatchData();
        return "GeoData: " + geoData + " | MatchData: " + matchData;
    }
}
