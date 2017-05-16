package com.dqdl.io.filewrite.demo;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.RandomAccessFile;
import java.io.UnsupportedEncodingException;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;

public class FileChannelDemo extends FileWriteDemo {

	public FileChannelDemo(String fileName, int lineNum) {
		super(fileName, lineNum);
	}

	@Override
	protected void writeInner() {
		RandomAccessFile randomAccessFile = null;
		 try {
			randomAccessFile = new RandomAccessFile(this.getFileName(),"rw");
			FileChannel writer = randomAccessFile.getChannel();
			byte[] tempBytes = this.getFileLine().getBytes("UTF-8");
			long length = this.getLineNum()*tempBytes.length;
			ByteBuffer writerBuffer = writer.map(FileChannel.MapMode.READ_WRITE, 0, length);
			for(int i = 0; i < this.getLineNum(); i++) {				
				writerBuffer.put(tempBytes);
			}
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
			if(randomAccessFile != null) {
				try {
					randomAccessFile.close();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		}

	}

}
