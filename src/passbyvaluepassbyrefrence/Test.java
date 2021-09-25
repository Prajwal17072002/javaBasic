package passbyvaluepassbyrefrence;

public class Test {
    int a, b;

    Test(){
       a = -1;
       b = -2;
    }

    Test(int i, int j){
        this.a = i;
        this.b = j;
    }

    public void meth(int a, int b){
        this.a = a;
        this.b = b;

        this.a = this.a * 2;
        this.b = this.b / 2;
    }

    public void meth(Test o){
        o.a = o.a * 2;
        o.b = o.b / 2;
    }
}
