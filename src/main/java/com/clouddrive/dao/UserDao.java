package com.clouddrive.dao;

import java.util.Vector;

import com.clouddrive.entity.User;

public interface UserDao {

	int countUser();

	int countUserByName(String name);

	User findUserByName(String name);

	Vector<User> findUsersByName(String name);

	int insert(User user);
}
