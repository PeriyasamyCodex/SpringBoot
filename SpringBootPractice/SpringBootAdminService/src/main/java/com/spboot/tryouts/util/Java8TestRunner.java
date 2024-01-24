package com.spboot.tryouts.util;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

import com.google.common.base.Optional;
import com.spboot.tryouts.inter.MyFunctionalInterface;

public class Java8TestRunner implements MyFunctionalInterface{
    

    public static void main(String[] args) {
        
        Java8TestRunner java8TestRunner = new Java8TestRunner();
        java8TestRunner.method1();
        java8TestRunner.print();
        java8TestRunner.print2();

        MyFunctionalInterface functionalInterface = () -> {
             System.out.println("Custom Implementation ");
        };
        functionalInterface.method1();
        functionalInterface.print();
        functionalInterface.print2();
        

        List<String> listOfComponies = Arrays.asList("Infosys","WIpro","Robert Bosch");
        List<String> listOfComponiesFormatted  = listOfComponies.stream().map(cmp -> cmp.toUpperCase()).collect(Collectors.toList());
        System.out.println("Formatted Values ->"+listOfComponiesFormatted);
        List<String> listOfComponiesFormattedSorted = listOfComponiesFormatted.stream().sorted().collect(Collectors.toList());
         System.out.println("Formatted Values After Sorted->"+listOfComponiesFormattedSorted);

         Optional<String> isNull = Optional.of("");
         //isNull.

//Reverse a String in Java

// String name = "reverse";

// StringBuilder builder = new StringBuilder(name);
// String reversedString = builder.reverse().toString();
// System.out.println("Reversed String ->"+reversedString);
// char[] nameArray = name.toCharArray();
// String temp = "";
// for(int i = nameArray.length-1; i > 0; i--) {
// temp +=  nameArray[i];
// }
// System.out.println("Reversed String Classic->"+reversedString);

String palString = "rada98r";

char[] palStringArray = palString.toCharArray();
String reversedString = "";
for (int i=palStringArray.length-1; i >= 0; i--) {
    reversedString+=palStringArray[i];
}
if (palString.equals(reversedString)) {
    System.out.println("Its a Palindrome ->"+reversedString);
}else {
    System.out.println("Its not a Palindrome ->"+reversedString);
}



















    }

// //Find a largest number in a array


// int[] numArray= {45,67,14,24,06};

// Arrays.sort(numArray);

// System.out.println("Sorted Array"+Arrays.toString(numArray));
// System.out.println(" Largest Number"+(numArray[numArray.length -1]));

// int[] numArrayClassic= {45,67,14,24,06};
// int largestNum = 0;
// for (int i=0; i<numArrayClassic.length-1; i++) {

// if (numArrayClassic[i] > largestNum) {
// largestNum = numArrayClassic[i];
// }

// }
// System.out.println("Classic Largest Number"+largestNum);



// //Check if prime NUmber or Not


// // Scanner scanner = new Scanner(System.in);
// // String inputNum = scanner.nextLine();
// // int inpDble = Integer.parseInt(inputNum);
// // boolean IsPrimeNum = true;
// // for(int i=2; i <= Math.sqrt(inpDble); i++) {

// //     if (inpDble % i == 0){
// //         IsPrimeNum = false;
// //         break;
// //     }
// // }

// // if (IsPrimeNum) {
// // System.out.println(inputNum+"Is a Prime Number");
// // }else {
// //     System.out.println(inputNum+"Is Not a Prime Number");
// // }
// // scanner.close();


// //factorial 
// int inputFact = 5;
// int factResult = 1;


// for (int i = 1; i<=inputFact; i++) {
//     factResult *= i;
// }

// System.out.println("Factorial Result ->"+factResult);

// //first non repeating character

// String charString = "lgttColde";

// char[] charArray = charString.toCharArray();
//  String firstNonRepeatingChar = "";
// outerloop: for (int i=0; i<charArray.length; i++) {
// boolean repeated = false;
//     for (int j=0; j<charArray.length; j++) {
// System.out.println("charArray[i] -> "+charArray[i]);
// System.out.println("charArray[j] -> "+charArray[j]);
//     if (i != j && charArray[i]  == charArray[j]) {
// repeated = true;
// break;
//     }

//     }

//     if (!repeated){
//         firstNonRepeatingChar = charArray[i]+"";
// break outerloop;
//     }

    
// }

// System.out.println("First Repeating Char -> "+firstNonRepeatingChar);

// // Palindrome

// String palInput = "radar";

// char[] palArray = palInput.toCharArray();

// String palResult = "";

// for (int i=palArray.length-1; i >= 0; i--) {
// palResult+=palArray[i]+"";
// }
// System.out.println("palResult ->"+palResult);
// if (palInput.equals(palResult)) {
//     System.out.println(palInput+ " is Palindrome");
// }else {
//     System.out.println(palInput+ " is Not a Palindrome");
// }


// //fibonacci series f(n) = f(n-1) + f(n-2);

// int n1=0,n2=1,n3=0;

// for (int i=2; i< 10; ++i) {

//     n3 = n1 + n2;
// System.out.println(n3+ " ");
// n1 = n2;
// n2= n3;

// }

// //swap number without using 3rd variable

// int a = 10, b = 15;

// b = b + a;// 10 + 15 = 25
// a = b - a;// 25 - 10 = 15
// b = b - a;

// System.out.println("a -> "+a);
// System.out.println("b -> "+b);



//     }

// public void mongoDGTest() {
// //MongoClient mongoClient = MongoClient.create("mongodb://localhost:27017");



// }

    @Override
    public void method1() {
       System.out.println("Unimplemented method 'method1'");
    }

    
}
