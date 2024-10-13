package com.assignment.submission.AssignmentSubmission.Service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.assignment.submission.AssignmentSubmission.domain.User;
import com.assignment.submission.AssignmentSubmission.util.CustomPasswordEncoder;

@Service
public class UserDetailsServiceImpl implements UserDetailsService
{
	@Autowired
	private CustomPasswordEncoder passwordEncoder;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException
	{
		User user = new User();
		user.setUsername(username);
		user.setPassword(passwordEncoder.getPasswordEncoder().encode("Saloni2310"));
		user.setId(1L);
		return user;
	}
	
}
