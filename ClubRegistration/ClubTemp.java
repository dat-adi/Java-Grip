//Another Version

import java.util.*;	//Used to bring in the Scanner class.
import java.io.*;	//Used to bring in the FileWriter class.

public class ClubTemp
{
    public static void main(String[] args)
    {
        Scanner sc = new Scanner(System.in);
        String regisNo, name, temp_regis, selectedClub;	//Declaration of the variables
        String[] names = new String[10];
        String[] regisNumbers = new String[10];
        char resi, type;
        int i, cs, clubno, year, n = 0;
        long phNo;

        try{
            //adding your text file location below in the FileWriter will allow you to get the details after execution as well,
            //as the information is stored in a text file.
            FileWriter fw = new FileWriter("C:\\Users\\narui\\Documents\\Java\\ClassHomework\\Registered.txt");
            System.out.println("\n\nWelcome to the Club registration page.");
            System.out.println("\nPlease select an option");
            do 	//Running the loop till the user exits
            {
                System.out.println("\n1. List of registered members \n2. Register");
                cs = sc.nextInt();
                sc.nextLine();

                switch(cs)
                {
                    case 1:
                    {
                        System.out.println("\nThe registered members are : ");
                        if(n == 0)
                        {
                            System.out.println("\nNobody has registered yet.");
                        }
                        if(n!= 0)
                        {
                            System.out.println("\nThese are the members who have registered till now.");
                            for(i = 0; i < n; i++)
                            {

                                System.out.println("-------------------------------------------------------------------");
                                System.out.println(names[i]);
                                System.out.println(regisNumbers[i]);
                            }
                        }
                        break;
                    }
                    case 2:
                    {
                        n++;
                        System.out.println("\nEnter your name : ");
                        name = sc.nextLine();
                        fw.write("Name 				: " + name +"\n");
                        sc.nextLine();
                        for(i = n-1; i < n; i++)
                        {
                            names[i] = name;
                        }
                        System.out.println("\nEnter your registration number : ");
                        regisNo = sc.nextLine();
                        for(i = n-1; i < n; i++)
                        {
                            regisNumbers[i] = regisNo;
                        }

                        fw.write("Registration Number   		: " + regisNo + "\n");
                        sc.nextLine();
                        System.out.println("Are you a Hosteller or a Day Scholar?");
                        System.out.println("(H) or (D)");
                        resi = sc.next().charAt(0);
                        if(resi == 'H'|| resi == 'h')
                        {
                            fw.write("Hosteller");
                        }
                        else if(resi == 'D'|| resi == 'd')
                        {
                            fw.write("Dayscholar");
                        }
                        System.out.println("\nWhich Club do you wish to join?");
                        System.out.println("1. Technical\n2. Non-Technical");
                        int tnt = sc.nextInt();
                        if(tnt == 1)
                        {
                            System.out.println("\nPick your club :\n");
                            System.out.println("1. Computer Society of India");
                            System.out.println("2. IEEE Student Branch");
                            System.out.println("3. Developer Student Clubs");
                            System.out.println("4. Open Source Community");
                            System.out.println("5. Android Club");
                            System.out.println("6. Academic & Industrial Nano Society");
                            System.out.println("7. Robotics Club");
                            System.out.println("8. Null Chapter");
                            System.out.println("9. Drushya - Animation and Gaming");
                            System.out.println("10. Bulls and Bears - Investment and stock trading club");
                            System.out.println("11. BaN - Be a Nerd Club");
                            System.out.println("12. Math Club");
                            System.out.println("13. Cloud Space Community");
                            System.out.println("14. Renewable Energy Club");
                            System.out.println("15. ACM Student Chapter");
                            System.out.println("16. Students for the Exploration and Development of Space");
                            System.out.println("17. L.I.T.D.A.C - Data Analytics Club");
                            System.out.println("18. Electronics Hobby Club");
                            System.out.println("19. Teach your Machine Club");
                            System.out.println("20. Fly your Ideas Club");
                            System.out.println("21. Block Chain Club");
                            System.out.println("22. Youtuber Club");
                            System.out.println("23. SPARK - Electric Vehicle Club");
                            System.out.println("24. Creation Club");
                        }
                        if(tnt == 2)
                        {
                            System.out.println("25. ToastMasters");
                            System.out.println("26. Dhwani - Theatre and Fine Art Club");
                            System.out.println("27. LIVIT Club");
                            System.out.println("28. Master Mind - The Quiz Club");
                            System.out.println("29. The Gardening Club");
                            System.out.println("30. Comedy Club");
                            System.out.println("31. DIY - Do It Yourself Club");
                            System.out.println("32. Bioscope - Movie making and Screening Club");
                            System.out.println("33. Run 4 a Cause");
                            System.out.println("34. Adventure Club");
                            System.out.println("35. Click n Flick");
                            System.out.println("36. Clean Campus Club");
                            System.out.println("37. National Service Scheme");
                            System.out.println("38. Beat the Heat - Dance Club");
                            System.out.println("39. Sports Club");
                            System.out.println("40. Indian Classical Music Club");
                            System.out.println("41. Western Music Club");
                            System.out.println("42. Sanskriti - Culture Club");
                            System.out.println("43. SEED - Social Entrepreneurship Empowerment and Development Club");
                        }
                        String[] clubNames =
                                {
                                        "Computer Society of India",
                                        "IEEE Student Branch",
                                        "Developer Student Clubs",
                                        "Open Source Community",
                                        "Android Club",
                                        "Academic & Industrial Nano Society",
                                        "Robotics Club",
                                        "Null Chapter",
                                        "Drushya - Animation and Gaming",
                                        "Bulls and Bears - Investment and stock trading club",
                                        "BaN - Be a Nerd Club",
                                        "Math Club",
                                        "Cloud Space Community",
                                        "Renewable Energy Club",
                                        "ACM Student Chapter",
                                        "Students for the Exploration and Development of Space",
                                        "L.I.T.D.A.C - Data Analytics Club",
                                        "Electronics Hobby Club",
                                        "Teach your Machine Club",
                                        "Fly your Ideas Club",
                                        "Block Chain Club",
                                        "Youtuber Club",
                                        "SPARK - Electric Vehicle Club",
                                        "Creation Club",
                                        "ToastMasters",
                                        "Dhwani - Theatre and Fine Art Club",
                                        "LIVIT Club",
                                        "Master Mind - The Quiz Club",
                                        "The Gardening Club",
                                        "Comedy Club",
                                        "DIY - Do It Yourself Club",
                                        "Bioscope - Movie making and Screening Club",
                                        "Run 4 a Cause",
                                        "Adventure Club",
                                        "Click n Flick",
                                        "Clean Campus Club",
                                        "National Service Scheme",
                                        "Beat the Heat - Dance Club",
                                        "Sports Club",
                                        "Indian Classical Music Club",
                                        "Western Music Club",
                                        "Sanskriti - Culture Club",
                                        "SEED - Social Entrepreneurship Empowerment and Development Club"
                                };
                        System.out.println("\nEnter the number of the club that you wish to join : ");
                        clubno = sc.nextInt();
                        fw.write("\nRegistered Club 	 	: " + clubNames[clubno - 1] + "\n");
                        sc.nextLine();

                        System.out.println("\nWhich year are you in?");
                        System.out.println("\n1.Fresher\n2.Sophomore\n3.Junior\n4.Senior");
                        year = sc.nextInt();
                        if(year == 1)
                        {
                            fw.write("Fresher");
                        }
                        else if(year == 2)
                        {
                            fw.write("Sophomore");
                        }
                        else if(year == 3)
                        {
                            fw.write("Junior");
                        }
                        else if(year == 4)
                        {
                            fw.write("Senior");
                        }
                        else
                        {
                            System.out.println("Invalid.");
                        }
                        sc.nextLine();
                        System.out.println("\nEnter your phone number :");
                        phNo = sc.nextLong();
                        fw.write("\nPhone number 			: " + phNo + "\n");
                        System.out.println("\nWhat kind of a member do you wish to apply to be :");
                        System.out.println("Credit(c) or Volunteer(v)");
                        type = sc.next().charAt(0);
                        if(type == 'c')
                        {
                            fw.write("Status  			: Credit Member");
                        }
                        else if(type == 'v')
                        {
                            fw.write("Status  			: Volunteer");
                        }
                        else
                        {
                            fw.write("Invalid");
                        }
                        System.out.println("\n\nYou have successfully registered.");
                        fw.write("\n------------------------------------------------------------------------\n");
                        break;
                    }
                    default:
                    {
                        System.out.println("Invalid Option, will exit...");
                        break;
                    }
                }
                System.out.println("\nIs another person registering?");
                System.out.println("\nPress 1 to proceed, and 2 to exit.");
                cs = sc.nextInt();
            }
            while(cs == 1);
            fw.close();
        }
        catch(Exception e){System.out.println(e);}
    }
}