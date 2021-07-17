package HRMS.hrms.business.abstracts;

import java.util.List;

import HRMS.hrms.core.utilities.results.DataResult;
import HRMS.hrms.core.utilities.results.Result;
import HRMS.hrms.entities.concretes.SystemStaff;

public interface SystemStaffService {
	DataResult<List <SystemStaff>> getAll();
	Result add(SystemStaff systemStaff);
}
