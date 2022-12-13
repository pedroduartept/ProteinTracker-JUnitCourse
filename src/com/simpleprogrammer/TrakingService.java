package com.simpleprogrammer;

import java.util.ArrayList;
import java.util.List;

public class TrakingService {
    private int total;
    private int goal;
    private List<HistoryItem> history = new ArrayList<HistoryItem>();
    private int hitoryId = 0;

    public void addProtein(int amount){
        total += amount;
        history.add(new HistoryItem(hitoryId++, amount, "add", total));
    }

    public void removeProtein(int amount){
        total -= amount;
        if(total < 0){
            total = 0;
            history.add(new HistoryItem(hitoryId++, amount, "subtract", total) );
        }
    }

    public int getTotal(){
        return total;
    }

    public void setGoal(int value){
        goal = value;
    }

    public boolean isGoalMet(){
        return total >= goal;
    }

    public List<HistoryItem> getHistory(){
        return history;
    }

}
