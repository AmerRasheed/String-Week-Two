package org.example;

/**
 * Hello world!
 *
 */
public class App 
{
    public static void main( String[] args )
    {
       /*Working with String Exercise by Amer Rasheed Week 2*/
        /*FIRST SEVEN QUESTIONS SOLVED*/

/*What is the length of the String: "Java" ?*/
        String String1="JAVA";
        System.out.println(String1);
        int length_of_string=String1.length();
        System.out.println(length_of_string);  // Solution is 4

/*What char is at index position 6 in the following String:"Long example sentence" ?*/
        String string_position="Long example sentence";
        String  char_at_index_position= string_position.substring(6,7);
        System.out.println(char_at_index_position);    //Solution is x


/*What is the index position of 'o' in the following String: "Even longer example sentence" ? */
        String string__index_position="Even longer example sentence";
        int stringpos=string__index_position.indexOf('o');
        System.out.println(stringpos);   // Solution is 6.
                                         //Starting from 0 the string position will be 6

/*Given the following String: "Ok this is not as long!" create a substring of only "not as long" (excluding the exclamation point) and print it out*/

        String st2 = "Ok this is not as long!";
        String targetSt = st2.substring(11,st2.length()-1);
        System.out.println(targetSt); // Solution : not as long

/*Convert the following String: "CAPS EQUALS SCREAMING" to lowercase and print it out. Then convert it back to uppercase and print it out again. */

        String st3="CAPS EQUALS SCREAMING";
        String lower_case_St = st3.toLowerCase();
        System.out.println("The upper case sentence is " + lower_case_St);      //CAPS EQUALS SCREAMING
        st3 = lower_case_St.toUpperCase();
        System.out.println("The upper case sentence is " + st3);                //caps equals screaming


/*Correct the following String: "Java is the worst programming language!" by replacing the (obviously incorrect) word "worst" with the word "best". Then print out the sentence.*/

        String st4="Java is the worst programming language!";
        String stringarray[] = st4.split(" ");
        for(int i=0;i<stringarray.length;i++)
          System.out.print(stringarray[i] + " ");

        for(int i=0;i<stringarray.length;i++)                           // Java is the worst programming language!
          if (stringarray[i].equalsIgnoreCase("worst"))
                stringarray[i] = "best";
                  System.out.println("\n");

        for(int i=0;i<stringarray.length;i++)                         // Output will be "Java is the best programming language!"
            System.out.print(stringarray[i] + " ");


/*What is the output of the following String: "\tJ\ta\tv\ta\t" after you trim it? */

            String stTrim = "\tJ\ta\tv\ta\t";
            System.out.println(stTrim.trim()); //Java

/*Parse the following int: 20 to a String and add a 20 to the end of the String. Printing it out should return: "2020" */
            String stInt="";
            int pass=20;
            String newString = String.valueOf(pass);
            System.out.print(newString);
            String stInt1 ="20";
            stInt1 = stInt.concat(newString);
            System.out.println(stInt1);






    }
}
