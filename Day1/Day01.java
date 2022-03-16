//Day 1, Random numbers

import java.lang.Math;
import java.util.Random;
public class Day01{

public static void main(String[] args){
 Random random = new Random();
 int max=10;
 int min=1;

 //random number using Math,random
 System.out.println("hello world " + Math.random());
 System.out.println("hello world " + Math.random()*(max-min+1)+min);

  //random number using java.util.Random
 System.out.println("hello world " + random.nextInt(10));
}
}