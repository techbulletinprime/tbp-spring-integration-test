package tbp.integration.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiResponse;
import io.swagger.annotations.ApiResponses;
import tbp.integration.test.service.AdharService;

@RestController
public class AdharController {
	@Autowired
	AdharService adharService;

	public String env;

	@ApiOperation(value = "View adhar details by adhar No")
	@ApiResponses(value = {
	        @ApiResponse(code = 200, message = "Successfully retrieved list"),
	        @ApiResponse(code = 401, message = "You are not authorized to view the resource"),
	        @ApiResponse(code = 403, message = "Accessing the resource you were trying to reach is forbidden"),
			@ApiResponse(code = 404, message = "The resource you were trying to reach is not found") })
	@RequestMapping(value = "/v1/adhar.read", method = RequestMethod.GET, produces = "application/json")
	public ResponseEntity<String> fetchAdhar(@RequestParam("adharNo") String adhar) {

		String adharDetails = adharService.fetchAdharById(adhar);
		return ResponseEntity.status(HttpStatus.OK).header("status", "completed").body(adharDetails);

	}

}
