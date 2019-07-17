package klasy_wewnetrzne;

import java.util.Arrays;

public class LocalInnerClass {

    private static void localClassInstantiation(String[] args){
        class LocalClass{
            @Override
            public String toString() {
                return "Argumenty metody: " + Arrays.toString(args);
            }
        }

        LocalClass localClassInstance = new LocalClass();
        System.out.println(localClassInstance);
    }

    public static void main(String args[]){
        LocalInnerClass localInnerClass = new LocalInnerClass();
        localInnerClass.localClassInstantiation(new String[]{"a", "b", "c"});
    }

}
