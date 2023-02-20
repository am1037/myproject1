package FactoryTest;

public class StationeryFactory {

    public Stationery createStationery(Stationery.Type statType){
        switch (statType){
            case Pen:
                return new Pen();
            case Eraser:
                return new Eraser();
            default:
                throw new IllegalArgumentException();
        }
    }
}
