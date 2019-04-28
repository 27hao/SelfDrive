package com.clouddrive.dao;

import java.util.Vector;

import com.clouddrive.entity.Share;

public interface ShareDao {
	// ���ҷ���
    int countShare();

	int countShareByKey(String key);

	int countShareByUuidName(String uuidName);

	Share findShareByKey(String key);

	Vector<Share> findShareByUser(String name);

	Vector<Share> getHotShare();

	// ��ӷ���
    int insert(Share share);

	// ���·���
    int updateDownloadByKey(String key);

	// ɾ������
    int delShareByKey(String key);

	int delShareByUuidName(String uuidName);

	String findKeyByUuidName(String uuidName);

	// ͳ����������
    int countDownloads();
}
