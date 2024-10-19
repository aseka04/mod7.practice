
class TravelBookingContext {
    private ICostCalculationStrategy costCalculation;

    public TravelBookingContext(ICostCalculationStrategy costCalculation) {

    }

    @Override
    public String toString() {
        return "TravelBookingContext{" +
                "costCalculation=" + costCalculation +
                '}';
    }

    public void ChangeTravelCost(ICostCalculationStrategy costCalculation) {
        this.costCalculation = costCalculation;
    }


    public void getTravelCost(int i, ServiceClass serviceClass, boolean b, boolean b1) {
    }
}


class TravelCostClient {
    public static void main(String[] args) {
        TravelBookingContext bookingContext = new TravelBookingContext(new AirplaneCost());
        bookingContext.getTravelCost(8, ServiceClass.business, true, true);
        System.out.println(bookingContext);
    }
}
