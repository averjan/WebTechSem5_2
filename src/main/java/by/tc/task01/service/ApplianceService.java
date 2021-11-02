package by.tc.task01.service;

import by.tc.task01.entity.Appliance;
import by.tc.task01.entity.criteria.Criteria;

import java.util.Comparator;
import java.util.List;

public interface ApplianceService {	
	
	List<Appliance> find(Criteria criteria);

	List<Appliance> getSorted(Comparator<Appliance> comparator);

	List<Appliance> getMin(Comparator<Appliance> comparator);

	void save(List<Appliance> appliances);
}
