package com.app.pojos;


import javax.persistence.*;


//E_ID	email	pwd	name	mob	role(ENUM)	ADDR_ID	DOB	ID_proof(img/aadhar no)	manager_ID	E_status(working/not)
@Entity
@Table(name = "crust")
public class Crust {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer crustId;
	@Column(name = "crust_name", length = 25, unique = true)
	private String crustName;
	@Column(name = "crust_price")
	private Double crustPrice;
	

	public Crust() {
		System.out.println("inside ctor of " + getClass().getName());
	}

	
}
