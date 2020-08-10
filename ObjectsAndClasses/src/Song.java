public class Song {
    private String typeList;
    private String name;
    private String time;

    void setTypeList(String typeList) {
        this.typeList = typeList;
    }

    void setName(String name) {
        this.name = name;
    }

    void setTime(String time) {
        this.time = time;
    }

    String getTypeList() {
        return  this.typeList;
    }

    String getName() {
        return this.name;
    }

    public String getTime() {
        return this.time;
    }
}
