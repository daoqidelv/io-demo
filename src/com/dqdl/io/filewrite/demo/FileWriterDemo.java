package com.dqdl.io.filewrite.demo;

import java.io.FileWriter;
import java.io.IOException;

public class FileWriterDemo extends FileWriteDemo {

	public FileWriterDemo(String fileName, int lineNum) {
		super(fileName, lineNum);
	}

	@Override
	protected void writeInner() {
		FileWriter fw = null;		
		
		try {
			fw = new FileWriter(this.getFileName());
			for(int i = 0; i < this.getLineNum(); i++) {
				fw.write(getFileLine());			
			}
			fw.flush();
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
