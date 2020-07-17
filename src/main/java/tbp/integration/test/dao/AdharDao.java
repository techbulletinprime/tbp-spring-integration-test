package tbp.integration.test.dao;

import org.springframework.stereotype.Repository;

@Repository
public class AdharDao {

	public String getAdhar(String adhar) {
		
		return "{\"adhar\":{\r\n" + 
				"  \"adharno\":\"" + adhar
				+ "\",\r\n"
				+ 
				"  \"name\":\"Rajanikanta\",\r\n" + 
				"  \"age\":\"25\",\r\n" + 
				"  \"address\":\"Odisha\",\r\n" + 
				"  \"mobNo\":\"8917555645\"\r\n" + 
				"  \r\n" + 
				"}}";
	}
}
