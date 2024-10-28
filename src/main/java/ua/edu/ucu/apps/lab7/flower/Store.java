package ua.edu.ucu.apps.lab7.flower;

public class Store {
    private FlowerBucket flowerBucket;

    public Store() {
        this.flowerBucket = new FlowerBucket();
    }

    public Store(FlowerBucket flowerBucket) {
        this.flowerBucket = flowerBucket;
    }

    public FlowerPack[] search(Flower searchFlower) {
        FlowerPack[] searchResult = new 
        FlowerPack[flowerBucket.getFlowerBucket().length];
        int j = 0;
        for (FlowerPack flowerPack : flowerBucket.getFlowerBucket()) {
            if (flowerPack.getFlower().matches(searchFlower)) {
                searchResult[j] = flowerPack;
                j++;
            }
        }
        return searchResult;

    }

}
