
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
public class TestePessoa {
    public static void main (String[] args) {
		
		Pessoa pessoa = new Pessoa ("Nome Claudia", LocalDate.of(1999, 11, 22), Double.valueOf("1.70"));
		
		
		System.out.println(pessoa.toString());
		
    }
	}

