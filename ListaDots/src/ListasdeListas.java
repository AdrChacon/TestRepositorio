
public class ListasdeListas{
    private SimpleList list;
    private int size;
    private String Matriz;
    private Node head;
    
    public ListasdeListas(){
        this.head = null;
        this.size = 0;
    }
    
    public void crearMatriz(){
        Node aux = this.head;
        for(int X = 0; X<5; X++){
            if(aux == null){
            Node temp = new Node(crearLista(X), X);
            this.head = temp;
            aux = temp;
            this.size++;
            
            }
            else{
                Node temp = new Node(crearLista(X), X);
                aux.setNext(temp);
                aux = temp;
                this.size++;
            }
        }
            
      
    }
    public SimpleList crearLista(int fila){
        SimpleList columna = new SimpleList();
        Node sN = null;
        for (int Y = 0; Y<5; Y++){
            columna.insertLast(fila, Y);
        }
        return columna;
        
    
    }
    public boolean Buscalista(int x, int y){
       Node temporal = this.head;
       while (temporal != null && temporal.getPos() != x ){
           temporal = temporal.getNext();
       }
       
       SimpleList columna = (SimpleList) temporal.getData();
       Node tempColumn = columna.getHead();
       while (tempColumn != null && tempColumn.getY() != y){
           tempColumn = tempColumn.getNext();
       }
       if (tempColumn == null){
           return false;
       } else{
           return true;
       }
       
       
    }
    
    
    
}
