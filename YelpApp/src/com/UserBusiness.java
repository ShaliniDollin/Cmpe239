package com;

import java.util.List;


public class UserBusiness 
{
	private List<String> listbus;
	private List<String> listnear;
	
	private String user_id;
	
	public UserBusiness(String userid, List<String> listbus, List<String> listnear)
	{
		this.user_id = userid;
		this.listbus = listbus;
		this.listnear = listnear;
	}
	public String getUerid()
	{
		return user_id;
	}
	public List<String> getBusinessIDs()
	{
		return listbus;
	}
	public List<String> getNear()
	{
		return listnear;
	}
	
	
}
