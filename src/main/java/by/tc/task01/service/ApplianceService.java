package by.tc.task01.service;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

import java.util.Comparator;
import java.util.List;

/**
 * Interface for appliance services.
 */
public interface ApplianceService {

	/**
	 * Searches for appliances by criteria.
	 *
	 * @param criteria the criteria for search
	 * @return list of found appliances
	 */
	List<Appliance> find(Criteria criteria);

	/**
	 * Gets sorted by comparator appliances.
	 *
	 * @param comparator for sorting appliances
	 * @return list of sorted by comparator appliances
	 */
	List<Appliance> getSorted(Comparator<Appliance> comparator);

	/**
	 * Gets minimal appliances by criteria.
	 *
	 * @param comparator defines minimal value criteria
	 * @return list of appliances with minimal criteria defined by comparator
	 */
	List<Appliance> getMin(Comparator<Appliance> comparator);

	/**
	 * Appends appliances to model.
	 *
	 * @param appliances the list of appliances to add to model
	 */
	void save(List<Appliance> appliances);
}
