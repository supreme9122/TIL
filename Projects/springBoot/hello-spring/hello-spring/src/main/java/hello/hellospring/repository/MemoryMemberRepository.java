package hello.hellospring.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import hello.hellospring.domain.Member;


public class MemoryMemberRepository implements MemberRepository{

	
	//memory �̹Ƿ� ��������� �ʿ���.
	private static Map<Long, Member> store = new HashMap<>();		//ȸ�� id�� Key�̱� ������ ���ʷ��� Long �����մϴ�.
	private static Long sequence = 0L;
	private Object member;
	
	@Override
	public Member save(Member member) {
		member.setId(++sequence);		// id�� ������ ������ ��������, sequence(������ �Է½� �ܼ��� 1�� ����)�� �Է��մϴ�.
		store.put(member.getId(), member);
		return member;
	}

	@Override
	public Optional<Member> findById(Long id) {
		return Optional.ofNullable(store.get(id));
        //Optional.ofNullalbe ������ ���� null �ϰ�쿡�� ���Ҽ��� �ֽ��ϴ�.
	}

	@Override
	public Optional<Member> findByName(String name) {
		return store.values().stream()
					.filter(member -> member.getName().equals(name))
					.findAny();
		
        // �ڹ� 8�������� ����Ҽ� �ִ� ���ٽ� �Դϴ�. 
        // roop�� ���µ� member���� member.getName()�� name�� ������ ��츸 ���͸��� �ȴ� ��� �����Ͻø� �˴ϴ�.
        // ã���� �ش� ���� ��ȯ�ϰ� �˴ϴ�.
	}

	@Override
	public Optional<Member> findByPw(String pw) {
		return store.values().stream()
				.filter(member -> member.getPw().equals(pw))
				.findAny();
	}

	@Override
	public List<Member> findAll() {
		return new ArrayList<>(store.values());
	}

	
}