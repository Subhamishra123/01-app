package org.mishra.service;

import org.mishra.dao.UserDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Service;

@Service
public class UserService {
	@Autowired
	@Qualifier("pdao")
	private UserDao dao;
	public void printUserName()
	{
		System.out.println(dao.getUserNameById(102));
	}

}
