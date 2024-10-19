interface IObserver1 {
    void akcia(double akcia);
}
interface ISubject1{
    void message();
}
class StockExchange implements ISubject1{
    @Override
    public void message() {
        System.out.println("new message");
    }
}
class Trader implements IObserver1{
    String name;

    public Trader(String name) {
        this.name = name;
    }

    @Override
    public void akcia(double akcia) {
        System.out.println("new akcia: "+akcia);
    }
}
class TradingRobot implements IObserver1 {
    private double threshold; // Порог для автоматической покупки/продажи

    public TradingRobot(double threshold) {
        this.threshold = threshold;
    }

    @Override
    public void akcia(double akcia) {
        System.out.println("akcia: "+akcia);
    }
}
class Main2{
    public static void main(String[] args) {
        Trader trader = new Trader("Assiya");
        trader.akcia(8.1);
        TradingRobot tradingRobot = new TradingRobot(4.3);
        tradingRobot.akcia(1.2);
    }
}