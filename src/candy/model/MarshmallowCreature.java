package candy.model;

public class MarshmallowCreature
{
	// Declaration Section
	private int legs;
	private int arms;
	private int eyes;
	private boolean hasButton;
	private String name;

	public int getLegs()
	{
		return legs;
	}

	public int getArms()
	{
		return arms;
	}

	public int getEyes()
	{
		return eyes;
	}

	public boolean getisHasButton()
	{
		return hasButton;
	}

	public String getName()
	{
		return getName();
	}

	public void setName(String name)
	{
		this.name = name;
	}

	public void setLegs(int legs)
	{
		this.legs = legs;
	}

	public void setArms(int arms)
	{
		this.arms = arms;
	}

	public void setEyes(int eyes)
	{
		this.eyes = eyes;
	}

	public void setHasButton(boolean hasButton)
	{
		this.hasButton = hasButton;
	}


	/**
	 * Default constructor for the MarshmallowCreature - Do not use.
	 */
	 public MarshmallowCreature()
	 {
	 legs = 20;
	 arms = 10;
	 eyes = 10;
	 hasButton = false;
	 name = "bob";
	 }

	/**
	 * Creates a MarshmallowCreature with the specified parameters.
	 * 
	 * @param name
	 *            THe name of the creature.
	 * @param hasButton
	 *            whether the creature has a button.
	 * @param eyes
	 *            How many eyes the creature has
	 * @param arms
	 *            How many arms does the creature have.
	 * @param legs
	 *            How many legs the creature has.
	 */

		public MarshmallowCreature(int legs, int arms, int eyes, boolean hasButton,
				String name)
		{
			// TODO Auto-generated constructor stub
			this.legs = legs;
			this.hasButton = hasButton;
			this.eyes = eyes;
			this.arms = arms;
			this.name = name;
		}

}
