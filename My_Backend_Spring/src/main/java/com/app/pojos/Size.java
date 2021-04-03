package com.app.pojos;


import javax.persistence.*;


//E_ID	email	pwd	name	mob	role(ENUM)	ADDR_ID	DOB	ID_proof(img/aadhar no)	manager_ID	E_status(working/not)
@Entity
@Table(name = "size")
public class Size {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer sizeId;
	@Column(name = "size_type", length = 25, unique = true)
	private String sizeType;
	@Column(name = "size_price")
	private Double sizePrice;
	
	

	public Size() {
		System.out.println("inside ctor of " + getClass().getName());
	}



	public Integer getSizeId() {
		return sizeId;
	}



	public void setSizeId(Integer sizeId) {
		this.sizeId = sizeId;
	}



	public String getSizeType() {
		return sizeType;
	}



	public void setSizeType(String sizeType) {
		this.sizeType = sizeType;
	}



	public Double getSizePrice() {
		return sizePrice;
	}



	public void setSizePrice(Double sizePrice) {
		this.sizePrice = sizePrice;
	}



	@Override
	public String toString() {
		return "Size [sizeId=" + sizeId + ", sizeType=" + sizeType + ", sizePrice=" + sizePrice + "]";
	}

	
}
