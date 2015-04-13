package com.citi.citigate.service;
import java.io.File;
import java.io.IOException;
import java.util.*;
import java.io.*;

import org.apache.commons.io.FileUtils;
import org.apache.commons.io.filefilter.IOFileFilter;
import org.apache.commons.io.filefilter.TrueFileFilter;

import com.citi.citigate.rest.resource.Node;
public class FileBrowser {
	
	public static void main(String[] args) throws IOException {
		String searchDir = "/Users/vijikamal/ftp";
		File dir = new File(searchDir);

		System.out.println("Getting all files in " + dir.getCanonicalPath() + " including those in subdirectories");
		Collection<File> fileList =  FileUtils.listFilesAndDirs(dir, new IOFileFilter() {
			
			@Override
			public boolean accept(File dir, String name) {
				if(dir.isDirectory() && dir.canRead())
					return true;
				return false;
			}
			
			@Override
			public boolean accept(File file) {
				if(file.isDirectory() && file.canRead())
					return true;
				return false;

			}
		}, TrueFileFilter.INSTANCE);
		
		List<String> fileListStr = new ArrayList<String>();
		for(File file: fileList){
			
			if(!searchDir.equals(file.getCanonicalPath()))
				fileListStr.add(file.getCanonicalPath());
		}
		
		Collections.sort(fileListStr);
		
		System.out.println(fileListStr);
		
		
		
	}
	
//	/**
//	  * Demonstrate use.
//	  * 
//	  * @param aArgs - <tt>aArgs[0]</tt> is the full name of an existing 
//	  * directory that can be read.
//	  */
//	  public static void main(String... aArgs) throws FileNotFoundException {
//	    File startingDirectory= new File(aArgs[0]);
//	    FileBrowser listing = new FileBrowser();
//	    List<File> files = listing.getFileListing(startingDirectory);
//
//	    //print out all file names, in the the order of File.compareTo()
//	    for(File file : files){
//	      System.out.println(file);
//	    }
//	  }
	  
//	  /**
//	  * Recursively walk a directory tree and return a List of all
//	  * Files found; the List is sorted using File.compareTo().
//	  *
//	  * @param aStartingDir is a valid directory, which can be read.
//	  */
//	  public List<File> getFileListing(
//	    File aStartingDir
//	  ) throws FileNotFoundException {
//	    validateDirectory(aStartingDir);
//	    List<File> result = getFileListingNoSort(aStartingDir);
//	    Collections.sort(result);
//	    return result;
//	  }
//
//	  // PRIVATE
//
//	  private Node getFileListingNoSort(
//	    File aStartingDir
//	  ) throws FileNotFoundException {
//	    File[] filesAndDirs = aStartingDir.listFiles();
//	    List<File> filesDirs = Arrays.asList(filesAndDirs);
//	    for(File file : filesDirs) {
//	      result.add(file); //always add, even if directory
//	      if (! file.isDirectory() && !file.canRead()) {
//	        //must be a directory
//	        //recursive call!
//	        List<File> deeperList = getFileListingNoSort(file);
//	        result.addAll(deeperList);
//	      }
//	    }
//	    return result;
//	  }
//
//	  /**
//	  * Directory is valid if it exists, does not represent a file, and can be read.
//	  */
//	  private void validateDirectory (
//	    File aDirectory
//	  ) throws FileNotFoundException {
//	    if (aDirectory == null) {
//	      throw new IllegalArgumentException("Directory should not be null.");
//	    }
//	    if (!aDirectory.exists()) {
//	      throw new FileNotFoundException("Directory does not exist: " + aDirectory);
//	    }
//	    if (!aDirectory.isDirectory()) {
//	      throw new IllegalArgumentException("Is not a directory: " + aDirectory);
//	    }
//	    if (!aDirectory.canRead()) {
//	      throw new IllegalArgumentException("Directory cannot be read: " + aDirectory);
//	    }
//	  }
//	
	
}
