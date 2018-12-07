import java.text.DecimalFormat;
import java.util.Scanner;

public class ExampleMenu {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        int groupProjectMenuChoice;
        Scanner menuChoice = new Scanner(System.in);
        
        System.out.println("Main Menu");
        System.out.println("---------");
        System.out.println("Please select an option: (1-5)");
        System.out.println("#1 Calculator");
        System.out.println("#2 Tempreture Converter");
        System.out.println("#3 Currency Converter");
        System.out.println("#4 Multiple Choice Quiz");
        System.out.println("#5 Hotel Bookings");
        
        groupProjectMenuChoice = menuChoice.nextInt();
        if (groupProjectMenuChoice == 1)
        {
            Scanner sc = new Scanner(System.in);
        int operator;
        char replay;
        double num1, num2, radians, result;
        replay = 'y';
        System.out.println("Math Calculator!\n----------------");
        System.out.println("Input the number of the caulculation you would like to do.\n\nBasic Calculations\n#1) Addition(+)\n#2) Subtraction(-)\n#3) Multiplication(*)"
                + "\n#4) Division(/) \n\nAdvanced Calculations\n#5) Squared\n#6) Square Root\n#7) Absolute\n#8) sin\n#9) cos\n#10) tan");
        operator = sc.nextInt();
        DecimalFormat df = new DecimalFormat("#.00");

        switch (operator) {
            case 1:
                while (replay == 'y' || replay == 'Y') {
                    System.out.println("You have selected addition\nEnter your first number: ");
                    num1 = sc.nextDouble();
                    System.out.println("Enter your second number: ");
                    num2 = sc.nextDouble();
                    result = num1 + num2;
                    System.out.println("Answer of " + num1 + " + " + num2 + " is " + result);
                    System.out.println("Would you like to perform another addition calculation? (y/n)");
                    replay = sc.next().charAt(0);
                }
                ExampleMenu.main(args);
                break;
            case 2:
                while (replay == 'y' || replay == 'Y') {
                    System.out.println("You have selected subtraction\nEnter your first number: ");
                    num1 = sc.nextDouble();
                    System.out.println("Enter your second number: ");
                    num2 = sc.nextDouble();
                    result = num1 - num2;
                    System.out.println("Answer of " + num1 + " - " + num2 + " is: " + result);
                    System.out.println("Would you like to perform another subtraction calculation? (y/n)");
                    replay = sc.next().charAt(0);
                }
                ExampleMenu.main(args);
                break;
            case 3:
                while (replay == 'y' || replay == 'Y') {
                    System.out.println("You have selected Multiplication\nEnter your first number: ");
                    num1 = sc.nextDouble();
                    System.out.println("Enter your second number: ");
                    num2 = sc.nextDouble();
                    result = num1 * num2;
                    System.out.println("Answer of " + num1 + " * " + num2 + " is " + df.format(result));
                    System.out.println("Would you like to perform another multiplication calculation? (y/n)");
                    replay = sc.next().charAt(0);
                }
                ExampleMenu.main(args);
                break;
            case 4:
                while (replay == 'y' || replay == 'Y') {
                    System.out.println("You have selected Division\nEnter your first number: ");
                    num1 = sc.nextDouble();
                    System.out.println("Enter your second number: ");
                    num2 = sc.nextDouble();
                    result = num1 / num2;
                    System.out.println("Answer of " + num1 + " / " + num2 + " is " + df.format(result));
                    System.out.println("Would you like to perform another division calculation? (y/n)");
                    replay = sc.next().charAt(0);
                }
                ExampleMenu.main(args);
                break;
            case 5:
                while (replay == 'y' || replay == 'Y') {
                    System.out.println("You have selected Squared\nEnter your number: ");
                    num1 = sc.nextDouble();
                    result = num1 * num1;
                    System.out.println(num1 + " squared is: " + df.format(result));
                    System.out.println("Would you like to perform another square calculation? (y/n)");
                    replay = sc.next().charAt(0);
                }
                ExampleMenu.main(args);
                break;
            case 6:
                while (replay == 'y' || replay == 'Y') {
                    System.out.println("You have selected Sqaure Root\nEnter your number: ");
                    num1 = sc.nextDouble();
                    System.out.printf("sqrt(%.3f) is %.3f%n", num1, Math.sqrt(num1));
                    System.out.println("Would you like to perform another sqaure root calculation? (y/n)");
                    replay = sc.next().charAt(0);
                }
                ExampleMenu.main(args);
                break;
            case 7:
                while (replay == 'y') {
                    System.out.println("You have selected absolute\nEnter your number: ");
                    num1 = sc.nextDouble();
                    System.out.format("The absolute value of your number is: " + Math.abs(num1));
                    System.out.println("Would you like to perform another absolute calculation? (y/n)");
                    replay = sc.next().charAt(0);
                }
                ExampleMenu.main(args);
                break;
            case 8:
                while (replay == 'y' || replay == 'Y') {
                    System.out.println("You have selected sine\nEnter your number: ");
                    num1 = sc.nextDouble();
                    radians = Math.toRadians(num1);
                    System.out.format("The sine of %.1f degrees is %.4f%n", num1, Math.sin(radians));
                    System.out.println("Would you like to perform another sine calculation? (y/n)");
                    replay = sc.next().charAt(0);
                }
                ExampleMenu.main(args);
                break;
            case 9:
                while (replay == 'y' || replay == 'Y') {
                    System.out.println("You have selected cosine\nEnter your number: ");
                    num1 = sc.nextDouble();
                    radians = Math.toRadians(num1);
                    System.out.format("The sine of %.1f degrees is %.4f%n", num1, Math.cos(radians));
                    System.out.println("Would you like to perform another cosine calculation? (y/n)");
                    replay = sc.next().charAt(0);
                }
                ExampleMenu.main(args);
                break;
            case 10:
                while (replay == 'y' || replay == 'Y') {
                    System.out.println("You have selected tangent\nEnter your number: ");
                    num1 = sc.nextDouble();
                    radians = Math.toRadians(num1);
                    System.out.format("The tangent of %.1f degrees is %.4f%n", num1, Math.tan(radians));
                    System.out.println("Would you like to perform another tangent calculation? (y/n)");
                    replay = sc.next().charAt(0);
                }
                ExampleMenu.main(args);
                break;
            default:
                System.out.println("You have not selected a valid option.");
                ExampleMenu.main(args);
                return;
        }
        sc.close();
        }
        else if (groupProjectMenuChoice == 2)
        {
            Scanner scanner = new Scanner(System.in);
            int tempChoice;
        double celsius, fahrenheit, kelvin;
        double cf, fc, fk, ck, kc, kf;
                
        DecimalFormat df = new DecimalFormat("#.0");
      
        System.out.println("\n" + "Currency Converter");
        System.out.println("------------");
        System.out.println("Please choose conversion method");
        System.out.println("------------");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Celsius to Kelvin");
        System.out.println("3. Fahrenheit to Celsius");
        System.out.println("4. Fahrenheit to Kelvin");
        System.out.println("5. Kelvin to Celsius");
        System.out.println("6. Kelvin to Fahrenheit");
        System.out.println("------------");
        
        tempChoice = scanner.nextInt();
        
        if (tempChoice == 1)
        {
            System.out.println("Enter degrees celsius");
            celsius = scanner.nextDouble();
            cf = (celsius*9/5) + 32;  
            System.out.println(celsius + " Degrees celsius" + " equals " + cf + " fahrenheit"  );
            ExampleMenu.main(args);
        }
        
        else if (tempChoice == 2)
        {
            System.out.println("Enter degrees celsius");
            celsius = scanner.nextDouble();
            ck = celsius + 273.15;
            System.out.println(celsius + " Degrees celsius" + " equals " + ck + " kelvin"  );
            ExampleMenu.main(args);
        }
        
        else if (tempChoice == 3)
        {
            System.out.println("Enter degrees fahrenheit");
            fahrenheit = scanner.nextDouble();
            fc = (fahrenheit - 32) * 5/9;
            System.out.println(fahrenheit + " Degrees fahrenheit" + " equals " + df.format(fc) + " celsius"  );
            ExampleMenu.main(args);
        }
        
        else if (tempChoice == 4)
        {
            System.out.println("Enter degrees fahrenheit");
            fahrenheit = scanner.nextDouble();
            fk = (fahrenheit - 32) * 5/9 + 273.15;
            System.out.println(fahrenheit + " Degrees fahrenheit" + " equals " + df.format(fk) + " kelvin"  ); 
            ExampleMenu.main(args);
        }
        
        else if (tempChoice == 5)
        {
            System.out.println("Enter degrees kelvin");
            kelvin = scanner.nextDouble();
            kc = kelvin - 273.15;
            System.out.println(kelvin + " Kelvin" + " equals " + df.format(kc) + " celsius"  ); 
            ExampleMenu.main(args);
        }
        
        else if (tempChoice == 6)
        {
            System.out.println("Enter degrees kelvin");
            kelvin = scanner.nextDouble();
            kf = (kelvin - 273.15) * 9/5 + 32;  
            System.out.println(kelvin + " Kelvin" + " equals " + df.format(kf) + " fahrenheit" );
            ExampleMenu.main(args);
        }
        else
        {
            System.out.println("This is not a valid option, please try again");
            ExampleMenu.main(args);
        }
        ExampleMenu.main(args);
        
        }
        else if (groupProjectMenuChoice == 3)
        {
            String euroIcon = "€";
            String poundIcon = "£";
            String dollarIcon = "$";

            double amount;
            double totalAmount = 0;

            Scanner in = new Scanner(System.in);
            DecimalFormat df = new DecimalFormat("###.##");

            int mainMenuChoice = 0;
            System.out.println("Currency Converter");
            System.out.println("------------------");
            System.out.println("Please select the currency you are using:");
            System.out.println("#1 - Pounds (£)");
            System.out.println("#2 - Euro (€)");
            System.out.println("#3 - Dollar ($)");
            mainMenuChoice = in.nextInt();
            if (mainMenuChoice == 1)
            {
                int poundMenuChoice = 0;
                for (int i = 0; i < 50; ++i) System.out.println();
                System.out.println("The currency you have selected is pounds £");
                System.out.println("------------------------------------------");
                System.out.println("Please select what currency you would like to convert to:");
                System.out.println("#1 - Euro (€)");
                System.out.println("#2 - Dollar ($)");
                poundMenuChoice = in.nextInt();
                switch (poundMenuChoice) {
                    case 1:
                        double poundEuroRate = 1.13;
                        for (int i = 0; i < 50; ++i) System.out.println();
                        System.out.println("Please enter the amount you would like to convert in pounds (2.33 = £2.33)");
                        amount = in.nextDouble();
                        totalAmount = amount * poundEuroRate;
                        for (int i = 0; i < 50; ++i) System.out.println();
                        System.out.println("From " + poundIcon + amount + " You will get " + euroIcon + df.format(totalAmount) + " The exchange rate is £1 = " + euroIcon + poundEuroRate);
                        ExampleMenu.main(args);
                        break;
                    case 2:
                        double poundDollarRate = 1.30;
                        for (int i = 0; i < 50; ++i) System.out.println();
                        System.out.println("Please enter the amount you would like to convert in pounds (2.33 = £2.33)");
                        amount = in.nextDouble();
                        totalAmount = amount * poundDollarRate;
                        for (int i = 0; i < 50; ++i) System.out.println();
                        System.out.println("From " + poundIcon + amount + " You will get " + dollarIcon + df.format(totalAmount) + " The exchange rate is £1 = " + dollarIcon + poundDollarRate);
                        ExampleMenu.main(args);
                        break;
                    default:
                        System.out.println("The option you have selected is invalid, please try again");
                        ExampleMenu.main(args);
                        break;
                }
            }
            else if (mainMenuChoice == 2)
            {
                int euroMenuChoice = 0;
                for (int i = 0; i < 50; ++i) System.out.println();
                System.out.println("The currency you have selected is euro €");
                System.out.println("------------------------------------------");
                System.out.println("Please select what currency you would like to convert to:");
                System.out.println("#1 - Pound (£)");
                System.out.println("#2 - Dollar ($)");
                euroMenuChoice = in.nextInt();
                switch (euroMenuChoice) {
                    case 1:
                        double euroPoundRate = 0.88;
                        for (int i = 0; i < 50; ++i) System.out.println();
                        System.out.println("Please enter the amount you would like to convert in euro (2.33 = €2.33)");
                        amount = in.nextDouble();
                        totalAmount = amount * euroPoundRate;
                        for (int i = 0; i < 50; ++i) System.out.println();
                        System.out.println("From " + euroIcon + amount + " You will get " + poundIcon + df.format(totalAmount) + " The exchange rate is €1 = " + poundIcon + euroPoundRate);
                        ExampleMenu.main(args);
                        break;
                    case 2:
                        double euroDollarRate = 1.15;
                        for (int i = 0; i < 50; ++i) System.out.println();
                        System.out.println("Please enter the amount you would like to convert in euro (2.33 = €2.33)");
                        amount = in.nextDouble();
                        totalAmount = amount * euroDollarRate;
                        for (int i = 0; i < 50; ++i) System.out.println();
                        System.out.println("From " + euroIcon + amount + " You will get " + dollarIcon + df.format(totalAmount) + " The exchange rate is €1 = " + dollarIcon + euroDollarRate);
                        ExampleMenu.main(args);
                        break;
                    default:
                        System.out.println("The option you have selected is invalid, please try again");
                        ExampleMenu.main(args);
                        break;
                }
            }
            else if (mainMenuChoice == 3)
            {
                int dollarMenuChoice = 0;
                for (int i = 0; i < 50; ++i) System.out.println();
                System.out.println("The currency you have selected is dollar $");
                System.out.println("------------------------------------------");
                System.out.println("Please select what currency you would like to convert to:");
                System.out.println("#1 - Pound (£)");
                System.out.println("#2 - Euro (€)");
                dollarMenuChoice = in.nextInt();
                switch (dollarMenuChoice) {
                    case 1:
                        double dollarPoundRate = 0.77;
                        for (int i = 0; i < 50; ++i) System.out.println();
                        System.out.println("Please enter the amount you would like to convert in dollar (2.33 = $2.33)");
                        amount = in.nextDouble();
                        totalAmount = amount * dollarPoundRate;
                        for (int i = 0; i < 50; ++i) System.out.println();
                        System.out.println("From "+ dollarIcon + amount + " You will get " + poundIcon + df.format(totalAmount) + " The exchange rate is $1 = " + poundIcon + dollarPoundRate);
                        ExampleMenu.main(args);
                        break;
                    case 2:
                        double dollarEuroRate = 0.87;
                        for (int i = 0; i < 50; ++i) System.out.println();
                        System.out.println("Please enter the amount you would like to convert in dollar (2.33 = $2.33)");
                        amount = in.nextDouble();
                        totalAmount = amount * dollarEuroRate;
                        for (int i = 0; i < 50; ++i) System.out.println();
                        System.out.println("From " + dollarIcon + amount +" you will get " + euroIcon + df.format(totalAmount) + " The exchange rate is $1 = " + euroIcon + dollarEuroRate);
                        ExampleMenu.main(args);
                        break;
                    default:
                        System.out.println("The option you have selected is invalid, please try again");
                        ExampleMenu.main(args);
                        break;
                }
            }
            else
            {
                System.out.println("This is not a valid option, please try again");
                ExampleMenu.main(args);
            }
            in.close();        
        }
        else if (groupProjectMenuChoice == 4)
        {
            int totalScore = 0;
            int answer = 0;
            String name;

            Scanner in = new Scanner(System.in);

            System.out.println("Welcome to the Quiz");
            System.out.println("-------------------");
            System.out.println("Please enter your name below: ");
            name = in.nextLine();
            for (int i = 0; i < 50; ++i) System.out.println();
            System.out.println("Lets begin " + name + "\n\n");
            System.out.println("Question #1 - “Arco iris” is the Spanish term for what natural phenomenon?");
            System.out.println("#1 Rainbow");
            System.out.println("#2 Eye");
            System.out.println("#3 Blue Lagon");
            System.out.println("#4 Black Betty");
            answer = in.nextInt();
            switch (answer) {
                case 1:
                    System.out.println("Correct");
                    totalScore++;
                    answer = 0;
                    break;
                case 2:
                    System.out.println("Sorry, that is not correct");
                    answer = 0;
                    break;
                case 3:
                    System.out.println("Sorry, that is not correct");
                    answer = 0;
                    break;
                case 4:
                    System.out.println("Sorry, that is not correct");
                    answer = 0;
                    break;
                default:
                    System.out.println("Invaild Input - Please try again");
                    ExampleMenu.main(args);
                    break;
            }

            for (int i = 0; i < 50; ++i) System.out.println();
            System.out.println("Question #2 - Who was the first Twitter user to reach 20 million followers?");
            System.out.println("#1 PewDiePie");
            System.out.println("#2 Aidan Browne");
            System.out.println("#3 Elon Musk");
            System.out.println("#4 Lady Gaga");
            answer = in.nextInt();
            switch (answer) {
                case 1:
                    System.out.println("Sorry, that is not correct");
                    answer = 0;
                    break;
                case 2:
                    System.out.println("Sorry, that is not correct");
                    answer = 0;
                    break;
                case 3:
                    System.out.println("Sorry, that is not correct");
                    answer = 0;
                    break;
                case 4:
                    System.out.println("Correct!");
                    totalScore++;
                    answer = 0;
                    break;
                default:
                    System.out.println("Invaild Input - Please try again");
                    ExampleMenu.main(args);
                    break;
            }

            for (int i = 0; i < 50; ++i) System.out.println();
            System.out.println("Question #3 - What is the capital of Germany?");
            System.out.println("#1 London");
            System.out.println("#2 Berlin");
            System.out.println("#3 Munich");
            System.out.println("#4 Belfast");
            answer = in.nextInt();
            switch (answer) {
                case 1:
                    System.out.println("Sorry, that is not correct");
                    answer = 0;
                    break;
                case 2:
                    System.out.println("Correct!");
                    totalScore++;
                    answer = 0;
                    break;
                case 3:
                    System.out.println("Sorry, that is not correct");
                    answer = 0;
                    break;
                case 4:
                    System.out.println("Sorry, that is not correct");
                    answer = 0;
                    break;
                default:
                    System.out.println("Invaild Input - Please try again");
                    ExampleMenu.main(args);
                    break;
            }

            for (int i = 0; i < 50; ++i) System.out.println();
            System.out.println("Question #4 - Who is the manager of Liverpool Football Club?");
            System.out.println("#1 Jose Mourinho");
            System.out.println("#2 Gareth Southgate");
            System.out.println("#3 Jurgen Klopp");
            System.out.println("#4 Dele Alli");
            answer = in.nextInt();
            switch (answer) {
                case 1:
                    System.out.println("Sorry, that is not correct");
                    answer = 0;
                    break;
                case 2:
                    System.out.println("Sorry, that is not correct");
                    answer = 0;
                    break;
                case 3:
                    System.out.println("Correct!");
                    totalScore++;
                    answer = 0;
                    break;
                case 4:
                    System.out.println("Sorry, that is not correct");
                    answer = 0;
                    break;
                default:
                    System.out.println("Invaild Input - Please try again");
                    ExampleMenu.main(args);
                    break;
            }

            for (int i = 0; i < 50; ++i) System.out.println();
            System.out.println("Question #5 - The Peter Pan of dogs refers to which breed?");
            System.out.println("#1 Boxer");
            System.out.println("#2 Afghan Hound");
            System.out.println("#3 Poodle");
            System.out.println("#4 Great Dane");
            answer = in.nextInt();
            switch (answer) {
                case 1:
                    System.out.println("Correct!");
                    totalScore++;
                    answer = 0;
                    break;
                case 2:
                    System.out.println("Sorry, that is not correct");
                    answer = 0;
                    break;
                case 3:
                    System.out.println("Sorry, that is not correct");
                    answer = 0;
                    break;
                case 4:
                    System.out.println("Sorry, that is not correct");
                    answer = 0;
                    break;
                default:
                    System.out.println("Invaild Input - Please try again");
                    ExampleMenu.main(args);
                    break;
            }

            for (int i = 0; i < 50; ++i) System.out.println();
            if(totalScore == 5)
            {
                System.out.println("Well done " + name + " you got them all correct!");
                System.out.println("Your score was: " + totalScore);
                ExampleMenu.main(args);
            }
            else if (totalScore == 4)
            {
                System.out.println("You got one wrong " + name);
                System.out.println("Your score was: " + totalScore);
                ExampleMenu.main(args);
            }
            else if (totalScore == 3)
            {
                System.out.println("You got two wrong " + name);
                System.out.println("Your score was: " + totalScore);
                ExampleMenu.main(args);
            }
            else if (totalScore == 2)
            {
                System.out.println("You got three wrong " + name);
                System.out.println("Your score was: " + totalScore);
                ExampleMenu.main(args);
            }
            else if (totalScore == 1)
            {
                System.out.println("You got four wrong " + name);
                System.out.println("Your score was: " + totalScore);
                ExampleMenu.main(args);
            }
            else if (totalScore == 0)
            {
                System.out.println("You got them all wrong, better luck next time " + name);
                System.out.println("Your score was: " + totalScore);
                ExampleMenu.main(args);
            }
            in.close();
        }
        else if (groupProjectMenuChoice == 5)
        {
            String hotelRoom, breakfastState;
        int nights, discountStr, validDiscount;
        double price;
        char breakfast, discountCode;

        discountStr = 0;
        validDiscount = 123;
        breakfast = 0;
        price = 0;
        Scanner sc = new Scanner(System.in);
        System.out.println("Welcome to Belfast Hotel!\n\nChoose what room you would like to book"
                + "\n#1) Penthouse Suite (£99.99 p/n)\n#2) Premium Room (£74.99p/n)\n#3) Regular Room (£49.99 p/n)");
        int operator = sc.nextInt();
        DecimalFormat df = new DecimalFormat("#.00");
        switch (operator) {
            case 1:
                hotelRoom = "Penthouse Suite";
                System.out.println("How many nights are you staying? (15% off for 5 days or more)");
                nights = sc.nextInt();
                if(nights > 28){
                    System.out.println("Sorry you cannot book for more than 28 days"); 
                    ExampleMenu.main(args);
                    break;
                }
                else if (nights >= 5) {
                    price = nights * 99.99;
                    price = price * 0.85;
                    System.out.println("Total: £" + df.format(price));
                } else {
                    price = nights * 99.99;
                    System.out.println("Total: £" + df.format(price));
                }

                System.out.println("Would you like breakfast included every day for an extra £" + nights * 20 + "? (£20 p/n) (y/n)");
                breakfast = sc.next().charAt(0);
                if (breakfast == 'y' || breakfast == 'Y') {
                    price = price + (nights * 20);
                    breakfastState = "Yes";
                }
                else{
                    breakfastState = "No";
                }
                System.out.println("£" + df.format(price));

                System.out.println("Do you have a discount code? (y/n)");
                discountCode = sc.next().charAt(0);

                if (discountCode == 'y' || discountCode == 'Y') {
                    System.out.println("Enter discount code: ");
                    discountStr = sc.nextInt();
                }
                if (discountStr == validDiscount) {
                    price = price * 0.9;
                }

                System.out.println("Your final total is: £" + df.format(price));
                System.out.println("Room Booked: " + hotelRoom);
                System.out.println("Duration of Stay: " + nights + " nights");
                System.out.println("Breakfast included: " + breakfastState);
                ExampleMenu.main(args);

                break;

            case 2:
                hotelRoom = "Premium Room";
                System.out.println("How many nights are you staying? (15% off for 5 days or more)");
                nights = sc.nextInt();
                
                if(nights > 28){
                    System.out.println("Sorry you cannot book for more than 28 days"); 
                    ExampleMenu.main(args);
                    break;
                }
                else if (nights >= 5) {
                    price = nights * 74.99;
                    price = price * 0.85;
                    System.out.println("Total: £" + df.format(price));
                } else {
                    price = nights * 74.99;
                    System.out.println("Total: £" + df.format(price));
                }

                 System.out.println("Would you like breakfast included every day for an extra £" + nights * 20 + "? (£20 p/n) (y/n)");
                breakfast = sc.next().charAt(0);
                if (breakfast == 'y' || breakfast == 'Y') {
                    price = price + (nights * 20);
                    breakfastState = "Yes";
                }
                else{
                    breakfastState = "No";
                }
                System.out.println("£" + df.format(price));

                System.out.println("Do you have a discount code? (y/n)");
                discountCode = sc.next().charAt(0);

                if (discountCode == 'y' || discountCode == 'Y') {
                    System.out.println("Enter discount code: ");
                    discountStr = sc.nextInt();
                }
                if (discountStr == validDiscount) {
                    price = price * 0.9;
                }

                System.out.println("Your final total is: £" + df.format(price));
                System.out.println("Room Booked: " + hotelRoom);
                System.out.println("Duration of Stay: " + nights + " nights");
                System.out.println("Breakfast included: " + breakfastState);
                ExampleMenu.main(args);
                break;

            case 3:
                hotelRoom = "Regular Room";
                System.out.println("How many nights are you staying? (15% off for 5 days or more)");
                nights = sc.nextInt();
                if(nights > 28){
                    System.out.println("Sorry you cannot book for more than 28 days"); 
                    ExampleMenu.main(args);
                    break;
                }
                else if (nights >= 5) {
                    price = nights * 49.99;
                    price = price * 0.85;
                    System.out.println("Total: £" + df.format(price));
                } else {
                    price = nights * 49.99;
                    System.out.println("Total: £" + df.format(price));
                }

                 System.out.println("Would you like breakfast included every day for an extra £" + nights * 20 + "? (£20 p/n (y/n))");
                breakfast = sc.next().charAt(0);
                if (breakfast == 'y' || breakfast == 'Y') {
                    price = price + (nights * 20);
                    breakfastState = "Yes";
                }
                else{
                    breakfastState = "No";
                }
                System.out.println("£" + df.format(price));

                System.out.println("Do you have a discount code? (y/n)");
                discountCode = sc.next().charAt(0);

                if (discountCode == 'y' || discountCode == 'Y') {
                    System.out.println("Enter discount code: ");
                    discountStr = sc.nextInt();
                }
                if (discountStr == validDiscount) {
                    price = price * 0.9;
                }

                System.out.println("Your final total is: £" + df.format(price));
                System.out.println("Room Booked: " + hotelRoom);
                System.out.println("Duration of Stay: " + nights + " nights");
                System.out.println("Breakfast included: " + breakfastState);
                ExampleMenu.main(args);
                break;

            default:
                System.out.println("You have not selected a valid room.");
                return;
        }
         sc.close();
        }
        else
        {
            System.out.println("That option is invalid, please try again.");
            ExampleMenu.main(args);
        }
    }
    
}
