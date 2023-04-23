package Controller;

import java.util.Queue;

import br.mari.FilaObject.Fila;

public class EscalonadorControoler {
	 private Queue<Process> processQueue;
	    private int quantum;
Fila fila =new Fila();
	    public EscalonadorControoler(Queue<Process> processQueue, int quantum) {
		    this.processQueue = processQueue;
	        this.quantum = quantum;
	    }

	    public void schedule() {
	        while (!processQueue.isEmpty()) {
	            Process currentProcess = processQueue.remove();
	            int remainingTime = ((Object) currentProcess).getTimeRemaining();
	            if (remainingTime <= quantum) {
	                // O processo será concluído durante esse quantum
	                ((Object) currentProcess).toString();
	                System.out.println("Processo " + ((Object) currentProcess).getId() + " concluído.");
	            } else {
	                // O processo precisará ser executado novamente após o quantum
	                currentProcess.execute(quantum);
	                System.out.println("Processo " + currentProcess.getId() + " executado por " + quantum + " unidades de tempo.");
	                processQueue.add(currentProcess);
	            }
	        }
	    }
}
