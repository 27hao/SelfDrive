package com.clouddrive.biz;

import com.clouddrive.entity.User;

public interface LoginBiz {
	User login(String username, String password);
}
