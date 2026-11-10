import java.util.ArrayList;
import java.util.HashMap;

public class hmm{
    public static void main(String args[]){
        ArrayList <String> color = new ArrayList<>();
        color.add("red");
        color.add("blue");
        color.add("green");
        for(String c : color){
            System.out.println(c);
        }
    ArrayList <Integer> seen = new ArrayList<>();
    seen.add(7);
    seen.add(2);
    seen.add(8);
    seen.add(3);
    seen.add(4);
    for( Integer i : seen){
        if(   i%2 ==0){
             System.out.println(i);
        }
    }
ArrayList <Integer> maa = new ArrayList<>();
maa.add(2);
maa.add(3);
maa.add(2);
maa.add(5);
maa.add(3);
maa.add(2);
HashMap <Integer,Integer> counter=  new HashMap<>();
for(int number: maa){
    int tiktok =
     counter.getOrDefault(number,0);
    counter.put(number,tiktok +1);
}
System.out.println(counter);
ArrayList <Integer> blow= new ArrayList<>();
blow.add(4);
blow.add(7);
blow.add(2);
blow.add(7);
blow.add(9);
blow.add(4);
HashMap <Integer,Integer> boob = new HashMap<>();
for(int cute : blow){
     int oldCount = boob.getOrDefault(cute,0);
     if(oldCount>0){
        System.out.println("the most  repeated number is " + cute);
        break;
     }
     boob.put(cute ,oldCount+1);
}
ArrayList<Integer> numbers = new ArrayList<>();
numbers.add(3);
numbers.add(8);
numbers.add(4);
numbers.add(6);

int target = 10;
HashMap<Integer, Boolean> seenNumbers = new HashMap<>();

for(int number : numbers){
    if(seenNumbers.getOrDefault(number, false)){
        int complement = target - number;
        System.out.println("wtever i dont know" + number + complement);
        break;
    }
    seenNumbers.put(number,true);
}
ArrayList<Integer> tit = new ArrayList<>();
tit.add(4);
tit.add(5);
tit.add(4);
tit.add(2);
tit.add(2);
 HashMap<Integer,Integer> wow = new HashMap<>();
  for(int cup : tit){
    int tac =wow.getOrDefault(cup, 0);
          wow.put(cup ,tac +1);
  }
    System.out.println(wow);
    for(int num : tit){
    if(wow.getOrDefault(num, 0)==1){
     System.out.println("the unique number is" + num);
    }
  }
    }
  }
