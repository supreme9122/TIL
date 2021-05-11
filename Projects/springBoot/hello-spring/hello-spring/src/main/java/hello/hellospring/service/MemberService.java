package hello.hellospring.service;

import java.util.Optional;

import hello.hellospring.domain.Member;
import hello.hellospring.repository.MemberRepository;
import hello.hellospring.repository.MemoryMemberRepository;


public class MemberService {

	private final MemberRepository memberRepository = new MemoryMemberRepository();
	
	
	/**
	 * 회원 가입
	 */
	public Long join(Member member) {
		//같은 이름이 있는 중복 회원X
		Optional<Member> result = memberRepository.findByName(member.getName());
		result.ifPresent(m -> {				//ifPresent는 `Optional로 인해 사용 가능
			throw new IllegalStateException("이미 존재하는 회원입니다.");
		});
		
		memberRepository.save(member);
		return member.getId();
	}
}
