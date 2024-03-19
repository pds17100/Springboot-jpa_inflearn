package jpabook.jpashop;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;

@Repository //Component 대상이 돼서 자동으로 스프링빈에 등록
public class MemberRepository {

    @PersistenceContext
    private EntityManager em;


    public Long save(Member member) {
        em.persist(member);
        return member.getId();
    }

    public Member find(Long id) {   //조회
        return em.find(Member.class, id);
    }
}
