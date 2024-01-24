package com.spboot.tryouts.util;

import java.nio.charset.Charset;
import java.util.Arrays;
import java.util.List;

import org.springframework.http.HttpEntity;
import org.springframework.http.HttpHeaders;
import org.springframework.http.HttpMethod;
import org.springframework.http.MediaType;
import org.springframework.http.ResponseEntity;
import org.springframework.util.Base64Utils;
import org.springframework.web.client.RestTemplate;

import com.spboot.tryouts.bean.Employee;

public class MyRestTemplateClient {

	private static final String EMPLOYEE_LIST_URL = "http://localhost:8080/employee/empList";
	private static final String EMPLOYEE_BYID_URL = "";
	private static final String EMPLOYEE_POST_URL = "";
	private static final String EMPLOYEE_DELETE_URL = "";
	private static final String JOAN_ACCESS = "joan:joan@123";
	private static final String HERMOINEE_ACCESS = "hermoine@magic";

	public static void getEmployeeList() {

		HttpHeaders httpHeaders = getHeaders();

		HttpEntity<List<Employee>> httpEntity = new HttpEntity<List<Employee>>(httpHeaders);

	
		RestTemplate restTemplate = new RestTemplate();

		ResponseEntity<Employee[]> responseEntity = restTemplate.exchange(EMPLOYEE_LIST_URL, HttpMethod.GET, httpEntity,
				Employee[].class);

		Employee[] employees = responseEntity.getBody();

		for (Employee employee : employees) {

			System.out.println("Employee ->" + employee);

		}

	}

	private static HttpHeaders getHeaders() {

		HttpHeaders httpHeaders = new HttpHeaders();

		httpHeaders.setAccept(Arrays.asList(new MediaType[] { MediaType.APPLICATION_JSON }));
		httpHeaders.setContentType(MediaType.APPLICATION_JSON);

		byte[] encodedAuth = Base64Utils.encode(JOAN_ACCESS.getBytes(Charset.forName("US-ASCII")));

		String authHeader = "Basic " + new String(encodedAuth);
		httpHeaders.set("Authorization", authHeader);

		return httpHeaders;
	}

	public static void main(String[] args) {

		getEmployeeList();

	}

}
