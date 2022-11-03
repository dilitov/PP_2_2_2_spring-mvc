package web.model;

public class Cars {
    private String marka;
    private String model;
    private String number;

    public Cars() {
    }

    public Cars(String marka, String model, String number) {
        this.marka = marka;
        this.model = model;
        this.number = number;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getNumber() {
        return number;
    }

    public void setNumber(String number) {
        this.number = number;
    }

    @Override
    public String toString() {
        return "Cars{" +
                "marka='" + marka + '\'' +
                ", model='" + model + '\'' +
                ", gosNumber='" + number + '\'' +
                '}';
    }
}
