package hello.hellospring.repository;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.Test;

import hello.hellospring.domain.Member;

class MemoryMemberRepositoryTest {
	
	MemberRepository repository = new MemoryMemberRepository();
	
	@Test
	public void save() {
		Member member = new Member();
		member.setName("hello");					//member 객체에 등록할 이름 추가
		member.setPw("hello11");					//member 객체에 등록할 이름 추가
		
		repository.save(member);					//실제 repsository에 save메소드를 호출해서 회원등록
		
		Member result = repository.findById(member.getId()).get();		//검증
		//System.out.println("result = " + (result == member));
		//Assertions.assertEquals(member, null);	//expected, actual
		Assertions.assertThat(member).isEqualTo(result);
	}

	@Test
	public void findByName( ) {
		Member member1 = new Member();
		member1.setName("spring1");
		member1.setPw("qaz");
		repository.save(member1);
		
		Member member2 = new Member();
		member2.setName("spring2");
		member2.setPw("wsx");
		
		repository.save(member2);
			
		Member result = repository.findByName("spring1").get();
		
		assertThat(result).isEqualTo(member1);
	}
	
	@Test
	public void findByPw() {
		Member memberPw1 = new Member();
		memberPw1.setName("hello12");
		memberPw1.setPw("hello12");
		repository.save(memberPw1);
		
		Member memberPw2 = new Member();
		memberPw2.setName("hello2");
		memberPw2.setPw("hello2");
		repository.save(memberPw2);
		
		
		Member result = repository.findByPw(memberPw1.getPw()).get();
		
		
		assertThat(result).isEqualTo(memberPw1);
	}
	
	@Test
	public void findAll() {
		Member member1 = new Member();
		member1.setName("spring1");
		repository.save(member1);
		
		Member member2 = new Member();
		member2.setName("spring2");
		repository.save(member1);
		
		List<Member> result = repository.findAll();
		
		assertThat(result.size()).isEqualTo(2);
		
		
	}
	
}
