package com.fengxiu.common;



public enum CouponStatus {

    Availbe(1),
    Unavailble(2),
    Used(3);



    private int value;

    CouponStatus(int value)
    {
        this.value = value;
    }

    public int getValue() {
        return value;
    }


}
