package main.goal.cons;


import javax.management.relation.Role;

/**
 * @author xiaomo
 */
public interface IGoal {

    /**
     * 记录目标数据
     *
     * @param role role
     * @param
     */
    default void record(Role role, int type, int... param) {
    }

    /**
     * 更新目标数据
     *
     * @param role  role
     * @param goalCountHolder  goalCountHolder
     * @param params params
     * @return Goal
     */
    boolean update(Role role, GoalCountHolder goalCountHolder, GoalsConfig goalsConfig, int... params);

    /**
     * 成就check目标是否完成
     *
     * @param role role
     * @param goalCountHolder
     * @param goalsConfig goalsConfig
     * @return boolean
     */
    boolean check(Role role, GoalCountHolder goalCountHolder, GoalsConfig goalsConfig);
}
