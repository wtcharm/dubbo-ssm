package cn.mldn.mldndubbo.provider.service.impl;

import org.springframework.stereotype.Service;

import cn.mldn.mldndubbo.service.IMessageService;

@Service
public class MessageServiceImpl implements IMessageService {
	@Override
	public String echo(String str) {
		return "【ECHO】" + str;
	}

}
