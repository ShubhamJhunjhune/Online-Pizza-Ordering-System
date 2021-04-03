
package com.app.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.app.custom_excs.CustomerHandlingException;
import com.app.dao.CartRepository;
import com.app.dao.CustomerOrderDetailsRepository;
import com.app.dao.CustomerOrderRepository;
import com.app.dao.CustomerRepository;
import com.app.dao.SubMenuRepository;
import com.app.dao.UserRepository;
import com.app.dto.CartDTO;
import com.app.dto.CustomerDTO;
import com.app.dto.CustomerOrderDetailsDTO;
import com.app.dto.ShowCartDTO;
import com.app.pojos.CustomerCart;
import com.app.pojos.CustomerOrder;
import com.app.pojos.CustomerOrderDetails;
import com.app.pojos.Customers;
import com.app.pojos.SubMenu;
import com.app.pojos.User;
import com.app.pojos.UserRole;

@Service
@Transactional
public class CustomerServiceImpl implements ICustomerService {

	@Autowired
	private CustomerRepository customerRepo;
	@Autowired
	private CartRepository cartRepo;
	@Autowired
	private CustomerOrderRepository custOrderRepo;
	@Autowired
	private CustomerOrderDetailsRepository custOrderDetailsRepo;
	@Autowired
	private UserRepository userRepo;
	@Autowired
	private SubMenuRepository subMenuRepository;

	@Override
	public List<Customers> getAllCustomers() {
		return customerRepo.findAll();

	}

	@Override
	public Customers addCustomerDetails(CustomerDTO customerDTO) {
		Customers customers = new Customers();
		BeanUtils.copyProperties(customerDTO, customers);
		System.out.println("add user src : " + customerDTO);
		System.out.println(customers);
		customers.setRole("CUSTOMER");
		User user = new User();
		user.setUserEmail(customerDTO.getCustEmail());
		user.setPassword(customerDTO.getCustPass());
		user.setRole(UserRole.CUSTOMER);
		userRepo.save(user);
		return customerRepo.save(customers);

	}

	@Override
	public Customers authenticateCustomer(String customerId, String pwd) {
		System.out.println(customerId + "  pwd " + pwd);
		return customerRepo.validateCustomer(customerId, pwd)
				.orElseThrow(() -> new CustomerHandlingException("Invalid Credentials!!!!"));
	}

	@Override
	public Customers editCustomerDetails(int custId, CustomerDTO customerDTO) {
		System.out.println("in update " + customerDTO);
		Customers custDetails = customerRepo.findById(custId).get();
		// customerDTO.setCustId(custDetails.getCustId());
		System.out.println("user dtls from db " + custDetails);
		BeanUtils.copyProperties(customerDTO, custDetails, "custEmail", "custPass", "custId");
		System.out.println("updated customer dtls " + custDetails);
		// return null;
		return custDetails;

	}

	@Override
	public CustomerCart addToCart(int custId, CartDTO cartDTO) {
		System.out.println("inside service imple " + cartDTO + " id  " + custId);
		// Customers cust = customerRepo.findById(custId).get();
		CustomerCart customerCart = new CustomerCart();

		BeanUtils.copyProperties(cartDTO, customerCart);
		customerCart.setCustId(custId);
		System.out.println("after copying properties:" + customerCart);
		return cartRepo.save(customerCart);
		// return null;
	}

	@Override
	public List<CustomerCart> getAllCart(int custId) {
		return cartRepo.findAllCart(custId);
	}

	@Override
	public CustomerOrder addToCustomerOrder(int custId) {
		System.out.println("inside service imple " + custId);
		List<CustomerCart> customerCart = new ArrayList<>();
		customerCart = customerRepo.findAllById(custId);
		System.out.println(customerCart);
		int adrid = 0;
		double total = 0;
		for (CustomerCart cc : customerCart) {
			adrid = cc.getAddrId();
			total = total + cc.getTotal();
		}
		System.out.println("adrid = " + adrid + "total = " + total);
		CustomerOrder customerOrder = new CustomerOrder();
		customerOrder.setAddrId(adrid);
		customerOrder.setTotal(total);
		customerOrder.setCustId(custId);
		customerOrder.setOrderStatus("PENDING");
		custOrderRepo.save(customerOrder);
		System.out.println(customerOrder.getOrderId());

		CustomerOrderDetails customerOrderDetails = new CustomerOrderDetails();
		CustomerOrderDetailsDTO customerOrderDetailsDTO = new CustomerOrderDetailsDTO();
		for (CustomerCart cc1 : customerCart) {

			BeanUtils.copyProperties(cc1, customerOrderDetailsDTO);
			customerOrderDetailsDTO.setOrderId(customerOrder.getOrderId());
			BeanUtils.copyProperties(customerOrderDetailsDTO, customerOrderDetails, "cartId", "addrId");
			customerOrderDetails.setOrderStatus("PENDING");
			custOrderDetailsRepo.save(customerOrderDetails);
		}
		System.out.println("Cart Id Deleted : " + custId);
		cartRepo.deleteCart(custId);

		return customerOrder;

	}

	@Override
	public List<SubMenu> getCustomerOrderHistory(int custId) {
		 List<CustomerOrderDetails> list  = custOrderDetailsRepo.findAllOrderHistory(custId);
		 List<SubMenu> res = new ArrayList<SubMenu>();
		 for (CustomerOrderDetails co : list) {
			 SubMenu subMenu = subMenuRepository.findById(co.getSubMenuId())
						.orElseThrow(() -> new CustomerHandlingException("Error in getCustomerOrderHistory!!!!"));
			 res.add(subMenu);
			 System.out.println(subMenu);
		}
		 System.out.println(res);
	return res;
	}

	@Override
	public String deleteCart(int cartId) {
		cartRepo.deleteById(cartId);
		return "deleted";
	}

	@Override
	public List<ShowCartDTO> getAllCartDetails(int custId) {
		List<CustomerCart> customerCart = cartRepo.findAllCart(custId);
		List<ShowCartDTO> showCartDTO = new ArrayList<>();
		for (CustomerCart cc2 : customerCart) {
			int ssid = cc2.getSubMenuId();
			SubMenu subMenu = subMenuRepository.findById(ssid)
					.orElseThrow(() -> new CustomerHandlingException("Error in Getting Cart Details!!!!"));

			ShowCartDTO cartDTO = new ShowCartDTO(cc2.getCartId(), cc2.getCustId(), subMenu.getSubMenuName(),subMenu.getSubMenuDetails(),subMenu.getSubMenuBasePrice(),
					cc2.getSizeId(), cc2.getCrustId(), cc2.getAddrId(), cc2.getQty(), cc2.getTotal());

			showCartDTO.add(cartDTO);

			System.out.println("in for :"+cartDTO);
		}
		System.out.println(showCartDTO);
		return showCartDTO;
	}

	/*
	 * System.out.println("customerOrderDetailsDTO : " + customerOrderDetailsDTO);
	 * System.out.println("cc1 : " + cc1);
	 * System.out.println("customerOrderDetails : " + customerOrderDetails);
	 * 
	 * Yash Code :
	 * 
	 * @Override public CustomerOrder addToCustomerOrder(int custId, List<CartDTO>
	 * cartDTO) { System.out.println("inside service impl " + custId + "cart " +
	 * cartDTO); // int adrid = cartDTO.get(1).getAddrId(); double total = 0; for
	 * (CartDTO cartDTO2 : cartDTO) { total = total + cartDTO2.getTotal(); }
	 * CustomerOrder custOrder = new CustomerOrder(custId,
	 * cartDTO.get(0).getAddrId(), total); custOrderRepo.save(custOrder);
	 * System.out.println(addToCustomerOrderDetails(custId, custOrder.getOrderId(),
	 * cartDTO)); System.out.println("Cart Id Deleted : "+custId);
	 * cartRepo.deleteCart(custId); return custOrder; }
	 * 
	 * // Cart Cart_ID C_ID S_ID size_id crust_id Addr_ID O_DATE_AND_TIME O_QTY //
	 * total(base+size+crust) Cart_status public String
	 * addToCustomerOrderDetails(int custId, int orderId, List<CartDTO> cartDTO) {
	 * System.out.println("inside service impl " + custId + "cart " + cartDTO +
	 * "order id " + orderId); // List<CustomerOrderDetails> custOrderDetails = new
	 * ArrayList<>(); CustomerOrderDetails custOrderDetails = new
	 * CustomerOrderDetails(); CustomerOrderDetailsDTO custOrderDetailsDTO = new
	 * CustomerOrderDetailsDTO(); for (CartDTO cart : cartDTO) {
	 * custOrderDetailsDTO.setOrderId(orderId);
	 * 
	 * BeanUtils.copyProperties(cart, custOrderDetailsDTO);
	 * custOrderDetailsDTO.setCustId(custId);
	 * BeanUtils.copyProperties(custOrderDetailsDTO, custOrderDetails);
	 * custOrderDetailsRepo.save(custOrderDetails);
	 * System.out.println(custOrderDetails); } // Collections.copy(custOrderDetails,
	 * cartDTO); // custOrderDetails.add((CustomerOrderDetails) cartDTO);
	 * 
	 * System.out.println(custOrderDetails); return "updated";
	 * 
	 * }
	 */

}