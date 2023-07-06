package com.UserCoupons.MyCoupons.exception;

import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.ResponseStatus;

@ResponseStatus(HttpStatus.NOT_FOUND)
public class CouponNotFound extends Exception{
    public CouponNotFound(String msg) {
        super(msg);
    }

    public CouponNotFound() {
    }
}
