package com.ck.consumer;

import org.ck.HelloWorldService;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;
import org.osgi.util.tracker.ServiceTracker;

public class Activator implements BundleActivator{
	 private ServiceTracker serviceTracker;
	public void start(BundleContext ctx) throws Exception {
		// TODO Auto-generated method stub
		serviceTracker = new ServiceTracker(ctx, HelloWorldService.class.getName(), null);
		System.out.println("Consumer Bundle Started!");
		serviceTracker.open();
		HelloWorldService service = (HelloWorldService) serviceTracker.getService();
		String message = service.getMessage("chetan");
		System.out.println(message);
//		serviceTracker.getSer
	}

	public void stop(BundleContext ctx) throws Exception {
		// TODO Auto-generated method stub
		
	}

}
