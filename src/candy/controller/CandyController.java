package candy.controller;

import candy.model.MarshmallowCreature;

public class CandyController
{
	private MarshmallowCreature myCreature;
	public void start()
	{
		makeMonster();
	}
	
	private void makeMonster()
	{
		myCreature = new MarshmallowCreature(2, 7, 1, true, "Timmeh");
	}
}
