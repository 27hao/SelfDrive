package com.clouddrive.biz;

public interface FileManageBiz {
	// ɾ���ļ�
    boolean delFile(String url, String path);

	// �½��ļ���
    boolean mkdirFolder(String savePath, String fileName, String userName);

}
