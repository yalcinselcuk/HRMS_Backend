package Mernis;

import java.rmi.RemoteException;

import tr.gov.nvi.tckimlik.WS.KPSPublicSoapProxy;

public class Mernis {

	public static void main(String[] args) throws NumberFormatException, RemoteException {

		KPSPublicSoapProxy kpsPublicSoapProxy = new KPSPublicSoapProxy();
		boolean result = kpsPublicSoapProxy.TCKimlikNoDogrula
				(Long.parseLong("12345678910"), "Yalçın","Selçuk", 1999);
	}

}
