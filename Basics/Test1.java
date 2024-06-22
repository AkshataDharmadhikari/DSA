

import java.util.Scanner;

public class Test1 {

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String name = sc.nextLine();
        System.out.println("Your name is:" + name);

        //Concatenation
        String firstName = "Akshata";
        String LastName = "Dharmadhikari";
        String fullname = firstName + " " + LastName;
        System.out.println(fullname.length());
        sc.close();
        //charAt
        for (int i = 0; i < fullname.length(); i++) {
            System.out.println(fullname.charAt(i));
        }

        // Comparison
        // String name1 = "Tony";
        // String name2 = "uony";
        // ascii of characters is also get matched t is less than u 
        //1 s1> s2? = +ve
        // 2 s1 == s2 = 0
        //3 s1 < s2 = -ve
        // if(name1.compareTo(name2) ==0)
        // {
        //    System.out.println("The string1 equal to string2");
        // }
        // else if(name1.compareTo(name2) ==1)
        // {
        //     System.out.println("The string1 greater to string2");
        // }
        // else{
        //     System.out.println("The string1 less to string2");
        // }

        // if(name1 == name2) // This equals == function sometimes fails for string thats why we avoid to use them
        // {
        //    System.out.println("The string1 equal to string2");
        // }
        // else
        // {
        //     System.out.println("The string1 greater to string2");
        // }

        // if (new String("Tony") == new String("Tony")) // The problem is that java have string objects  
        // {
        //     System.out.println("Strings are equal");

        // } else {
        //     System.out.println("Strings are not equal");
        // }

        //conclusion only use name1.compareTo(name2)
        //substring function
        String sentence = "My name is Akshata";
        String subname = sentence.substring(1,3);
        System.out.println(subname);


        // String builder
        // In java once a string is created we cant add or delete the string we have to make a new string 
        // so it is time consuming so we use the string builder in java 
        // thats why we created more optimised string class thats why we created string builder 
        // String builder do add delete all the oprations & dont even take much time so instead of string we use string builder
        // String are immutable we cant mutate it or change 
        // Data in java placed in form of stack and some code is stored in heap 
        // String str = "h"; str + "e" = he;str + "l"=hel; str + "l"=hell ;str + "o"=hello
        
        StringBuilder sb = new StringBuilder();
        // StringBuilder sb = new StringBuilder("tony");
        sb.append("H");
        sb.append("e");
        sb.append("l");
        sb.append("l");
        String result = sb.toString();
        System.out.println(result);

        //char at index 0 
        System.out.println(sb.charAt(3));

        // set char at index
        System.out.println(sb.insert(3, 'y'));

        //delete the extra 'i'
        sb.delete(4,5);
        System.out.println(sb);

        //Reverse a string

        for(int i = 0;i<sb.length()/2;i++)
        {
            int front = i;
            int back = sb.length()-1;

            char frontchar = sb.charAt(front);
            char backchar = sb.charAt(back);

            sb.setCharAt(front, backchar);
            sb.setCharAt(back, frontchar);
        }

        System.out.println(sb);
             



    }
}
