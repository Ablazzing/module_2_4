package org.javaacademy.homework.homework2.ex2;

public enum LuggageCategory {
    LIGHT("легкий", 5),
    MIDDLE("средний", 10),
    HEAVY("Тяжелый", null);
    private String name;
    private Integer maxLimit;

    LuggageCategory(String name, Integer maxLimit) {
        this.name = name;
        this.maxLimit = maxLimit;
    }

    public String getName() {
        return name;
    }

    public Integer getMaxLimit() {
        return maxLimit;
    }

    @Override
    public String toString() {
        return "LuggageCategory{" +
                "name='" + name + '\'' +
                ", maxLimit=" + maxLimit +
                '}';
    }
}
