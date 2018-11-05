package cn.axy.xc.xcaddressprovider.test;

import cn.axy.xc.xcaddressprovider.service.AddressService;
import org.bouncycastle.asn1.dvcs.Data;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

@RestController
public class TestController {
    @Resource
    private AddressService ass;
    public AddressService getAss() {
        return ass;
    }
    public void setAss(AddressService ass) {
        this.ass = ass;
    }

    @RequestMapping("/all")
    public String test(){
        String all = ass.getAll();
        return all;
    }
}
