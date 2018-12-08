package br.com.senior.mydomain.myservice.properties;


/**
 * This is a generated file. DO NOT EDIT ANY CODE HERE, YOUR CHANGES WILL BE LOST.
 *
 */

public class My_domainMy_serviceServicePropertiesImpl extends BaseProperties {
	
	/**
	 * This property is only an example. You can change it and create others properties as desired.
	 */
	public static String getOnlyExample(String defaultValue) {
		return getConfigs().getString(My_domainMy_servicePropertyConsts.Service.ONLY_EXAMPLE, defaultValue);
	}
	
	public static void setOnlyExample(String value) {
		getConfigs().setProperty(My_domainMy_servicePropertyConsts.Service.ONLY_EXAMPLE, value);
	}				
	
	
}
