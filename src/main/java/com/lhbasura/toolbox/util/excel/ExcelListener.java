package com.lhbasura.toolbox.util.excel;

import com.alibaba.excel.context.AnalysisContext;
import com.alibaba.excel.event.AnalysisEventListener;
import lombok.Data;

import java.util.ArrayList;
import java.util.List;

/**
 * @author liuhb
 */
@Data
public class ExcelListener<T> extends AnalysisEventListener<T> {

    List<T> list = new ArrayList<>();
    @Override
    public void invoke(T t, AnalysisContext analysisContext) {
        System.out.println(t);
        list.add(t);
    }

    @Override
    public void doAfterAllAnalysed(AnalysisContext analysisContext) {

    }
}
