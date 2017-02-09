package com.hubay.lang.helper;


/**
 * @author shuye
 * @time 2013-7-26
 */
public final class HttpSessionIdHolder {

	private HttpSessionIdHolder(){}
	
	private final static ThreadLocal<String> SESSIONID = new ThreadLocal<String>();
	
	/**
	 * @return
	 */
	public static String getSessionId(){
		return SESSIONID.get();
	}
	
	/**
	 * @param request
	 */
	public static void setSessionId(String SessionId){
		SESSIONID.set(SessionId);
	}
	
	/**
	 * 
	 */
	public static void removeSessionId(){
		SESSIONID.remove();
	}

}
