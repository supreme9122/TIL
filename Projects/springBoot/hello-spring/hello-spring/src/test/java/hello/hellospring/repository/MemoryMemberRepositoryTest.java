package hello.hellospring.repository;

import static org.assertj.core.api.Assertions.assertThat;

import java.util.List;

import org.assertj.core.api.Assertions;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.Test;

import hello.hellospring.domain.Member;

class MemoryMemberRepositoryTest {
	
	MemoryMemberRepository repository = new MemoryMemberRepository();
	
	@AfterEach
	public void afterEach() {
		repository.clearStore();
	}
	
	@Test
	public void save() {
		Member member = new Member();
		member.setName("hello");					//member 객체에 등록할 이름 추가
		//member.setPw("hello11");					//member 객체에 등록할 이름 추가
		
		repository.save(member);					//실제 repsository에 save메소드를 호출해서 회원등록
		
		Member result = repository.findById(member.getId()).get();		//검증
		//System.out.println("result = " + (result == member));
		//Assertions.assertEquals(member, null);	//expected, actual
		Assertions.assertThat(member).isEqualTo(result);
	}

	@Test
	public void findByName( ) {
		Member memberNM = new Member();
		memberNM.setName("springNM");
		memberNM.setPw("springNM");
		repository.save(memberNM);
		
		Member memberNM2 = new Member();
		memberNM2.setName("springNM2");
		memberNM2.setPw("springNM2");
		repository.save(memberNM2);
			
		Member result = repository.findByName("springNM").get();
		
		assertThat(memberNM).isEqualTo(result);
	}
	
	@Test
	public void findByPw() {
		Member memberPW = new Member();
		memberPW.setName("hello");
		memberPW.setPw("hello");
		repository.save(memberPW);
		
		Member memberPW2 = new Member();
		memberPW2.setName("hello2");
		memberPW2.setPw("hello2");
		repository.save(memberPW2);
		
		
		Member result = repository.findByPw(memberPW.getPw()).get();
		
		
		assertThat(memberPW).isEqualTo(result);
	}
	
	@Test
	public void findAll() {
		Member memberALL = new Member();
		memberALL.setName("hello");
		memberALL.setPw("hello");
		repository.save(memberALL);
		
		Member memberALL2 = new Member();
		memberALL2.setName("hello2");
		memberALL2.setPw("hello2");
		repository.save(memberALL2);
		
		List<Member> result = repository.findAll();
		
		assertThat(result.size()).isEqualTo(2);
	}
	
}
