class Stack<V> {

  public int maxSize;
  public int top;
  private V arr[];


  public Stack(int maxSize){
    this.maxSize = maxSize;
    this.top = -1;
    arr = (V[]) new Object[maxSize];
  }


  public int getMaxSize(){
    return this.maxSize;
  }
  
  
  public boolean isEmpty(){
    return (this.top == -1);
  }
  
  public boolean isFull(){
    return top == maxSize -1;
  }
    
  public V top(){
    if(this.isEmpty()){
      return null;
    }
    return arr[top];
  }
  
  
  public void push(V value){
    
    if(!this.isFull()){
        
      this.top++;
      this.arr[top] = value;
      
    }
  }
  
  
  public V pop(){
    if(isEmpy()){
      return null;
    }
    return arr[top--];
  }
  
}

