package day23_array;

import java.lang.reflect.Array;
import java.util.Arrays;
import java.util.Scanner;

public class CreatingArrays {
    public static void main(String[] args) {
        /*

            Student Information
            0 -> id
            1 -> first name
            2 -> last name
            3 -> batch num
         */

        // Have all the information:
        String [] studentOne = {"04", "Kristina", "Gaidomociv", "27"};

        // Know the number of elements, but not the values yet
        String [] studentTwo = new String[4];
        studentTwo[0] = "10";
        studentTwo[1] = "Olena";
        studentTwo[2] = "Kravetska";
        studentTwo[3] = "27";
        System.out.println(Arrays.toString(studentTwo));

        // know the number of elements, and add from Scanner
        Scanner input = new Scanner(System.in);
        String[] studentThree = new String[4];
        System.out.println("Enter your id");
        studentThree[0] = input.next();
        System.out.println("Enter your first name");
        studentThree[1] = input.next();
        System.out.println("Enter your last name");
        studentThree[2] = input.next();
        System.out.println("Enter your batch number");
        studentThree[3] = input.next();
        System.out.println(Arrays.toString(studentThree));

        // most dynamic
        String[] studentFour = new String[4];
        String[] questions = {"id", "first name", "last", "batch number"} ;
        for (int i = 0; i < studentFour.length; i++) {
            System.out.println("Enter your " + questions[i]); // print a dynamic message based on the questions defined in the question elements
            studentFour[i] = input.next(); // storing the scanner input from the console into the array at index i
        }
        System.out.println(Arrays.toString(studentFour));
    }
}

//class note 07/19
//
//        Agenda:
//
//        - Software methodology
//
//        - waterfall
//
//        - Agile
//
//        ===================
//
//        1. SDLC : standard steps to build high quality software
//
//        2. testing types : each step of SDLC requires a set of testing types , those are performed by responsible team/members
//
//        who performs testings in SDLC?
//        - everyone who involved the SDLC steps
//
//        what needs to be tested?
//
//        - any outcome relates to the software
//        - documents, codes, the software itself
//
//        testing types:
//
//        Static testing : testing documents
//
//
//
//        Dynamic testing :  codes, the software itself
//
//        1. unit testing - done by developers, in the dev env
//
//        2. Integration testing -  done by developers, in the dev env
//
//        3. System testing -> divides to 2 parts:
//
//        1. Func testing -> done by SDET, in the QA env
//
//        most of the func needs to be tested by 3 layers:
//        FrontEnd testing == UI testing
//        BackEnd testing == DB testing + API testing
//
//        2. Non-func testing -> done by performance testers, in the QA env
//
//        fast or slow? capacity? stress? ...
//
//
//        4. UAT -> done by the client, (end users) , also in some company automation engineers/sdet are hireed in a UAT team to test the software itself one more time before release
//
//        1. Alpha testing  -> done by the UAT team members , in the stg env
//
//        2. beta testing  -> done by the client, manually , in the stg env
//
//        the client could take 15-20m, or max 1 hour to perform beta testing.
//
//        ***after this UAT testing is performed, then the app will be released.
//
//
//        =======================================
//
//        rule /principle / method to manage the project?
//
//        how should people who involved in the SDLC steps work? each steps members work separately from the other step people? or together?
//
//        how to manage documents?
//
//        how about meetings? how often we should meet with the client?
//
//
//        software method / rule
//
//        1. waterfall : 1st software method used in IT industry
//
//        step by step action, no go back to the previous step
//
//        too many documents, no human interaction, no req changes once sdlc started
//
//
//
//        2. from 2000, 17 developers
//
//        human communication
//
//        satisfy the client
//
//        - the client involves in the each SDLC step
//
//        short time release --> in waterfall too much time for working on one entire project
//
//        welcome changes on the req
//
//
//        new software method --> Agile
//
//        -----------------------------------------------
//        in IT company, who decides to follow which software method?
//
//        - company managers' decision. one company implement the same method.
//
//
//
//
//        users should able to login. -> req will be estimated by the business team : 2 months
//
//
//        task1: user should be able to go to the login page.
//
//        dev team estimate:
//        developers : 2 days
//        SDET       : 1 day
//
//        task2: user should be able to see the login url as http://abc.com
//        developers : 1 day
//        SDET       : 1 day
//
//        task3:user should be able to see the login page title as abc company
//
//        task 4: user should be able to login with email - abc@gmail.com
//
//    task 5 :user should be able to login with at least 8 char password
//
//            -------
//            next class:
//            Agile --> branches, frames
//
//            Agile - Scrum
//            Agile - Kanban
//
//
//
//            software methodolofy: Waterfall, Agile, Agile-Scrum, Agile - kanban
//
//
//
