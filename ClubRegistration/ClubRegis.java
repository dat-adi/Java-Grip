package ClubRegistration;

import java.util.*;

class ClubRegis
{
    public static void main(String[] args)
    {
        ClubRegis CR = new ClubRegis();
        Scanner sc = new Scanner(System.in);
        String[] regisNo = new String[10];
        String[] name = new String[10];
        String[] selectedClub = new String[10];
        String[] residence = new String[10];
        String[] years = new String[10];
        String[] memberType = new String[10];
        long[] phNo = new long[10];
        char resi, type;
        int i, cs, clubno, year, n = 0, fl = 0, flag = 0;

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
        
        int[] availableSeats =
        {
            12, 23, 1, 26, 34, 2, 5, 45, 23, 41, 23, 13, 12,
            23, 4, 23, 28, 13, 12, 23, 31, 11, 12, 3, 1,
            1, 21, 19, 16, 15, 13, 16, 2, 3, 12, 14, 2,
            5, 9, 22, 12, 23, 12, 32
        };

        System.out.println("Welcome to the Club Registration Page.");
        do
        {
            System.out.println("Please Choose an Option");
            System.out.println("1. List of available seats in each club");
            System.out.println("2. Registration Form");
            System.out.println("3. Details of students registered from this system.");
            cs = sc.nextInt();
            switch(cs)
            {
                case 1:
                {
                    System.out.println("The list of Available seats in each club : ");
                    System.out.println("-------------------------------------------------------------");
                    for(i = 0; i < 43; i++)
                    {
                        System.out.println("Club Name : " + clubNames[i]);
                        System.out.println("Numbers of seats available : " + availableSeats[i]);
                        System.out.println("-------------------------------------------------------------");
                    }
                    break;
                }
                case 2:
                {
                    n++;
                    sc.nextLine();
                    System.out.println("Enter your name :");
                    for(i = n - 1; i < n; i++)
                    {
                        name[i] = sc.nextLine();
                    }
                    sc.nextLine();
                    System.out.println("Enter your Registration Number :");
                    for(i = n - 1; i < n; i++)
                    {
                        regisNo[i] = sc.nextLine();
                    }
                    sc.nextLine();
                    flag = 0;
                    while(flag == 0)
                    {
                        System.out.println("Are you a hosteller or a day scholar?");
                        resi = sc.next().charAt(0);
                        for(i = n - 1; i < n; i++)
                        {
                            if(resi == 'h'|| resi == 'H')
                            {
                                residence[i] = "Hosteller";
                                flag = 1;
                            }
                            else if(resi == 'd'||resi == 'D')
                            {
                                residence[i] = "Day Scholar";
                                flag = 1;
                            }
                            else
                            {
                                System.out.println("Seems like you made a mistake, returning back to selection");
                                flag = 0;
                            }
                        }
                    }
                    flag = 0;
                    
                    while(flag == 0)
                    {
                        CR.show();
                        clubno = sc.nextInt();
                        for(i = n - 1; i < n; i++)
                        {
                            if(availableSeats[clubno-1] > 0)
                            {
                                selectedClub[i] = clubNames[clubno - 1];
                                System.out.println("Registered for " + clubNames[clubno - 1]);
                                availableSeats[clubno-1]--;
                                flag = 1;
                            }
                            else if(clubno < 0 || clubno > 43)
                            {
                                System.out.println("Invalid input, returning back to club selection...");
                                flag = 0;
                            }
                            else
                            {
                                System.out.println("No seats left in " + clubNames[clubno - 1]);
                                System.out.println("Returning back to club selection...");
                                flag = 0;
                            }
                        }
                    }
                    flag = 0;
                    while(flag == 0)
                    {
                        System.out.println("Where are you in your education?");
                        System.out.println("1. Fresher\n2. Sophomore\n3. Junior\n4. Senior");
                        year = sc.nextInt();
                        for(i = n - 1; i < n; i++)
                        {
                            if(year == 1)
                            {
                                years[i] = "Fresher";
                                flag = 1;
                            }
                            else if(year == 2)
                            {
                                years[i] = "Sophomore";
                                flag = 1;
                            }
                            else if(year == 3)
                            {
                                years[i] = "Junior";
                                flag = 1;
                            }
                            else if(year == 4)
                            {
                                years[i] = "Senior";
                                flag = 1;
                            }
                            else
                            {
                                System.out.println("Invalid Option, returning back to selection...");
                                flag = 0;
                            }
                        }
                    }
                    
                    System.out.println("Enter your phone number : ");
                    for(i = n - 1; i < n; i++)
					{
						phNo[i] = sc.nextLong();
					}
                    flag = 0;
                    while(flag == 0)
                    {
                        System.out.println("What kind of a club member do you wish to be?");
                        System.out.println("Credit or Volunteer?");
                        type = sc.next().charAt(0);
                        for(i = n - 1; i< n; i++)
                        {
                            if(type == 'c'|| type == 'C')
                            {
                                memberType[i] = "Credit Member";
                                flag = 1;
                            }
                            else if(type == 'v'|| type == 'V')
                            {
                                memberType[i] = "Volunteer";
                                flag = 1;
                            }
                            else
                            {
                                System.out.println("Invalid Input, returning back to selection...");
                                flag = 0;
                            }
                        }
                    }
                    System.out.println("You have successfully registered.");
                    System.out.println("---------------------------------------------------------------");
                    break;
                }
                case 3:
                {
                    if(n > 0)
                    {
                        System.out.println("These are the students who have registered through this system.");
                        System.out.println("----------------------------------------------------------------");
                        for(i = 0; i < n; i++)
                        {
                            System.out.println("Name : " + name[i]);
                            System.out.println("Registration Number : " + regisNo[i]);
                            System.out.println("Position : " + years[i]);
                            System.out.println("Residence : " + residence[i]);
                            System.out.println("Enrolled Club : " + selectedClub[i]);
                            System.out.println("Member Type : " + memberType[i]);
                            System.out.println("Phone Number : " + phNo[i]);
                            System.out.println("----------------------------------------------------------------");
                        }
                    }
                    else
                    {
                        System.out.println("This system has no registrations yet.");
                    }
                	
                    break;
                }
                default:
                {
                    System.out.println("Invalid option chosen.");
                    break;
                }
            }
            System.out.println("Choose your next step.");
            System.out.println("1. Proceed\n2. Exit");
            cs = sc.nextInt();
        }while(cs == 1);
    }
    
    void show()
    {
    	Scanner sc = new Scanner(System.in);
    	int flag;
    	flag = 0;
    	while(flag == 0)
        {
            System.out.println("Which Club do you wish to join?");
            System.out.println("1. Technical\n2. Non - Technical");
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
                flag = 1;
            }
            else if(tnt == 2)
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
                flag = 1;
            }
            else
            {
                System.out.println("Looks like you've made a mistake, let's try again...");
                flag = 0;
            }
        }
        
    }
}