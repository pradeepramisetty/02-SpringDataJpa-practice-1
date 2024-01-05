package com.example.entityclas;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.*;
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
	
	@Override
	public String toString() {
		return "IplTeams [teamNom=" + teamNom + ", teamName=" + teamName + ", noPlayers=" + noPlayers + ", teamBudget="
				+ teamBudget + "]";
	}
	
	public void m1() {
		System.out.println("haii GitHub");
	}
	
}
