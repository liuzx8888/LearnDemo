package filedemo;

import java.io.File;
import java.io.IOException;

public class filedemo1 {

	public static void main(String[] args) {

		System.out.println(File.pathSeparator);
		System.out.println(File.separator);                  
		String path = "D:" + File.separator + "Test.txt";      /*�����ļ�*/
		String pagepath = "D:" + File.separator + "JavaTest";  /*�����ļ���*/
		String listpath = "D:" + File.separator ; 			   /*��ȡ�ļ��б�*/
		System.out.println(pagepath);
		File f = new File(path);
		File f1 = new File(pagepath);
		File f2 = new File(listpath);		
        String list[] = f2.list();           			   /*��ȡ�ļ��б�*/
        File[] listfile = f2.listFiles();   			   /*��ȡ��·�����ļ��б�*/
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
		 f1.mkdir();										/*�����ļ���*/

       for (int i =0;i<list.length;i++) {
    	   System.out.println(list[i]);
       }
       for (int i =0;i<listfile.length;i++) {
    	   System.out.println(listfile[i]);
       }
       
       if (f1.isDirectory()) {
    	   System.out.println("����Ч·��");
       }else {
    	   System.out.println("������Ч·��");
       }
    	   
       
       
       
	}

}
