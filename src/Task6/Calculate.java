package Task6;

public class Calculate {
    int seconds;
    double minutes;
    double hours;
    double days;
    double weeks;
    public void Data(int seconds){
    minutes=seconds/60;
    hours=minutes/60;
    days=hours/24;
    weeks=days/7;
        System.out.println("Часов: "+hours+" Минуты: "+minutes+" Секунды: "+seconds+" Сутки: "+
                days+" Недели: "+weeks);
    }
}