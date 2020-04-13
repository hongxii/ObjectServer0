package main.goal.entity;


import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Goal {


    private int goalId;

    public int count;

    public Goal() {
    }

    public Goal(int goalId) {
        this.goalId = goalId;
    }

    public Goal(int goalId, int count) {
        this.goalId = goalId;
        this.count = count;
    }

    public boolean check() {
        return true;
    }

    public void autoComplete() {}
}
