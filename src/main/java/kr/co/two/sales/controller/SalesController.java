package kr.co.two.sales.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;

import kr.co.two.sales.dao.SalesDAO;

@Controller
public class SalesController {

	@Autowired SalesDAO dao;
	
	Logger logger = LoggerFactory.getLogger(getClass());
}
