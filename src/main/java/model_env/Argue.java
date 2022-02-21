package model_env;

import java.util.*;

public class Argue {
    private Problem problem;
    private Entity[] participants;
    private String[] entityArguePositions;

    public Argue(Problem problem, Entity[] participants) {
        this.problem = problem;
        this.participants = participants;
    }

    public String[] getEntityArguePositions() {
        return entityArguePositions;
    }

    public void setEntityArguePositions() {
        this.entityArguePositions = new String[participants.length];
        for (int i = 0; i < participants.length; i++) {
            entityArguePositions[i] = participants[i].getArguePosition();
        }
    }

    public Problem getProblem() {
        return problem;
    }

    public void setProblem(Problem problem) {
        this.problem = problem;
    }

    public Entity[] getParticipants() {
        return participants;
    }

    public void setParticipants(Entity[] participants) {
        this.participants = participants;
    }



    public void do_argue(){
        setEntityArguePositions();
            if (entityArguePositions.length != 0){
                HashMap<String, Integer> countMap = countIntem(entityArguePositions);
                int maxVal = 0;
                String solution = "";
                boolean has_second_value = false;

                for (Map.Entry<String, Integer> entry : countMap.entrySet()) {
                    String key = entry.getKey();
                    Integer value = entry.getValue();

                    if (value == maxVal) has_second_value = true;
                    if (value > maxVal){
                        maxVal = value;
                        solution = key;
                        has_second_value = false;
                    }
                }
                if (!has_second_value) set_argue_result(solution);
                //else System.out.println("Спор не был решен, так как равные группы имеют разные позиции");
            }
    }

    public void set_argue_result(String solution){
        problem.setSolving(true);
        problem.setSolution(solution);
    }




    public HashMap<String, Integer> countIntem(String[] array ) {

        Arrays.sort(array);
        HashMap<String, Integer> map = new HashMap<String, Integer>();
        Integer count = 0;
        String first = array[0];
        for( int counter = 0; counter < array.length; counter++ ) {
            if(first.hashCode() == array[counter].hashCode()) {
                count = count + 1;
            } else {
                map.put(first, count);
                count = 1;
            }
            first = array[counter];
            map.put(first, count);
        }

        return map;
    }

}
