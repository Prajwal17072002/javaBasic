package enumdemo;

import java.util.Random;

//This is an enum defined
enum Answers{
    NO, YES, MAYBE, LATER, SOON, NEVER
}

// This is a class Question
public class Question {

    //Ref var of Random class is created
    Random rand = new Random();

    //ask method is return Answers
        Answers ask(){
            //random generated double convert int.
            int prob = (int) (100 * rand.nextDouble());

            if(prob < 15)
                return Answers.MAYBE;
            else if(prob <30)
                return Answers.NO;
            else if(prob <60)
                return Answers.YES;
            else if(prob <75)
                return Answers.LATER;
            else if(prob <98)
                return Answers.SOON;
            else
                return Answers.NEVER;


        }
    }

    class Askme {


        static void answer (Answers result){
            switch (result){
                case NO:
                  System.out.println("No");
                  break;
                case YES:
                    System.out.println("Yes");
                    break;
                case MAYBE:
                    System.out.println("Maybe");
                    break;
                case LATER:
                    System.out.println("Later");
                    break;
                case SOON:
                    System.out.println("Soon");
                    break;
                case NEVER:
                    System.out.println("Never");

            }
        }

//        public int getRandomInt(){
//            Random r1  = new Random();
//            int num = (int) (10 * r1.nextDouble());
//            if (num < 7) {
//                return num;
//            }else {
//                return getRandomInt();
//            }
//        }

        public static void main(String args[]){
            Question q = new Question();
            answer(q.ask());
            answer(q.ask());
            answer(q.ask());
            answer(q.ask());

        }
    }

