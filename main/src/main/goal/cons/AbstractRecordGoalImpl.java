package main.goal.cons;


import javax.management.relation.Role;


public abstract class AbstractRecordGoalImpl extends AbstractGoalImpl {

    @Override
    public boolean check(Role role, GoalCountHolder goalCountHolder, GoalsConfig goalsConfig) {
        int newCount = recordCountGet(role, goalsConfig);
        goalCountHolder.setCount(newCount);
        return goalCountHolder.getCount() >= 0;
    }

    @Override
    public boolean update(Role role, GoalCountHolder goalCountHolder, GoalsConfig goalsConfig, int... params) {
        int newCount = recordCountGet(role, goalsConfig);
        int oldCount = goalCountHolder.getCount();
        goalCountHolder.setCount(newCount);
        return newCount != oldCount;
    }

    protected abstract int recordCountGet(Role role, GoalsConfig goalsConfig);
}
