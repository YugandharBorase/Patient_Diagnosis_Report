import java.util.ArrayList;
import java.util.Scanner;

public class Main
{
    public static void main(String[] args) {
        LeftEye L = new LeftEye();

        RightEye R = new RightEye();

        Heart H = new Heart();

        Stomach O = new Stomach();

        Skin D = new Skin();
        Scanner SC = new Scanner(System.in);
        ArrayList<String> Patient_name = new ArrayList<>();
        String name;

        ArrayList <String> color = new ArrayList<>();
        String EyeColor;

        ArrayList <String> Medical_Condition = new ArrayList<>();
        String MedicalC;

        ArrayList <Integer> HeartRate = new ArrayList<>();
        int HeartR;

        System.out.println("Enter the START to Start application");
        String Start = SC.next();
        while(Start!="MENU")
        {
            System.out.println("welcome to patient data base");
            System.out.println();

            System.out.println("Press");
            System.out.println();

            System.out.println("E = Edit || Add Information");
            System.out.println();

            System.out.println("D = Show the Existing information");
            String Choose = SC.next();
            System.out.println();



            switch(Choose)
            {
                case "E":
                {
                    System.out.println("To Add new patient detail press A");
                    System.out.println("To Close the menu press C");
                    String AddClose=SC.next();
                    switch(AddClose)
                    {
                        case "A":
                        {
                            System.out.println("Enter the name of patient ");
                            name = SC.next();
                            Patient_name.add(name);

                            System.out.println("enter medical Condition of left Eye and color ");
                            MedicalC=SC.next();
                            System.out.println();
                            EyeColor=SC.next();
                            Medical_Condition.add(MedicalC);
                            color.add(EyeColor);
                            L.setMedical_Condition(Medical_Condition);
                            L.setColor(color);
                            System.out.println();
                            System.out.println();

                            System.out.println("enter the medical condition of Right Eye and color");
                            MedicalC=SC.next();
                            System.out.println();
                            EyeColor=SC.next();
                            Medical_Condition.add(MedicalC);
                            color.add(EyeColor);
                            R.setMedical_Condition(Medical_Condition);
                            R.setColor(color);
                            System.out.println();
                            System.out.println();

                            System.out.println("Enter the medical condtion of Heart and Heart rate ");
                            MedicalC = SC.next();
                            System.out.println();
                            HeartR = SC.nextInt();
                            Medical_Condition.add(MedicalC);
                            HeartRate.add(HeartR);
                            H.setMedical_condition(Medical_Condition);
                            H.setHeartRate(HeartRate);
                            System.out.println();
                            System.out.println();

                            System.out.println("Enter the Medical condion of Stomach");
                            MedicalC = SC.next();
                            Medical_Condition.add(MedicalC);
                            O.setMedical_Condition(Medical_Condition);
                            System.out.println();
                            System.out.println();

                            System.out.println("Enter the Medical condion of Skin");
                            MedicalC = SC.next();
                            Medical_Condition.add(MedicalC);
                            D.setMedical_Condition(Medical_Condition);
                            System.out.println();
                            System.out.println();
                            break;
                        }
                        case "C":
                        {
                            System.out.println("now go for display");
                            break;
                        }

                    }
                    break;
                }
                case "D":
                {

                    for (String S : Patient_name)
                    {
                        System.out.println(S);
                    }

                    System.out.println(" Type Enter to go to Display Patient Detail ");
                    String Enter = SC.next();
                    System.out.println();

                    while(Enter!="Enter")
                    {
                        System.out.println("Enter the patient name ");
                        name=SC.next();

                        System.out.println("the patient no in the list is = ");
                        System.out.print(Patient_name.indexOf(name));
                        System.out.println();

                        System.out.println("go to organ list press ");
                        System.out.println("L = Left Eye | R = Right Eye");
                        System.out.println();
                        System.out.println("H = Heart | S= Stomach | K = Skin ");
                        System.out.println();
                        String OrganList = SC.next();

                        switch(OrganList)
                        {
                            case "L":
                            {
                                System.out.print("the medical condition of left eye is ");
                                System.out.println(L.Medical_Condition.get(Patient_name.indexOf(name)));
                                System.out.print("the color of left eye is ");
                                System.out.println(L.color.get(Patient_name.indexOf(name)));
                                break;
                            }
                            case "R":
                            {
                                System.out.print("the medical condition of Right eye is ");
                                System.out.println(R.Medical_Condition.get(Patient_name.indexOf(name)));
                                System.out.print("the color of Right eye is ");
                                System.out.println(R.color.get(Patient_name.indexOf(name)));
                                break;
                            }
                            case "H":
                            {
                                System.out.print("the medical condition of Heart is ");
                                System.out.println(H.Medical_condition.get(Patient_name.indexOf(name)));
                                System.out.print("the heart rate is ");
                                System.out.println(H.HeartRate.get(Patient_name.indexOf(name)));
                                break;
                            }
                            case "S":
                            {
                                System.out.print("the medical condition of Stomach is ");
                                System.out.println(O.Medical_Condition.get(Patient_name.indexOf(name)));
                                break;
                            }
                            case "K":
                            {
                                System.out.print("the medical condition of Skin is ");
                                System.out.println(D.Medical_Condition.get(Patient_name.indexOf(name)));
                                break;
                            }
                            default:
                            {
                                System.out.println("wronge option");
                                System.out.println("go to main menu type Enter");
                                Enter=SC.next();
                                break;
                            }
                        }
                    }

                    break;
                }


            }

        }
        System.out.println(" why it happen");
        SC.close();

    }
}
