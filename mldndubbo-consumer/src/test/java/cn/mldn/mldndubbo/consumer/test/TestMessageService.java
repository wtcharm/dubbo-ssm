package cn.mldn.mldndubbo.consumer.test;

import java.util.concurrent.TimeUnit;

import javax.annotation.Resource;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import cn.mldn.mldndubbo.service.IMessageService;

@ContextConfiguration(locations = { "classpath:spring/spring-*.xml" })
@RunWith(SpringJUnit4ClassRunner.class)
public class TestMessageService {
	@Resource
	private IMessageService messageService ;
	@Test
	public void testEcho() throws Exception {
		String echo = this.messageService.echo("www.mldn.cn") ;
		System.err.println(echo);
	}
}
