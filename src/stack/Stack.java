package stack;
// This is class to repesent stack bheaviour
public class Stack {

    //instance variables
    int stck[] = new int[5];
    int tos;    //top of stack

    public Stack(){
        tos = -1;
    }

    //This method will add items to array stck
    void push(int item){

        if(tos == 4)
            System.out.println("Stack is full!!!!!");
        else
            stck[++tos] = item;
    }

    //This method will pop up the items from the array stck
    int pop(){

        if(tos < 0) {
            System.out.println("Stack is underflow");
            return 0;
        }
        else
            return stck[tos--];
    }
}
