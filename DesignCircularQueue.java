class MyCircularQueue {
int [] arr;
int front =0, rear = -1,size=0;

    public MyCircularQueue(int k) {
        arr = new int[k];
    }
    
    public boolean enQueue(int value) {
        if(size==arr.length) return false;
        rear = (rear+1)%arr.length;
        arr[rear] = value;
        size++;
        return true;
    }
    
    public boolean deQueue() {
        if(size==0) return false;
        front = (front+1)%arr.length;
        size--;
        return true;
    }
    
    public int Front() {
      if(size==0) return -1;
      else return arr[front];  
    }
    
    public int Rear() {
        if(size == 0) return -1;
        else return arr[rear];
            }
    
    public boolean isEmpty() {
        return size==0;
    }
    
    public boolean isFull() {
        return size==arr.length;
    }
}

/**
 * Your MyCircularQueue object will be instantiated and called as such:
 * MyCircularQueue obj = new MyCircularQueue(k);
 * boolean param_1 = obj.enQueue(value);
 * boolean param_2 = obj.deQueue();
 * int param_3 = obj.Front();
 * int param_4 = obj.Rear();
 * boolean param_5 = obj.isEmpty();
 * boolean param_6 = obj.isFull();
 */