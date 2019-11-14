package com.lhbasura.toolbox.util.excel;

import com.lhbasura.toolbox.model.ReqDf;
import org.junit.jupiter.api.Test;

import java.util.List;


class ExcelUtilTest {

    @Test
    void read() {
        ExcelUtil excelUtil = new ExcelUtil(ReqDf.class);
        List<ReqDf> list = excelUtil.read("req_df.xlsx");
        list.forEach(System.out::println);
    }

    @Test
    void write() {
        ExcelUtil excelUtil = new ExcelUtil(ReqDf.class);
        List<ReqDf> list = excelUtil.read("req_df.xlsx");
        excelUtil.write("result.xlsx",list);
    }
}