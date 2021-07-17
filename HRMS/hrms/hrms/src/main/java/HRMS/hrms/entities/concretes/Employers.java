package HRMS.hrms.entities.concretes;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="employers")
@AllArgsConstructor
@NoArgsConstructor

public class Employers {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	
	@Column(name="id")
	private int id;
	
//	@Column(name="category_id")
//	private int categoryId;
	
	@Column(name="mail")
	private String mail;
	
	@Column(name="password")
	private String password;
	
	@Column(name="company_name")
	private String companyName;
	
	@Column(name="web_site")
	private String WebSite;
	
	@Column(name="phone_no")
	private String phoneNo;

	@ManyToOne
	@JoinColumn(name="category_id")
	private Category category;
	
}
