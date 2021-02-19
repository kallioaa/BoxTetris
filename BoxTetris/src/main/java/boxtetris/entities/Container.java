package boxtetris.entities;

public class Container extends Dimensions {

    private Integer maxWeight;

    public Container(Integer length, Integer width, Integer height, Integer maxWeight) {
        super(length, width, height);
        this.maxWeight = maxWeight;
    }

    /**
     * @return Integer
     */
    public Integer getMaxWeight() {
        return this.maxWeight;
    }

    /**
     * @return String
     */
    @Override
    public String toString() {
        String returnString = "";
        returnString += super.toString();
        returnString += "Max weight: " + maxWeight + "\n";
        return returnString;

    }
}