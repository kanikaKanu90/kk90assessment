package com.football.service;

import java.util.List;

import com.football.model.Standing;

public interface IStandingService {
	
	List<Standing> fetchStandings(String countryName, String leagueName,String teamName);

}
