package cn.chenchen.service;


import cn.chenchen.domain.Member;

import java.util.List;

public interface MemberService {

    //登录
    public Member login(Member member);

    //注册
    void register(Member member);

    //修改信息
    void update(Member member);

    //修改密码
    void updatePassword(Member member);

    //分页查询全部
    List<Member> findAllByPage(int page, int size);

    //插入一条记录并显示自增id
    Integer register2(Member member);
}
