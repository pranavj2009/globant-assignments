package rough;

// Online Java Compiler
// Use this editor to write, compile and run your Java code online
import java.util.*;
class Rough {
    public static void main(String[] args) {
        String input = "Hello, World!";
        //how many times each char occurs
        int count = 0;
        Map<String, Integer> map = new HashMap<>();
        for(int i=0; i<input.length(); i++){
            String temp = input.charAt(i)+"";
            if(map.containsKey(temp)){
                map.put(temp,map.get(temp)+1);
            }else{
                map.put(temp,1);
            }
        }

        System.out.println(map);
    }

}
