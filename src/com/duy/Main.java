package com.duy;

import com.duy.pagereplacement.LRU;
import com.duy.pagereplacement.PageReplacement;

public class Main {

	public static void main(String[] args) {
		int[] processes = {1,2,3};
		double[] arrivalTime = {0,1,2,3};
		double[] burstTime = {6,4,2,3};
		
//		Scheduling scheduling = new FCFS(processes,burstTime);
//		Scheduling scheduling = new SJF(arrivalTime,burstTime);
//		Scheduling scheduling = new SJFPreemptive(arrivalTime,burstTime);
//		Scheduling scheduling = new RoundRobin(arrivalTime,burstTime,4);
		
//		scheduling.showGain();
//		scheduling.showWaitingTime();
//		scheduling.showAroundTime();
		
		int[] page = {1,2,3,4,1,5,6,2,1,3,7,6,3,2,1,2,3,6,1};
		int frame = 3;
		
//		PageReplacement pageReplacement = new FIFO(page,frame);
//		PageReplacement pageReplacement = new NRU(page,frame);
		PageReplacement pageReplacement = new LRU(page,frame);
		
		pageReplacement.showTable();
	}

}
