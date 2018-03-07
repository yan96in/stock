package com.yan96in.stock.util.dataextract;

import java.io.FileInputStream;
import java.io.IOException;

import org.apache.poi.hssf.usermodel.HSSFWorkbook;

/**
 * poi实现,用的场景不多
 * 考虑性能因素,实时数据导入导出在内存数据库实现
 * 只有初始数据可以考虑excel导入
 * @author yan96in
 *
 */
public class ExcelExtract {
	/**
	 * 
	 * @param fileUrl
	 */
	public static void imp(String fileUrl) {
		try {
			HSSFWorkbook workbook = new HSSFWorkbook(new FileInputStream(fileUrl));
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
