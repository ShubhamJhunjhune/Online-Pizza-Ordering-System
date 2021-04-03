package com.app.dao;

import org.springframework.data.jpa.repository.JpaRepository;



import com.app.pojos.SubMenu;

public interface SubMenuRepository extends JpaRepository<SubMenu,Integer>{

//	@Query("select c from Customers c where c.custId=:id and c.custPass=:pass")
//	Optional<Customers> validateCustomer(@Param("id")int id,@Param("pass") String pwd);
//	
}
