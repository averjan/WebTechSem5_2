package by.tc.task01.service.validation;

import by.tc.task01.entity.criteria.ApplianceCriteria;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.entity.criteria.SearchCriteria;

import java.util.Arrays;
import java.util.Objects;
import java.util.Set;

/**
 * The type of criteria validator.
 */
public class Validator {

	/**
	 * Private constructor.
	 */
	private Validator() {
	}

	/**
	 * Checks if criteria is valid.
	 *
	 * @param criteria the criteria to validate
	 * @return boolean if valid
	 */
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

	/**
	 * Check if criteria exists for given group.
	 *
	 * @param criteria the criteria to find
	 * @param existingCriteria the existing criteria for given group
	 * @return
	 */
	private static boolean checkIfCriteriaExists(Criteria criteria, ApplianceCriteria[] existingCriteria) {
		Set<String> properties = criteria.getCriteria().keySet();
		return properties.stream().allMatch(p -> Arrays.stream(existingCriteria)
				.anyMatch(e -> Objects.equals(e.getName(), p)));
	}

}