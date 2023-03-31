package SpeculativeGenerality.NotClean;

public class Person {
    private String name;
    TelephoneNumber numbers;
    public Person(){}
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public TelephoneNumber getNumbers() {
        return numbers;
    }

    public void setNumbers(TelephoneNumber numbers) {
        this.numbers = numbers;
    }
}