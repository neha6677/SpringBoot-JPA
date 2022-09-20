package com.jpa.test;

import java.util.List;
import java.util.Optional;
import java.util.function.Consumer;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

import com.jpa.test.dao.UserRepository;
import com.jpa.test.entities.User;

@SpringBootApplication
public class BootjpaexampleApplication {

	public static void main(String[] args) {
		ApplicationContext context = SpringApplication.run(BootjpaexampleApplication.class, args);
		UserRepository userRepository = context.getBean(UserRepository.class);
		
		//Spring data jpa
		 //create user
		/*
		 * User user = new User(); user.setName("Nisha Kaur"); user.setCity("Pune");
		 * user.setStatus("active"); User user1 = new User();
		 * user1.setName("Neelu Thakur"); user1.setCity("Bhopal");
		 * user1.setStatus("not active");
		 * 
		 * List<User> users = List.of(user,user1); Iterable<User> saveAll =
		 * userRepository.saveAll(users); saveAll.forEach(n->System.out.println(n));
		 */		
		
		
		 //update the user
		 
			/*
			 * Optional<User> userinfo = userRepository.findById(4); User user =
			 * userinfo.get(); user.setCity("Nepal"); User updated =
			 * userRepository.save(user); System.out.println(updated);
			 */
		
		
		 //to get data retrieve data
		
			/*
			 * Iterable<User> getallusers = userRepository.findAll();
			 * getallusers.forEach(new Consumer<User>() {
			 * 
			 * @Override public void accept(User t) { System.out.println(t);
			 * 
			 * } });
			 */
		
		
		//delete
		/*
		 * Optional<User> userId = userRepository.findById(1); User id = userId.get();
		 * userRepository.delete(id); System.out.println("deleted");
		 */
		
		List<User> names = userRepository.findByName("Neelu Thakur");
		names.forEach(n->System.out.println(n));
	
		List<User> userwithnameandcity = userRepository.findByNameAndCity("Nisha Kaur", "Pune");
		userwithnameandcity.forEach(System.out::println);
	}

}
