package tbp.integration.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import tbp.integration.test.service.AdharService;

@RestController
public class AdharController {
	@Autowired
	AdharService adharService;

	public String env;
	@RequestMapping(value = "/v1/adhar.read", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<String> fetchAdhar(@RequestParam("adharNo") String adhar) {

		String adharDetails = adharService.fetchAdharById(adhar);
		return ResponseEntity.status(HttpStatus.OK).header("status", "completed").body(adharDetails);

	}

}
