package com.craneprint.chickagent.tcp;

import java.io.PrintWriter;

import com.craneprint.chickagent.tcp.AuthenticateConnection;
import com.craneprint.chickagent.tcp.PrinterStatus;
import org.json.simple.JSONObject;

public class RespondHandShake {
	public static JSONObject respond(JSONObject j){
		// TODO: Use actual data
		String pw = (String)j.get("password");
		boolean auth = AuthenticateConnection.authenticatePassword(pw);
		if(auth){
			JSONObject obj = new JSONObject();
			obj.put("notes", "We Will Be Down for Scheduled Maintenance Next Monday, All Day.");
			obj.put("status", PrinterStatus.READY_CODE);
			//obj.put("queueSize", "2 Hours");
			JSONObject tools = new JSONObject();
			tools.put("tool0", "Blue, ABS");
			tools.put("tool1", "Clear, ABS");
			obj.put("tools", tools);
			return obj;
		}
		else {
		    JSONObject obj = new JSONObject();
		    obj.put("status", "-3");
		    return obj;
		}
	}
}
