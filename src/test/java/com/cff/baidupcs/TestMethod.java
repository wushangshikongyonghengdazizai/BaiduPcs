package com.cff.baidupcs;

import com.cff.download.SiteFileFetch;
import com.cff.download.SiteInfoBean;

public class TestMethod {
	public TestMethod() 
	 { ///xx/weblogic60b2_win.exe 
	 try{ 
	 SiteInfoBean bean = new SiteInfoBean("http://sw.bos.baidu.com/sw-search-sp/software/775ada201a2da/QQ_9.0.2.23490_setup.exe",
	     "C:\\Users\\fufei\\Desktop\\test","qq.exe",50); 

	 SiteFileFetch fileFetch = new SiteFileFetch(bean); 
	 fileFetch.start(); 
	 } 
	 catch(Exception e){e.printStackTrace ();} 
	 }

	public static void main(String[] args) {
		new TestMethod();
	}
}