package by.tc.task01.main;

import by.tc.task01.entity.Appliance;

import java.util.List;

/**
 * The type PrintApplianceInfo for printing appliance info
 */
public class PrintApplianceInfo {

	/**
	 * Private constructor.
	 */
	private PrintApplianceInfo() {
	}

	/**
	 * Prints list of appliances.
	 *
	 * @param appliances to print
	 */
	public static void print(List<Appliance> appliances) {
		for (Appliance appliance : appliances) {
			System.out.println(appliance);
		}
	}

}
