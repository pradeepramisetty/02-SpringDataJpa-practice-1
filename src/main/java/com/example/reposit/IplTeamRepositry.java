package com.example.reposit;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import com.example.entityclas.IplTeams;

import jakarta.transaction.Transactional;
@Repository
public interface IplTeamRepositry extends JpaRepository<IplTeams,Integer> {
	  
	
	/*
	 * public List<IplTeams> findByNoPlayersLessThanEqual(Integer noPlay); public
	 * List<IplTeams> findByNoPlayersGreaterThanEqual(Integer noPl); public
	 * List<IplTeams> findByTeamBudgetLessThanEqual(Double sal); public
	 * List<IplTeams> findByTeamBudgetGreaterThanEqual(Double sal1);
	 */
//	@Query(value ="select * from ipl_teams_list", nativeQuery =true)
//	public List<IplTeams> getAllIpl_Teams_List();
//	@Query(value ="from IplTeams WHERE teamBudget>=?1 and noPlayers<=?2")
//	public List<IplTeams> getAllIplTeams(Double m1,int m2);
//	@Query(value="select * from ipl_teams_list WHERE TEAM_BUDGET<?1 and  NO_PLAYERS>?2" ,nativeQuery=true)
//	public List<IplTeams> getAllIplTeams(double sal,int no);
	@Query("from IplTeams")
	public List<IplTeams> getAllIplTeamsList();
    @Query("update IplTeams set noPlayers=?1 where teamBudget=?2") 
    @Modifying
    @Transactional
	public void updateIplTeamsTbl(int i1,double i2);
    @Query("delete from IplTeams where noPlayers=:players ")
    @Modifying
    @Transactional
    public void deleteIplTeamsTbl(int players);
    @Query(value= "insert into ipl_teams_list values(NO_PLAYERS=?1,TEAM_BUDGET=?2,TEAM_NOM=?3,TEAM_NAME=?4)", nativeQuery=true)
    @Modifying
    @Transactional
    public void insertInIplsTeam(int noPlay,double tmBudg,int tmNo,String name);
    
}
