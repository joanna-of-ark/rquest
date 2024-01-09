import org.example.Question;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int userInput;
        String x = link();

        System.out.println("Welcome to Responders' Quest! Type a number to continue:\n0.) Start\n1.) Guide");
        userInput = sc.nextInt();

        if (userInput == 0) {
            String q1 = """
                    What is the primary purpose of safety measures?'
                    a.) Enhancing productivity
                    b.) Minimizing potential harm
                    c.) Following regulations
                    d.) Promoting accidents""";

            String q2 = """
                    What is the fundamental purpose of administering first aid?
                    a.) To preserve life, prevent the worsening of a condition, and promote recovery
                    b.) To provide immediate relief from pain
                    c.) To assess the severity of injuries
                    d.) To diagnose medical conditions""";

            String q3 = """
                    What components are typically found in a first aid kit?
                    a.) Bandages and dressings
                    b.) Adhesive tape and band-aids
                    c.) Antiseptic wipes or solution
                    d.) All of the above""";

            String q4 = """
                    What does the "Stop, Drop, and Roll" technique address?
                    a.) Extinguishing fires in buildings
                    b.) Reducing stress and anxiety
                    c.) Extinguishing flames on clothes
                    d.) Preventing earthquakes""";

            String q5 = """
                    Why is it important to stay away from glass windows during an earthquake?
                    a.) Glass can shatter during everyday activities
                    b.) To avoid distraction from the outside view
                    c.) Glass can shatter during shaking
                    d.) To prevent theft""";

            String q6 = """
                    What is the primary purpose of an emergency blanket in a first aid kit?
                    a.) To provide shade in hot weather
                    b.) To create a makeshift tent
                    c.) To protect from the elements and provide warmth
                    d.) To use as a stretcher""";

            String q7 = """
                    How does elastic strain contribute to the occurrence of earthquakes?
                    a.) By causing earthquakes directly
                    b.) By releasing accumulated energy in Earth's crust
                    c.) By preventing seismic waves
                    d.) By cooling the Earth's lithosphere""";

            String q8 = """
                    What is the role of safety measures in regulatory compliance?
                    a.) To encourage rule-breaking
                    b.) To enforce unnecessary restrictions
                    c.) To ensure adherence to established standards
                    d.) To promote unsafe practices""";

            String q9 = """
                    What is the purpose of a CPR mask in a first aid kit?
                    a.) To perform magic tricks
                    b.) To protect both the rescuer and the person receiving assistance during CPR
                    c.) To provide a source of fresh air
                    d.) To cool down overheated individuals""";

            String q10 = """
                    How can you identify the severity of bleeding and when medical attention is needed?
                    a.) By counting the number of bandages used
                    b.) By measuring the length of the wound
                    c.) By assessing the type of bleeding
                    d.) By asking the person how they feel""";

            String q11 = """
                    What is the purpose of a CPR mask in a first aid kit?
                    a.) To protect the rescuer
                    b.) To protect the person receiving assistance
                    c.) To protect both the rescuer and the person receiving assistance during CPR
                    d.) To provide oxygen to the rescuer""";

            String q12 = """
                    How can you identify the severity of bleeding and when medical attention is needed?
                    a.) By the color of blood
                    b.) By the speed of bleeding
                    c.) By assessing the type of bleeding
                    d.) By counting the number of bandages used""";

            String q13 = """
                    What is the 'Stop, Drop, and Roll' technique used for?
                    a.) Crossing the road
                    b.) Extinguishing a fire
                    c.) Extinguishing flames on clothes
                    d.) Performing self-defense""";

            String q14 = """
                    Why is it important to stay away from glass windows during an earthquake?
                    a.) Glass can reflect seismic waves
                    b.) Glass can amplify the shaking
                    c.) Glass can shatter during shaking
                    d.) Glass can protect against earthquakes""";

            String q15 = """
                    What are the primary objectives of first aid?
                    a.) To administer medication
                    b.) To provide long-term care
                    c.) To preserve life, prevent worsening, and promote recovery
                    d.) To replace professional medical help""";

            String q16 = """
                    What historical factor prompted the development of safety regulations and equipment?
                    a.) Technological advancements
                    b.) Hazardous working conditions
                    c.) Government regulations
                    d.) Public demand for safety""";

            String q17 = """
                    In case of a fire emergency, why is it advised not to use elevators?
                    a.) Elevators are not functional during emergencies
                    b.) Elevators increase the risk of fire
                    c.) Elevators are only for firefighters
                    d.) Elevators can explode during fires""";

            String q18 = """
                    What is the purpose of an emergency blanket in a first aid kit?
                    a.) To provide shade
                    b.) To cover wounds
                    c.) To protect from the elements and provide warmth
                    d.) To signal for help""";

            String q19 = """
                    How does elastic strain contribute to the occurrence of earthquakes?
                    a.) By preventing earthquakes
                    b.) By releasing accumulated energy in Earth's crust
                    c.) By increasing seismic waves
                    d.) By causing fault lines""";

            String q20 = """
                    What is the role of safety measures in regulatory compliance?
                    a.) To promote accidents
                    b.) To follow popular opinion
                    c.) To ensure adherence to established standards
                    d.) To bypass regulations""";

            String q21 = """
                    In the event of a workplace accident, what immediate actions should be taken according to safety measures?
                    a.) Continue working
                    b.) Call 9-1-1 immediately
                    c.) Wait for a colleague to respond
                    d.) Fill out paperwork first""";

            String q22 = """
                    If someone is choking but still conscious, what first aid procedure should be applied?
                    a.) Administer CPR
                    b.) Perform the 'Stop, Drop, and Roll'
                    c.) Use the Heimlich maneuver
                    d.) Apply a cold compress""";

            String q23 = """
                    Why is it crucial to prioritize personal safety during a fire emergency?
                    a.) To protect belongings
                    b.) To prevent further injury
                    c.) To avoid emergency services
                    d.) To save personal items""";

            String q24 = """
                    When should a first aid kit be used?
                    a.) Only in major emergencies
                    b.) As a replacement for professional medical help
                    c.) In all situations requiring immediate and preliminary care
                    d.) Only when instructed by a doctor""";

            String q25 = """
                    What role does technology play in enhancing safety measures?
                    a.) Technology has no impact on safety
                    b.) Technology contributes to the development of safety regulations and equipment
                    c.) Technology increases hazards
                    d.) Technology is solely for entertainment""";

            String q26 = """
                    If you encounter a person with a burn injury, what immediate first aid steps should be taken?
                    a.) Apply ice to the burn
                    b.) Keep the burned area warm
                    c.) Remove clothing and jewelry
                    d.) Wait for the person to ask for help""";

            String q27 = """
                    During an earthquake, why is it advised to stay away from trees and electric posts?
                    a.) To avoid insects
                    b.) To prevent aftershocks
                    c.) To minimize the risk of falling objects
                    d.) Trees and electric posts are earthquake-resistant""";

            String q28 = """
                    What is the primary purpose of an earthquake emergency evacuation?
                    a.) To create panic
                    b.) To get closer to the epicenter
                    c.) To protect against lightning
                    d.) To move to a safer area""";

            String q29 = """
                    How do safety measures contribute to the overall well-being of communities?
                    a.) By causing accidents
                    b.) By hindering productivity
                    c.) By protecting individuals from immediate dangers
                    d.) By promoting hazards""";

            String q30 = """
                    In a fire emergency, why is it important to check for water, electrical, gas, or LPG leaks and damages?
                    a.) To report to the media
                    b.) To determine the cause of the fire
                    c.) To prevent further hazards and injuries
                    d.) To retrieve personal belongings""";

            Question[] questions = {
                    new Question(q1, "c"),
                    new Question(q2, "a"),
                    new Question(q3, "d"),
                    new Question(q4, "c"),
                    new Question(q5, "c"),
                    new Question(q6, "c"),
                    new Question(q7, "c"),
                    new Question(q8, "c"),
                    new Question(q9, "c"),
                    new Question(q10, "c"),
                    new Question(q11, "b"),
                    new Question(q12, "c"),
                    new Question(q13, "c"),
                    new Question(q14, "c"),
                    new Question(q15, "c"),
                    new Question(q16, "b"),
                    new Question(q17, "a"),
                    new Question(q18, "c"),
                    new Question(q19, "b"),
                    new Question(q20, "c"),
                    new Question(q21, "b"),
                    new Question(q22, "c"),
                    new Question(q23, "b"),
                    new Question(q24, "c"),
                    new Question(q25, "b"),
                    new Question(q26, "c"),
                    new Question(q27, "c"),
                    new Question(q28, "d"),
                    new Question(q29, "c"),
                    new Question(q30, "c")
            };
            respondersQuest(questions);
        } else if (userInput == 1) {
            System.out.println(x);
        } else {
            System.out.println("Invalid input value.");

        }
        sc.close();
    }
    public static void respondersQuest(Question[]questions){
        Scanner type = new Scanner(System.in);
        int score = 0;
        String x = link();

        int i = 0;
        while (i < questions.length) {
            System.out.println(questions[i].prompt);
            String answer = type.nextLine();

            if (answer.equals(questions[i].answer)) {
                score++;
            }
            i++;
        }

        System.out.println("You got " + score + "/" + questions.length);
        System.out.println(x);
        type.close();
    }
    public static String link(){
        String url = "file:///C:/Users/Nervous/RQ.html";
        String text = "Check our guide: ";
        return text + url;
    }
}