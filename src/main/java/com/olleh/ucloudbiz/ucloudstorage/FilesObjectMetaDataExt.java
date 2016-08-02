package com.olleh.ucloudbiz.ucloudstorage;

import java.util.Map;
import java.util.HashMap;
import org.apache.http.HttpException;

import com.rackspacecloud.client.cloudfiles.FilesException;
import com.rackspacecloud.client.cloudfiles.FilesObjectMetaData;

/**
 * <p>
 * �� Ŭ������ FilesObjectMetaData Ȯ�� Ŭ������ ���� ���ε�� ���õ� manifest ���Ͽ� ���� �޼ҵ带 ������ �ִ�. 
 * </p>
 * 
 * @see	<A HREF="../../../../com/rackspacecloud/client/cloudfiles/FilesObjectMetaData.html"><CODE>FilesObjectMetaData</CODE></A>,
 *		<A HREF="../../../../com/rackspacecloud/client/cloudfiles/FilesClient.html#getObjectMetaData(java.lang.String, java.lang.String)"><CODE>getObjectMetaData(String, String)</CODE></A>,
 *      <A HREF="../../../../com/kt/client/ucloudstorage/FilesClientExt.html#getObjectMetaDataExt(java.lang.String, java.lang.String)"><CODE>getObjectMetaDataExt(String, String)</CODE></A>
 * 
 * @author KT Ŭ���彺�丮����
 */

public class FilesObjectMetaDataExt extends FilesObjectMetaData {
	protected String objectManifest;
	protected String contentType;
	
	public FilesObjectMetaDataExt(String mimeType, String contentLength, String eTag,
								  String lastModified, String contentType, String objectManifest) {
		
		super(mimeType, contentLength, eTag, lastModified);
		this.contentType = contentType;
		this.objectManifest = objectManifest;
	}
	
	/**
    * <p>
    * ���Ͽ� ���� contetn type ������ �����´�.
    * </p>
    *
    * @return ������ content type, ����� ���� ��� null
    *
    */ 
	public String getContentType() {
		return contentType;
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
		return objectManifest;
	}	
}