package com.snmp.example;

import org.snmp4j.smi.OID;

public class MyClient {

	public static void main(String args[]) {
		try {
			SimpleSnmpClient client = new SimpleSnmpClient("udp:127.0.0.1/2001");
			String sysDescr = client.getAsString(new OID(".1.3.7.1.2.1.2.1.1"));
			
			//Db Info
			System.out.println(client.getAsString(new OID(".1.3.7.1.2.1.2.1.1")));
			System.out.println(client.getAsString(new OID(".1.3.7.1.2.1.2.2.1")));
			System.out.println(client.getAsString(new OID(".1.3.7.1.2.1.2.3.1")));
			System.out.println(client.getAsString(new OID(".1.3.7.1.2.1.2.4.1")));
			System.out.println(client.getAsString(new OID(".1.3.7.1.2.1.2.5.1")));
			System.out.println(client.getAsString(new OID(".1.3.7.1.2.1.2.6.1")));
			System.out.println(client.getAsString(new OID(".1.3.7.1.2.1.2.7.1")));
		} catch (Exception e) {
			e.printStackTrace();
		}
	}
}
