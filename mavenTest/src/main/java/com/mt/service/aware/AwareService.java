package com.mt.service.aware;

import java.io.IOException;

import org.apache.commons.io.IOUtils;
import org.springframework.beans.factory.BeanNameAware;
import org.springframework.context.ResourceLoaderAware;
import org.springframework.core.io.Resource;
import org.springframework.core.io.ResourceLoader;
import org.springframework.stereotype.Service;

@Service
public class AwareService implements BeanNameAware, ResourceLoaderAware {

	private String beanName;
	private ResourceLoader loaderAware;
	public void setResourceLoader(ResourceLoader resourceLoader) {
		this.loaderAware = resourceLoader;
	}

	public void setBeanName(String arg0) {
		this.beanName = arg0;
	}

	public void outputResult() {
		System.out.println("Bean 的名称为： " + beanName);
		Resource resource = loaderAware.getResource("classpath:com/mt/service/el/test.txt");
		try {
			System.out.println("ResourceLoader 加载的文件内容为：" + IOUtils.toString(resource.getInputStream()));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
