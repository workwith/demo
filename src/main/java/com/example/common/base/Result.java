package com.example.common.base;
;
import lombok.Data;

import java.util.List;

@Data
public class Result<T>{
    private int success = 0; // 操作标识，标记
    private String resultCode; // 结果编码
    private String message; // 提示信息
    private T model; // 结果对象
    private List<T> models; // 结果集对象
    private PageInfo pageInfo; // 分页信息对象
    private Object extra; // 扩展字段

    private static <T> Result<T> createWithSuccessFlag(int success) {
        Result result = new Result();
        result.setSuccess(success);
        return result;
    }

    public static <T> Result<T> createWithSuccessMessage() {
        Result result = createWithSuccessFlag(Constants.YES);
        result.setResultCode(Constants.OPERATION_SUCCESS);
        result.setMessage(Constants.SUCCESS_MESSAGE);
        return result;
    }
    public static <T> Result<T> createWithSuccessMessage(String message) {
        Result result = createWithSuccessFlag(Constants.YES);
        result.setResultCode(Constants.OPERATION_SUCCESS);
        result.setMessage(message.isEmpty() ? Constants.SUCCESS_MESSAGE : message);
        return result;
    }

    public static <T> Result<T> createWithModel(T model) {
        Result result = createWithSuccessMessage();
        result.setModel(model);
        return result;
    }

}
