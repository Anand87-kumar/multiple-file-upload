package com.anand.service;

import java.util.List;

import com.anand.modal.FileModal;

public interface FileService {
	List<FileModal> getAllFiles();
	void saveAllFilesList(List<FileModal> fileList);
}

