package hello.hellospring.service;

import java.util.List;
import java.util.Optional;

import hello.hellospring.domain.Member;
import hello.hellospring.repository.MemberRepository;
import hello.hellospring.repository.MemoryMemberRepository;


public class MemberService {

	private final MemberRepository memberRepository = new MemoryMemberRepository();
	
	
	/**
	 * ȸ�� ����		�ڵ��ּ� ����Ű : alt+shift+j
	 */
	public Long join(Member member) {
		//���� �̸��� �ִ� �ߺ� ȸ��X
//		Optional<Member> result = memberRepository.findByName(member.getName());
//		result.ifPresent(m -> {				//ifPresent�� Optional�� ���� ��� ����
//			throw new IllegalStateException("�̹� �����ϴ� ȸ���Դϴ�.");
//		});
		
		
		validateDuplicateMember(member);	//�ߺ� ȸ�� ����	extract method ����Ű : alt+shift+m
		
		memberRepository.save(member);
			return member.getId();
		}


	private void validateDuplicateMember(Member member) {
		memberRepository.findByName(member.getName())
			.ifPresent(m -> {				//�� �ҽ� �ڵ带 ���ݰ� ���� �ٲܼ� ����.
				throw new IllegalStateException("�̹� �����ϴ� ȸ���Դϴ�.");
			});
	}
	
	
	
	/**
	 * ��ü ȸ�� ��ȸ
	 */
	public List<Member> findMembers() {
		return memberRepository.findAll(); 
	}
	
	
	/**
	 * @param memberId
	 * ȸ���̸� ã��
	 */
	public Optional<Member> findOne(Long memberId) {
		return memberRepository.findById(memberId);
	}
	
}
