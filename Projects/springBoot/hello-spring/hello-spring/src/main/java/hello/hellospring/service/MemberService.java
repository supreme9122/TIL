package hello.hellospring.service;

import java.util.List;
import java.util.Optional;

import hello.hellospring.domain.Member;
import hello.hellospring.repository.MemberRepository;
import hello.hellospring.repository.MemoryMemberRepository;


public class MemberService {

	private final MemberRepository memberRepository = new MemoryMemberRepository();
	
	
	/**
	 * 회원 가입		자동주석 단축키 : alt+shift+j
	 */
	public Long join(Member member) {
		//같은 이름이 있는 중복 회원X
//		Optional<Member> result = memberRepository.findByName(member.getName());
//		result.ifPresent(m -> {				//ifPresent는 Optional로 인해 사용 가능
//			throw new IllegalStateException("이미 존재하는 회원입니다.");
//		});
		
		
		validateDuplicateMember(member);	//중복 회원 검증	extract method 단축키 : alt+shift+m
		
		memberRepository.save(member);
			return member.getId();
		}


	private void validateDuplicateMember(Member member) {
		memberRepository.findByName(member.getName())
			.ifPresent(m -> {				//위 소스 코드를 지금과 같이 바꿀수 있음.
				throw new IllegalStateException("이미 존재하는 회원입니다.");
			});
	}
	
	
	
	/**
	 * 전체 회원 조회
	 */
	public List<Member> findMembers() {
		return memberRepository.findAll(); 
	}
	
	
	/**
	 * @param memberId
	 * 회원이름 찾기
	 */
	public Optional<Member> findOne(Long memberId) {
		return memberRepository.findById(memberId);
	}
	
}
