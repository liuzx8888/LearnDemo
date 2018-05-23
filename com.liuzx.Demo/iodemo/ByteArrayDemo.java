package iodemo;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.File;
import java.io.IOException;

public class ByteArrayDemo {
	public static void main(String[] args) {
		String path = "D:" + File.separator + "JavaTest" + File.separator + "Iotest.txt";
		File f1 = new File(path);
		byte[] b = new byte[(int) f1.length()];
		ByteArrayInputStream inputStream = new ByteArrayInputStream(path.getBytes());/* д���ڴ� */
		ByteArrayOutputStream outputStream = new ByteArrayOutputStream();
		/*
		 * ��ȡ�ڴ����ݷ���1 try { inputStream.read(b); outputStream.write(b);
		 * System.out.println(outputStream.toString()); inputStream.close();
		 * outputStream.close(); } catch (IOException e) { // TODO Auto-generated catch
		 * block e.printStackTrace(); }
		 */

		/*
		 * �ļ��� IN OUT �����ڴ�Ϊ���ն�����ʵ�ֵģ��ļ������� �ڴ� ---���ļ��� ���Զ��ļ���д������ outputStream ����ǻ�ȡ
		 * InputStream д���ڴ�����ļ��෴ �����ڴ��� in ��ȡ�ڴ����� ���� OUT
		 */
		int temp;
		while ((temp = inputStream.read()) != -1) {

			outputStream.write(temp);

		}

		System.out.println(outputStream.toString());
		try {
			inputStream.close();
			outputStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

	}

}
