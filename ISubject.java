//import java.util.ArrayList;
//import java.util.List;
//
//interface ISubject {
//    void RegisterObserver(IObserver1 observer);
//    void RemoveObserver(IObserver1 observer);
//    void NotifyObservers();
//}
//
//class WeatherStation implements ISubject{
//    private List<IObserver1> observers;
//    private float temperature;
//
//    public WeatherStation()
//    {
//        observers = new ArrayList<IObserver1>();
//    }
//
//    public void RegisterObserver(IObserver1 observer)
//    {
//        observers.add(observer);
//    }
//
//    public void RemoveObserver(IObserver1 observer)
//    {
//        observers.remove(observer);
//    }
//
//    public void NotifyObservers()
//    {
//        for (var observer : observers)
//        {
//            observer.Update(temperature);
//        }
//    }
//
//    public void SetTemperature(float newTemperature)
//    {
//        System.out.println("Изменение температуры: "+newTemperature+"°C");
//        temperature = newTemperature;
//        NotifyObservers();
//    }
//}
//
//class WeatherDisplay implements IObserver1 {
//    private String _name;
//
//    public WeatherDisplay(String name) {
//        _name = name;
//    }
//
//    public void Update(float temperature) {
//        System.out.println(_name+ "показывает новую температуру:" + temperature+"°C");
//    }
//}
//
//class Program
//{
//    public static void main(String[] args) {
//
//        WeatherStation weatherStation = new WeatherStation();
//
//        WeatherDisplay mobileApp = new WeatherDisplay("Мобильное приложение");
//        WeatherDisplay digitalBillboard = new WeatherDisplay("Электронное табло");
//
//        weatherStation.RegisterObserver(mobileApp);
//        weatherStation.RegisterObserver(digitalBillboard);
//
//        weatherStation.SetTemperature(25.0f);
//        weatherStation.SetTemperature(30.0f);
//
//        weatherStation.RemoveObserver(digitalBillboard);
//        weatherStation.SetTemperature(28.0f);
//    }
//}
//
