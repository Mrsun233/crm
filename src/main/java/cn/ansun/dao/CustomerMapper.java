package cn.ansun.dao;

import cn.ansun.pojo.Customer;
import cn.ansun.pojo.QueryVo;
import org.apache.ibatis.annotations.Mapper;
import org.springframework.stereotype.Repository;

import java.util.List;


public interface CustomerMapper {
	
	public List<Customer> findCustomerByVo(QueryVo vo);
	public Integer findCustomerByVoCount(QueryVo vo);
	
	public Customer findCustomeById(Long id);
	
	public void updateCustomerById(Customer customer);
	public void deleteCustomer(Long id);
}
