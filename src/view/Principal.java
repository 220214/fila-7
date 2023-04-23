package view;

import java.util.Collection;
import java.util.LinkedList;
import java.util.Queue;

import Controller.EscalonadorControoler;
import model.Processo;

public class Principal {

	public static void main(String[] args) {
		 // Criação da fila de processos
        Queue<Process> processQueue = new LinkedList<>();
        processQueue.addAll((Collection<? extends Process>) new Processo(1, 0, 10));
        processQueue.addAll((Collection<? extends Process>) new Processo(2, 3, 5));
        processQueue.addAll((Collection<? extends Process>) new Processo(3, 5, 2));
        processQueue.addAll((Collection<? extends Process>) new Processo(4, 8, 8));
        processQueue.addAll((Collection<? extends Process>) new Processo(5, 10, 4));

        // Criação do escalonador com quantum = 2
        EscalonadorControoler scheduler = new EscalonadorControoler(processQueue, 2);

        // Execução da simulação de escalonamento de processos
        scheduler.schedule();
    }
}

