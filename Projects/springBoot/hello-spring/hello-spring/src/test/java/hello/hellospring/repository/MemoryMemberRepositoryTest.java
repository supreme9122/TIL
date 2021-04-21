package hello.hellospring.repository;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import hello.hellospring.domain.Member;

class MemoryMemberRepositoryTest {
	
	MemberRepository repository = new MemoryMemberRepository();
	
	@Test
	public void save() {
		Member member = new Member();
		member.setName("hello");					//member ��ü�� ����� �̸� �߰�
		
		repository.save(member);					//���� repsository�� save�޼ҵ带 ȣ���ؼ� ȸ�����
		
		Member result = repository.findById(member.getId()).get();		//����
		//System.out.println("result = " + (result == member));
		Assertions.assertEquals(member, null);	//expected, actual
	}

}
