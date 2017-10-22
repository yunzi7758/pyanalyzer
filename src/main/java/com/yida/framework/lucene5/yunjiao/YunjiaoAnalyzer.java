package com.yida.framework.lucene5.yunjiao;

import java.io.BufferedReader;
import java.io.Reader;
import java.io.StringReader;

import org.apache.lucene.analysis.Analyzer;
import org.apache.lucene.analysis.TokenStream;
import org.apache.lucene.analysis.Tokenizer;
import org.wltea.analyzer.lucene.IKTokenizer;

public class YunjiaoAnalyzer extends Analyzer {

	@Override
	protected TokenStreamComponents createComponents(String fieldName) {
		Reader reader = new BufferedReader(new StringReader(fieldName));
		Tokenizer tokenizer = new IKTokenizer(reader, true);
		
		TokenStream tokenStream = new YunjiaoTokenFilter(tokenizer);
		
		return new Analyzer.TokenStreamComponents(tokenizer, tokenStream);
	}

}
