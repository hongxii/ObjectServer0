package main.goal.goaltype.count;


import lombok.extern.slf4j.Slf4j;
import main.goal.cons.GoalCountHolder;
import main.goal.GoalManager;
import main.goal.cons.GoalsConfig;
import main.goal.cons.AbstractGoalImpl;

import javax.management.relation.Role;

/**
 * Created by IntelliJ IDEA.
 *
 * @author : jinyonghui
 * Date : 2019/7/25 13:56
 * Desc :
 */
@Slf4j
public class NewGemCountImpl extends AbstractGoalImpl {
    @Override
    public boolean update(Role role, GoalCountHolder goalCountHolder, GoalsConfig goalsConfig, int... params) {
        return GoalManager.getInstance().addGoalCount(role, goalCountHolder, goalsConfig);
    }
}
