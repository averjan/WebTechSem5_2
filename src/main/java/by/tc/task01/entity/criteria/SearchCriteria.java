package by.tc.task01.entity.criteria;

public final class SearchCriteria {
	
	public static enum Oven{
		POWER_CONSUMPTION("powerConsumption"),
		WEIGHT("weight"),
		CAPACITY,
		DEPTH,
		HEIGHT,
		WIDTH;

		private String name;

		Oven(String name) {
			this.name = name;
		}

		public String getName() {
			return name;
		}

		public static String getGroupName() {
			return "Oven";
		}
	}
	
	public static enum Laptop{
		BATTERY_CAPACITY,
		OS,
		MEMORY_ROM,
		SYSTEM_MEMORY,
		CPU,
		DISPLAY_INCHS;

		public static String getGroupName() {
			return "Laptop";
		}
	}
	
	public static enum Refrigerator{
		POWER_CONSUMPTION,
		WEIGHT("weight"),
		FREEZER_CAPACITY,
		OVERALL_CAPACITY,
		HEIGHT,
		WIDTH;


		public static String getGroupName() {
			return "Refrigerator";
		}
	}
	
	public static enum VacuumCleaner{
		POWER_CONSUMPTION, FILTER_TYPE, BAG_TYPE, WAND_TYPE, MOTOR_SPEED_REGULATION, CLEANING_WIDTH;

		public static String getGroupName() {
			return "VacuumCleaner";
		}
	}
	
	public static enum TabletPC{
		BATTERY_CAPACITY, DISPLAY_INCHES, MEMORY_ROM, FLASH_MEMORY_CAPACITY, COLOR;

		public static String getGroupName() {
			return "TabletPC";
		}
	}
	
	public static enum Speakers{
		POWER_CONSUMPTION, NUMBER_OF_SPEAKERS, FREQUENCY_RANGE, CORD_LENGTH;

		public static String getGroupName() {
			return "Speakers";
		}
	}

	public static enum Kettle{
		POWER_CONSUMPTION,
		WATER_CAPACITY, COLOR;

		public static String getGroupName() {
			return "Kettle";
		}
	}

	private SearchCriteria() {}
}

