
public class SimpleList{
    private Node head;
    private int size;
    
    
    public SimpleList(){
     this.head = null;
     this.size = 0;
    }
    public int getSize(){
        return this.size;
    }
    
    public Node getHead(){
        if(head == null){
            return null;
        }
        else{
            return this.head;
        }
    }
    
    public void insertFirst(Object Data){
        Node newNode = new Node(Data);
        if(head == null){
            this.head = newNode;
            this.size++;
        } else {
            Node temp = this.head;
            this.head = newNode;
            newNode.setNext(temp);
            this.size++;
        }
    }
    public void insertLast(Object Data){
        Node newNode = new Node(Data);
        if(head == null){
            this.head = newNode;
            this.size++;
        } else{
            Node aux = head;
            while(aux.getNext() != null){
                aux = aux.getNext();
            }
            aux.setNext(newNode);
            this.size++;
        }
    }
    public void insertLast(int xPos, int yPos){
        Node newNode = new Node(xPos, yPos);
        if(head == null){
            this.head = newNode;
            this.size++;
        } else{
            Node aux = head;
            while(aux.getNext() != null){
                aux = aux.getNext();
            }
            aux.setNext(newNode);
            this.size++;
        }
    }
}
