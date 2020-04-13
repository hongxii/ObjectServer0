package main.goal;

import lombok.extern.slf4j.Slf4j;
import main.goal.cons.GoalCountHolder;
import main.goal.cons.GoalsConfig;
import main.goal.cons.IGoal;

import javax.management.relation.Role;
import java.util.HashMap;
import java.util.Map;


@Slf4j
public class GoalManager {


    private static GoalManager ourInstance = new GoalManager();
    private static final Map<Integer, IGoal> GOAL_HANDLERS = new HashMap<>();

    static {

    }


    public static GoalManager getInstance() {
        return ourInstance;
    }

    public boolean addGoalCount(Role role, GoalCountHolder goal, GoalsConfig goalsConfig) {
        return addGoalCount(role, goal, goalsConfig, 1);
    }

    public boolean addGoalCount(Role role, GoalCountHolder goal, GoalsConfig goalsConfig, long count) {
        return true;
    }



}
