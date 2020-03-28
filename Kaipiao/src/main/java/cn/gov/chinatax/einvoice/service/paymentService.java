package cn.gov.chinatax.einvoice.service;
import cn.gov.chinatax.einvoice.entities.paymentEntity;
import org.apache.ibatis.annotations.Param;

public interface paymentService
{
    public int create(paymentEntity payment);
    public paymentEntity getParamentById(@Param("id") Long id);
}
