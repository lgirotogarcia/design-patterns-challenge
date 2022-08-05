package one.digitalinnovation.gof;

import one.digitalinnovation.gof.facade.Facade;
import one.digitalinnovation.gof.singleton.SingletonEager;
import one.digitalinnovation.gof.singleton.SingletonLazy;
import one.digitalinnovation.gof.singleton.SingletonLazyHolder;
import one.digitalinnovation.gof.strategy.Comportamento;
import one.digitalinnovation.gof.strategy.ComportamentoAgressivo;
import one.digitalinnovation.gof.strategy.ComportamentoDefensivo;
import one.digitalinnovation.gof.strategy.ComportamentoNormal;
import one.digitalinnovation.gof.strategy.Robo;

public class Test {
	
	public static void main (String[] args) {
		
		//Testes relacionados ao Design Pattern Singleton:
		System.out.println("----------------------- Testes Singleton -----------------------\n");
		
		SingletonLazy lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		lazy = SingletonLazy.getInstancia();
		System.out.println(lazy);
		System.out.println("\n");
		
		SingletonEager eager = SingletonEager.getInstancia();
		System.out.println(eager);
		eager = SingletonEager.getInstancia();
		System.out.println(eager);
		System.out.println("\n");
		
		
		SingletonLazyHolder holder = SingletonLazyHolder.getInstancia();
		System.out.println(holder);
		holder = SingletonLazyHolder.getInstancia();
		System.out.println(holder);
		System.out.println("\n----------------------------------------------------------------\n");
		
		//Testes relacionados ao Design Pattern Strategy
		System.out.println("----------------------- Testes Strategy -----------------------\n");
		Comportamento defensivo = new ComportamentoDefensivo();
		Comportamento normal = new ComportamentoNormal();
		Comportamento agressivo = new ComportamentoAgressivo();
		
		Robo robo = new Robo();
		
		
		System.out.println("Aventura do Robô na floresta \n \n");
		robo.setComportamento(normal);
		robo.mover();
		robo.mover();
		System.out.println("~~ Barulho na mata ~~");
		robo.setComportamento(defensivo);
		robo.mover();
		System.out.println("~~ Robô vê um monstro ~~");
		robo.setComportamento(agressivo);
		robo.mover();
		robo.mover();
		robo.mover();
		System.out.println("~~ Monstro derrotado ~~");
		robo.setComportamento(normal);
		robo.mover();
		System.out.println("\n----------------------------------------------------------------\n");
		
		//Testes relacionados ao Design Pattern Facade
		
		Facade facade = new Facade();
		facade.migrarCliente("Leonardo Garcia", "02316-110");
	}
	
}
