package com.lhbasura.toolbox.util.excel;

import com.alibaba.excel.EasyExcel;
import com.alibaba.excel.ExcelReader;
import com.alibaba.excel.ExcelWriter;
import com.alibaba.excel.read.metadata.ReadSheet;
import com.alibaba.excel.write.metadata.WriteSheet;
import com.lhbasura.toolbox.model.ReqDf;

import java.lang.reflect.ParameterizedType;
import java.lang.reflect.Type;
import java.util.List;

/**
 * @author liuhb
 * Excel读写工具类
 */
public class ExcelUtil {

    Class clazz;

    public ExcelUtil(Class clazz) {
        this.clazz = clazz;
    }

    /**
     * 读excel
     *
     * @param path excel文件路径
     * @return 对应T类型的集合
     */
    public List read(String path) {
        ExcelListener excelListener = new ExcelListener<>();
        ExcelReader excelReader = EasyExcel.read(path, clazz, excelListener).build();
        ReadSheet readSheet = EasyExcel.readSheet().build();
        excelReader.read(readSheet);
        List list = excelListener.getList();
        excelReader.finish();
        return list;
    }

    /**
     * 写excel
     *
     * @param path 文件路径
     * @param data 写入的数据集合对象
     * @return
     */
    public void write(String path, List data) {
        // 这里 需要指定写用哪个class去写
        ExcelWriter excelWriter = EasyExcel.write(path, clazz).build();
        WriteSheet writeSheet = EasyExcel.writerSheet().build();
        excelWriter.write(data, writeSheet);
        /// 千万别忘记finish 会帮忙关闭流
        excelWriter.finish();
    }
}
