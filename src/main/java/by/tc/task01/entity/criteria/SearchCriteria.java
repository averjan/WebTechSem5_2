package by.tc.task01.entity.criteria;

public final class SearchCriteria {

	/**
	 * Enum for oven criteria
	 */
	public enum Oven implements ApplianceCriteria {

		/**
		 * Power consumption oven.
		 */
		POWER_CONSUMPTION("powerConsumption"),
		/**
		 * Weight oven.
		 */
		WEIGHT("weight"),
		/**
		 * Capacity oven.
		 */
		CAPACITY("capacity"),
		/**
		 * Depth oven.
		 */
		DEPTH("depth"),
		/**
		 * Height oven.
		 */
		HEIGHT("height"),
		/**
		 * Width oven.
		 */
		WIDTH("width");

		private final String name;

		/**
		 * Enum constructor specifying string representation
		 *
		 * @param name string representation
		 */
		Oven(String name) {
			this.name = name;
		}

		/**
		 * @return string representation of criteria name
		 */
		@Override
		public String getName() {
			return name;
		}

		/**
		 * @return group name
		 */
		public String getGroupName() {
			return "Oven";
		}
	}

	/**
	 * Enum for laptop criteria
	 */
	public enum Laptop implements ApplianceCriteria {

		/**
		 * Battery capacity laptop.
		 */
		BATTERY_CAPACITY("batteryCapacity"),
		/**
		 * Os laptop.
		 */
		OS("os"),
		/**
		 * Memory rom laptop.
		 */
		MEMORY_ROM("memoryRom"),
		/**
		 * System memory laptop.
		 */
		SYSTEM_MEMORY("systemMemory"),
		/**
		 * Cpu laptop.
		 */
		CPU("CPU"),
		/**
		 * Display inches laptop.
		 */
		DISPLAY_INCHS("displayInches");

		private final String name;

		/**
		 * Enum constructor specifying string representation
		 *
		 * @param name string representation
		 */
		Laptop(String name) {
			this.name = name;
		}

		/**
		 * @return string representation of criteria name
		 */
		@Override
		public String getName() {
			return name;
		}

		/**
		 * @return group name
		 */
		public static String getGroupName() {
			return "Laptop";
		}
	}

	/**
	 * Enum for refrigerator criteria
	 */
	public enum Refrigerator implements ApplianceCriteria {

		/**
		 * Power consumption refrigerator.
		 */
		POWER_CONSUMPTION("powerConsumption"),
		/**
		 * Weight refrigerator.
		 */
		WEIGHT("weight"),
		/**
		 * Freezer capacity refrigerator.
		 */
		FREEZER_CAPACITY("freezerCapacity"),
		/**
		 * Overall capacity refrigerator.
		 */
		OVERALL_CAPACITY("overallCapacity"),
		/**
		 * Height refrigerator.
		 */
		HEIGHT("height"),
		/**
		 * Width refrigerator.
		 */
		WIDTH("width");

		private final String name;

		/**
		 * Enum constructor specifying string representation
		 *
		 * @param name string representation
		 */
		Refrigerator(String name) {
			this.name = name;
		}

		/**
		 * @return string representation of criteria name
		 */
		@Override
		public String getName() {
			return name;
		}

		/**
		 * @return group name
		 */
		public static String getGroupName() {
			return "Refrigerator";
		}
	}

	/**
	 * Enum for vacuum cleaner criteria.
	 */
	public enum VacuumCleaner implements ApplianceCriteria {

		/**
		 * Power consumption vacuum cleaner.
		 */
		POWER_CONSUMPTION("powerConsumption"),
		/**
		 * Filter type vacuum cleaner/
		 */
		FILTER_TYPE("filterType"),
		/**
		 * Bag type vacuum cleaner.
		 */
		BAG_TYPE("bagType"),
		/**
		 * Wand type vacuum cleaner.
		 */
		WAND_TYPE("wandType"),
		/**
		 * Motor speed regulation vacuum cleaner.
		 */
		MOTOR_SPEED_REGULATION("motorSpeedRegulation"),
		/**
		 * Cleaning width vacuum cleaner.
		 */
		CLEANING_WIDTH("cleaningWidth");

		private final String name;

		/**
		 * Enum constructor specifying string representation
		 *
		 * @param name string representation
		 */
		VacuumCleaner(String name) {
			this.name = name;
		}

		/**
		 * @return string representation of criteria name
		 */
		@Override
		public String getName() {
			return name;
		}

		/**
		 * @return group name
		 */
		public static String getGroupName() {
			return "VacuumCleaner";
		}
	}

	/**
	 * Enum for tabletPC criteria
	 */
	public enum TabletPC implements ApplianceCriteria {
		/**
		 * Battery capacity tablet pc.
		 */
		BATTERY_CAPACITY("batteryCapacity"),
		/**
		 * Display inches tablet pc.
		 */
		DISPLAY_INCHES("displayInches"),
		/**
		 * Memory rom tablet pc.
		 */
		MEMORY_ROM("memoryRom"),
		/**
		 * Flash memory capacity tablet pc.
		 */
		FLASH_MEMORY_CAPACITY("flashMemoryCapacity"),
		/**
		 * Color tablet pc.
		 */
		COLOR("color");

		private final String name;

		/**
		 * Enum constructor specifying string representation
		 *
		 * @param name string representation
		 */
		TabletPC(String name) {
			this.name = name;
		}

		/**
		 * @return string representation of criteria name
		 */
		@Override
		public String getName() {
			return name;
		}

		/**
		 * @return group name
		 */
		public static String getGroupName() {
			return "TabletPC";
		}
	}

	/**
	 * Enum for speakers criteria
	 */
	public enum Speakers implements ApplianceCriteria {
		/**
		 * Power consumption teapot.
		 */
		POWER_CONSUMPTION("powerConsumption"),
		/**
		 * Number of speakers speakers.
		 */
		NUMBER_OF_SPEAKERS("numberOfSpeakers"),
		/**
		 * Frequency range speakers.
		 */
		FREQUENCY_RANGE("frequencyRange"),
		/**
		 * Cord length speakers.
		 */
		CORD_LENGTH("cordLength");

		private final String name;

		/**
		 * Enum constructor specifying string representation
		 *
		 * @param name string representation
		 */
		Speakers(String name) {
			this.name = name;
		}

		/**
		 * @return string representation of criteria name
		 */
		@Override
		public String getName() {
			return name;
		}

		/**
		 * @return group name
		 */
		public static String getGroupName() {
			return "Speakers";
		}
	}

	/**
	 * Enum for kettle criteria
	 */
	public enum Kettle implements ApplianceCriteria{
		/**
		 * Power consumption kettle.
		 */
		POWER_CONSUMPTION("powerConsumption"),
		/**
		 * Water capacity kettle.
		 */
		WATER_CAPACITY("waterCapacity"),
		/**
		 * Color kettle.
		 */
		COLOR("color");

		private final String name;

		/**
		 * Enum constructor specifying string representation
		 *
		 * @param name string representation
		 */
		Kettle(String name) {
			this.name = name;
		}

		/**
		 * @return string representation of criteria name
		 */
		@Override
		public String getName() {
			return name;
		}

		/**
		 * @return group name
		 */
		public static String getGroupName() {
			return "Kettle";
		}
	}

	/**
	 * Private constructor.
	 */
	private SearchCriteria() {}
}

