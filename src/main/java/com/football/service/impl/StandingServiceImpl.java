package com.football.service.impl;

import java.util.Arrays;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.ParameterizedTypeReference;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Component;
import org.springframework.web.client.RestTemplate;
import org.springframework.web.util.UriComponentsBuilder;

import com.football.model.Standing;
import com.football.service.IStandingService;

import lombok.extern.slf4j.Slf4j;

@Slf4j
@Component
public class StandingServiceImpl implements IStandingService{
	
	@Autowired
	private RestTemplate restTemplate;
	
	private static final String STANDINGS_URL = "https://apiv2.apifootball.com/?action=get_standings";

	@Override
	public List<Standing> fetchStandings(String countryName, String leagueName, String teamName) {
		HttpHeaders headers = new HttpHeaders();
	    headers.setAccept(Arrays.asList(MediaType.APPLICATION_JSON));
	
		ResponseEntity<List<Standing>> responseEntity;
		
		UriComponentsBuilder builder =
		          UriComponentsBuilder.fromHttpUrl(STANDINGS_URL)
		              /*.queryParam("country_name", countryName)
		              .queryParam("league_name", leagueName)
		              .queryParam("team_name", teamName)*/
		              .queryParam("league_id", "148")
		              .queryParam("APIkey", "9bb66184e0c8145384fd2cc0f7b914ada57b4e8fd2e4d6d586adcc27c257a978");
		log.info("Request to footbal standings api: {}", builder.toUriString());
		
		responseEntity =
		          restTemplate.exchange(
		              builder.toUriString(),
		              HttpMethod.GET,
		              null, new ParameterizedTypeReference<List<Standing>>(){});
		List<Standing> standings = responseEntity.getBody();
		      
		log.info("Response from standings api: {}",standings);
		return standings;
	}
}
