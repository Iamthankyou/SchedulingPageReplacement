package com.duy;

import com.duy.scheduling.SJFPreemptive;
import com.duy.scheduling.Scheduling;

public class Main {

	public static void main(String[] args) {
		int[] processes = {1,2,3};
		double[] arrivalTime = {0,1,2,3};
		double[] burstTime = {21,3,6,2};
		
//		Scheduling scheduling = new FCFS(processes,burstTime);
//		Scheduling scheduling = new SJF(arrivalTime,burstTime);
		Scheduling scheduling = new SJFPreemptive(arrivalTime,burstTime);
		
		scheduling.showGain();
		scheduling.showWaitingTime();
		scheduling.showAroundTime();
	}

}
