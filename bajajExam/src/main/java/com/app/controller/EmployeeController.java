package com.app.controller;

import java.util.ArrayList;
import java.util.List;

import org.springframework.util.NumberUtils;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/testbfhl.herokuapp.com")
public class EmployeeController {


	@PostMapping("/bfhl")
	public Data getDataOfUser(@RequestBody List<String> data) {
		System.out.println("In get data");
		Data d = new Data();
		ArrayList<Integer> ints = new ArrayList<Integer>();
		ArrayList<String> strs = new ArrayList<String>();
		for(int i=0;i<data.size();i++) {
			
			try {
				int m = Integer.parseInt(data.get(i));
				ints.add(m);
			}catch (Exception e) {
				strs.add(data.get(i));
			}
			
//			if(data.get(i)>=65&&data.get(i)<=90) {
//				strs.add(data.get(i));
//			}else if(data.get(i)>=97&&data.get(i)<=122) {
//				strs.add(data.get(i));
//			}else if(data.get(i)>=48&&data.get(i)<=57) {
//				int num = data.get(i);
//				ints.add(num);
//			}
		}
		
		d.setNumbers(ints);
		d.setAlphabates(strs);
		
		return d;
	}

}
