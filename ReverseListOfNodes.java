package ReverseListOfNodes;

//класс Узел - элемент связанного списка
public class Node {
    int value; //значение узла
    Node next; // следующий элемент
    Node prev; //предыдущий элемент

    //конструктор узла
    Node(int value){
        this.value = value; //принимается значение
        this.next = null; //предыдущ. и следующий инициализируются как null
        this.prev = null;
    }

    //у ПЕРВОГО элемента prev всегда null
    //у ПОСЛЕДНЕГО next всегда null
    //у единственного элемента списка - оба указателя равны null
}

//Реализация методов работы с двусвязным списком
public class ReverseDoubleLinkedList {
    //указатели на первый и последний элементы
    private Node head;
    private Node tail;

    //Метод добавления узлов в связанный список
    public void insert(int value) {
        Node node = new Node(value); //создаем новый узел
        if (head == null) { //если не существует головы (список был пустым)
            head = node; //тогда этот узел и есть голова
        } else { //иначе если голова уже была (список не был пустым)
            tail.next = node; // устанавливаем текущему хвосту указатель на новый узел, который и станет хвостом
            node.prev = tail; //новому узлу устанавливаем в указатель предыдущего -- текущий хвост. Текущий tail перестанет быть хвостом
        }
        tail = node; // Обновляем хвост: теперь это новый узел
    }

    //вспом. метод для распечатки списка
    public void printList() {
        Node current = head; // Начинаем с головы списка. Устанавливаем голову текущим узлом
        while (current != null) { //пока узлы не закончатся
            System.out.print(current.value + " "); // Печатаем значение текущего узла
            current = current.next; //двигаемся по списку, переключаясь по указателям next
        }
        System.out.println();
    }

    //Алгоритм разворота списка:
    public void reverse() {
        Node current = head; //НАЧИНАЕМ С ГОЛОВЫ
        Node temp; //временная переменная для хранения ссылок

        while (current != null) { //пока узлы не закончатся
            temp = current.next; //сохраняем во временную переменную ссылку на след.узел
            current.next = current.prev; // а саму ссылку на след. переписываем на ссылку на предыдущий
            //ТАКИМ ОБРАЗОМ РАЗВОРАЧИВАЕМ ВСЕ УКАЗАТЕЛИ У КАЖДОГО УЗЛА
            current.prev = temp; //ССЫЛКУ НА ПРЕДЫДУЩУЮ переписываем на ССЫЛКУ NEXT которую мы положили в temp
            //После того как мы поменяли местами указатели next и prev для текущего узла, чтобы продолжить обход списка,
            // мы должны перейти к узлу, который раньше был "следующим". Ссылка на него была сохранена в temp, поэтому мы обновляем current на temp.
            current = temp;   //двигаемся по списку, переключаясь по указателям next (на тот, который хранится в temp)
        }

        //В конце Голову и Хвост меняем местами, с помощью временной темп
        temp = head;
        head = tail;
        tail = temp;

    }


    public static void main(String[] args) {
      //Создаем и наполняем список элементами
        var list = new ReverseDoubleLinkedList();
        list.insert(1);
        list.insert(2);
        list.insert(3);
        list.insert(4);
        list.printList(); //вывод списка

        list.reverse(); //разворот списка
        list.printList(); 
    }


}
