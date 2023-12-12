package org.example.lab06.code;

import java.util.Random;


public class CompanySimulator {

	private int currentTime;
	
	public static final int DEFAULT_MAX_SIZE = 10;
	private int numItems;

	private Employee[] company;

	private void initCompany() {
		company = new Employee[DEFAULT_MAX_SIZE];
		numItems = 0;
		
		add(new Executive());
		for (int i = 0; i < 3; i++) {
			add(new SoftwareManager());
			for (int j = 0; j < 2; j++) {
				add(new SoftwareEngineer());
			}
		}

		System.out.println(numItems);
		for(int i = 0; i < this.numItems; i++)
			System.out.println(company[i].toString());
	}
	
	public void add(Employee em) {
		if (numItems < DEFAULT_MAX_SIZE) {
			company[numItems++] = em;
		} else {
			System.out.println("Cannot add more employees!");
		}
	}

	public void run(int runTime) {
		initCompany();
		
		Random timeGen = new Random();

		currentTime = 0;
		while (currentTime <= runTime) {

			int scheduledTime = timeGen.nextInt(10) + 1;

			currentTime += scheduledTime;
			System.out.println("Current Time: " + currentTime);
			performWork();
			
			System.out.println("\n");
		}
	}

	private void performWork() {
		
		for (Employee emp : company) {
			if (!emp.work())
				manageCrisis(emp);
		}

	}

	private int index = 0;
	private void manageCrisis(Employee emp) {
		if (emp instanceof SoftwareManager) {
			index = emp.getId();
			((Executive) company[0]).handleCrisis();
		} else if (emp instanceof SoftwareEngineer) {
			((SoftwareManager) company[index]).handleCrisis();
		}
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		CompanySimulator sim = new CompanySimulator();
		sim.run(100);
	}

}

