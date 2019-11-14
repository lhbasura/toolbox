package com.lhbasura.toolbox.model;

import com.alibaba.excel.annotation.ExcelProperty;
import lombok.Data;

/**
 * @author liuhb
 */
@Data
public class ReqDf {
    @ExcelProperty(value = "trans_id")
    private String transId;

//    @ExcelProperty(value = "return_code")
//    private String returnCode;
//
//    @ExcelProperty(value = "return_msg")
//    private String returnMsg;
}
