package com.clouddrive.dao;

import java.util.Vector;

import com.clouddrive.entity.FileMessage;

public interface FileDao {
	// ͳ���ļ�����
    int countFiles();

	// �����ļ�
    Vector<FileMessage> findFilesByPathAndUser(String path, String userName);

	Vector<FileMessage> findFilesByTypeAndUser(String type, String user);

	// ����ļ�
    int insert(FileMessage file);

	// ɾ���ļ�
    int delFileByUuidName(String uuidName);

	// ɾ���ļ���
    int delFolder(String path, String fileName);
}
