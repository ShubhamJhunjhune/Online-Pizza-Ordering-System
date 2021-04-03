/**
 * 
 */
package com.app.service;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.app.custom_excs.CustomerHandlingException;
import com.app.dao.UserRepository;
import com.app.pojos.User;

@Service
@Transactional
public class UserServiceImpl implements IUserService {
@Autowired
private UserRepository userRepo;
	@Override
	public User authenticateUser(String email, String pass) {
		User user = new User();
		user = userRepo.authenticateUser(email, pass)
				.orElseThrow(() -> new CustomerHandlingException("Error in authentication of user"));
		return user;
	}

}
 