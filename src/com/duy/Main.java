package com.duy;

import com.duy.scheduling.FCFS;
import com.duy.scheduling.Scheduling;

public class Main {

	public static void main(String[] args) {
		int[] processes = {1,2,3};
		int[] burstTime = {24,3,3};
		Scheduling scheduling = new FCFS(processes,burstTime);
		
		scheduling.showGain();
		scheduling.showWaitingTime();
		scheduling.showAroundTime();
	}

}
