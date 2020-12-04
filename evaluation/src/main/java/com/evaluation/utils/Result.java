package com.evaluation.utils;

import java.io.Serializable;

/**
 * @author: chg
 * @date: 2020/3/26 09:32
 * @Description:
 */
public class Result<T> implements Serializable {
    private boolean success;
    private int codeNum;
    private String codeDesc;
    private T value;

    private Result() {
    }

    public static <T> Result<Object> ofSuccess() {
        return ofSuccess((Object) null);
    }

    public static <T> Result<T> ofSuccess(T value) {
        Result<T> result = new Result();
        result.setSuccess(true);
        result.setValue(value);
        return result;
    }

    public static <T> Result<T> ofErrorT(int codeNum, String codeDesc) {
        Result<T> result = new Result();
        result.setSuccess(false);
        result.setCodeNum(codeNum);
        result.setCodeDesc(codeDesc);
        return result;
    }

    public static Result ofError(int codeNum, String codeDesc) {
        Result result = new Result();
        result.setSuccess(false);
        result.setCodeNum(codeNum);
        result.setCodeDesc(codeDesc);
        return result;
    }

    public void setSuccess(boolean success) {
        this.success = success;
    }

    public int getCodeNum() {
        return this.codeNum;
    }

    public void setCodeNum(int codeNum) {
        this.codeNum = codeNum;
    }

    public String getCodeDesc() {
        return this.codeDesc;
    }

    public void setCodeDesc(String codeDesc) {
        this.codeDesc = codeDesc;
    }

    public T getValue() {
        return this.value;
    }

    public void setValue(T value) {
        this.value = value;
    }

    public boolean isSuccess() {
        return this.success;
    }

    @Override
    public String toString() {
        return "Result{" +
                "success=" + success +
                ", codeNum=" + codeNum +
                ", codeDesc='" + codeDesc + '\'' +
                ", value=" + value +
                '}';
    }
}
