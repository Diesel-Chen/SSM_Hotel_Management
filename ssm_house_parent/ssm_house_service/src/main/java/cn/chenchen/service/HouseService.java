package cn.chenchen.service;

import cn.chenchen.domain.House;
import cn.chenchen.domain.HouseCount;

import java.util.List;

public interface HouseService {

    //查询空房
    List<House> findAllVacant();

    //根据房名选择具体房间 （空房）
    List<House> findByName(String houseName);

    //根据id查找房间
    House findById(int hid);

    //查询全部房间
    List<House> findAllHouse();

    //查询各种状态下的房间数量
    HouseCount findCount();

    //根据房间名查询房间
    List<House> findByHouseName(String houseName);

    //多条件查询房间
    List<House> findByMutiCondition(String houseNum, String houseState);

    //根据房间状态查询
    List<House> findByHouseState(String houseState);

    //把房间改为住人
    void updateToPeople(int hid);

    List<House> findNotVacant();

    void updateToDirty(int hid);

    List<House> findDirty();

    void updateToVacant(int hid);

    List<House> findAllByPage(int page, int size);

    void addHouse(House house);
}
