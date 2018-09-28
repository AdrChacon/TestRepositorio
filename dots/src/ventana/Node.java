package ventana;
public class Node<T>{
    private T data;
    private Node<T> next;
    private int Pos; 
    private int x;
    private int y;
    
    public Node(T Data){
        this.data = Data;
        this.next = null;
    }
    
    public Node(T Data, int Pos){
        this.data = Data;
        this.next = null;
        this.Pos = Pos;
    }
    
    public Node(int x, int y){
        this.x = x;
        this.y = y;
        this.next = null;
    }
    public int getY(){
        return this.y;
    }
    
    public int getX(){
        return this.x;
    }
    public int getPos(){
        return this.Pos;
    }
    
    public void setData(T Data){
        this.data = Data;
    }
    public Object getData(){
        return this.data;
    }
    public void setNext(Node<T> node){
        this.next = node;
    }
    public Node<T> getNext(){
        return this.next;
    }
}
