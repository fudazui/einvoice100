package cn.gov.chinatax.einvoice.service;

import cn.gov.chinatax.einvoice.entities.paymentEntity;
import cn.gov.chinatax.einvoice.dao.paymentDao;
import org.apache.ibatis.annotations.Param;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Service;

import javax.annotation.Resource;

@Service
public class paymentServiceImpl implements  paymentService{
    @Resource
    private paymentDao paymentdao;

    public int create(paymentEntity payment) {
        return paymentdao.create(payment);
    }
    public paymentEntity getParamentById(@Param("id") Long id){
        return paymentdao.getPaymentById(id);
    }
}
