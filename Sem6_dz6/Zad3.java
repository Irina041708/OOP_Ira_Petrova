package OOP_Practica_DZ.Sem6_dz6;


//https://habr.com/ru/post/210288/
//https://yandex.ru/video/preview/16484989985612031002

// Поведенческие:

// Эти паттерны решают проблемы эффективного взаимодействия между объектами
// - Цепочка обязанностей
// - Команда
// - Интерпретатор
// - Интератор 
// - Посредник
// - Хранитель
// - Наблюдатель
// - Состояние
// - Стратегия
// - Шаблонный метод
// - Посетитель

//ЦЕПОЧКА ОБЯЗАННОСТЕЙ

 //рассмотрим применение паттерно цепочко обязанностей
 public class Zad3 {
    public static void main(String[] args) {
        Designer designer = new Designer();
        Carpenters carpenters = new Carpenters();
        FinishingWorker finishingWorker = new FinishingWorker();

        //Создадим цепочку обязанностей
        designer.setNextWorker(carpenters).setNextWorker(finishingWorker);
        //Скомандуем 
        GiveCommand(designer, "спроектировать дом");
        GiveCommand(designer, "класть кирпич");
        GiveCommand(designer,"клеить обои");
        GiveCommand(designer,"провести электропроводку ");
    }

    public static void GiveCommand(IWorker worker, String command) {
        String str = worker.execute(command);
        if(str.equals(""))
            System.out.println(command + "никто не умеет деалть");
        else 
        System.out.println(str);
    }
}

interface IWorker {
    IWorker setNextWorker(IWorker worker);// метод передачи следующему по цепочке рабочему
    String execute(String command);//метод, принимающий команды на исполнение  
}

//Сщздадим абстрактного рабочего IWorker, реализующего интерфейс IWorker

abstract class AbsWorker implements IWorker {
    private IWorker nextWorker;
    public AbsWorker(){
        nextWorker = null; //которое будет зануляться в конструкторе класса
    }

    // и задаваться через реализацию метода setNextIWorker
    @Override
    public IWorker setNextWorker(IWorker worker){
        nextWorker = worker;
        return worker;
    }

    @Override
    public String execute(String command){
        if(nextWorker!=null)
            return nextWorker.execute(command);
        return "";
        
    } 
}

class Designer extends AbsWorker{
    @Override
    public String execute(String command){
        if(command.equals("спроектировать дом")){
            return "Проектировщик выполнил команду:" + command;
        }
        return super.execute(command);
    }
}

class Carpenters extends AbsWorker{
    @Override
    public String execute (String command){
        if(command.equalsIgnoreCase("класть кирпич")){
            return "Плотник выполнил команду: " + command;
        }
        return super.execute(command);
    }
}

class FinishingWorker extends AbsWorker{
    @Override
    public String execute(String command){
        if(command.equalsIgnoreCase("клеить обои")){
            return "Рабочий внутренней отделки выполнил команду: " + command;
        }
        return super.execute(command);
    }
}
