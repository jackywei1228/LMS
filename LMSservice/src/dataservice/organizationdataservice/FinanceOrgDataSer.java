package dataservice.organizationdataservice;

import java.rmi.Remote;

public interface FinanceOrgDataSer extends Remote{
	
	/**
	 * ���Ҳ����ز�����Ա�б�
	 * @return ������ԱID+name�б�
	 */
	public String[] find();
	
	/**
	 * ����һ��������Ա
	 * @param ID ���ӵĲ�����Ա�ı��
	 * @return �����Ƿ�ɹ�����Ϣ
	 */
	public boolean insert(long ID);
	
	/**
	 * ɾ��һ��������Ա
	 * @param ID Ҫɾ���Ĳ�����Ա���˺�
	 * @return �����Ƿ�ɹ�����Ϣ
	 */
	public boolean delete(long ID);
	
}