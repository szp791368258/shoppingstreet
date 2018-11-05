package cn.axy.xc.xcaddressprovider;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;

@SpringBootApplication
@EnableDiscoveryClient//表示是注册中心客户端
public class XcAddressProviderApplication {
    public static void main(String[] args) {
        SpringApplication.run(XcAddressProviderApplication.class, args);
    }
}
