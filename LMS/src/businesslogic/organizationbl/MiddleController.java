package businesslogic.organizationbl;

import vo.orgVO.MiddleOrgVO;

public class MiddleController {
	
	MiddleBL mBL = new MiddleBL();
	
	

	public String[] getBussinessmanList() {
		// TODO �Զ����ɵķ������
		return mBL.getBussinessHallList();
	}


	public boolean addBussinessman(long ID) {
		// TODO �Զ����ɵķ������
		return mBL.addBussinessman(ID);
	}

	
	public boolean removeBussinessman(long ID) {
		// TODO �Զ����ɵķ������
		return mBL.removeBussinessman(ID);
	}

	
	public String[] getStorgerList() {
		// TODO �Զ����ɵķ������
		return mBL.getStorgerList();
	}

	
	public boolean addStorger(long ID) {
		// TODO �Զ����ɵķ������
		return mBL.addStorger(ID);
	}


	public boolean removeStorger(long ID) {
		// TODO �Զ����ɵķ������
		return mBL.removeStorger(ID);
	}

	
	public String[] getBussinessHallList() {
		// TODO �Զ����ɵķ������
		return mBL.getBussinessHallList();
	}


	public String GetInfo() {
		// TODO �Զ����ɵķ������
		return mBL.GetInfo();
	}


	public boolean changeCity(String city) {
		// TODO �Զ����ɵķ������
		return mBL.changeCity(city);
	}


	public boolean addMiddleOrg(MiddleOrgVO vo) {
		// TODO �Զ����ɵķ������
		return mBL.addMiddleOrg(vo);
	}


	public boolean removeMiddleOrg(String codeNumber) {
		// TODO �Զ����ɵķ������
		return mBL.removeMiddleOrg(codeNumber);
	}


}