package main.goal.goaltype.check;


import lombok.extern.slf4j.Slf4j;
import main.goal.cons.GoalCountHolder;
import main.goal.cons.GoalsConfig;
import main.goal.cons.AbstractGoalImpl;

import javax.management.relation.Role;

/***
 * author:lipan
 * 检查指定品阶装备穿戴数量
 */
@Slf4j
public class CheckEquipPutNumIml extends AbstractGoalImpl {

    @Override
    public boolean update(Role role, GoalCountHolder goalCountHolder, GoalsConfig goalsConfig, int... params) {
        return false;
    }

}
