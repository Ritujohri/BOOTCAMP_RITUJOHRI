package Lambda;

/**
 * Created by johrir on 7/28/2017.
 */
public class ArrayHolder {
    int[] array;

    public ArrayHolder(int[] array) {
        this.array = array;
    }

    public void forEach(DoSomething doSomething){
        for (int val:array) {
            doSomething.doSomething(val);
        }
    }

    public int[] modify(Tranform tranform){
        for (int i = 0;i<array.length;i++) {
            System.out.println(tranform.transform(array[i]));
        }
        return  array;
    }

    public boolean delete(Check check){
        for (int i=0;i<array.length;i++) {
            if (check.check(array[i])) {
               array[i]=0;
                }
            return true;
            }
        return false;
    }
    public void fold(Calculator calculator){
        int sum=0;
        for (int j = 0; j < array.length ; j++)
            sum = calculator.calculate(sum,array[j]);
        System.out.println( sum);

    }

}
