package org.craneprint.chickagent.files;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

import org.json.simple.JSONObject;

public class HandleFile {
	public GCodeFile buildFileFromJSON(JSONObject jo, String fileFolder){
		String f = (String)jo.get("file");
		System.out.println("FILE: " + f);
		File file =  new File(fileFolder + (String)jo.get("name"));
		try {
			writeFile(f, file);
		} catch (IOException e) {
			e.printStackTrace();
		}
		return new GCodeFile(file, (String)jo.get("name"), (String)jo.get("user"), (String)jo.get("notes"));
	}
	
	private void writeFile(String text, File fi) throws IOException {
		fi.getParentFile().mkdirs();
	    BufferedWriter output = new BufferedWriter(new FileWriter(fi));
	    output.write(text);
	    output.close();
	}
}
