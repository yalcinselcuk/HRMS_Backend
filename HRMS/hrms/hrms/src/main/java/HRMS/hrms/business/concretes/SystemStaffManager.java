package HRMS.hrms.business.concretes;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import HRMS.hrms.DataAccess.abstracts.SystemStaffDao;
import HRMS.hrms.business.abstracts.SystemStaffService;
import HRMS.hrms.core.utilities.results.DataResult;
import HRMS.hrms.core.utilities.results.Result;
import HRMS.hrms.core.utilities.results.SuccessDataResult;
import HRMS.hrms.core.utilities.results.SuccessResult;
import HRMS.hrms.entities.concretes.SystemStaff;

@Service
public class SystemStaffManager implements SystemStaffService{
	
	private SystemStaffDao systemStaffDao;

	@Autowired
	public SystemStaffManager(SystemStaffDao systemStaffDao) {
		super();
		this.systemStaffDao = systemStaffDao;
	}
	
	@Override
	public DataResult< List <SystemStaff>> getAll() {
		return new SuccessDataResult < List <SystemStaff> > (this.systemStaffDao.findAll(),"Data Listelendi");
	}

	@Override
	public Result add(SystemStaff systemStaff) {
		this.systemStaffDao.save(systemStaff);
		
		return new SuccessResult("Sistem Görevlisi Eklendi");
	}
	
}
