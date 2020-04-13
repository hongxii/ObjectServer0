package main.goal.goaltype.record;


import main.goal.cons.GoalsConfig;
import main.goal.cons.AbstractRecordGoalImpl;

import javax.management.relation.Role;

/**
 * @author hongxii
 */
public class RecordBTTowerLevelImpl extends AbstractRecordGoalImpl {

    @Override
    protected int recordCountGet(Role role, GoalsConfig goalsConfig) {
        return 1;
    }
}
