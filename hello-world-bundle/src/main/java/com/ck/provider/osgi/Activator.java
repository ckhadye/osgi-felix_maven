package com.ck.provider.osgi;

import org.apache.commons.lang3.StringUtils;
import org.osgi.framework.BundleActivator;
import org.osgi.framework.BundleContext;

public class Activator implements BundleActivator {

	public void start(BundleContext ctx) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Bundle HelloWorld Activated");
		String name = "chetan";
		System.out.println(StringUtils.isBlank(name) ? "Hi anonymous" : "Hi "+name);
	}

	public void stop(BundleContext ctx) throws Exception {
		// TODO Auto-generated method stub
		System.out.println("Bundle HelloWorld De-Activated");
	}

}
