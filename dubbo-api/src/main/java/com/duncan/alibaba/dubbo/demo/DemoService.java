package com.duncan.alibaba.dubbo.demo;

import java.util.List;

/**
 * 公共接口
 */
public interface DemoService {
	
	/**
	 * 定义服务接口，需单独打包，在服务提供方和消费方共享
	 * @param id
	 * @return
	 */
	List<String> getPermissions(Long id);
	
}
