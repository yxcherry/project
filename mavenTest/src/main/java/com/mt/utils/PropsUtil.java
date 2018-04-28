package com.mt.utils;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

/**
 * 属性文件工具类
 * @author Administrator
 *
 */
public class PropsUtil {
	
//	private static final Logger logger = LoggerFactory.getLogger(PropsUtil.class);
	/**
	 * 加载属性文件
	 * @param FileName
	 * @return
	 */
	public static Properties loadProps(String FileName) {
		Properties props = null;
		InputStream is = null;
		try {
			is = Thread.currentThread().getContextClassLoader().getResourceAsStream(FileName);
			if (is == null) {
				throw new FileNotFoundException(FileName + "file is not fonnd");
			}
			props = new Properties();
			props.load(is);
		} catch (IOException e) {
			// TODO: handle exception
		} finally {
			if (is != null) {
				try {
					is.close();
				} catch (IOException e) {
					e.printStackTrace();
				}
			}
		}
		return props;
	}
	
	/**
	 * 获取字符型属性（）
	 * @param props
	 * @param key
	 * @return
	 */
	public static String getString(Properties props, String key) {
		return getString(props, key, "");
	}
	
	public static String getString(Properties props, String key, String defaultValue){
		String value = defaultValue;
		if(props.contains(key)) {
			value = props.getProperty(key);
		}
		return value;
	}

	/**
	 * 获取数值型属性
	 * @param props
	 * @param key
	 * @return
	 */
	public static int getInt(Properties props, String key) {
		return getInt(props, key, 0);
	}
	
	public static int getInt(Properties props, String key, int defaultValue) {
		int value = defaultValue;
		if(props.contains(key)) {
			value = Integer.parseInt(props.getProperty(key));
		}
		return value;
	}
	
	/**
	 * 获取
	 * @param props
	 * @param key
	 * @return
	 */
	public static boolean getBoolean(Properties props, String key) {
		return getBoolean(props, key, false);
	}
	
	public static boolean getBoolean(Properties props, String key, boolean defaultValue) {
		boolean value = defaultValue;
		if(props.contains(key)) {
			value = Boolean.parseBoolean(key);
		}
		return value;
	}
	
	public static void main(String[] args) {
		String FileName = "C:\\Users\\Administrator\\Desktop\\a.properties";
		Properties props = loadProps(FileName);
		String dd = getString(props, "001");
		System.out.println(dd);
	}
}
