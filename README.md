# Integration Test Using Spring Boot

> Spring Boot Integration Test

> How to write end to end test using Spring Boot.


**Key Annotation**

- @SpringBootTest
- @LocalServerPort
- @Test

---
																		
## Table of Contents 

> 

- [Installation](#installation)
- [Features](#features)
- [Contributing](#contributing)
- [Team](#team)
- [FAQ](#faq)
- [Support](#support)
- [License](#license)


---

## Example (Test Class)

```javascript
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

```

---

## Installation

- Clone this repository
- Import in to IDE
- Do a maven clean and build

### Clone

- Clone this repo to your local machine.

### Setup

- 

> Do maven update


> Run the junit

---

## Features
## Usage 
## Documentation
## Tests 
---

## Contributing

> To get started...

### Step 1

- **Option 1**
    - 🍴 Fork this repo!

- **Option 2**
    - 👯 Clone this repo to your local machine.

### Step 2

- **HACK AWAY!** 🔨🔨🔨

### Step 3

- 🔃 Create a new pull request .


## FAQ

- **What is @SpringBootTest ?**
    - This annotation will load the context from main app.

---

## Support

Reach out to me If any issue !

- FaceBook at <a href="https://www.facebook.com/rajanikanta.pradhan1" target="_blank">`Rajanikanta`</a>


---


## License

[![License](http://img.shields.io/:license-mit-blue.svg?style=flat-square)](http://badges.mit-license.org)

- **[MIT license](http://opensource.org/licenses/mit-license.php)**
