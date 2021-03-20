package com.football.controller;


import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.football.model.Standing;
import com.football.service.IStandingService;

@RestController
public class KkStandingController {
	
	@Autowired IStandingService standingService;
	
	@GetMapping(value = "/standings", produces = "application/json")
	public ResponseEntity<List<Standing>> getStandingsForMatch(
			@RequestParam(required = true) String countryName, 
			@RequestParam(required = true) String leagueName,
			@RequestParam(required = true) String teamName){
		
		List<Standing> standings = standingService.fetchStandings(countryName, leagueName, teamName);
		return new ResponseEntity<>(standings, HttpStatus.OK);
	}

}
