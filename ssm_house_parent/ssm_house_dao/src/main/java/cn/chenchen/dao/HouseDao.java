package cn.chenchen.dao;

import cn.chenchen.domain.House;
import org.apache.ibatis.annotations.*;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HouseDao {

    //查询空房
    @Select("select *,count(*) count from house where houseState = '空房' group by houseName")
    List<House> findAllVacant();

    //根据房名查询
    @Select("select * from house where houseName = #{houseName} and houseState = '空房' ")
    List<House> findByName(String houseName);

    //根据id查找房间
    @Select("select * from house where hid = #{id}")
    House findById(int id);

    //根据id修改房间状态为预订
    @Update("update house set houseState = '预订' where hid = #{hid}")
    void updateToReserveById(int hid);

    //根据id修改房间状态为住人
    @Update("update house set houseState = '住人' where hid = #{hid}")
    void updateToNotVacant(Integer houseId);

    //根据id修改房间状态为空房
    @Update("update house set houseState = '空房' where hid = #{hid}")
    void updateToVacant(Integer houseId);

    //查询全部房间
    @Select("select * from house")
    List<House> findAllHouse();

    //查询全部房间数量
    @Select("select count(*) from house")
    Integer findAllCount();

    //查询空闲房间数量
    @Select("select count(*) from house where houseState = '空房'")
    Integer findVacantCount();

    //查询预定房间数量
    @Select("select count(*) from house where houseState='预订'")
    Integer findPreserveCount();

    //查询住人房间数量
    @Select("select count(*) from house where houseState= '住人'")
    Integer findPeopleCount();

    //查询脏房数量
    @Select("select count(*) from house where houseState='脏房'")
    Integer findDirtyCount();

    //根据房间名查询房间
    @Select("select * from house where houseName = #{houseName}")
    List<House> findByHouseName(String houseName);

    //多条件注解查询失败!
    @Select(" <script> select * from house where 1 = 1  " +
            " <if test=\"houseNum != null\">  and houseNum = #{houseNum} </if> "+
            " <if test=\"houseState != null \">and houseState = #{houseState} </if> "+
            " </script>")
    List<House> findByMutiCondition(@Param("houseNum") String houseNum, @Param("houseState") String houseState);

    //根据房间状态查询
    @Select("select * from house where houseState = #{houseState}")
    List<House> findByHouseState(String houseState);

    @Select("select * from house where houseState='住人'")
    List<House> findNotVacant();

    @Update("update house set houseState = '脏房' where hid = #{hid}")
    void updateToDirty(int hid);

    @Select("select * from house where houseState='脏房'")
    List<House> findDirty();

    @Insert("insert into house(houseName,houseState,housePrice,houseNum) values(#{houseName},#{houseState},#{housePrice},#{houseNum})")
    void addHouse(House house);

    @Update("update house set houseName = #{houseName},houseState = #{houseState},housePrice = #{housePrice},houseNum = #{houseNum} where hid = #{hid}")
    void editHouse(House house);

    @Delete("delete from house where hid = #{id}")
    void delete(int id);
}
