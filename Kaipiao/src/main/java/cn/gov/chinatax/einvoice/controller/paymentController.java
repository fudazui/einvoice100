package cn.gov.chinatax.einvoice.controller;

import lombok.extern.slf4j.Slf4j;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RestController;
import cn.gov.chinatax.einvoice.service.paymentService;
import cn.gov.chinatax.einvoice.entities.CommonResult;
import cn.gov.chinatax.einvoice.entities.paymentEntity;

import javax.annotation.Resource;

@RestController
@Slf4j
public class paymentController {
    @Resource
    private paymentService paymentService1;

    @PostMapping(value = "/payment/create")
    public CommonResult create(paymentEntity paymentEntity) {
        int result = paymentService1.create(paymentEntity);
        log.info("插入结果:"+result);
        if (result>0) {
            return new CommonResult(200,"插入数据成功",result);
        }else{
            return  new CommonResult(444,"插入失败",null);
        }
    }

    @GetMapping(value = "/payment/get/{id}")
    public CommonResult getParamentById(@PathVariable("id") Long id) {
        paymentEntity payment = paymentService1.getParamentById(id);
        log.info("****查询结果："+payment);
        if (payment !=null ) {
            return new CommonResult(200,"查询数据成功",payment);
        } else {
            return new CommonResult(444,"查询数据失败，编号"+id,null);
        }
    }

}
