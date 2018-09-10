package com.example.wxpay.com.dz;

import com.github.wxpay.sdk.WXPay;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

import java.util.HashMap;
import java.util.Map;

@Controller
public class controller {
    @GetMapping("/")
    public String hello(){
        return "index";
    }
    @GetMapping("/wxpay/pay")
    public void pay(){
        WxPayConfig config = new WxPayConfig();
        WXPay wxPay = new WXPay(config);
        Map<String,String> data=new HashMap<String,String>();
        data.put("body", "微信支付测试");
        data.put("out_trade_no",  "");
        data.put("device_info", "");
        data.put("fee_type", "CNY");
        data.put("total_fee", "1");
        data.put("spbill_create_ip", "192.168.0.119");
        data.put("notify_url", "");
        data.put("trade_type", "NATIVE");  // 此处指定为扫码支付
        data.put("product_id", "12");
        try {
            Map<String, String> resp = wxPay.unifiedOrder(data);
            String code_url = resp.get("code_url");
            
        } catch (Exception e) {
            e.printStackTrace();
        }

    }

}
