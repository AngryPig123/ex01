package org.zerock.controller;

import static org.junit.Assert.assertNotNull;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.zerock.sample.Restaurant;

import lombok.Setter;
import lombok.extern.log4j.Log4j;

@RunWith(SpringJUnit4ClassRunner.class)	//	현재 테스트 코드가 스프링을 실행하게 될것이다.
@ContextConfiguration("file:src/main/webapp/WEB-INF/spring/root-context.xml")	//	클래스나 문자열을 사용해서 필요한 객체들을 스프링내에 객체로 등록
@Log4j	//	lombok를 이용해서 로그를 기록하는 Logger를 변수로 생성.
public class SampleTests {
	
	
	@Setter(onMethod_ = {@Autowired})	//	@Autowired : 해당 인스턴스가 스프링으로 부터 자동주입받는다.
	private Restaurant restaurant;
	
	@Test
	public void testExist() {
		
		assertNotNull(restaurant);
		
		log.info(restaurant);
		log.info("-----------------");
		log.info(restaurant.getChef());
		
	}
	

}
