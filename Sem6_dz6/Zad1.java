package OOP_Practica_DZ.Sem6_dz6;

// Реализуйте по одному паттерну не рассмотренных на этом занятии 
// из каждой группы (один порождающий, один структурный и 
// один поведенческий). Постарайтесь не смотреть в примеры
// и вначале реализовать его по описанию

// Порождающие - эти паттерны решают проблемы обеспечения гибкости создания объектов
// - Абстрактная фабрика
// - Строитель
// - Фабричный метод
// - Прототип
// - Одиночка

public class Zad1 {
    public static void main(String[] args) {
        StringBuilder patternBuilder = new StringBuilder();
        patternBuilder.append("Оказывается ");
        patternBuilder.append("это ");
        patternBuilder.append("паттерн ");
        patternBuilder.append("строить ");
        patternBuilder.append("!!! ");
        System.out.println(patternBuilder.toString());
    }
    
}
