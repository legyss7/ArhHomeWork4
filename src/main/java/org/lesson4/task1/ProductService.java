package org.lesson4.task1;

import java.io.File;
import java.security.cert.CollectionCertStoreParameters;
import java.util.ArrayList;
import java.util.Collection;

public class ProductService implements Readable {

    private ArrayList<String> res;

    public void process1() {

    }

    public void process2() {
        res = null;
    }

    public Collection<String> readTextFile(File file) throws RuntimeException {
        //Предусловие
        if (file.exists()) {
            if (file.length() > 5000)
                throw new RuntimeException("Размер файла более 5 мб.");
        } else {
            throw new RuntimeException("Файл не найден.");
        }

        //region Работа с данными
        //TODO: Считывание данных
        res = new ArrayList<>();
        //TODO: Выполнение основного кода ...
        res.add("AAAAAAA");
        res.add("BBBBBBB");

        process1();
        // Инвариант
        validateResult(res);
        process2();
        // Инвариант
        validateResult(res);
        //endregion

        //Постусловие
        if (res == null) {
            throw new RuntimeException("Ошибка обработки данных.");
        }

        //TODO: Возвращаем результат выполнения задачи ...
        return res;
    }

    private void validateResult(Collection<String> res) {
        if (res == null || res.isEmpty()) {
            throw new RuntimeException("Некорректное состояние объекта.");
        }
    }
}

/**
 * Позволяет считывать данные
 */
interface Readable {
    /**
     * Считывание и обработка данных
     * @param file файл
     * @return коллекция данных
     * @throws RuntimeException исключения при обработке файла
     */
    Collection<String> readTextFile(File file) throws RuntimeException;
}