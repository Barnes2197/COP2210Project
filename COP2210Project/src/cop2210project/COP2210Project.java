package cop2210project;
import java.util.*;

public class COP2210Project {

    
    public static void main(String[] args)
    {
        Scanner in = new Scanner(System.in);
        int seats[][] = new int [9][10];
        int range = (40 - 10) + 10;
        String choice = "z";
        String option;
        int counter = 0;
        //Populating the array
        for(int i = 0; i < 9; i++)
        {
            for(int j = 0; j < 10; j++)
            {
                seats[i][j] = (int)(((Math.random() * range) + 10)/10) * 10;
            }
        }
        //Displaying array of seat prices to user
        /*for(int i = 0; i < 9;i++)
        {
            for(int j = 0; j < 10; j++)
            {
                System.out.print(seats[i][j] + " ");
            }
            System.out.println("");
        }*/
        do
        {
            for(int i = 0; i < 9;i++)
        {
            for(int j = 0; j < 10; j++)
            {
                System.out.print(seats[i][j] + " ");
            }
            System.out.println("");
        }
            
            System.out.println("\nWould you like to buy a ticket by seat or by price");
            System.out.println("A.Seat");
            System.out.println("B.Price");
            option = in.nextLine();
            switch(option.toUpperCase())
            {
                case "A":
                    System.out.print("Enter a row(9 rows): ");
                    int a = in.nextInt();
                    System.out.print("Enter a column(10 columns): ");
                    int b = in.nextInt();
                    
                    if(a > 9 || b > 10)
                    {
                        System.out.println("Invalid Input");
                    }
                    else
                    {
                        seats[a][b] = 0;                       
                    }
                    
                    break;
                case "B": 
                    System.out.println("Please enter a price on the screen: ");
                    int price = in.nextInt();
                    
                    for(int i = 0; i < 9; i++)
                    {
                        for(int j = 0; j < 10; j++)
                        {
                            if(seats[i][j] == price)
                            {
                                seats[i][j] = 0;
                                break;
                            }
                        }
                    }
                    
                    break;
                default:
                    System.out.println("Invalid Input");
                    
            }
            
            System.out.println("Would you like to buy another ticket? (yes or no)");
                    in.nextLine();
                    choice = in.nextLine();
                    
                    
            
           
        }while(!choice.equals("no")); 
        
        for(int i = 0; i < 9; i++)
        {
            for(int j = 0;j < 10;j++)
            {
                if(seats[i][j] == 0)
                {
                    counter++;
                }
            }
        }
        System.out.println("You bought: " + counter + " tickets");
        System.out.println("I hope you enjoy your movie");
            
        }
        
    }
    

