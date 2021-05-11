package hello.hellospring.service;

import java.util.Optional;

import hello.hellospring.domain.Member;
import hello.hellospring.repository.MemberRepository;
import hello.hellospring.repository.MemoryMemberRepository;


public class MemberService {

	private final MemberRepository memberRepository = new MemoryMemberRepository();
	
	
	/**
	 * ȸ�� ����
	 */
	public Long join(Member member) {
		//���� �̸��� �ִ� �ߺ� ȸ��X
		Optional<Member> result = memberRepository.findByName(member.getName());
		result.ifPresent(m -> {				//ifPresent�� `Optional�� ���� ��� ����
			throw new IllegalStateException("�̹� �����ϴ� ȸ���Դϴ�.");
		});
		
		memberRepository.save(member);
		return member.getId();
	}
}
