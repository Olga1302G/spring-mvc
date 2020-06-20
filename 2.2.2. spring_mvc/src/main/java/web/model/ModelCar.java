package web.model;

public class ModelCar {
    private String model;
    private int series;
    private String colors;

    public ModelCar(){}

    public ModelCar(String model, int series, String colors) {
        this.model = model;
        this.series = series;
        this.colors = colors;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getSeries() {
        return series;
    }

    public void setSeries(int series) {
        this.series = series;
    }

    public String getColors() {
        return colors;
    }

    public void setColors(String colors) {
        this.colors = colors;
    }

    @Override
    public String toString() {
        return "ModelCar{" +
                "model='" + model + '\'' +
                ", series=" + series +
                ", colors='" + colors + '\'' +
                '}';
    }
}
