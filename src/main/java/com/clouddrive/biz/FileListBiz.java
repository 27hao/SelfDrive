package com.clouddrive.biz;

import java.util.LinkedHashMap;
import java.util.Vector;

import com.clouddrive.entity.FileMessage;

public interface FileListBiz {
	Vector<FileMessage> getFilesByTypeAndUser(String userName, String type);

	Vector<FileMessage> getFilesByPathAndUser(String path, String userName);

	String getLastPath(String path);

	LinkedHashMap<String, String> getPaths(String path);
}
