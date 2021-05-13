package cn.chenchen.service.impl;

import cn.chenchen.dao.HouseDao;
import cn.chenchen.domain.House;
import cn.chenchen.domain.HouseCount;
import cn.chenchen.service.HouseService;
import com.github.pagehelper.PageHelper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;

@Service
@Transactional
public class HouseServiceImpl implements HouseService {
    @Autowired
    private HouseDao houseDao;

    @Override
    public List<House> findAllVacant() {
        return houseDao.findAllVacant();
    }

    @Override
    public List<House> findByName(String houseName) {
        return houseDao.findByName(houseName);
    }

    @Override
    public House findById(int id) {
        return houseDao.findById(id);
    }

    @Override
    public List<House> findAllHouse() {
        //查询全部房间
        return  houseDao.findAllHouse();
    }

    @Override
    public HouseCount findCount() {
        HouseCount houseCount = new HouseCount();
        //查询全部房间数量
        houseCount.setAllHouseCount(houseDao.findAllCount());
        //查询空闲房间数量
        houseCount.setVacantCount(houseDao.findVacantCount());
        //查询预定房间数量
        houseCount.setPreserveCount(houseDao.findPreserveCount());
        //查询住人房间数量
        houseCount.setPeopleCount(houseDao.findPeopleCount());
        //查询脏房数量
        houseCount.setDirtyCount(houseDao.findDirtyCount());
        return houseCount;
    }

    @Override
    public List<House> findByHouseName(String houseName) {
        return houseDao.findByHouseName(houseName);
    }

    @Override
    public List<House> findByMutiCondition(String houseNum, String houseState) {
        return houseDao.findByMutiCondition(houseNum,houseState);
    }

    @Override
    public List<House> findByHouseState(String houseState) {
        return houseDao.findByHouseState(houseState);
    }

    @Override
    public void updateToPeople(int hid) {
        houseDao.updateToNotVacant(hid);
    }

    @Override
    public List<House> findNotVacant() {
        return houseDao.findNotVacant();
    }

    @Override
    public void updateToDirty(int hid) {
        houseDao.updateToDirty(hid);
    }

    @Override
    public List<House> findDirty() {
        return houseDao.findDirty();
    }

    @Override
    public void updateToVacant(int hid) {
        houseDao.updateToVacant(hid);
    }

    @Override
    public List<House> findAllByPage(int page, int size) {
        PageHelper.startPage(page,size);
        return houseDao.findAllHouse();
    }

    @Override
    public void addHouse(House house) {
        houseDao.addHouse(house);
    }

    @Override
    public void editHouse(House house) {
        houseDao.editHouse(house);
    }

    @Override
    public void delete(int id) {
        houseDao.delete(id);
    }
}
