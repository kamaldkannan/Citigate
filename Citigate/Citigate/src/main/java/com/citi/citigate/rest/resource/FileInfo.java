package com.citi.citigate.rest.resource;

import java.util.Date;

public class FileInfo {
public FileInfo(String fileName, Date creationDate, Date modifiedDate,
		int size, String location) {
	super();
	this.fileName = fileName;
	this.creationDate = creationDate;
	this.modifiedDate = modifiedDate;
	this.size = size;
	this.location = location;
}
public String getFileName() {
	return fileName;
}
public void setFileName(String fileName) {
	this.fileName = fileName;
}
public Date getCreationDate() {
	return creationDate;
}
public void setCreationDate(Date creationDate) {
	this.creationDate = creationDate;
}
public Date getModifiedDate() {
	return modifiedDate;
}
public void setModifiedDate(Date modifiedDate) {
	this.modifiedDate = modifiedDate;
}
public int getSize() {
	return size;
}
public void setSize(int size) {
	this.size = size;
}
public String getLocation() {
	return location;
}
public void setLocation(String location) {
	this.location = location;
}
String fileName ;

Date creationDate;
Date modifiedDate;
int size;
String location;
}
