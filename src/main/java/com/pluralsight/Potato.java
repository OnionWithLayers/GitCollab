package com.pluralsight;

public class Potato {
    private boolean hot;
    private String name;
    private String location;

    public Potato(String name, String location) {
        this.name = name;
        this.location = location;
        this.hot = false;
    }

    public boolean isHot() {
        return hot;
    }

    public void setHot(boolean hot) {
        this.hot = hot;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }


    @Override
    public String toString() {
        return "Potato{" +
                "hot=" + hot +
                ", name='" + name + '\'' +
                ", location='" + location + '\'' +
                '}';
    }
}
