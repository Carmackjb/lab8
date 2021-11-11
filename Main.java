import java.util.Scanner;

public class Main
{


    public static void main(String[] args) {
        int answer= 3;
        char shapeBuilding = 0x258c;
        char shapeSpace = 0x00a0;
        boolean flag = true;

        String shapeBuild = Character.toString(shapeBuilding);
        String shapeSp = Character.toString(shapeSpace);
        // code from class
        while (flag)
        {
            System.out.println("enter an odd integer greater than or equal to three.");
            try
            {
                Scanner keyboard = new Scanner(System.in);
                answer = keyboard.nextInt();
                keyboard.nextLine();
                if ( answer >=3 && answer % 2 == 1)
                {
                    flag = false;
                }
            }
            catch (Exception e)
            {
                System.out.println("It must be a number.");
            }
        }
        //code from class
        String image = "";
            for (int s = 0, end = answer - 1, row = 0; row < answer; row ++)
        {
            for ( int columns = 0; columns < answer; columns++)
            {
                if ( row == columns || row + columns == answer -1 )
                {
                    image += shapeBuild;
                }
                else
                {
                    image += shapeSp;
                }
            }
            image += "\n";
        }
        System.out.println(image);


// 2nd question
        System.out.println("The number you entered is " + answer);
        if ( answer <0)
        {
            System.out.println(0);
        }
        int sum = 0;
        for (int i =0; i <= answer; i=i+3) //multiples of 3
        {
            if (i%3 ==0)
            {
               sum += i;
                System.out.println("Multiples of 3 are " + i);
            }
        }
        System.out.println("The sum of the multiples of 3 is " + sum);

        int sumTwo = 0;
        for (int i =0; i<= answer; i=i+5) // multiples of 5
        {
            if (i%5 ==0)
            {
                sumTwo +=i;
                System.out.println("Multiples of 5 are " + i);
            }
        }
        System.out.println("The sum of the multiples of 5 is " + sumTwo);

    }
}

