package hello.hellospring.repository;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Optional;

import hello.hellospring.domain.Member;


public class MemoryMemberRepository implements MemberRepository{

	
	//memory 이므로 저장공간이 필요함.
	private static Map<Long, Member> store = new HashMap<>();		//회원 id가 Key이기 때문에 제너럴에 Long 선언합니다.
	private static Long sequence = 0L;
	private Object member;
	
	@Override
	public Member save(Member member) {
		member.setId(++sequence);		// id는 데이터 구분을 위함으로, sequence(데이터 입력시 단순히 1씩 증가)로 입력합니다.
		store.put(member.getId(), member);
		return member;
	}

	@Override
	public Optional<Member> findById(Long id) {
		return Optional.ofNullable(store.get(id));
        //Optional.ofNullalbe 데이터 값이 null 일경우에도 감쌀수가 있습니다.
	}

	@Override
	public Optional<Member> findByName(String name) {
		return store.values().stream()
					.filter(member -> member.getName().equals(name))
					.findAny();
		
        // 자바 8버전에서 사용할수 있는 람다식 입니다. 
        // roop를 도는데 member에서 member.getName()과 name이 동일할 경우만 필터링이 된다 라고 생각하시면 됩니다.
        // 찾으면 해당 값을 반환하게 됩니다.
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