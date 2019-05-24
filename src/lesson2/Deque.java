package lesson2;

/**
 * Задание №3
 * Создать класс для реализации дека.
 */

public class Deque {
    public static void main(String[] args) {

    }

    int size;
    int head; //голова
    int tail; //хвост
    int[] data;

    Deque(int size) {
        data = new int[this.size = size];
    }

    int Pushback(int value)  //добавление в коненц очереди

    {

        if (++tail == size)
            tail = 0;
        data[tail] = value;
        return data[tail];
    }

    int PopBack() //выборка с помощью конца очереди
    {
        int ret = data[tail];
        if (--tail < 0)
            tail = size - 1;
        return ret;
    }

    void PushFont(int value) //добавление в начало очереди
    {
        data[head] = value;
        if (--head < 0)
            head = size - 1;
    }

    int PopFront()//выборка с начала очереди
    {
        if (++head == size)
            head = 0;
        return data[head];

    }
}



