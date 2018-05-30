package CollectionDemo;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.Properties;

public class PropertiesDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Properties pro = new Properties();
		pro.setProperty("name", "张三");
		pro.setProperty("age", "19");
		pro.setProperty("sex", "男");

		System.out.println(pro.getProperty("name"));
		System.out.println(pro.getProperty("name1", "没有找到改属性"));
		String path = "D:" + File.separator + "JavaTest" + File.separator + "Pro.Properties";
		File file = new File(path);
		
		String path1 = "D:" + File.separator + "JavaTest" + File.separator + "Pro.xml";
		File file1 = new File(path1);
		OutputStream os = null;
		try {
			os = new FileOutputStream(file);
		} catch (FileNotFoundException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try {
			pro.store(os, "Pro.Properties");
		} catch (IOException e1) {
			// TODO Auto-generated catch block
			e1.printStackTrace();
		}

		try {
			os = new FileOutputStream(file1);
			pro.storeToXML(os, "Pro.xml");
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		Properties pro1 = new Properties();	
		InputStream in = null;
		try {
			in = new FileInputStream(file1);
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		try {
			pro1.loadFromXML(in);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println(pro1);
		System.out.println(pro1.getProperty("name"));

	}

}
