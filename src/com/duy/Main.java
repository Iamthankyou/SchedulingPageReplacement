package com.duy;

import com.duy.pagereplacement.FIFO;
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
		
		int[] page = {1,2,3,4,1,2,5,1,2,3,4,5};
		int frame = 4;
		PageReplacement pageReplacement = new FIFO(page,frame);
		
		pageReplacement.showTable();
	}

}
