package com.duncan.alibaba.dubbo.demo;

import java.util.List;

/**
 * �����ӿ�
 */
public interface DemoService {
	
	/**
	 * �������ӿڣ��赥��������ڷ����ṩ�������ѷ�����
	 * @param id
	 * @return
	 */
	List<String> getPermissions(Long id);
	
}
