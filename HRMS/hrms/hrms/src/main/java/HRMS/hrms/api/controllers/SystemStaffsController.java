package HRMS.hrms.api.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import HRMS.hrms.business.abstracts.SystemStaffService;
import HRMS.hrms.core.utilities.results.DataResult;
import HRMS.hrms.core.utilities.results.Result;
import HRMS.hrms.entities.concretes.SystemStaff;



@RestController
@RequestMapping("/api/systemStaff")
public class SystemStaffsController {
	
	private SystemStaffService systemStaffService;
	
	@Autowired
	public SystemStaffsController(SystemStaffService systemstaffService) {
		super();
		this.systemStaffService = systemstaffService;
	}
	
	@GetMapping("/getall")
	public DataResult< List<SystemStaff>> getAll(){
		return this.systemStaffService.getAll();
	}
	@PostMapping("/add")
	public Result add(@RequestBody SystemStaff systemStaff) {
		return this.systemStaffService.add(systemStaff);
	}
	
	
}
