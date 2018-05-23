package filedemo;

import java.io.ByteArrayInputStream;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

public class ByteArrayDemo {
	public static void main(String[] args) throws IOException {
		ByteArrayOutputStream outputStream = null;
		ByteArrayInputStream inputStream = null;
		String str1 = "Hello World 112233";

		inputStream = new ByteArrayInputStream(str1.getBytes()); /* 内存写入数据 */
		outputStream = new ByteArrayOutputStream(); /* 内存的输出流 */
        int temp =0;
		while ((temp=inputStream.read()) != -1) {
			outputStream.write(temp);
		/*
		 * “OutputStream 中直接写入一个 int 类型，会截取其低 8 位，丢弃其高 24 位，
		 * 因此，需要将基本类型先转换为字节流。Java 采用的是 Big Endian 字节序。
		 * 无独有偶，所有的网络协议也都是采用 Big Endian 字节序来进行传输的。
		 * 因此，我们在进行数据的传输时，需要先将其转换成 Big Endian 字节序；
		 * 同理，在数据接收时，也需要进行相应的转换”。	
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
