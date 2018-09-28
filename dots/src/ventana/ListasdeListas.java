package ventana;
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
    public Node Buscalista(int x, int y){
       Node temporal = this.head;
       if (x > 4){
            return null;
       } else{
       while (temporal != null && temporal.getPos() != x ){
           temporal = temporal.getNext();
       }
       if (temporal == null){
           return null;
       } else {
       SimpleList columna = (SimpleList) temporal.getData();
       Node tempColumn = columna.getHead();
       while (tempColumn != null && tempColumn.getY() != y){
           tempColumn = tempColumn.getNext();
       }
       if (tempColumn == null){
           return null;
       } else{
           return tempColumn;
       }
       }
       }
       
    }
    
    
    
}
