package com.olleh.ucloudbiz.ucloudstorage;

import org.apache.http.HttpException;

import java.util.List;
import java.util.Map;
import java.io.IOException;
import org.apache.log4j.Logger;

import com.rackspacecloud.client.cloudfiles.FilesClient;
import com.rackspacecloud.client.cloudfiles.FilesObject;
import com.rackspacecloud.client.cloudfiles.FilesContainer;
import com.rackspacecloud.client.cloudfiles.FilesException;
import com.rackspacecloud.client.cloudfiles.wrapper.RequestEntityWrapper;


/**
 * <p>
 * �� Ŭ������ FilesContainer�� Ȯ�� Ŭ������ static website �� container logging�� ���õ�
 * �޼ҵ带 ������ �ִ�. �Ѱ��� ������ ���� �� Ŭ������ �ν��Ͻ��� �����ϴ� ������ ���丮�� ��
 * container�� �����Ǵ� ���� �ƴϴ�. ���丮���� �ִ� container�� ���� ������ü�ν� ����ϴ� ����
 * �ٶ����ϴ�.
 * </p>
 * 
 * @see	<A HREF="../../../../com/rackspacecloud/client/cloudfiles/FilesContainer.html"><CODE>FilesContainer</CODE></A>
 * 
 * @author KT Ŭ���彺�丮����
 */

public class FilesContainerExt extends FilesContainer
{
	protected FilesClientExt clientExt;
	
    /**
     * FilesClientExt�� ��ü�������� ���丮���� container�� �������� �ʴ´�.
     *  
     * @param containerName  container �̸�
     * @param objs           container�� ����Ǿ� �ִ� ���� ����Ʈ
     * @param clientExt      http client
     */
    public FilesContainerExt(String containerName, List<FilesObject> objs, FilesClientExt clientExt)
    {
        super(containerName, objs, clientExt);
    }

    /**
     * @param containerName   container �̸�
     * @param clientExt       http client
     */
    public FilesContainerExt(String containerName, FilesClientExt clientExt)
    {
        super(containerName, clientExt);
    }
    
   /**
    * <p>
    * container�� ���� ������ �����´�.
    * </p>
    *
    * @return �����ϸ� FilesContainerInfoExt, �����ϸ� null
    *
    */  
    public FilesContainerInfoExt getInfoExt() throws HttpException, IOException, FilesException {
        if (clientExt != null)
        {
            return clientExt.getContainerInfoExt(this.name);
        }
        else
        {
            logger.fatal("This container does not have a valid client !");
        }
        return null;
    }

    /**
    * <p>
    * container�� static website�� �����Ѵ�. �ڼ��� ���� ������ <A HREF="https://ucloudbiz.olleh.com/manual/ucloud_storage_Static_Web_service_user_guide.pdf"><CODE>ucloud storage Static Web ���� �̿� ���̵�</CODE></A>�� �����Ѵ�.
    * </p>
    *
    * @param config
    *            ��������
    * @return �����ϸ� true
    *
    */  
    public boolean enableStaticWebsiteConfig(Map<String, String> config) throws IOException, 
                                                                             FilesException, 
                                                                             HttpException {
	    return this.clientExt.enableStaticWebsiteConfig(this.name, config);
    }
    
    /**
    * <p>
    * static website�� ������ container�� ��Ȱ��ȭ��Ų��. �׷��� ���� ���� ������ �������� �ʴ´�. ���� ���ο� 
    * ���������� �����̸� ���� ��� enableStaticWebsiteConfig�� �̿��Ѵ�.
    * �ڼ��� ���� ������ <A HREF="https://ucloudbiz.olleh.com/manual/ucloud_storage_Static_Web_service_user_guide.pdf"><CODE>ucloud storage Static Web ���� �̿� ���̵�</CODE></A>�� �����Ѵ�.
    * </p>
    *
    * @return �����ϸ� true
    *
    */  
    public boolean disableStaticWebsiteConfig() throws IOException, FilesException, HttpException {  
	    return this.clientExt.disableStaticWebsiteConfig(this.name);
    }
    
    /**
    * <p>
    * container�� ���� ���ٷα׸� �����Ѵ�. �ڼ��� ���� ������ <A HREF="https://ucloudbiz.olleh.com/manual/ucloud_storage_log_save_service_user_guide.pdf"><CODE>ucloud storage �α� ���� ���� �̿� ���̵�</CODE></A>�� �����Ѵ�.
    * </p>
    *
    * @param active ����(true/false)
    *            
    * @return �����ϸ� true
    *
    */
    public boolean setContainerLogging(boolean active) throws IOException, 
                                                              FilesException,
                                                              HttpException {
	   	return this.clientExt.setContainerLogging(this.name, active); 	    
    }    
}
