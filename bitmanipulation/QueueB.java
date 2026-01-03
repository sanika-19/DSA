public class QueueB {
    static class Queue{
        static int arr[];
        static int sz=0;
       static int rear;
       static int front;
       public Queue(int n){
        arr=new int[n];
        sz=n;
        rear=-1;
        front=-1;

       }
       //isEmpty()
       public static boolean isEmpty(){
        return rear==-1 && front==-1;
       }

       //isfull
       public static boolean isfull()
       {
        return (rear+1)%sz==front;
       }
       //add(Enqueue)
       public static void add(int data){
        if(rear==sz-1){
            System.out.println("Sorry!!Queue is Full");
            return;
        }
        rear=rear+1;
        arr[rear]=data;
        
       }

       //remove(Dequeue)
       public static int remove(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        int front=arr[0];
        for(int i=0;i<rear;i++){
            arr[i]=arr[i+1];
        }
        rear=rear-1;
        return front;
       }

       //peek
       public int peek(){
        if(isEmpty()){
            System.out.println("Queue is Empty");
            return -1;
        }
        return arr[0];
       }
    }
    public static void main(String[] args) {
        Queue q=new Queue(5);
        q.add(10);
        q.add(20);
        q.add(30);
       while (!q.isEmpty()) {
        System.out.println(q.peek());
        q.remove();
       }
    }
}
