package cn.mldn.mldndubbo.service;

public class IMessageServiceMock implements IMessageService {

	@Override
	public String echo(String str) {
		return "【NOTHING】Message服务暂不可用";
	}

}
