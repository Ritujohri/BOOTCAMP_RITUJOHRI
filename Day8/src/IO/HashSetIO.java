package IO;

import java.io.FileWriter;
import java.io.IOException;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Created by johrir on 7/27/2017.
 */
public class HashSetIO {
    public static void main(String[] args)  {
        Set<String> cars = new HashSet<>();
         cars.add("i10 ");
        cars.add("aulto ");
        cars.add("santro ");
        cars.add("beat ");
        cars.add("bmw ");
        FileWriter out = null;
        try {
           out  = new FileWriter("C:\\Users\\johrir\\IdeaProjects\\memory\\Day8\\src\\IO\\cars.txt");
            Iterator<String> itr = cars.iterator();
            while(itr.hasNext()){
                out.write(itr.next());
            }

        } catch (IOException e) {
            e.printStackTrace();
        }
        finally {
            if(out != null){
                try {
                    out.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}
