package com.smhrd.web.repo;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.smhrd.web.domain.Cloudtest;

@Repository
public interface CloudtestRepository extends JpaRepository<Cloudtest, Long> {

	// JpaRepository<테이블을 대표하는 자료형, 테이블의 pk 자료형>
	// JpaRepository<Cloudtest, Long>
	// interface이지만, 일종의 자료형태를 정하는 개념으로 봐서 extends로 상속 받음
	// !!!! 특이 케이스입 !!!!
	
	// 메소드명을 기준으로 sql 구문을 생성
	// Java 기본적으로 이름을 지어줄 때, 카멜식 기법을 따름
	Cloudtest findByAndName(Long id, String name);
	// select * from cloudtest where id = ? and name = ?
}
