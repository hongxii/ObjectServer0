package main.goal.cons;


import javax.management.relation.Role;

/**
 * @Author : zhanyy  ʕ·͡ˑ·ཻʔෆʕ•̫͡•ོʔ
 * @Date : 2019/1/17
 * @Desc : to do anything
 */
public abstract class AbstractGoalImpl implements IGoal {


    @Override
    public boolean check(Role role, GoalCountHolder goalCountHolder, GoalsConfig goalsConfig) {
        return true;
    }
}
