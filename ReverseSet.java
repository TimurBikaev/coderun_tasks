//РАЗВОРОТ СВЯЗАННОГО СПИСКА LinkedList
//В процессе разворота односвязного списка мы меняем адреса next у узлов, чтобы указатели ссылались на предыдущий узел, а не на следующий. Это и есть основная идея алгоритма.

/**
Метод add(int data): Создает новый узел и добавляет его в конец списка.
Метод reverse():
Использует три указателя:
prev — для хранения предыдущего узла.
current — для текущего узла.
next — для временного хранения следующего узла.
Цикл меняет направление next для каждого узла.
*/

//НОДА - узел, имеет внутри данные и ссылку
class Node {
    int data; // Данные в текущем узле
    Node next; // Ссылка на следующий узел

  //Конструктор
    public Node(int data) {
        this.data = data;
        this.next = null; //по умолчанию у ноды нет ссылки на след. Будем задавать при создании Связанного списка
    }
  
}

class LinkedList {
    Node head; // Голова списка (первый узел)

    // Метод для добавления узла в конец списка
    public void add(int data) {
        Node newNode = new Node(data); // Создаем новый узел
        if (head == null) { // Если список пустой
            head = newNode; // Новый узел становится первым
        } else { // Иначе ищем конец списка
            Node current = head; // Начинаем с головы
            while (current.next != null) { // Пока не дойдем до конца
                current = current.next; // Переходим к следующему узлу
            }
            current.next = newNode; // Добавляем новый узел в конец
        }
    }
}


   public void reverse() {
     //Три временных хранилища
    Node prev = null;       // Указатель предыдущего`prev` изначально ничего не указывает (будет "новым концом" списка)
    Node current = head;    // Начинаем с головы списка (ГЛАВНАЯ НОДА)
    Node next;              // Временный указатель для хранения следующего узла

    while (current != null) { // Пока не дойдем до конца списка (ВЫХОД ИЗ ЦИКЛА когда дойдем до последнего 
        next = current.next; // Сохраняем ссылку на следующий узел
        current.next = prev; // Меняем направление: текущий узел указывает на предыдущий
        prev = current;      // Двигаем `prev` вперед (становится текущим)
        current = next;      // Двигаем `current` вперед (становится следующим)
    }

    head = prev; // После цикла, `prev` — это новый первый узел
}

    // Метод для печати списка
    public void printList() {
        Node current = head;
        while (current != null) {
            System.out.print(current.data + " -> ");
            current = current.next;
        }
        System.out.println("null");
    }
}
