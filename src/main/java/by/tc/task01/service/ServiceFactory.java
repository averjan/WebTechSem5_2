package by.tc.task01.service;

import by.tc.task01.service.impl.ApplianceServiceImpl;

/**
 * The type of factory for creating ApplianceService.
 */
public final class ServiceFactory {
	private static final ServiceFactory instance = new ServiceFactory();

	/**
	 * Private constructor.
	 */
	private ServiceFactory() {}

	/**
	 * Gets new ApplianceService object.
	 *
	 * @return mew ApplianceService object.
	 */
	public ApplianceService getApplianceService() {

		return new ApplianceServiceImpl();
	}

	/**
	 * Gets current ServiceFactory object.
	 *
	 * @return instance of ServiceFactory
	 */
	public static ServiceFactory getInstance() {
		return instance;
	}

}
