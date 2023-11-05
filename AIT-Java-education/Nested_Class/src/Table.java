public class Table {
    private Pair[] pairs; // массив пар ключ-значение
    private int count; // количество добавленных пар, изначально - 0

    public Table() {
        this.pairs = new Pair[10]; // выделяем память под массив пар, размерности 10
        this.count = 0;
    }

    /**
     * Добавление пары ключ-значение в таблицу
     * @param key строковый ключ
     * @param value целочисленное значение
     */
    public void add(String key, int value) {
        for (int i = 0; i < count; i++) { // пробегаем все добавленные пары
            if (pairs[i].getKey().equals(key)) { // если у какой-то пары ключ совпал с тем, что мы добавляем
                pairs[i].setValue(value); // заменяем у него значение
                return; // останавливаем работу метода, потому что добавлять нечего
            }
        }

        pairs[count] = new Pair(key, value); // добавляем новую пару
        count++; // увеличиваем количество элементов
    }

    /**
     * Получение значения по ключу
     * @param key строковый ключ
     * @return целочисленное значение
     * @throws IllegalArgumentException если значения под нужным ключом нет
     */
    public int get(String key) {
        // пробежать все пары ключ-значение
        for (int i = 0; i < count; i++) {
            if (pairs[i].getKey().equals(key)) { // если у какой-то пары совпал ключ
                return pairs[i].getValue(); // возвращаем значение этой пары
            }
        }
        // если мы ни разу не сделали return, значит ключа нет
        throw new IllegalArgumentException("Ключа <" + key + "> в таблице нет");
    }

    public int getCount() {
        return count;
    }

    public Pair[] getPairs() {
        return pairs;
    }
}