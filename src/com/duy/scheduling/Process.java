package com.duy.scheduling;

public class Process {
	private int arrivalTime;
	private int burstTime;
	private int process;
	private int waitTime;
	private int aroundTime;
	
	public Process(int arrivalTime, int burstTime, int process) {
		super();
		this.arrivalTime = arrivalTime;
		this.burstTime = burstTime;
		this.process = process;
	}

	public int getArrivalTime() {
		return arrivalTime;
	}

	public void setArrivalTime(int arrivalTime) {
		this.arrivalTime = arrivalTime;
	}

	public int getBurstTime() {
		return burstTime;
	}

	public void setBurstTime(int burstTime) {
		this.burstTime = burstTime;
	}

	public int getProcess() {
		return process;
	}

	public void setProcess(int process) {
		this.process = process;
	}

	public int getWaitTime() {
		return waitTime;
	}

	public void setWaitTime(int waitTime) {
		this.waitTime = waitTime;
	}

	public int getAroundTime() {
		return aroundTime;
	}

	public void setAroundTime(int aroundTime) {
		this.aroundTime = aroundTime;
	}

	@Override
	public String toString() {
		return "Process [arrivalTime=" + arrivalTime + ", burstTime=" + burstTime + ", process=" + process
				+ ", waitTime=" + waitTime + ", aroundTime=" + aroundTime + "]";
	}

}
