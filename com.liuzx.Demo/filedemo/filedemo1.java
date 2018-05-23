package filedemo;

import java.io.File;
import java.io.IOException;

public class filedemo1 {

	public static void main(String[] args) {

		System.out.println(File.pathSeparator);
		System.out.println(File.separator);                  
		String path = "D:" + File.separator + "Test.txt";      /*创建文件*/
		String pagepath = "D:" + File.separator + "JavaTest";  /*创建文件夹*/
		String listpath = "D:" + File.separator ; 			   /*获取文件列表*/
		System.out.println(pagepath);
		File f = new File(path);
		File f1 = new File(pagepath);
		File f2 = new File(listpath);		
        String list[] = f2.list();           			   /*获取文件列表*/
        File[] listfile = f2.listFiles();   			   /*获取带路径的文件列表*/
		if (f.exists()) {
			f.delete();
		} else {
			try {
				f.createNewFile();
			} catch (IOException e) {
				// TODO Auto-generated catch block
				e.printStackTrace();
			}
		}
		
/*		 f1.deleteOnExit();*/
		 f1.mkdir();										/*创建文件夹*/

       for (int i =0;i<list.length;i++) {
    	   System.out.println(list[i]);
       }
       for (int i =0;i<listfile.length;i++) {
    	   System.out.println(listfile[i]);
       }
       
       if (f1.isDirectory()) {
    	   System.out.println("是有效路径");
       }else {
    	   System.out.println("不是有效路径");
       }
    	   
       
       
       
	}

}
