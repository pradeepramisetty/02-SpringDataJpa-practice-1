package com.example;

import java.util.List;
import java.util.Scanner;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.repository.Query;

import com.example.entityclas.IplTeams;
import com.example.reposit.IplTeamRepositry;

@SpringBootApplication
public class Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext context = SpringApplication.run(Application.class, args);
		IplTeamRepositry ipl = context.getBean(IplTeamRepositry.class);
		
		/*
		 * IplTeams iptm = new IplTeams(5,"Rastha Royals",14,40.6); IplTeams iptm1 = new
		 * IplTeams(6,"Delhi Capitals",15,80.20); IplTeams iptm2 = new
		 * IplTeams(7,"Gujarat Taitans",14,85.20); IplTeams iptm3 = new
		 * IplTeams(8,"Sunraisers Hyderabad",14,55.20); IplTeams iptm4 = new
		 * IplTeams(9,"Punjab Kings",14,40.20); IplTeams iptm5 = new
		 * IplTeams(10,"Luckno Super Gaints",14,48.20); List<IplTeams> l1 =
		 * Arrays.asList(iptm,iptm1,iptm2,iptm3,iptm4,iptm5); ipl.saveAll(l1);
		 */
		 
		/*
		 * IplTeams iptm = new IplTeams(1,"Chennai Super Kings ",15,50.5);
		 * ipl.save(iptm);
		 */
		/*
		 * List<Integer> l2 = Arrays.asList(2,3,4,9,10);
		 * System.out.println(ipl.findAllById(l2));
		 * System.out.println("Records Inserted");
		 */
		//ipl.deleteById(8);
	//	List<Integer> l1 = Arrays.asList(6,7,9);
	//	ipl.deleteAllById(l1);
	/*
	 * IplTeams iptm1 = new IplTeams(6,"Delhi Capitals",15,80.20); IplTeams iptm2 =
	 * new IplTeams(7,"Gujarat Taitans",14,85.20); IplTeams iptm3 = new
	 * IplTeams(8,"Sunraisers Hyderabad",14,55.20); IplTeams iptm4 = new
	 * IplTeams(9,"Punjab Kings",14,40.20);
	 * 
	 * List<IplTeams> l1 = Arrays.asList(iptm1,iptm2,iptm3,iptm4); ipl.saveAll(l1);
	 * Iterable<IplTeams> i1 =ipl.findAll(); i1.forEach(System.out::println);
	 */
	//	System.out.println(ipl.existsById(8));
	//	System.out.println(ipl.count());
		
	/*
	 * Iterable<IplTeams> i1 = ipl.findByNoPlayersLessThanEqual(15);
	 * i1.forEach(System.out::println);
	 * 
	 * Iterable<IplTeams> i2 = ipl.findByNoPlayersGreaterThanEqual(15);
	 * i2.forEach(System.out::println); Iterable<IplTeams> b1 =
	 * ipl.findByTeamBudgetLessThanEqual(50.0); b1.forEach(System.out::println);
	 * Iterable<IplTeams> b2 = ipl.findByTeamBudgetGreaterThanEqual(50.8);
	 * b2.forEach(System.out::println);
	 */
		
	
		
	/*
	 * Scanner scn = new Scanner(System.in);
	 * System.out.println("Enter Page Starting Number"); int i1 = scn.nextInt();
	 * System.out.println("Enter Page Size"); int i2 = scn.nextInt(); PageRequest
	 * pgreq = PageRequest.of(i1-1, i2); Page<IplTeams> page = ipl.findAll(pgreq);
	 * List<IplTeams> l1 = page.getContent(); l1.forEach(System.out::println);
	 * 
	 * List<IplTeams> l2 = ipl.findAll(Sort.by("teamNom"));
	 * l2.forEach(System.out::println);
	 */
	/*
	 * IplTeams i1 = new IplTeams(); i1.setNoPlayers(14); i1.setTeamBudget(60.2);
	 * Example<IplTeams> e1 = Example.of(i1); List<IplTeams> l1 = ipl.findAll(e1);
	 * l1.forEach(System.out::println);
	 */
		// ipl.updateIplTeamsTbl(20, 85.2);
		//System.out.println("updated successfuly");
		List<IplTeams> l1 = ipl.getAllIplTeamsList();
		l1.forEach(System.out::println);
		ipl.insertInIplsTeam(16,60.89,4, "Kolkata Night Rider");
		ipl.insertInIplsTeam(16,60.90,5, "Rajasthan Royal");
		ipl.insertInIplsTeam(17,57.90,8, "Sunrises Hyderabad");
		ipl.insertInIplsTeam(17,58.78, 9, "Punjab Kings");
		ipl.insertInIplsTeam(15, 48.9, 10, "Luckno Super Gaints");
		List<IplTeams> l2 = ipl.getAllIplTeamsList();
		l2.forEach(System.out::println);
	}

}
