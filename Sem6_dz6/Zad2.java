package OOP_Practica_DZ.Sem6_dz6;

public class Zad2 {

//реализуем общий интерфейс->создаем классы,коорые реализую этот интерфейс
//->создаем общий абстрактный класс животные на основе этого интерфейса
//->>>>создается класс моста, который отделяет абстрактный класс от его реализации

// Структурные паттерны - цель - построение удобных в поддержке иерархий классов и их взаимосвязей.
// - Адаптер
// - Мост
// - Компоновщик
// - Декоратор
// - Фасад
// - Приспособленец
// - Прокси

// Ещё одним из интересных структурных паттернов является паттерн "Мост" (Bridge). 
// Называется он так, потому что описывает соединение или мост между двумя различными иерархиями классов. 
// Одну из этих иерархий считают абстракцией, а другую — реализацией. 

    
    public static void main(String[] args) {
        Plants pineTree = new Tree (120, new PineTree());
        Plants oak = new Tree (600, new Oak());

        pineTree.drink();
        oak.drink();        
        
    }

     // Отправной точкой является интерфейс
    public static interface Nutrition {
        public void drink(int water);       
    }

    //После чего, конкретные классы реализуют его
    public static class PineTree implements Nutrition {
        @Override
        public void drink (int water) {
            System.out.println("Drinking PineTree " + water + "л. water in a Day.");
        }
    }

    public static class Oak implements Nutrition {
        @Override
        public void drink (int water) {
            System.out.println("Drinking Oak " + water  + "л. water in a Day.");
        }
    }
  
    //С помощью NutritioAPI интерфейса создается абстрактный Plants класс
    public static abstract class Plants {
        protected Nutrition nutrition;/////////////////////????????????

        protected Plants(Nutrition nutrition){//////////////////???????????
            this.nutrition = nutrition;////////////////?????????
        }

        public abstract void drink();
    }

    //Вот тут-то и срабатывает схема Моста. 
    //Создается класс моста, который отделяет абстрактный Plants класс
    //  от его реализации:
    public static class Tree extends Plants{
        private int water;

        public Tree(int water, Nutrition nutrition) {
            super(nutrition);
            this.water = water;  
        }

        public void drink(){
            nutrition.drink(water);
        }
    }
}


