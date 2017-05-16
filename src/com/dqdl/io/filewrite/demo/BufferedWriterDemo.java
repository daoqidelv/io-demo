package com.dqdl.io.filewrite.demo;

import java.io.BufferedWriter;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterDemo extends FileWriteDemo{

	public BufferedWriterDemo(String fileName, int lineNum) {
		super(fileName, lineNum);
	}

	@Override
	protected void writeInner() {
		BufferedWriter bw = null;
		FileWriter fw = null;		
		
		try {
			fw = new FileWriter(this.getFileName());
			bw = new BufferedWriter(fw);
			for(int i = 0; i < this.getLineNum(); i++) {
				bw.write(this.getFileLine());			
			}
			bw.flush();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} finally {
			if(fw != null) {
				try {
					fw.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}
		
	}

}
