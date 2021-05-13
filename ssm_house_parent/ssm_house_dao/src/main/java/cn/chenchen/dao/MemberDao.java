package cn.chenchen.dao;

import cn.chenchen.domain.Member;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface MemberDao {

    //登录
    @Select("select * from member where userName = #{userName} and passWord = #{passWord}")
    public Member login(Member member);

    //注册
    @Insert("insert into member(userName,passWord,nickName,realName,sex,identificationNum,telephone,email) values(#{userName},#{passWord},#{nickName},#{realName},#{sex},#{identificationNum},#{telephone},#{email})")
    void register(Member member);

    //修改信息
    @Update("update member set nickName=#{nickName},sex=#{sex},email=#{email} where mid = #{mid}")
    void update(Member member);

    //根据id查找用户
    @Select("select * from member where mid = #{mid}")
    Member findById(int id);

    //修改密码
    @Select("update member set passWord =#{passWord} where mid = #{mid}")
    void updatePassword(Member member);

    //查询全部数据
    @Select("select * from member")
    List<Member> findAll();

    //插入一条记录，并且显示刚插入的id
    @Insert("insert into member(userName,passWord,nickName,realName,sex,identificationNum,telephone,email) values(#{userName},#{passWord},#{nickName},#{realName},#{sex},#{identificationNum},#{telephone},#{email})")
    @Options(useGeneratedKeys = true, keyProperty = "id", keyColumn = "id")
    void register2(Member member);

    //根据用户名查
    @Select("select * from member where userName = #{userName}")
    Member findByUserName(String userName);

    //删除用户
    @Delete("delete from member where mid = #{id}")
    void delete(int id);
}
