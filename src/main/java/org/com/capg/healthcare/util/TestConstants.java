package org.com.capg.healthcare.util;

public class TestConstants {
	
	public static final String ADD_CENTER_URL= "/addcenter";
	
	public static final String CENTER_ADDED="Center added successfully ";
	
	public static final String DELETE_CENTER_URL= "/deletecenter/{centerId}";
	
	public static final String CENTER_DELETED="Center deleted successfully ";

	public static final String TEST_ADDED="Test added successfully for center ";
	
	public static final String TEST_NOT_FOUND="Test not found ";
	
	public static final String CENTER_NOT_FOUND="Center not found";
	
	public static final String ADD_TEST_URL= "addtest/{tid}/{cid}";
	
	public static final String VIEW_CENTER_BY_CENTERID_URL="/getcenter/centerid/{centerId}";
	
	public static final String VIEW_ALL_CENTERS_URL="/allcenters";
	
	public static final String VIEW_TEST_BY_CENTER_URL="viewtest/{cid}";
	
	public static final String VIEW_CENTER_BY_TEST="viewcenters/{tid}";

	public static final String NAME_ALREADY_EXIST = "Id already exist";
}
