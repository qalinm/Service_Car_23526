class Car {
    public String company;
    public String model;
    public int year;
    public int yearStop;

    public Car(String company, String model, int year, int yearStop) {
        this.company = company;
        this.model = model;
        this.year = year;
        this.yearStop = yearStop;
    }

    public String getCompany() {
        return company;
    }

    public String getModel() {
        return model;
    }

    public int getYear() {
        return year;
    }

    public int getYearStop() {
        return yearStop;
    }

    @Override
    public String toString() {
        return company + ", " + model + ", " + year + ", " + yearStop;
    }
}