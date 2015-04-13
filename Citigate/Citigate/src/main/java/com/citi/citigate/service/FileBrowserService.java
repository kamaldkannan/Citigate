package com.citi.citigate.service;

import java.util.List;

import org.springframework.stereotype.Service;

import com.citi.citigate.rest.resource.FileInfo;
import com.citi.citigate.rest.resource.Node;

public interface FileBrowserService {
	public List<Node> getDirectoryStructure();
	public List<FileInfo> getFiles();
}
