package cn.mldn.mldndubbo.provider.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Service;

import cn.mldn.mldndubbo.service.IDeptService;
import cn.mldn.mldndubbo.vo.Dept;

@Service
public class DeptServiceImpl implements IDeptService {

	@Override
	public boolean add(Dept dept) {
		System.err.println("【DeptService】部门增加：" + dept);
		return true;
	}

	@Override
	public Dept get(long deptno) {
		Dept dept = new Dept();
		dept.setDeptno(deptno);
		dept.setDname("mldn - " + deptno);
		dept.setLoc("北京 - " + deptno);
		return dept;
	}

	@Override
	public List<Dept> list() {
		List<Dept> allDepts = new ArrayList<Dept>();
		for (int x = 0 ; x < 10 ; x ++) {
			Dept dept = new Dept() ;
			dept.setDeptno((long)x);
			dept.setDname("mldn部门 - " + x);
			dept.setLoc("mldn位置 - " + x);
			allDepts.add(dept) ;
		}
		return allDepts;
	}

}
