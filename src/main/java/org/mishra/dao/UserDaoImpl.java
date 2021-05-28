package org.mishra.dao;

import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Repository;

@Repository("udao")
public class UserDaoImpl implements UserDao {

	@Override
	public String getUserNameById(Integer i) {
		// TODO Auto-generated method stub
		if(i==101) {
			return "Cheese";
		}
		else if(i==102) {
			return "Sumit";
		}
		return null;
	}

}
