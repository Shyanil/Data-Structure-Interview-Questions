import java.util.ArrayList;
import java.util.function.Consumer;

/**
 * lambdaFunction
 */
public class lambdaFunction {

    public static void main(String[] args) {
          // lambda Function is a inline or one line function that assign them into  variable that are types are interfaces

     Operation sum = (a , b) -> a+b;
     Operation product = (a, b) -> a*b;
     Operation minus = (a , b) -> a-b;
     

     ArrayList<Integer> list = new ArrayList<>();
     for(int i  = 0 ; i  < 5 ; i++){
        list.add(i);
    }
    
    // here Consumer also interface and that store the take Integer class and there one function and we make this a inline function
    // item represents every single element in arrayList 
    Consumer<Integer> fConsumer = (item) -> System.out.println(item * 100);
    list.forEach(fConsumer);

    // Operation perform 
    lambdaFunction oFunction = new lambdaFunction();
    int minuO = oFunction.operationAlways(10, 20, minus); // here three parameters and last one is basically the lambda function i created that all are the we call
    int sumO = oFunction.operationAlways(20, 10, sum);
    System.out.println(minuO);
    System.out.println(sumO);
    
        
    }

    private int operationAlways(int a , int b , Operation op){
        return op.sum(a, b); // We call the below interface function operation
    }
}

/**
 * Operation
 */
interface Operation {
    int sum(int a , int b);
    
}