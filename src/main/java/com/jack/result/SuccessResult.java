package com.jack.result;

/**
 * Created on 2017/9/16.
 */
public class SuccessResult extends BaseResult {

    private Object data;

    public Object getData() {
        return data;
    }

    public void setData(Object data) {
        this.data = data;
    }

    public SuccessResult(Object object) {
        this();
        this.data = object;
    }

    public SuccessResult() {
        super(SUCCESS);
    }

    @Override
    public String toString() {
        return "SuccessResult{" +
                "data=" + data +
                '}';
    }
}
