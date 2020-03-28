package cn.gov.chinatax.einvoice.dao;
import cn.gov.chinatax.einvoice.entities.paymentEntity;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;

@Mapper
public interface  paymentDao
{
    public int create(paymentEntity payment);
    public paymentEntity getPaymentById(@Param("id") Long id);

}
