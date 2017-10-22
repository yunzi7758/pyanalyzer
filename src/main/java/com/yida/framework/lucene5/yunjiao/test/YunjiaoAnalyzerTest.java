package com.yida.framework.lucene5.yunjiao.test;

import java.io.IOException;


import com.yida.framework.lucene5.util.AnalyzerUtils;
import com.yida.framework.lucene5.yunjiao.YunjiaoAnalyzer;

public class YunjiaoAnalyzerTest {

	public static void main(String[] args) throws IOException {
		YunjiaoAnalyzer yunjiaoAnalyzer = new YunjiaoAnalyzer();
		String text = "hello world ! 世界你好";
		
		AnalyzerUtils.displayTokens(yunjiaoAnalyzer, text);
		
		
	}

}
