package by.tc.task01.dao;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

import java.util.List;

/**
 * Interface for appliance DAOs.
 */
public interface ApplianceDAO {

	/**
	 * Searches for appliances by criteria.
	 *
	 * @param criteria the criteria for search
	 * @return list of found appliances
	 */
	List<Appliance> find(Criteria criteria);

	/**
	 * Get all appliances.
	 *
	 * @return list of all appliances
	 */
	List<Appliance> getAll();

	/**
	 * Saves appliances into db.
	 *
	 * @param appliances list of appliances to save into db
	 */
	void save(List<Appliance> appliances);

}
