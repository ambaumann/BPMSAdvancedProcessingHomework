package com.solarvillage.permit.wih;

import java.util.HashMap;
import java.util.Map;

import org.kie.api.runtime.process.WorkItem;
import org.kie.api.runtime.process.WorkItemHandler;
import org.kie.api.runtime.process.WorkItemManager;
import org.kie.internal.runtime.Cacheable;

public class ResidentialElectricPermitWorkItemHandler implements WorkItemHandler, Cacheable {

	public void abortWorkItem(WorkItem arg0, WorkItemManager arg1) {
		// TODO Auto-generated method stub
		
	}

	public void executeWorkItem(WorkItem workItem, WorkItemManager manager) {
		System.out.println("Stubbing Residential Electric Permit Work Item Handler");
		Map<String, Object> output = new HashMap<String, Object>();
		String action = (String) workItem.getParameter("Action");
		Boolean pass = Boolean.parseBoolean((String)workItem.getParameter("Pass"));
		if(action.equalsIgnoreCase("Apply")){
			output.put("result", pass);
	        manager.completeWorkItem(workItem.getId(), output);
		}else if(action.equalsIgnoreCase("Rescind")){
			output.put("result", pass);
	        manager.completeWorkItem(workItem.getId(), output);
		}
		
	}

	public void close() {
		// TODO Auto-generated method stub
		
	}

}
