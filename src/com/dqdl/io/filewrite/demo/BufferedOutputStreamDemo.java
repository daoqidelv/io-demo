package com.dqdl.io.filewrite.demo;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.UnsupportedEncodingException;

public class BufferedOutputStreamDemo extends FileWriteDemo {
	
	public BufferedOutputStreamDemo(String fileName, int lineNum) {
		super(fileName, lineNum);
	}

	@Override
	protected void writeInner() {
		FileOutputStream fos = null;
		BufferedOutputStream bos = null;
		
		try {
			fos = new FileOutputStream(this.getFileName());
			bos = new BufferedOutputStream(fos);
			byte[] tempBytes = this.getFileLine().getBytes("UTF-8");
			for(int i = 0; i < this.getLineNum(); i++) {
				bos.write(tempBytes);				
			}
			bos.flush();			
		} catch (FileNotFoundException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(bos != null) {
				try {
					bos.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}
}
