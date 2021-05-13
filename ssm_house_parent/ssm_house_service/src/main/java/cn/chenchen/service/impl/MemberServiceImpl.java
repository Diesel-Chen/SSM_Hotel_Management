package cn.chenchen.service.impl;

import cn.chenchen.dao.MemberDao;
import cn.chenchen.domain.Member;
import cn.chenchen.service.MemberService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class MemberServiceImpl implements MemberService {

    @Autowired
    private MemberDao memberDao;


    @Override
    public Member login(Member member) {
        return memberDao.login(member);
    }

    @Override
    public void register(Member member) {
        memberDao.register(member);
    }

    @Override
    public void update(Member member) {
        memberDao.update(member);
    }

    @Override
    public void updatePassword(Member member) {
        memberDao.updatePassword(member);
    }

    @Override
    public List<Member> findAllByPage(int page, int size) {
        PageHelper.startPage(page,size);
        return memberDao.findAll();

    }

    @Override
    public Integer register2(Member member) {
        memberDao.register2(member);
        Member m = memberDao.findByUserName(member.getUserName());
        return m.getMid();
    }

    @Override
    public void delete(int id) {
        memberDao.delete(id);
    }

    @Override
    public Member FindById(int id) {
        return memberDao.findById(id);
    }
}
