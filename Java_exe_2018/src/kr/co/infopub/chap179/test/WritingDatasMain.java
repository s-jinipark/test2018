package kr.co.infopub.chap179.test;
import java.io.*;

import kr.co.infopub.chap179.WritingDatas;

public class WritingDatasMain {
	public static void main(String[] args) {
		WritingDatas wd=new WritingDatas();
		try {
			wd.writingData("writed.txt",false);
			wd.readingData("writed.txt");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
