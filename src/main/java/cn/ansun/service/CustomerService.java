package cn.ansun.service;

import cn.ansun.pojo.BaseDict;
import cn.ansun.pojo.Customer;
import cn.ansun.pojo.QueryVo;

import java.util.List;

public interface CustomerService {
	
	public List<BaseDict> findDictByCode(String code);
	
	public List<Customer> findCustomerByVo(QueryVo vo);
	
	public Integer findCustomerByVoCount(QueryVo vo);
	
	public Customer findCustomerById(Long id);
	
	public void updateCustomerState(Customer customer);
	// 删除用户
	public void deleteCustomer(Long id);
}
