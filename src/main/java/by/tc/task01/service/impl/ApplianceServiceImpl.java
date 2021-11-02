package by.tc.task01.service.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.dao.DAOFactory;
import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;
import by.tc.task01.service.ApplianceService;
import by.tc.task01.service.validation.Validator;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

/**
 * The type of appliance xml service.
 */
public class ApplianceServiceImpl implements ApplianceService{

	/**
	 * Searches for appliances by criteria.
	 *
	 * @param criteria the criteria for search
	 * @return list of found appliances
	 */
	@Override
	public List<Appliance> find(Criteria criteria) {
		if (!Validator.criteriaValidator(criteria)) {
			return null;
		}
		
		DAOFactory factory = DAOFactory.getInstance();
		ApplianceDAO applianceDAO = factory.getApplianceDAO();
		
		return applianceDAO.find(criteria);
	}

	/**
	 * Gets sorted by comparator appliances.
	 *
	 * @param comparator for sorting appliances
	 * @return list of sorted by comparator appliances
	 */
	@Override
	public List<Appliance> getSorted(Comparator<Appliance> comparator) {
		DAOFactory factory = DAOFactory.getInstance();
		List<Appliance> appliances = factory.getApplianceDAO().getAll();
		appliances.sort(comparator);
		return appliances;
	}

	/**
	 * Gets minimal appliances by criteria.
	 *
	 * @param comparator defines minimal value criteria
	 * @return list of appliances with minimal criteria defined by comparator
	 */
	@Override
	public List<Appliance> getMin(Comparator<Appliance> comparator) {
		DAOFactory factory = DAOFactory.getInstance();
		List<Appliance> appliances = factory.getApplianceDAO().getAll();
		Optional<Appliance> mins = appliances.stream().min(comparator);
		Appliance min = mins.orElse(null);
		if (min != null) {
			return appliances.stream().filter(
					p -> comparator.compare(p, min) == 0)
					.collect(Collectors.toList());
		}

		return new ArrayList<>();
	}

	/**
	 * Appends appliances to xml file.
	 *
	 * @param appliances the list of appliances to add to model
	 */
	@Override
	public void save(List<Appliance> appliances) {
		DAOFactory factory = DAOFactory.getInstance();
		factory.getApplianceDAO().save(appliances);
	}

}
