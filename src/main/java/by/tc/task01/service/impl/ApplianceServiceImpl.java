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

public class ApplianceServiceImpl implements ApplianceService{

	@Override
	public List<Appliance> find(Criteria criteria) {
		if (!Validator.criteriaValidator(criteria)) {
			return null;
		}
		
		DAOFactory factory = DAOFactory.getInstance();
		ApplianceDAO applianceDAO = factory.getApplianceDAO();
		
		return applianceDAO.find(criteria);
	}

	@Override
	public List<Appliance> getSorted(Comparator<Appliance> comparator) {
		DAOFactory factory = DAOFactory.getInstance();
		List<Appliance> appliances = factory.getApplianceDAO().getAll();
		appliances.sort(comparator);
		return appliances;
	}

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

	@Override
	public void save(List<Appliance> appliances) {
		DAOFactory factory = DAOFactory.getInstance();
		factory.getApplianceDAO().save(appliances);
	}

}
