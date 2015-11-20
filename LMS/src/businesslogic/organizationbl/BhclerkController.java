package businesslogic.organizationbl;

import vo.orgVO.DriverVO;
import vo.orgVO.VehicleVO;

public class BhclerkController {
	
	BusinessBL bBL = new BusinessBL();
	
	public String[] getVehicleList() {
		// TODO �Զ����ɵķ������
		return bBL.getVehicleList();
	}


	public VehicleVO getVehicleInfo(String codeVehicle) {
		// TODO �Զ����ɵķ������
		return bBL.getVehicleInfo(codeVehicle);
	}


	public boolean addVehicle(VehicleVO vo) {
		// TODO �Զ����ɵķ������
		return bBL.addVehicle(vo);
	}


	public boolean removeVehicle(String codeVehicle) {
		// TODO �Զ����ɵķ������
		return bBL.removeVehicle(codeVehicle);
	}


	public boolean changeVehicle(VehicleVO vo) {
		// TODO �Զ����ɵķ������
		return bBL.changeVehicle(vo);
	}


	public String[] getDriverList() {
		// TODO �Զ����ɵķ������
		return bBL.getDriverList();
	}


	public DriverVO getDriverInfo(String codeDriver) {
		// TODO �Զ����ɵķ������
		return bBL.getDriverInfo(codeDriver);
	}


	public boolean addDriver(DriverVO vo) {
		// TODO �Զ����ɵķ������
		return bBL.addDriver(vo);
	}


	public boolean removeDriver(String codeDriver) {
		// TODO �Զ����ɵķ������
		return bBL.removeDriver(codeDriver);
	}


	public boolean changeDriver(DriverVO vo) {
		// TODO �Զ����ɵķ������
		return bBL.changeDriver(vo);
	}

}