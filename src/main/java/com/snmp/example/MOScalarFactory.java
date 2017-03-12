package com.snmp.example;

import org.snmp4j.agent.mo.MOAccessImpl;
import org.snmp4j.agent.mo.MOScalar;
import org.snmp4j.smi.OID;
import org.snmp4j.smi.OctetString;
import org.snmp4j.smi.Variable;

public class MOScalarFactory {
	
	public static MOScalar createReadOnly(OID oid,Object value ){
		return new MOScalar(oid, 
				MOAccessImpl.ACCESS_READ_ONLY,
				getVariable(value));
	}

	private static Variable getVariable(Object value) {
		if(value instanceof String) {
			if(((String)value).equals(".1.2.1.2.1.2.1.0"));
				System.out.println("haha");
			return new OctetString((String)value);
		}
		throw new IllegalArgumentException("Unmanaged Type: " + value.getClass());
	}
}
