package com.yida.framework.lucene5.yunjiao;

import java.io.IOException;

import org.apache.lucene.analysis.TokenFilter;
import org.apache.lucene.analysis.TokenStream;

import com.github.stuxuhai.jpinyin.PinyinFormat;
import com.github.stuxuhai.jpinyin.PinyinHelper;

public class YunjiaoTokenFilter extends TokenFilter {

	protected YunjiaoTokenFilter(TokenStream input) {
		super(input);
	}

	@Override
	public boolean incrementToken() throws IOException {
		if (!this.input.incrementToken()) {
			return false;
		}
		return true;
	}
	
	public String getJpinyin(String str) {
		return PinyinHelper.convertToPinyinString(str, ",", PinyinFormat.WITHOUT_TONE);;
	}

}
