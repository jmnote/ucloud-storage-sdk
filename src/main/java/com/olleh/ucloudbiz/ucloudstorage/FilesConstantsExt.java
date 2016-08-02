package com.olleh.ucloudbiz.ucloudstorage;

import com.rackspacecloud.client.cloudfiles.FilesConstants;

/**
 * <p>
 * �� Ŭ������ FilesConstants�� Ȯ�� Ŭ������ �߰����� Ŭ���� �ʵ带 ���� �ִ�.
 * </p>
 * <p>
 * �߰��� �ʵ�� static website �� container logging�� ���õ� �ʵ带 �����Ͽ�
 * ���� ���ε�� ���ϰ� ���õ� �ʵ���̴�.
 * </p>
 * 
 * @see	<A HREF="../../../../com/rackspacecloud/client/cloudfiles/FilesConstants.html"><CODE>FilesConstants</CODE></A>,
 *      <A HREF="../../../../com/kt/client/ucloudstorage/FilesClientExt.html#getContainerInfoExt(java.lang.String)"><CODE>getContainerInfoExt(String)</CODE></A>,
 *      <A HREF="../../../../com/kt/client/ucloudstorage/FilesClientExt.html#getObjectMetaDataExt(java.lang.String, java.lang.String)"><CODE>getObjectMetaDataExt(String, String)</CODE></A>
 * 
 * @author KT Ŭ���彺�丮����
 */

public class FilesConstantsExt extends FilesConstants
{
    public static final String X_CONTAINER_LOG_DELIVERY = "X-Container-Meta-Access-Log-Delivery";
    public static final String X_CONTAINER_WEB_INDEX    = "X-Container-Meta-Web-Index";
	public static final String X_CONTAINER_WEB_ERROR    = "X-Container-Meta-Web-Error";
	public static final String X_CONTAINER_WEB_LISTINGS = "X-Container-Meta-Web-Listings";
	public static final String X_CONTAINER_WEB_CSS = "X-Container-Meta-Web-Listings-Css";
	public static final String X_CONTAINER_ACCESS_LOGGING = "X-Container-Meta-Access-Log-Delivery";
	public static final String X_CONTAINER_READ  = "X-Container-Read";
	public static final String X_OBJECT_MANIFEST = "X-Object-Manifest";
}