package tbp.integration.test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.boot.test.context.SpringBootTest.WebEnvironment;
import org.springframework.boot.test.web.client.TestRestTemplate;
import org.springframework.boot.web.server.LocalServerPort;
import org.springframework.http.HttpEntity;
import org.springframework.http.HttpMethod;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.util.UriComponents;
import org.springframework.web.util.UriComponentsBuilder;

@SpringBootTest(webEnvironment = WebEnvironment.RANDOM_PORT)
public class TbpAdharIntegrationTest {

	@LocalServerPort
	private int port;

	@Autowired
	private TestRestTemplate testRestTemplate;

	@Test
	public void getAdharTest() {

		String url = "http://localhost:" + port + "/v1/adhar.read"; // ?adharNo=adhar-rajani-1234"

		UriComponents builder = UriComponentsBuilder.fromHttpUrl(url).queryParam("adharNo", "adhar-Pradhan-1234")
				.build();
		HttpEntity<String> requestEntity = new HttpEntity<>(null, null);
		ResponseEntity<String> response = testRestTemplate.exchange(builder.toString(), HttpMethod.GET, requestEntity,
				String.class);
		System.out.println(response.getBody());

		assertEquals(HttpStatus.OK, response.getStatusCode());

	}

}
