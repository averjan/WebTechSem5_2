package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.ApplianceCriteria;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.Arrays;
import java.util.Objects;
import java.util.Set;

public class Validator {
	
	public static boolean criteriaValidator(Criteria criteria) {
		return switch (criteria.getGroupSearchName()) {
			case "Kettle" -> checkIfCriteriaExists(criteria, SearchCriteria.Kettle.values());
			case "Laptop" -> checkIfCriteriaExists(criteria, SearchCriteria.Laptop.values());
			case "Oven" -> checkIfCriteriaExists(criteria, SearchCriteria.Oven.values());
			case "Refrigerator" -> checkIfCriteriaExists(criteria, SearchCriteria.Refrigerator.values());
			case "Speakers" -> checkIfCriteriaExists(criteria, SearchCriteria.Speakers.values());
			case "TabletPC" -> checkIfCriteriaExists(criteria, SearchCriteria.TabletPC.values());
			default -> false;
		};
	}

	private static boolean checkIfCriteriaExists(Criteria criteria, ApplianceCriteria[] existingCriteria) {
		Set<String> properties = criteria.getCriteria().keySet();
		return properties.stream().allMatch(p -> Arrays.stream(existingCriteria)
				.anyMatch(e -> Objects.equals(e.getName(), p)));
	}

}