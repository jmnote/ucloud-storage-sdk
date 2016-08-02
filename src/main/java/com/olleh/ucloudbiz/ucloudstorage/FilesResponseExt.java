package com.olleh.ucloudbiz.ucloudstorage;

import java.util.ArrayList;
import org.apache.http.Header;
import org.apache.http.HttpResponse;

import com.rackspacecloud.client.cloudfiles.FilesResponse;

/**
 * <p>
 * �� Ŭ������ FilesResponse Ȯ�� Ŭ������ static website, container logging �� manifest ���Ͽ� ���õ�
 * �޼ҵ带 ������ �ִ�. 
 * </p>
 * 
 * @see	<A HREF="../../../../com/rackspacecloud/client/cloudfiles/FilesResponse.html"><CODE>FilesResponse</CODE></A>
 * 
 * @author KT Ŭ���彺�丮����
 */

public class FilesResponseExt extends FilesResponse {
	
	protected static ArrayList<String> TRUE_VALUE = new ArrayList<String>();
    public FilesResponseExt (HttpResponse response) {
	    super(response);
	    TRUE_VALUE.add("true");
	    TRUE_VALUE.add("1");   
	    TRUE_VALUE.add("yes"); 
	    TRUE_VALUE.add("on");  
	    TRUE_VALUE.add("t");   
	    TRUE_VALUE.add("y");   
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
	    Header indexPageHeader = getResponseHeader(FilesConstantsExt.X_CONTAINER_WEB_INDEX); 
	    if (indexPageHeader != null)
          return indexPageHeader.getValue();
        return null;
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
	    Header errorPageHeader = getResponseHeader(FilesConstantsExt.X_CONTAINER_WEB_ERROR); 
	    if (errorPageHeader != null)
          return errorPageHeader.getValue();
        return null;
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
	    Header webListingHeader = getResponseHeader(FilesConstantsExt.X_CONTAINER_WEB_LISTINGS); 
	    if (webListingHeader != null) {
			String value = webListingHeader.getValue();
			return TRUE_VALUE.contains(value);
      	}
        return false;
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
	    Header CssHeader = getResponseHeader(FilesConstantsExt.X_CONTAINER_WEB_CSS); 
	    if (CssHeader != null)
          return CssHeader.getValue();
        return null;
    }
    
    /**
    * <p>
    * container�� ���� logging �������¸� ��ȸ�Ѵ�. 
    * </p>
    *
    * @return �����Ǿ� ������ true, �� ������ false
    *
    */    
    public boolean getContainerLogging() {
	    Header loggingHeader = getResponseHeader(FilesConstantsExt.X_CONTAINER_ACCESS_LOGGING); 
	    if (loggingHeader != null) {
          	String value = loggingHeader.getValue();
			return TRUE_VALUE.contains(value);
		}
        return false;
    }

	/**
    * <p>
    * ���Ҿ��ε�� ���Ͽ� ���� manifest ������ ���(X-Object-Manifest)���� �����´�.
    * �� ��� ���� �̿��Ͽ� ���Ҿ��ε�� ������ �����ϰų� ������Ʈ�� �Ѵ�.
    * </p>
    *
    * @return X-Object-Manifest ����� ��, ����� ���� ��� null
    *
    */    
    public String getObjectManifest() {
		Header manifest = getResponseHeader(FilesConstantsExt.X_OBJECT_MANIFEST); 
		if(manifest != null) {
			return manifest.getValue();
		}   
		return null;
    }   
}
