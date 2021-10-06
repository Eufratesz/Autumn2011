package looptypes;

import java.util.Arrays;
import java.util.List;

public class LoopTypesMain {

    public static void main(String[] args) {

        String[]names = {"John", "Jack", "Jane"};
        for(int i=0; i < names.length; i++){
            System.out.println(names[i]);
        }
        for(String name : names){
            System.out.println(name);
        }



        List<String> nameList = Arrays.asList("John", "Jack", "Jane", "Jim");

        for(int j = 0; j < nameList.size(); j++){
            System.out.println(nameList.get(j));
        }

        for(String name : nameList){
            System.out.println(name);
        }

        for (int k = 0; k < nameList.size(); k++) {
            System.out.println((k + 1) + ".elem: " + nameList.get(k));
        }


        for(int j = nameList.size() -1; j >=0; j--){
            System.out.println(nameList.get(j));
        }

        for (int i = 1; i < nameList.size(); i += 2) {
            System.out.println(nameList.get(i));
        }

        List<Integer> numbers = Arrays.asList(1,2,1,2,3,1);
        for( int i =1; i < numbers.size(); i++){
            if(numbers.get(i-1)< numbers.get(i)) {
                System.out.println("nő");
            }else {
                    System.out.println("csökken");
                }
            }
        }
    }

