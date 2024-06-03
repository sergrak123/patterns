package patterns.adapter;

public class AdapterPattern {

    public static void main(String[] args) {

        // Создаем карту памяти
        MemoryCard memoryCard = new MemoryCard();

        // Создаем адаптер для карты памяти
        USB memoryCardAdapter = new MemoryCardAdapter(memoryCard);

        // Создаем компьютер и читаем данные через адаптер
        Computer computer = new Computer();
        computer.readFromUSB(memoryCardAdapter);
    }
}
