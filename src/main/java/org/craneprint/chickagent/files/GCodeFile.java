package org.craneprint.chickagent.files;

import java.io.File;

public class GCodeFile {
	// An object to represent uploaded gcode files
	private File file = null;
	private String name = "";
	private String user = "";
	private String notes = "";
	private boolean complete = false;
	
	public GCodeFile(File f, String n, String ns, String u){
		file = f;
		name = n;
		user = u;
		notes = ns;
	}
	
	public boolean deleteFile(){
		return file.delete();
	}
	
	public String getNotes(){
		return notes;
	}
	
	public void setComplete(){
		deleteFile();
		complete = true;
	}
	
	public File getFile(){
		return file;
	}
	
	public String getName(){
		return name;
	}
	
	public String getUser(){
		return user;
	}
}
