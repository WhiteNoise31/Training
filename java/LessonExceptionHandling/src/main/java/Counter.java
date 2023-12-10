import java.io.Closeable;
import java.io.IOException;

//Создайте класс Счетчик, у которого есть метод add(), увеличивающий значение внутренней
//int переменной на 1. Сделайте так, чтобы с объектом такого типа можно было работать
//в блоке try-with-resources. Подумайте, что должно происходить при закрытии этого ресурса?
//Напишите метод для проверки, закрыт ли ресурс. При попытке вызвать add() у закрытого ресурса, должен выброситься IOException
public class Counter implements Closeable {
    private Integer number = 0;
    public int add() throws IOException {
        if (number == null){
            throw new IOException("Ресурс закрыт");
        }
        return ++number;
    }

    @Override
    public void close() throws IOException {
        number = null;
//        isClose = true;

    }
}


