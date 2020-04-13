package main.goal.cons;

import java.util.HashMap;
import java.util.Map;


public interface GoalConst {

    /**
     * 目标类型
     */
    enum GoalTypeEnum {

        //=========================================追溯类=============================================
        /**
         * 到X地图击杀X怪物X次
         */
        NEW_KILL_POINTED_MONSTER_IN_POINTED_MAP(101),

        /**
         * 属性达到指定值
         */
        RECORD_ATTRIBUTE_VALUE(111),
        /**
         * 附魔次数
         */
        ENCHANTING_INDEX(112),
        /**
         * 附魔等阶
         */
        ENCHANTING_LEVELS(113),
        /**
         * 打造次数
         */
        FORGE_INDEX(114),

        /**
         * 打造总等级
         */
        FORGE_TOTAL_INDEX(115),

        /**
         * 强化X次
         */
        NEW_QIANGHUA_EQUIP(116),

        /**
         * 强化总等级
         */
        RECORD_QIANGHUA_TOTAL_LEVEL(117),

        /**
         * 精炼X次
         */
        NEW_REFINE_EQUIP(118),

        /**
         * 精炼总等级
         */
        RECORD_REFINE_TOTAL_LEVEL(119),

        /**
         * 宝石总等级
         */
        RECORD_GEM_TOTAL_LEVEL(121),

        /**
         * 戒灵总等级达到X级
         */
        RECORD_RING_HERO_TOTAL_LEVEL(122),

        /**
         * 八门系统等级达到X级
         */
        RECORD_BA_MEN_LEVEL(123),

        /**
         * 八门部位装备达到X阶
         */
        RECORD_BA_MEN_EQUIP_RANK(124),

        /**
         * 召唤帮会boss X 次
         */
        NEW_CALL_UNION_BOSS_COUNT(125),

        /**
         * 参与X次帮会进度boss
         */
        NEW_JOIN_UNION_PROGRESS_BOSS_COUNT(126),

        /**
         * 获得XX次数的XXboss的归属奖励
         */
        WORLD_BOSS_OWNER_REWARD_COUNT(127),

        /**
         * 灵器激活死星内核
         */
        NEW_GLOVE_ACTIVATE_TYPE(128),

        /**
         * 回收
         */
        NEW_RECYCLE_EQUIPMENT(129),

        /**
         * 玩家转生等级
         */
        RECORD_ROLE_REIN_LEVEL(130),

        /**
         * 每日钻石充值数
         */
        RECORD_DAY_GEM_CHARGE(131),
        /**
         * 终生钻石充值数
         */
        RECORD_LIFE_GEM_CHARGE(132),

        /**
         * 悲叹之塔通关层数
         */
        RECORD_BT_TOWER_LEVEL(133),

        /**
         * 飞升达到对应等级
         */
        RECORD_SOAR_UP_LEVEL(134),

        /**
         * 累计登陆<>记录型的</>
         */
        RECORD_TOTAL_LOGIN_DAYS(135),

        /**
         * 挑战英雄榜次数
         */
        RECORD_ARMORY_FIGHT_TIME(136),

        /**
         * 激活光翼到指定等级
         */
        NEW_WING_LEVEL(137),

        /**
         * 元宝任务完成次数
         */
        YUANBAO_TASK(138),
        /**
         * 学习指定技能次数
         */
        LEARN_SKILL_COUNT(139),

        /**
         * 击杀野外boss数量
         */
        KILL_OUTDOOR_BOSS_COUNT(140),

        /**
         * 检查商品购买次数
         */
        CHECK_ITEM_BUY_COUNT(141),
        /**
         * 检查商城购买次数
         */
        CHECK_STORE_BUY_COUNT(142),
        /**
         * 检查指定图鉴等级
         */
        CHECK_IllUSTRATION_LEVEL(143),
        /**
         * 检查穿戴了几件装备
         */
        CHECK_EQUIP_PUT_NUM(145),

        /**
         * 悬赏任务完成次数
         */
        CHECK_XUANSHANG_TASK_COUNT(146),
        /**
         * 回收任务完成次数
         */
        CHECK_RECYCLE_TASK_COUNT(147),
        /**
         * 强化指定类型特戒
         */
        STRENGTH_SPECIALRING_COUNT(148),
        /**
         * 挑战王者争霸次数
         */
        KING_PERSON_COUNT(149),
        /**
         *  心法佩戴个数
         */
        SOULMETHOD_PUTON_COUNT(150),
        /**
         * 官职升到指定等级
         */
        OFFICAL_UP_LEVEL(151),

        /**
         * 宝石升级X次
         */
        NEW_GEM_COUNT(120),

        ;
        /**
         * 目标缓存
         */
        private static Map<Integer, GoalTypeEnum> map = new HashMap<>();

        static {
            for (GoalTypeEnum types : values()) {
                map.put(types.getGoalType(), types);
            }
        }

        final private int goalType;

        GoalTypeEnum(int goalType) {
            this.goalType = goalType;
        }

        public static Map<Integer, GoalTypeEnum> getMap() {
            return map;
        }

        public static GoalTypeEnum parse(int type) {
            GoalTypeEnum[] values = GoalTypeEnum.values();
            for (GoalTypeEnum value : values) {
                if (value.getGoalType() == type) {
                    return value;
                }
            }
            return null;
        }

        public int getGoalType() {
            return goalType;
        }

    }
}
