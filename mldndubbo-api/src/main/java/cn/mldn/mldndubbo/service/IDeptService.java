package cn.mldn.mldndubbo.service;

import java.util.List;

import cn.mldn.mldndubbo.vo.Dept;

public interface IDeptService {
	public boolean add(Dept dept) ;
	public Dept get(long deptno) ;
	public List<Dept> list() ; 
}
