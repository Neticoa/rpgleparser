package examples.fixed2free;

import java.util.HashMap;
import java.util.Map;

public class Symbol {
	/** I am using static strings rather than enums because I want the user to be able to 
	 * extend what is held in the list of symbol attributes.
	 * The list of symbols that are predefined start with DT_
	 * 
	 */
	public static final String CAT_DATA_TYPE="DATA TYPE";
	/**
	 * CAT_DECIMAL_POSITIONS Is an optional attribute that pertains only to Packed and Zoned fields
	 */
	public static final String CAT_DECIMAL_POSITIONS = "DEC_POS";
	/**
	 * Definition type is Marked by the DS, S, ' ' normally on a D-Spec. 
	 * I have moved the array, table stuff and the multiple occurrence datastructure here too 
	 * since my intent is to be able to tell if the variable is the right type for an operation
	 * The first level of checking is to see if this is an array or data structure or just a field.
	 */
	public static final String CAT_DEFINITION_TYPE = "DEFINITION_TYPE";
	/**
	 * Element type is intended to be used with Arrays only
	 */
	public static final String CAT_ELEMENT_TYPE = "ELEMENT_TYPE";
	/**
	 * CAT_LENGTH Is an optional attribute that records the length of a field
	 */
	public static final String CAT_LENGTH = "LENGTH";
	public static final String CAT_VARYING_LENGTH = "VARYING";
	
	public static final String DF_ARRAY="ARRAY";
	public static final String DF_DATA_STRUCTURE = "DATA STRUCTURE";
	public static final String DF_KLIST="KLIST";
	public static final String DF_MULTIPLE_OCCURANCE_DATA_STRUCTURE = "MULTIPLE_OCCUR";
	public static final String DF_PLIST="PLIST";
	public static final String DF_PRECOMPILER_SYMBOL="PRECOMPILER SYMBOL";
	public static final String DF_STANDALONE = "STAND-ALONE";
	public static final String DF_SUBFIELD = "SUBFIELD";
	public static final String DF_TABLE="TABLE";
	public static final String DF_CONSTANT="CONSTANT";
	public static final String DF_PROTOTYPE = "PROTOTYPE";
	public static final String DF_PARAMETER_INTERFACE = "PARAMETER INTERFACE";
	
	public static final String DT_BINARY = "BINARY";
	public static final String DT_FLOAT="FLOAT";
	public static final String DT_INTEGER="INTEGER";
	public static final String DT_LEFTSIGN="LEFTSIGN";
	public static final String DT_RIGHTSIGN="RIGHTSIGN";
	public static final String DT_UNSIGNED="UNSIGNED";
	public static final String DT_PACKED="PACKED";
	public static final String DT_ZONED="ZONED";

	public static final String DT_ALPHANUM="ALPHANUM";
	public static final String DT_INDICATOR="INDICATOR";
	public static final String DT_GRAPHIC="GRAPHIC";
	public static final String DT_UCS2="UCS2";
	
	public static final String DT_DATE="DATE";
	public static final String DT_TIME="TIME";
	public static final String DT_TIMESTAMP="TIMESTAMP";

	public static final String DT_OBJECT = "OBJECT";
	
	public static final String DT_POINTER="POINTER";
	public static final String DT_PROC_POINTER= "PROC_PTR";
	
	private Map<String, String>attributes = new HashMap<String, String>();
	private String name;
	public void addAttribute(String category, String value) {
		if (attributes.containsKey(category)){
			// Do nothing
		} else {
			attributes.put(category, value);
		}
	}
	public Map<String, String> getAttributes() {
		return attributes;
	}
	public String getName() {
		return name;
	}
	public void setAttributes(Map<String, String> attributes) {
		this.attributes = attributes;
	}
	public void setName(String name) {
		this.name = name;
	}
	@Override
	public String toString() {
		StringBuilder sb = new StringBuilder();
		String newline = System.lineSeparator();
		sb.append("Name = " + name + newline);
		for (Map.Entry<String, String> e : attributes.entrySet()){
			sb.append("\t\tKey = " + e.getKey() + "\t Value = " + e.getValue() + newline);
		}
		return sb.toString();
	}
	public String getAnAttribute(String key) {
		return attributes.get(key);
	}

}
