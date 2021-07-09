package com.ict.service;

import org.springframework.stereotype.Service;

// 서비스 : DB 트랜잭션처리, DB결과를 가공
// DAO	  : DB 결과 받기
// @Component 원래는 컴포넌트인데 서비스는 서비스로 줌
@Service("calc") // 어노테이션 (이제 이걸 받을 애한테 @autowire를 사용)
public class CalcService {
	public int plus() {
		return 5+3;
	}
	public int minus() {
		return 5-3;
	}
	public int multi() {
		return 5*3;
	}
	public int devide() {
		return 5/3;
	}
}
