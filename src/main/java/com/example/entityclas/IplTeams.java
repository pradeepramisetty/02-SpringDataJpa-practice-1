package com.example.entityclas;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name = "IplTeamsList")
public class IplTeams {
	
	@Id
	private Integer teamNom;
	private String teamName;
	private Integer noPlayers;
	private Double teamBudget;
	
	
	public IplTeams() {
		
	}
	
	public IplTeams(Integer teamNom, String teamName, Integer noPlayers, Double teamBudget) {

		this.teamNom = teamNom;
		this.teamName = teamName;
		this.noPlayers = noPlayers;
		this.teamBudget = teamBudget;
	}
	public Integer getTeamNom() {
		return teamNom;
	}
	public void setTeamNom(Integer teamNom) {
		this.teamNom = teamNom;
	}
	public String getTeamName() {
		return teamName;
	}
	public void setTeamName(String teamName) {
		this.teamName = teamName;
	}
	public Integer getNoPlayers() {
		return noPlayers;
	}
	public void setNoPlayers(Integer noPlayers) {
		this.noPlayers = noPlayers;
	}
	public Double getTeamBudget() {
		return teamBudget;
	}
	public void setTeamBudget(Double teamBudget) {
		this.teamBudget = teamBudget;
	}
	@Override
	public String toString() {
		return "IplTeams [teamNom=" + teamNom + ", teamName=" + teamName + ", noPlayers=" + noPlayers + ", teamBudget="
				+ teamBudget + "]";
	}
	
	
	
}
