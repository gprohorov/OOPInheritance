public class Quadrat extends Rectangle{
    private int sideA;

    public Quadrat(int sideA) {
        super(sideA, sideA);
            }

    @Override
    public int getSideA() {
        return sideA;
    }

    @Override
    public void setSideA(int sideA) {
        this.sideA = sideA;
    }
}
