package org.lesson4.task2;

import java.util.ArrayList;

public class FactoryProvider {

    private final ArrayList<ComponentInfo> components = new ArrayList<>();

    {
        for (int i = 0; i < 10; i++) {
            components.add(
                    new ComponentInfo(900000 + i,
                            String.format("component description %d", 900000 + i)));
        }

        for (int i = 0; i < 5; i++) {
            components.add(
                    new ComponentInfo(1000 + i,
                            String.format("component description %d", 1000 + i)));
        }
    }

    /**
     * Получить информацию о детали по идентификатору
     * @param id Идентификатор детели
     * @throws RuntimeException исключения при обработке операции поиска
     * @return Информация о детали
     */
    public ComponentInfo getComponentInfo(int id) throws RuntimeException {

        // Предусловие
        if (id < 0)
            throw new RuntimeException("Некорректный номер детали");
        if (String.valueOf(id).length() < 6)
            throw new RuntimeException("Некорректный номер детали." +
                    "деталь существует, но устарела" +
                    " более не производиться.");

        // Выполнение основного кода подпрограммы
        ComponentInfo searchComponent = null;
        for (ComponentInfo componentInfo : components) {
            if (componentInfo.getId() == id) {
                searchComponent = componentInfo;
                break;
            }
        }

        // Постусловие
        if (searchComponent == null)
            throw new RuntimeException("Деталь не найдена.");


        return searchComponent;
    }
}
