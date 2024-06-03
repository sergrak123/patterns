package patterns.adapter;

// Адаптер для карты памяти
public class MemoryCardAdapter implements USB {

    private MemoryCard memoryCard;

    public MemoryCardAdapter(MemoryCard memoryCard) {
        this.memoryCard = memoryCard;
    }

    @Override
    public void readData() {
        memoryCard.readFromMemoryCard();
    }
}

