package model;

public class Processo {
	
	    private int id;
	    private int arrivalTime;
	    private int timeRemaining;

	    public  Processo(int id, int arrivalTime, int timeRemaining) {
	        this.id = id;
	        this.arrivalTime = arrivalTime;
	        this.timeRemaining = timeRemaining;
	    }

	    public int getId() {
	        return id;
	    }

	    public int getArrivalTime() {
	        return arrivalTime;
	    }

	    public int getTimeRemaining() {
	        return timeRemaining;
	    }

	    public void execute(int time) {
	        timeRemaining -= time;
	    }
	}
