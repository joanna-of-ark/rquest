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
            String q1 = "What is the primary purpose of safety measures?\n"
                    + "a.) Enhancing productivity\nb.) Minimizing potential harm\nc.) Following regulations\nd.) Promoting accidents";

            String q2 = "What is the fundamental purpose of administering first aid?\n"
                    + "a.) To preserve life, prevent the worsening of a condition, and promote recovery\nb.) To provide immediate relief from pain\nc.) To assess the severity of injuries\nd.) To diagnose medical conditions";

            String q3 = "What components are typically found in a first aid kit?\n"
                    + "a.) Bandages and dressings\nb.) Adhesive tape and band-aids\nc.) Antiseptic wipes or solution\nd.) All of the above";

            String q4 = "What does the \"Stop, Drop, and Roll\" technique address?\n"
                    + "a.) Extinguishing fires in buildings\nb.) Reducing stress and anxiety\nc.) Extinguishing flames on clothes\nd.) Preventing earthquakes";

            String q5 = "Why is it important to stay away from glass windows during an earthquake?\n"
                    + "a.) Glass can shatter during everyday activities\nb.) To avoid distraction from the outside view\nc.) Glass can shatter during shaking\nd.) To prevent theft";

            String q6 = "What is the primary purpose of an emergency blanket in a first aid kit?\n"
                    + "a.) To provide shade in hot weather\nb.) To create a makeshift tent\nc.) To protect from the elements and provide warmth\nd.) To use as a stretcher";

            String q7 = "How does elastic strain contribute to the occurrence of earthquakes?\n"
                    + "a.) By causing earthquakes directly\nb.) By releasing accumulated energy in Earth's crust\nc.) By preventing seismic waves\nd.) By cooling the Earth's lithosphere";

            String q8 = "What is the role of safety measures in regulatory compliance?\n"
                    + "a.) To encourage rule-breaking\nb.) To enforce unnecessary restrictions\nc.) To ensure adherence to established standards\nd.) To promote unsafe practices";

            String q9 = "What is the purpose of a CPR mask in a first aid kit?\n"
                    + "a.) To perform magic tricks\nb.) To protect both the rescuer and the person receiving assistance during CPR\nc.) To provide a source of fresh air\nd.) To cool down overheated individuals";

            String q10 = "How can you identify the severity of bleeding and when medical attention is needed?\n"
                    + "a.) By counting the number of bandages used\nb.) By measuring the length of the wound\nc.) By assessing the type of bleeding\nd.) By asking the person how they feel";

            String q11 = "What is the purpose of a CPR mask in a first aid kit?\n"
                    + "a.) To protect the rescuer\nb.) To protect the person receiving assistance\nc.) To protect both the rescuer and the person receiving assistance during CPR\nd.) To provide oxygen to the rescuer";

            String q12 = "How can you identify the severity of bleeding and when medical attention is needed?\n"
                    + "a.) By the color of blood\nb.) By the speed of bleeding\nc.) By assessing the type of bleeding\nd.) By counting the number of bandages used";

            String q13 = "What is the 'Stop, Drop, and Roll' technique used for?\n"
                    + "a.) Crossing the road\nb.) Extinguishing a fire\nc.) Extinguishing flames on clothes\nd.) Performing self-defense";

            String q14 = "Why is it important to stay away from glass windows during an earthquake?\n"
                    + "a.) Glass can reflect seismic waves\nb.) Glass can amplify the shaking\nc.) Glass can shatter during shaking\nd.) Glass can protect against earthquakes";

            String q15 = "What are the primary objectives of first aid?\n"
                    + "a.) To administer medication\nb.) To provide long-term care\nc.) To preserve life, prevent worsening, and promote recovery\nd.) To replace professional medical help";

            String q16 = "What historical factor prompted the development of safety regulations and equipment?\n"
                    + "a.) Technological advancements\nb.) Hazardous working conditions\nc.) Government regulations\nd.) Public demand for safety";

            String q17 = "In case of a fire emergency, why is it advised not to use elevators?\n"
                    + "a.) Elevators are not functional during emergencies\nb.) Elevators increase the risk of fire\nc.) Elevators are only for firefighters\nd.) Elevators can explode during fires";

            String q18 = "What is the purpose of an emergency blanket in a first aid kit?\n"
                    + "a.) To provide shade\nb.) To cover wounds\nc.) To protect from the elements and provide warmth\nd.) To signal for help";

            String q19 = "How does elastic strain contribute to the occurrence of earthquakes?\n"
                    + "a.) By preventing earthquakes\nb.) By releasing accumulated energy in Earth's crust\nc.) By increasing seismic waves\nd.) By causing fault lines";

            String q20 = "What is the role of safety measures in regulatory compliance?\n"
                    + "a.) To promote accidents\nb.) To follow popular opinion\nc.) To ensure adherence to established standards\nd.) To bypass regulations";

            String q21 = "In the event of a workplace accident, what immediate actions should be taken according to safety measures?\n"
                    + "a.) Continue working\nb.) Call 9-1-1 immediately\nc.) Wait for a colleague to respond\nd.) Fill out paperwork first";

            String q22 = "If someone is choking but still conscious, what first aid procedure should be applied?\n"
                    + "a.) Administer CPR\nb.) Perform the 'Stop, Drop, and Roll'\nc.) Use the Heimlich maneuver\nd.) Apply a cold compress";

            String q23 = "Why is it crucial to prioritize personal safety during a fire emergency?\n"
                    + "a.) To protect belongings\nb.) To prevent further injury\nc.) To avoid emergency services\nd.) To save personal items";

            String q24 = "When should a first aid kit be used?\n"
                    + "a.) Only in major emergencies\nb.) As a replacement for professional medical help\nc.) In all situations requiring immediate and preliminary care\nd.) Only when instructed by a doctor";

            String q25 = "What role does technology play in enhancing safety measures?\n"
                    + "a.) Technology has no impact on safety\nb.) Technology contributes to the development of safety regulations and equipment\nc.) Technology increases hazards\nd.) Technology is solely for entertainment";

            String q26 = "If you encounter a person with a burn injury, what immediate first aid steps should be taken?\n"
                    + "a.) Apply ice to the burn\nb.) Keep the burned area warm\nc.) Remove clothing and jewelry\nd.) Wait for the person to ask for help";

            String q27 = "During an earthquake, why is it advised to stay away from trees and electric posts?\n"
                    + "a.) To avoid insects\nb.) To prevent aftershocks\nc.) To minimize the risk of falling objects\nd.) Trees and electric posts are earthquake-resistant";

            String q28 = "What is the primary purpose of an earthquake emergency evacuation?\n"
                    + "a.) To create panic\nb.) To get closer to the epicenter\nc.) To protect against lightning\nd.) To move to a safer area";

            String q29 = "How do safety measures contribute to the overall well-being of communities?\n"
                    + "a.) By causing accidents\nb.) By hindering productivity\nc.) By protecting individuals from immediate dangers\nd.) By promoting hazards";

            String q30 = "In a fire emergency, why is it important to check for water, electrical, gas, or LPG leaks and damages?\n"
                    + "a.) To report to the media\nb.) To determine the cause of the fire\nc.) To prevent further hazards and injuries\nd.) To retrieve personal belongings";

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

        for (int i = 0; i < questions.length; i++) {
            System.out.println(questions[i].prompt);
            String answer = type.nextLine();

            if (answer.equals(questions[i].answer)) {
                score++;
            }
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