package com.duy;

import com.duy.scheduling.SJF;
import com.duy.scheduling.Scheduling;

public class Main {

	public static void main(String[] args) {
		int[] processes = {1,2,3};
		int[] arrivalTime = {0,2,4,5};
		int[] burstTime = {7,4,1,4};
		
//		Scheduling scheduling = new FCFS(processes,burstTime);
		Scheduling scheduling = new SJF(arrivalTime,burstTime);
		
		scheduling.showGain();
		scheduling.showWaitingTime();
		scheduling.showAroundTime();
	}

}
