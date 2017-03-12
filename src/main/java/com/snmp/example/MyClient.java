package com.snmp.example;

import org.snmp4j.smi.OID;

public class MyClient {

	public static void main(String args[]) {
		try {
			SimpleSnmpClient client = new SimpleSnmpClient("udp:127.0.0.1/2001");
			String sysDescr = client.getAsString(new OID(".1.3.6.1.2.1.1.1.0"));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
