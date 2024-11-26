package kr.suus.entity;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@NoArgsConstructor
@AllArgsConstructor
public class Company {
	private String companyId;
	private String companyPw;
	private String companyName;
	private String contact;
	private String registration;
}
