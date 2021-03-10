package electionsystem;

import java.io.File;
import java.util.List;

public class PollingStation implements Collation {
	private List<Voter> voted;
	private List<Integer> votes;
	private int pinkSheet[];
	private String pollingStation;
	private District district;
	private File results;

	
//Constructor to set Polling Station Varaibles	
private void setPollingStation(List<Voter> voted,List<Integer> votes,int[] pinkSheet, String pollingStation,District district,File results) {
	this.voted = voted;
	this.votes = votes;
	this.pinkSheet = pinkSheet;
	this.pollingStation = pollingStation;
	this.district = district;
	this.results = results;
			
}



/**
 * 
 * 
 * 
 */
//Method to Get Results of Election
 private File getResults() {
	 
 }
 
 
 
//Method to set the Results of the Election
 private void setResults() {
	 
 }
 
 
 //Method to Get Results for a Particular District
 private District getDistrict(){
	 
 }
 
 //Method to Get the Name of Polling Station
 private String getPollingStationName() {
	 
 }
 
 //Method to get NPP votes
 private int getNppResults() {
	 
 }
 
 //Method to get NDC votes
 private int getNdcResults() {
	 
 }
 
 //Method to get GUM votes
 private  int getGumResults() {
	 
 }
 
 
//Method to get PPP results
 private int getPppResults() {
	 
 }
 
 //Method to get CPP results
 private int getCppResults() {
	 
 }
 
 private String toString() {
	 
 }
 
 private void readResults() {
	 
 }
 
 
}