package app;

import java.util.Scanner;

import com.mongodb.client.MongoDatabase;

import controller.Controller;
import dao.DAObirdsDb;
import service.BirdsDB;
import utils.InitialBirdsFilling;
import view.Menu;

public class Main {
//update
	public static void main(String[] args) {
		// Watching up birds!
		
		MongoDatabase database = Controller.init();
		
		DAObirdsDb BirdsDAO = Controller.setSource(database);
		
		//Create a Birds Data Base
		BirdsDB db = new BirdsDB( "birding" );
		//BirdsDB dbRoger = new BirdsDB( "Rogerbirding" );
		db.setBirds(InitialBirdsFilling.birds);
		
		//Ask user from menu by scanner
		Scanner reader = new Scanner(System.in);
		
		Menu menu = new Menu(reader);
		menu.loop(reader);
		
		System.out.println("See you in the sky!");
	}	

}