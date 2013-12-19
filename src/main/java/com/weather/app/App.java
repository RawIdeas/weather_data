package com.weather.app;

import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

public class App {
	private static Logger logger = LoggerFactory.getLogger(App.class);

	public static void main(String[] args) {
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("h2");
		
		logger.info("App started...");
		
		/*
		 * 1) Use http://api.openweathermap.org/data/2.5/weather?q=Sydney,au
		 * to retrieve the current temp, humidity and pressure.
		 *
		 * 2) Store the weather record in the DB using a Hibernate entity.
		 * 
		 * 3) Log how many records you have stored so far by querying the DB.
		 * 
		 * 4) Repeat from step 1 every 10 minutes.
		 */
	}
}
