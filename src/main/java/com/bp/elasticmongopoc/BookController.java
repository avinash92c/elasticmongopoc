package com.bp.elasticmongopoc;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.netflix.hystrix.contrib.javanica.annotation.HystrixCommand;
import com.netflix.hystrix.contrib.javanica.annotation.HystrixProperty;

@RestController
public class BookController {

	@Autowired private EBookRepo ebRepo;
	@Autowired private MBookRepo mbRepo;

//	@HystrixCommand(fallbackMethod = "getEBooks")
//	@HystrixCommand(groupKey = "testExecute", commandKey = "cmdExecute")
	@RequestMapping("/book")
	public List getBooks() throws Exception {
		System.out.println("MBook");
		return mbRepo.findAll();
//		throw new Exception();
	}

//	@HystrixCommand(groupKey = "testExecute", commandKey = "cmdExecute",
	@HystrixCommand(fallbackMethod = "getBooks")
	@RequestMapping("/ebook")
	public List getEBooks() throws Exception{
		try {
			System.out.println("EBook");
			return (List<EBook>) ebRepo.findAll();
		} catch (Exception e) {
			e.printStackTrace();
			throw e;
		}
	}
}
