package com.Java.oops;

public interface ParentInterfaceSports {
	   public void setHomeTeam(String name);
	   public void setVisitingTeam(String name);
	}

	// Filename: Football.java
	interface Football extends ParentInterfaceSports {
	   public void homeTeamScored(int points);
	   public void visitingTeamScored(int points);
	   public void endOfQuarter(int quarter);
	}

	// Filename: Hockey.java
	interface Hockey extends ParentInterfaceSports {
	   public void homeGoalScored();
	   public void visitingGoalScored();
	   public void endOfPeriod(int period);
	   public void overtimePeriod(int ot);
	}
	
	
	