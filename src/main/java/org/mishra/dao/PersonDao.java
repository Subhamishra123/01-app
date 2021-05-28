package org.mishra.dao;

import org.springframework.context.annotation.Primary;
import org.springframework.stereotype.Repository;

@Repository("pdao")
public class PersonDao implements UserDao {
	@Override
	public String getUserNameById(Integer i) {
		if(i==101) {
			return "Dickesh";
		}else if(i==102) {
			return "Chotya";
		}
		return null;
	}
}
