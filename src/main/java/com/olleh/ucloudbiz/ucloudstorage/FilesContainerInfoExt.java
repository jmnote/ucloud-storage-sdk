package com.olleh.ucloudbiz.ucloudstorage;

import java.util.Map;
import java.util.HashMap;
import org.apache.http.HttpException;

import com.rackspacecloud.client.cloudfiles.FilesException;
import com.rackspacecloud.client.cloudfiles.FilesContainerInfo;

/**
 * <p>
 * �� Ŭ������ FilesContainerInfo Ȯ�� Ŭ������ static website �� container logging�� ���õ�
 * �޼ҵ带 ������ �ִ�. 
 * </p>
 * 
 * @see	<A HREF="../../../../com/rackspacecloud/client/cloudfiles/FilesContainerInfo.html"><CODE>FilesContainerInfo</CODE></A>,
 *      <A HREF="../../../../com/kt/client/ucloudstorage/FilesClientExt.html#getContainerInfoExt(java.lang.String)"><CODE>getContainerInfoExt(String)</CODE></A>
 * 
 * @author KT Ŭ���彺�丮����
 */

public class FilesContainerInfoExt extends FilesContainerInfo {
	
    private String webIndex;
    private String webError;
    private boolean webListings;
    private String webCss; 
    private boolean loggingStatus;

    public FilesContainerInfoExt(String name, int containerCount, long totalSize,
                          String webIndex, String webError, boolean webListings,
                          String webCss, boolean loggingStatus) {
    	super(name, containerCount, totalSize);
    	this.webIndex = webIndex;
    	this.webError = webError;
    	this.webListings = webListings;
    	this.webCss = webCss;
    	this.loggingStatus = loggingStatus;
    }
      
    /**
    * <p>
    * static website�� index���� ������ �����´�.
    * </p>
    *
    * @return index ����, �� ������ null
    *
    */ 
    public String getWebIndex() {
    	return webIndex;
    }
    
    /**
    * <p>
    * static website�� error ���Ͽ� ���� ������ suffix �����´�.
    * </p>
    *
    * @return error suffix, �� ������ null
    *
    */ 
    public String getWebError() {
		return webError;    
	}
	
	/**
    * <p>
    * HTML ���� listing�� ���� ���������� �����´�.
    * </p>
    *
    * @return ������ true, �� ������ false
    *
    */    
    public boolean getWebListings() {
		return webListings;    
    }
    
    /**
    * <p>
    * style sheet�� ���� ���������� �����´�.
    * </p>
    *
    * @return style sheet ����, �� ������ null
    *
    */
    public String getWebCss() {
		return webCss;    
    }
    
    /**
    * <p>
    * container�� ���� logging �������¸� ��ȸ�Ѵ�. 
    * </p>
    *
    * @return �����Ǿ� ������ true, �� ������ false
    *
    */
    public boolean getLoggingStatus() {
		return loggingStatus;    
    }    
    
    /**
    * <p>
    * container�� �����Ǿ� �ִ� static website ���������� �����´�.
    * </p>
    *
    * @return static website ��������
    *
    */
    public Map<String, String> getStaticWebsiteConfig() {
	    HashMap<String, String> hm = new HashMap<String, String>();
	    hm.put(FilesConstantsExt.X_CONTAINER_WEB_INDEX, webIndex);
	    hm.put(FilesConstantsExt.X_CONTAINER_WEB_ERROR, webError);
	    hm.put(FilesConstantsExt.X_CONTAINER_WEB_LISTINGS, Boolean.toString(webListings));
	    hm.put(FilesConstantsExt.X_CONTAINER_WEB_CSS, webCss);
	    return hm;
    }
}