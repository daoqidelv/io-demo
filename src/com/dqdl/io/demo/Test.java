package com.dqdl.io.demo;

import com.dqdl.io.filewrite.demo.BufferedOutputStreamDemo;
import com.dqdl.io.filewrite.demo.BufferedWriterDemo;
import com.dqdl.io.filewrite.demo.FileChannelDemo;
import com.dqdl.io.filewrite.demo.FileOutputStreamDemo;
import com.dqdl.io.filewrite.demo.FileWriteDemo;
import com.dqdl.io.filewrite.demo.FileWriterDemo;

public class Test {

	/**
	 * @param args
	 */
	public static void main(String[] args) {
		String fileName = "D:\\temp\\test.txt";
		int lineNum = 1*1024;
		
		FileWriteDemo fileWriterDemo = new FileWriterDemo(fileName, lineNum);
		fileWriterDemo.write();
		
		System.out.println();
		
		FileWriteDemo bufferedWriterDemo = new BufferedWriterDemo(fileName, lineNum);
		bufferedWriterDemo.write();
		
		System.out.println();
		
		FileWriteDemo fileOutputStreamDemo = new FileOutputStreamDemo(fileName, lineNum);
		fileOutputStreamDemo.write();
		
		System.out.println();
		
		FileWriteDemo bufferedOutputStreamDemo = new BufferedOutputStreamDemo(fileName, lineNum);
		bufferedOutputStreamDemo.write();
		
		System.out.println();
		
		FileWriteDemo fileChannelDemo = new FileChannelDemo(fileName, lineNum);
		fileChannelDemo.write();
	}

}
