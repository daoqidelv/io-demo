package com.dqdl.io.filewrite.demo;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;


public class FileOutputStreamDemo extends FileWriteDemo{

	public FileOutputStreamDemo(String fileName, int lineNum) {
		super(fileName, lineNum);
	}
	
	@Override
	protected void writeInner() {
		FileOutputStream fos = null;
		try {
			fos = new FileOutputStream(this.getFileName());		
			byte[] tempBytes = this.getFileLine().getBytes("UTF-8");
			for(int i = 0; i < this.getLineNum(); i++) {
				fos.write(tempBytes);				
			}
			fos.flush();
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			if(fos != null) {
				try {
					fos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
	}
	

}
