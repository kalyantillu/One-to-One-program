package com.example.firstdynamic.security;

import java.util.Collection;
import java.util.HashSet;
import java.util.Set;
import java.util.stream.Collectors;

import org.aspectj.weaver.NewConstructorTypeMunger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.example.firstdynamic.Entity.details;
import com.example.firstdynamic.Repo.repodetails;

@Service
public class CustomUserDetails implements UserDetailsService{

	@Autowired
	private repodetails repo1;
	
	@Override
	public UserDetails loadUserByUsername(String email) throws UsernameNotFoundException {
       details d = repo1.findByEmail(email).orElseThrow(
    		   ()-> new UsernameNotFoundException(String.format("User with email : %s is not found", email)));
       Set<String> roles = new HashSet<String>();
       roles.add("ROLE_ADMIN");
		return new User(d.getEmail(), d.getPassword(), userAuthorities(roles));
	}

	private Collection <? extends GrantedAuthority > userAuthorities(Set<String> roles)
	{
		return roles.stream().map(
				role -> new SimpleGrantedAuthority(role)
				).collect(Collectors.toList());
	}
}
