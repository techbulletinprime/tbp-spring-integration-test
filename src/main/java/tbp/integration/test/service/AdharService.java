package tbp.integration.test.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import tbp.integration.test.dao.AdharDao;

@Service
public class AdharService {
	@Autowired
	AdharDao adharDao;

	public String fetchAdharById(String adhar) {

		return adharDao.getAdhar(adhar);
	}

}
