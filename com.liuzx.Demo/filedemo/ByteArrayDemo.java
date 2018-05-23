package filedemo;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayDemo {
	public static void main(String[] args) throws IOException {
		ByteArrayOutputStream outputStream = null;
		ByteArrayInputStream inputStream = null;
		String str1 = "Hello World 112233";

		inputStream = new ByteArrayInputStream(str1.getBytes()); /* �ڴ�д������ */
		outputStream = new ByteArrayOutputStream(); /* �ڴ������� */
        int temp =0;
		while ((temp=inputStream.read()) != -1) {
			outputStream.write(temp);
		/*
		 * ��OutputStream ��ֱ��д��һ�� int ���ͣ����ȡ��� 8 λ��������� 24 λ��
		 * ��ˣ���Ҫ������������ת��Ϊ�ֽ�����Java ���õ��� Big Endian �ֽ���
		 * �޶���ż�����е�����Э��Ҳ���ǲ��� Big Endian �ֽ��������д���ġ�
		 * ��ˣ������ڽ������ݵĴ���ʱ����Ҫ�Ƚ���ת���� Big Endian �ֽ���
		 * ͬ�������ݽ���ʱ��Ҳ��Ҫ������Ӧ��ת������	
		 */
			
		}

		try {
			outputStream.close();
			inputStream.close();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}

		System.out.println(outputStream.toString());

	}
}
