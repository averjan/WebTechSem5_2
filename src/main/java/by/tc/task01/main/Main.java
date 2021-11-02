package by.tc.task01.main;


import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.ServiceFactory;

import java.util.Comparator;
import java.util.List;

/**
 * The Main type
 */
public class Main {

	/*
	private static List<Appliance> appliancesInitDataList = Arrays.asList(
			new Kettle("Holt HT-KT-001", 79, 2200, 2, Color.Black),
			new Kettle("Maxwell MW-1077ST", 47.10, 2200, 1.8, Color.White),
			new Refrigerator("LG DoorCooling+ GA-B459SMUM", 1920, 262, 59.5, 107, 341, 1, 1),
			new Refrigerator("Haier C2F636CWRG", 1699, 342, 80, 108, 364, 1, 1),
			new Oven("SAMSUNG MG23F302TQS/BW", 349, 300, 13.5, 23, 1, 1, 1),
			new Oven("HORIZONT 20MW700-1378BIS", 165, 300, 10.5, 20, 1, 1, 1),
			new TabletPC("Samsung Galaxy Tab A7 LTE 64GB (SM-T505NZAESER)", 769,
					7040, 10.4, 65, 12, Color.Grey),
			new TabletPC("Xiaomi Pad 5 6GB/128GB Pearl White RU", 1199,
					8720, 11, 128, 12, Color.Red)
	);
	*/

	/**
	 * The entry point of the application.
	 *
	 * @param args arguments of command line
	 */
	public static void main(String[] args) {
		List<Appliance> appliances;
		ServiceFactory factory = ServiceFactory.getInstance();
		ApplianceService service = factory.getApplianceService();
		Criteria kettleCriteria = new Criteria(SearchCriteria.Kettle.getGroupName());
		appliances = service.find(kettleCriteria);
		if (appliances == null) {
			System.out.println("Invalid criteria");
		}
		else {
			System.out.println("All kettles: ");
			PrintApplianceInfo.print(appliances);
		}

		System.out.println();
		appliances = service.getMin(Comparator.comparing(Appliance::getPrice));
		System.out.println("Appliances with minimal price: ");
		PrintApplianceInfo.print(appliances);
	}

}
