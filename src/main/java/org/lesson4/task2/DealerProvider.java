package org.lesson4.task2;

/**
 * Дилер
 */
public class DealerProvider {

    private final FactoryProvider factoryProvider;

    public DealerProvider(FactoryProvider factoryProvider) {
        this.factoryProvider = factoryProvider;
    }

    /**
     *
     * @param id
     * @return
     */
    public ComponentInfo getComponent(int id) {
        // Предусловие ...
//        if (id < 0 || String.valueOf(id).length() < 6)
//            throw new RuntimeException("Некорректный номер детали.");
//        return factoryProvider.getComponentInfo(id);
        // Выполнение основного кода программы
        ComponentInfo componentInfo = factoryProvider.getComponentInfo(id);
        // Постусловие ...
        if (componentInfo == null) {
            throw new RuntimeException("Детель не найдена.");
        }

        return componentInfo;
    }
}
