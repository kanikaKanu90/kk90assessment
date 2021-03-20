package com.football.model;

import com.fasterxml.jackson.annotation.JsonInclude;

import lombok.Data;

@Data
@JsonInclude(JsonInclude.Include.NON_EMPTY)
public class Standing {

	private String country_id;
	private String country_name;
	private String league_id;
	private String league_name;
	private String team_id;
	private String team_name;
	private String overall_league_position;

}
