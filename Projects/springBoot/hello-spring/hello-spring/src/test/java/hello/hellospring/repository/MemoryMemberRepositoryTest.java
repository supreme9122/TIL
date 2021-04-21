package hello.hellospring.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import hello.hellospring.domain.Member;

class MemoryMemberRepositoryTest {
	
	MemberRepository repository = new MemoryMemberRepository();
	
	@Test
	public void save() {
		Member member = new Member();
		member.setName("hello");					//member 객체에 등록할 이름 추가
		
		repository.save(member);					//실제 repsository에 save메소드를 호출해서 회원등록
		
		Member result = repository.findById(member.getId()).get();		//검증
		//System.out.println("result = " + (result == member));
		Assertions.assertEquals(member, null);	//expected, actual
	}

}
