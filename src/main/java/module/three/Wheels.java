package module.three;

public class Wheels {
    // we don't own this class, so we can't annotate it with @Inject.

    private Rims rims;
    private Tires tires;

    public Wheels(Rims pRims, Tires pTires) {
        super();
        rims = pRims;
        tires = pTires;
    }

}
