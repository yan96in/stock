package com.yan96in.stock.util.dataextract;

import static org.junit.Assert.*;

import org.junit.Before;
import org.junit.Test;

public class ExcelExtractTest {
	String fileUrl;
	@Before
	public void initValue() {
		fileUrl="D:\\workspace\\git\\stock\\stock\\src\\main\\java\\com\\yan96in\\stock\\util\\dataextract\\A股.xls";
//		fileUrl="D:\\A股.xls";
	}
	@Test
	public void testImp() {
		ExcelExtract.imp(fileUrl);
	}

}
