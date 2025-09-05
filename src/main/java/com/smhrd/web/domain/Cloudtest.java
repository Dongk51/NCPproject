package com.smhrd.web.domain;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

// Entity 어노테이션 필수!!
@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
public class Cloudtest {
	
	// int 보다 long이 표현법이 길어서 jpa에서는 long으로 사용
	@Id
	private Long id;
	private String name;
	private String gender;
	private int age;
	
}
