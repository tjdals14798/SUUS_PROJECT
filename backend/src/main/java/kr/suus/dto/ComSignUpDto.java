package kr.suus.dto;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class ComSignUpDto {
	private String companyId;
	private String companyPw;
	private String companyName;
	private String contact;
	private String cardNum;
	private String cardYuhyoDate;
	private String ssnNum;
}
