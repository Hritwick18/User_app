package com.cp.users.service;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;



import static org.mockito.Mockito.when;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import com.cp.users.entities.User;
import com.cp.users.repository.UserRepository;


@ExtendWith(SpringExtension.class)
class UserServiceTest {

	@Mock
	private UserRepository repository;

	@InjectMocks
	private UserService service;

	@Test
	public void testGetUserInfo() {

		List<User> user = new ArrayList<>();
		user.add(new User(1, "Hritwick","hritwick.goya@gamil.com",21, 2.34));
		user.add(new User(2, "Ritik", "Ritik.goya@gamil.com",25, 2.34));
		when(repository.findAll()).thenReturn(user);
		assertEquals(user, service.getAllUsers());

	}

	@Test
	public void testFailGetUserInfo() {

		List<User> user = new ArrayList<>();
		user.add(new User(1, "Hritwick","hritwick.goya@gamil.com",21, 2.34));
		user.add(new User(2, "Ritik", "Ritik.goya@gamil.com",25, 2.34));
		when(repository.findAll()).thenReturn(user);
		assertNotEquals("not equal", service.getAllUsers());

	}

	@Test
	public void testGetUserById() {
		User user = new User(1, "Hritwick","hritwick.goya@gamil.com",21, 2.34);
		when(repository.findById(user.getUserid())).thenReturn(Optional.of(user));
		when(repository.save(user)).thenReturn(user);
		assertEquals(user, service.getUserById(user.getUserid()));
	}

	@Test
	public void testFailGetUserById() {
		User user = new User(1, "Hritwick","hritwick.goya@gamil.com",21, 2.34);
		when(repository.findById(user.getUserid())).thenReturn(Optional.of(user));
		when(repository.save(user)).thenReturn(user);
		assertNotEquals("not equal", service.getUserById(user.getUserid()));
	}

	@Test
	public void testFailAddUserBy() {
		User user = new User(1, "Hritwick","hritwick.goya@gamil.com",21, 2.34);
		when(repository.findById(user.getUserid())).thenReturn(Optional.of(user));
		when(repository.save(user)).thenReturn(user);
		assertEquals("User inserted successfully!", service.addUser(user));
	}

	@Test
	public void testFailAddUserById() {
		User user = new User(1, "Hritwick","hritwick.goya@gamil.com",21, 2.34);
		when(repository.findById(user.getUserid())).thenReturn(Optional.of(user));
		when(repository.save(user)).thenReturn(user);
		assertNotEquals("not equal", service.getUserById(user.getUserid()));
	}

	@Test
	public void testUpdateUserBy() {
		User user = new User(1, "Hritwick","hritwick.goya@gamil.com",21, 2.34);
		when(repository.findById(user.getUserid())).thenReturn(Optional.of(user));
		when(repository.save(user)).thenReturn(user);
		assertEquals("User updated successfully!!!", service.updateUserById(user, 1));
	}

	@Test
	public void testFailUpdateUserBy() {
		User user = new User(1, "Hritwick","hritwick.goya@gamil.com",21, 2.34);
		when(repository.findById(user.getUserid())).thenReturn(Optional.of(user));
		when(repository.save(user)).thenReturn(user);
		assertNotEquals("not equal", service.updateUserById(user, 1));
	}

}
