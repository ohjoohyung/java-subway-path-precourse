package subway.domain;

public class Station {
    private String name;

    public Station(String name) {
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public boolean isSame(String name) {
        return this.name.equals(name);
    }

    // 추가 기능 구현
}
