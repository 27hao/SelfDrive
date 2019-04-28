package com.clouddrive.biz;

import com.clouddrive.entity.Share;

public interface ShareManageBiz {
	String insertShare(String userName, String uuidName, String url, long size);

	Share getShareByKey(String key);

	boolean delShareByKey(String key);

	int delShareByUuidName(String uuidName);
}
