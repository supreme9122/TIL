package hello.hellospring.repository;

import java.util.List;
import java.util.Optional;

import hello.hellospring.domain.Member;

public interface MemberRepository {
	Member save(Member member);
	Optional<Member> findById(Long id);
	Optional<Member> findByName(String name);
	Optional<Member> findByPw(String pw);
	//Optional null을 걸러내줌 java8에 들어간 기능
	
	List<Member> findAll();
	
}
