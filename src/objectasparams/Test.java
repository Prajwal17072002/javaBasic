package objectasparams;

public class Test {
    int a, b;

    Test(int i, int j){
        this.a = i;
        this.b = j;
    }

    boolean equals(Test o){
        if(this.a == o.a && this.b == o.b) return  true;
        else return false;
    }

}
