public class Triangolo {

    private float base;
    private float altezza;

    public Triangolo(float base, float altezza) {
        this.base = base;
        this.altezza = altezza;
    }

    public float getBase() {
        return base;
    }

    public float getAltezza() {
        return altezza;
    }

    public float area (){
        return (base*altezza)/2;
    }
}
