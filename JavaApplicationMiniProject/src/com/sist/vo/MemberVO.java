package com.sist.vo;
/*
ID       NOT NULL VARCHAR2(20)  
PWD      NOT NULL VARCHAR2(10)  
NAME     NOT NULL VARCHAR2(50)  
SEX               CHAR(6)       
EMAIL             VARCHAR2(100) 
BIRTHDAY NOT NULL DATE          
ADDRESS  NOT NULL VARCHAR2(100) 
REGDATE           DATE    
 */
import java.util.*;

import lombok.Data;
@Data
public class MemberVO {
	private String id,pwd,name,sex,email,address,msg;
	private Date regdate,birthday;
}
