

import java.time.LocalDate;
/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Marcelo
 */
public class TesteAgenda {
public static void main(String[] args) {
	
	Agenda agenda = new Agenda();
	
	System.out.println("Iniciando processo...");
	agenda.add("Claudia",LocalDate.of(1999, 8, 4), Double.valueOf("1.73"));
	agenda.add("Luana",LocalDate.of(1998, 7, 18), Double.valueOf("1.60"));
	agenda.add("Gessica",LocalDate.of(1996, 9, 6), Double.valueOf("1.69"));
	agenda.add("Gabriela",LocalDate.of(1999, 6, 9), Double.valueOf("1.73"));
	agenda.add("Pamela",LocalDate.of(1993, 8, 12), Double.valueOf("1.58"));
	agenda.add("Marciele",LocalDate.of(2002, 10, 8), Double.valueOf("1.68"));
	agenda.add("Carol",LocalDate.of(2001, 11, 24), Double.valueOf("1.65"));
	agenda.add("Eduarda",LocalDate.of(2000, 1, 1), Double.valueOf("1.57"));
	agenda.add("Rafaela",LocalDate.of(1998, 2, 3), Double.valueOf("1.78"));
	agenda.add("Alexandra",LocalDate.of(1998, 3, 11), Double.valueOf("1.79"));
	
	System.out.println("Imprimindo...");
	agenda.imprimirAgenda();
	
	System.out.println("Removendo...");
	agenda.removePessoa("Claudia");
	
	System.out.println("Imprimindo...");
	agenda.imprimirAgenda();
		
	System.out.println("Imprimindo...");
	agenda.imprimirPessoa(7);
        
        System.out.println("imprimindo a posicão da pessoa escolhida");
        System.out.println(agenda.buscaPessoa("Claudia"));
        //agenda.buscaPessoa(Claudia)
}
}
