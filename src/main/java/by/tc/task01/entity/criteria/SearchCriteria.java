package by.tc.task01.entity.criteria;

import by.tc.task01.entity.Appliance;

public final class SearchCriteria {
	
	public enum Oven implements ApplianceCriteria {
		POWER_CONSUMPTION("powerConsumption"),
		WEIGHT("weight"),
		CAPACITY("capacity"),
		DEPTH("depth"),
		HEIGHT("height"),
		WIDTH("width");

		private final String name;

		Oven(String name) {
			this.name = name;
		}

		@Override
		public String getName() {
			return name;
		}

		public String getGroupName() {
			return "Oven";
		}
	}
	
	public enum Laptop implements ApplianceCriteria {
		BATTERY_CAPACITY("batteryCapacity"),
		OS("os"),
		MEMORY_ROM("memoryRom"),
		SYSTEM_MEMORY("systemMemory"),
		CPU("CPU"),
		DISPLAY_INCHS("displayInches");

		private final String name;

		Laptop(String name) {
			this.name = name;
		}

		@Override
		public String getName() {
			return name;
		}

		public static String getGroupName() {
			return "Laptop";
		}
	}
	
	public enum Refrigerator implements ApplianceCriteria {
		POWER_CONSUMPTION("powerConsumption"),
		WEIGHT("weight"),
		FREEZER_CAPACITY("freezerCapacity"),
		OVERALL_CAPACITY("overallCapacity"),
		HEIGHT("height"),
		WIDTH("width");

		private final String name;

		Refrigerator(String name) {
			this.name = name;
		}

		@Override
		public String getName() {
			return name;
		}

		public static String getGroupName() {
			return "Refrigerator";
		}
	}
	
	public enum VacuumCleaner implements ApplianceCriteria {
		POWER_CONSUMPTION("powerConsumption"),
		FILTER_TYPE("filterType"),
		BAG_TYPE("bagType"),
		WAND_TYPE("wandType"),
		MOTOR_SPEED_REGULATION("motorSpeedRegulation"),
		CLEANING_WIDTH("cleaningWidth");

		private final String name;

		VacuumCleaner(String name) {
			this.name = name;
		}

		@Override
		public String getName() {
			return name;
		}

		public static String getGroupName() {
			return "VacuumCleaner";
		}
	}
	
	public enum TabletPC implements ApplianceCriteria {
		BATTERY_CAPACITY("batteryCapacity"),
		DISPLAY_INCHES("displayInches"),
		MEMORY_ROM("memoryRom"),
		FLASH_MEMORY_CAPACITY("flashMemoryCapacity"),
		COLOR("color");

		private final String name;

		TabletPC(String name) {
			this.name = name;
		}

		@Override
		public String getName() {
			return name;
		}

		public static String getGroupName() {
			return "TabletPC";
		}
	}
	
	public enum Speakers implements ApplianceCriteria {
		POWER_CONSUMPTION("powerConsumption"),
		NUMBER_OF_SPEAKERS("numberOfSpeakers"),
		FREQUENCY_RANGE("frequencyRange"),
		CORD_LENGTH("cordLength");

		private final String name;

		Speakers(String name) {
			this.name = name;
		}

		@Override
		public String getName() {
			return name;
		}

		public static String getGroupName() {
			return "Speakers";
		}
	}

	public enum Kettle implements ApplianceCriteria{
		POWER_CONSUMPTION("powerConsumption"),
		WATER_CAPACITY("waterCapacity"),
		COLOR("color");

		private final String name;

		Kettle(String name) {
			this.name = name;
		}

		@Override
		public String getName() {
			return name;
		}

		public static String getGroupName() {
			return "Kettle";
		}
	}

	private SearchCriteria() {}
}

