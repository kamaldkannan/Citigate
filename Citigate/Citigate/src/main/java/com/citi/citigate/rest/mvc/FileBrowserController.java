package com.citi.citigate.rest.mvc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.citi.citigate.rest.resource.FileInfo;
import com.citi.citigate.rest.resource.Node;
import com.citi.citigate.service.FileBrowserService;

@RestController
@RequestMapping(value = "/rest")
public class FileBrowserController {
	private FileBrowserService fileBrowserService;

    @Autowired
    public FileBrowserController(FileBrowserService fileBrowserService) {
        this.fileBrowserService = fileBrowserService;
    }
    
	@RequestMapping(value = "directoryStructure", method = RequestMethod.GET)
	public List<Node> getDirectoryStructure() {
		List<Node> node = fileBrowserService.getDirectoryStructure();
		return node;
	}
	
	@RequestMapping(value = "files", method = RequestMethod.GET)
	public List<FileInfo> getFiles() {
		List<FileInfo> fileList = fileBrowserService.getFiles();
		return fileList;
	}
    
}
