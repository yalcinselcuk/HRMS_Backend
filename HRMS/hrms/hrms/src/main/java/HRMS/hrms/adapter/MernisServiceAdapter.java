package HRMS.hrms.adapter;

import HRMS.hrms.business.abstracts.PersonCheckService;
import HRMS.hrms.entities.concretes.JobSeekers;
import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class MernisServiceAdapter implements PersonCheckService{

	@Override
	public boolean ifCheckRealPerson(JobSeekers jobSeekers) {
		
		KPSPublicSoapProxy proxy = new KPSPublicSoapProxy();
		boolean result = false;
		
		try {
			result=proxy.TCKimlikNoDogrula
					(
							
							Long.parseLong(jobSeekers.getNationalityId()),
							jobSeekers.getFirstName().toUpperCase(),
							jobSeekers.getLastName().toUpperCase(),
							Integer.parseInt(jobSeekers.getBirthDate())
							
							);
		}
		
		catch(Exception e) {
		
			System.out.println("Not a Valid Person");
		
		}
		
		return result;
	}

}
