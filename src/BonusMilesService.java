public class BonusMilesService {
    public int calculate(int price) {
        int priceForBonus = 20;
        int quantityOfMiles = price / priceForBonus;
        return quantityOfMiles;
    }
}
