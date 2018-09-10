package com.example.wxpay.com.dz;

import com.github.wxpay.sdk.WXPayConfig;

import java.io.InputStream;

public class WxPayConfig implements WXPayConfig {

    @Override
    public String getAppID() {
        return "wx11bd61834b0d57ef";
    }

    @Override
    public String getMchID() {
        return "1234567890";
    }

    @Override
    public String getKey() {
        return "1234567890";
    }

    @Override
    public InputStream getCertStream() {
        return null;
    }

    @Override
    public int getHttpConnectTimeoutMs() {
        return 0;
    }

    @Override
    public int getHttpReadTimeoutMs() {
        return 0;
    }
}
