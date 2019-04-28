package com.clouddrive.biz.impl;

import java.io.File;
import java.text.SimpleDateFormat;
import java.util.Date;

import com.clouddrive.biz.FileManageBiz;
import com.clouddrive.dao.impl.FileDaoImpl;
import com.clouddrive.entity.FileMessage;

public class FileManageBizImpl implements FileManageBiz {

	FileDaoImpl fileDaoImpl = new FileDaoImpl();
	ShareManageBizImpl shareManage = new ShareManageBizImpl();

	@Override
	public boolean delFile(String url, String path) {
		File file = new File(url);
		if (!file.exists()) {
			// �ļ�������
			return false;
		}
		if (file.isDirectory()) {
			// ������ļ���
			System.out.println("ɾ���ļ���");
			boolean d = deleteDir(file, path);
			if (!d) {
				System.out.println("ɾ��ʧ�ܣ�");
				return false;
			}
		} else {
			System.out.println("ɾ���ļ�");
			return deleteFile(file);
		}
		return false;
	}

	// �ݹ�ɾ���ļ���
	private boolean deleteDir(File dir, String path) {
		if (dir.isDirectory()) {
			String[] children = dir.list();
			// �ݹ�ɾ��Ŀ¼�е���Ŀ¼��
			for (int i = 0; i < children.length; i++) {
				boolean success = deleteDir(new File(dir, children[i]), path + "/" + dir.getName());
				if (!success) {
					return false;
				}
			}
			// Ŀ¼��ʱΪ�գ�����ɾ��
			String url = dir.getPath();
			System.out.println(url);
			String fileName = dir.getName();
			System.out.println("fileName:" + fileName);
			System.out.println("path:" + path);
			fileDaoImpl.delFolder(path, fileName);
			return dir.delete();
		}
		// ɾ���ļ�
		return deleteFile(dir);
	}

	// ɾ���ļ�
	private boolean deleteFile(File file) {
		String uuidName = file.getName();
		fileDaoImpl.delFileByUuidName(uuidName);
		shareManage.delShareByUuidName(uuidName);
		return file.delete();
	}

	@Override
	public boolean mkdirFolder(String savePath, String fileName, String userName) {
		File folder = new File(savePath);
		if (!folder.exists() || !folder.isDirectory()) {
			System.out.println(savePath + "Ŀ¼�����ڣ���Ҫ����");
			folder.mkdirs();
		}
		File newFolder = new File(savePath + "/" + fileName);
		newFolder.mkdirs();
		String type = "folder";
		Date date = new Date();
		SimpleDateFormat format = new SimpleDateFormat("yyyy-MM-dd HH:mm");
		String updateTime = format.format(date);
		System.out.println("fileName:" + fileName);
		FileMessage fileMessage = new FileMessage(fileName, updateTime, type, savePath, userName);

		FileDaoImpl fileDaoImpl = new FileDaoImpl();
        return fileDaoImpl.insert(fileMessage) != 0;
    }

}
