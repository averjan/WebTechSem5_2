package by.tc.task01.dao.impl;

import by.tc.task01.dao.ApplianceDAO;
import by.tc.task01.entity.*;
import by.tc.task01.entity.criteria.Criteria;

import java.beans.XMLDecoder;
import java.beans.XMLEncoder;
import java.io.*;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

public class ApplianceDAOImpl implements ApplianceDAO{

	private static final String path = "src/main/resources/appliances.xml";

	@Override
	public List<Appliance> find(Criteria criteria) {
		ArrayList<Appliance> products = new ArrayList<>();
		Appliance product;
		try (XMLDecoder decoder = new XMLDecoder(new BufferedInputStream(new FileInputStream(ApplianceDAOImpl.path)))) {
			Set<String> properties = criteria.getCriteria().keySet();
			do {
				product = (Appliance) decoder.readObject();
				boolean isSuit = true;
				if (!criteria.getGroupSearchName().equals(product.getClass().getSimpleName())) {
					isSuit = false;
				}

				for (String prop : properties) {
					Field field = product.getClass().getDeclaredField(prop);
					field.setAccessible(true);
					Object fieldValue = field.get(product);
					if (!fieldValue.equals(criteria.getCriteria().get(prop))) {
						isSuit = false;
						break;
					}
				}

				if (isSuit) {
					products.add(product);
				}

			} while (product != null);
		} catch (ArrayIndexOutOfBoundsException e) {
		} catch (FileNotFoundException e) {
		} catch (NoSuchFieldException e) {
		} catch (IllegalAccessException e) {
		}

		return products;
	}

	@Override
	public List<Appliance> getAll() {
		ArrayList<Appliance> appliances = new ArrayList<>();
		Appliance appliance;
		try (XMLDecoder decoder = new XMLDecoder(new BufferedInputStream(new FileInputStream(ApplianceDAOImpl.path)))) {
			do {
				appliance = (Appliance) decoder.readObject();
				appliances.add(appliance);
			} while (appliance != null);
		} catch (ArrayIndexOutOfBoundsException e) {
		} catch (FileNotFoundException e) {
		}

		return appliances;
	}

	@Override
	public void save(List<Appliance> appliances) {
		try (XMLEncoder encoder = new XMLEncoder(new BufferedOutputStream(new FileOutputStream(ApplianceDAOImpl.path)))) {
			for (Appliance appliance: appliances) {
				encoder.writeObject(appliance);
			}

		} catch (ArrayIndexOutOfBoundsException e) {
		} catch (FileNotFoundException e) {
		}
	}
}