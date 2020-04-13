package main.goal.cons;

import lombok.Getter;
import lombok.Setter;

/**
 * 把今天最好的表现当作明天最新的起点．．～
 * いま 最高の表現 として 明日最新の始発．．～
 * Today the best performance  as tomorrow newest starter!
 * Created by IntelliJ IDEA.
 * <p>
 *
 * @author : xiaomo
 * github: https://github.com/xiaomoinfo
 * email : xiaomo@xiaomo.info
 * QQ    : 83387856
 * Date  : 17/7/4 16:20
 * desc  : 目标配置
 * Copyright(©) 2017 by xiaomo.
 * @author qq
 */

@Getter
@Setter
public class GoalsConfig {

    /**
     * 唯一id
     */
    private int id;

    private int parentType;

    /**
     * 目标类型
     */
    private int type;

    /**
     * 目标参数
     */
    private int[] param;

    /**
     * 数量
     */
    private int count;

    /**
     * 杀怪类目标位置
     * 地图id#x坐标#y坐标
     */
    private int[] map;
}
