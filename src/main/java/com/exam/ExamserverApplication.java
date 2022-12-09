package com.exam;

import com.exam.model.Role;
import com.exam.model.User;
import com.exam.model.UserRole;
import com.exam.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.HashSet;
import java.util.Set;

@SpringBootApplication
public class  ExamserverApplication  //implements CommandLineRunner {

	{
		@Autowired
		private UserService userService;

	public static void main(String[] args) {
		SpringApplication.run(ExamserverApplication.class, args);
	}




	//	@Override

	public void run(String... args) throws Exception {
		System.out.println("starting code");

//		User user = new User();
//		user.setFirstname("zzz");
//		user.setLastname("xxx");
//		user.setUsername("bbb");
//		user.setPassword("123");
//		user.setEmail("pj2410@gmail.com");
//		user.setProfile("temp.png");
//
//		Role role1 = new Role();
//		role1.setRoleId(46L);
//		role1.setRoleName("ADMIN");
//
//		Set<UserRole> userRoleSet = new HashSet<>();
//		UserRole userRole = new UserRole();
//		userRole.setRole(role1);
//		userRole.setUser(user);
//		userRoleSet.add(userRole);
//		User user1 = this.userService.createUser(user, userRoleSet);
//		System.out.println(user1.getUsername());
	}
}