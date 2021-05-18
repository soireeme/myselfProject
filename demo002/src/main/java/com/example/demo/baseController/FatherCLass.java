package com.example.demo.baseController;

/**
 * @author honglei
 * @version 1.0
 * @date 2021/5/17 16:25
 * @desp
 */
public abstract class FatherCLass {
    private String xx;

    public String getXx() {
        return xx;
    }

    public void setXx(String xx) {
        this.xx = xx;
    }

    protected String getUserId() {
        String userId =xx;
        if (userId == null) {
            throw new  RuntimeException();
        }
        return userId;
    }


}
