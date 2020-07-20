package cn.chenchen.domain;

public class HouseCount {
    private Integer allHouseCount; //全部房间数量
    private Integer vacantCount; //空闲的房间数量
    private Integer preserveCount;//预定的房间数量
    private Integer peopleCount; //住人的数量
    private Integer dirtyCount; //脏房的数量

    public Integer getAllHouseCount() {
        return allHouseCount;
    }

    public void setAllHouseCount(Integer allHouseCount) {
        this.allHouseCount = allHouseCount;
    }

    public Integer getVacantCount() {
        return vacantCount;
    }

    public void setVacantCount(Integer vacantCount) {
        this.vacantCount = vacantCount;
    }

    public Integer getPreserveCount() {
        return preserveCount;
    }

    public void setPreserveCount(Integer preserveCount) {
        this.preserveCount = preserveCount;
    }

    public Integer getPeopleCount() {
        return peopleCount;
    }

    public void setPeopleCount(Integer peopleCount) {
        this.peopleCount = peopleCount;
    }

    public Integer getDirtyCount() {
        return dirtyCount;
    }

    public void setDirtyCount(Integer dirtyCount) {
        this.dirtyCount = dirtyCount;
    }

    @Override
    public String toString() {
        return "HouseCount{" +
                "allHouseCount=" + allHouseCount +
                ", vacantCount=" + vacantCount +
                ", preserveCount=" + preserveCount +
                ", peopleCount=" + peopleCount +
                ", dirtyCount=" + dirtyCount +
                '}';
    }
}
