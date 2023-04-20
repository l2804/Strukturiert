package Zusatz;


public class Node {

    private Object context;
    private Node next;

    public Node(Object pObject){
        this.context = pObject;
    }

    public Node(){

    }


    /**
     * returns context of a node
     * @return
     */
    public Object getContext(){
        return this.context;
    }

    /**
     * set the context of a node
     * @param pContext
     */
    public void setContext(Object pContext){
        this.context = pContext;
    }

    /**
     * returns next node
     * @return
     */
    public Node getNext(){
        return this.next;
    }

    /**
     * sets next node
     * @param pNode
     */
    public void setNext(Node pNode){
        this.next = pNode;
    }
}
