package interviewQuestions;

public class ArraysCommonElements {

    public static void main(String args[]){

        int[] array1={10,20,30,40,50,60};
        int[] array2={100,20,300,40,500,60};

//        int[] array33 = {};
//        array33[0] = 10;

        int[] array3= new int[10];

        int a = 0;

        for(int i=0;i<array1.length;i++){

            for(int j=0;j<array2.length;j++){

                if (array1[i]==array2[j]){

                   array3[a]=array1[i];
                   a++;
                }

                }
            }
        for(int i=0;i<array3.length;i++){
            System.out.println(array3[i]);
        }
        }

    }
