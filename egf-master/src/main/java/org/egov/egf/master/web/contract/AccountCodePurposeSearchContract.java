package org.egov.egf.master.web.contract ;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor

public class AccountCodePurposeSearchContract extends AccountCodePurposeContract { private String ids; 
private String  sortBy; 
private Integer pageSize; 
private Integer offset; 
} 