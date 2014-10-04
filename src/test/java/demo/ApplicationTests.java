package demo;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;
import org.springframework.web.client.RestTemplate;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = Application.class)
@WebAppConfiguration
public class ApplicationTests {

	@Test
	public void test() {
		RestTemplate restTemplate = new RestTemplate();
		ResponseEntity<String> response = restTemplate.getForEntity(
		        "https://data.sparkfun.com/streams/dZ4EVmE8yGCRGx5XRX1W.json",
		        String.class);

		System.out.println(response);
	}
	
	@Test
	public void convert_json_response_to_java_obj() {

	    RestTemplate restTemplate = new RestTemplate();
	    ResponseEntity<SparkResponseWrapper> response = restTemplate
	            .getForEntity(
	                    "https://data.sparkfun.com/streams/dZ4EVmE8yGCRGx5XRX1W.json",
	                    SparkResponseWrapper.class);

	    System.out.println(response.getBody().getStream().getDocWrapper()
	            .getLocation());
	}
	
	@Test
	public void test_successfull_response() {

	    RestTemplate restTemplate = new RestTemplate();
	    ResponseEntity<SparkResponseWrapper> response = restTemplate
	            .getForEntity(
	                    "https://data.sparkfun.com/streams/dZ4EVmE8yGCRGx5XRX1W.json",
	                    SparkResponseWrapper.class);

	    if (HttpStatus.OK == response.getStatusCode()) {
	    		System.out.println(response);
	    } else {
	    		//log error or retry request
	    }
	}

}
