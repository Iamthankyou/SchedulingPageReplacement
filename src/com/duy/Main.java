package com.duy;

import com.duy.scheduling.RoundRobin;
import com.duy.scheduling.SJFPreemptive;
import com.duy.scheduling.Scheduling;

public class Main {

	public static void main(String[] args) {
		int[] processes = {1,2,3};
		double[] arrivalTime = {0,1,2,3};
		double[] burstTime = {6,4,2,3};
		
//		Scheduling scheduling = new FCFS(processes,burstTime);
//		Scheduling scheduling = new SJF(arrivalTime,burstTime);
		Scheduling scheduling = new SJFPreemptive(arrivalTime,burstTime);
//		Scheduling scheduling = new RoundRobin(arrivalTime,burstTime,4);
		
		scheduling.showGain();
		scheduling.showWaitingTime();
		scheduling.showAroundTime();
	}

}
