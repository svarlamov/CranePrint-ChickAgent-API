package org.craneprint.chickagent.files;

import java.util.ArrayList;

public class PersistentFileManager {
	private GCodeFile currentJob = null;
	
	public void initPreviousFiles(){
		//TODO: Load all files in the working directory to be loaded into the queue
	}
	
	public void setupNewJob(GCodeFile f){
		if(currentJob != null)
			currentJob.deleteFile();
		currentJob = f;
	}
	public GCodeFile getFile(){
		return currentJob;
	}
}
