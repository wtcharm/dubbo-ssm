package cn.mldn.mldndubbo.consumer.test;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.mldn.mldndubbo.service.IMemberService;

@ContextConfiguration(locations = { "classpath:spring/spring-*.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class TestMemberService {
	@Resource
	private IMemberService memberService ;
	@Test
	public void testGetRoleAndAction() throws Exception {
		System.err.println(this.memberService.getRoleAndActionByMember("mldn"));
	}
	@Test
	public void testGet() throws Exception {
		System.err.println(this.memberService.get("mldn"));
	}
}
