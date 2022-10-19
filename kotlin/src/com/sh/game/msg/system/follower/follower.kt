package com.sh.game.msg.system.follower

import com.sh.game.msg.system.role.AttributeBean

private val id = 55
private val queue = 2

/**
 * @id 0
 * @param followerId followerId
 * @param sex sex
 * @param number number
 */
class FollowerBean(
    followerId: Long,
    sex: Int,
    number: Int
)

/**
 * @id 1
 * @param followerId followerId
 * @param sex sex
 * @param number number
 */
class ReqCreateFollowerMessage(career: Int, sex: Int)

/**
 * @id 2
 * @param list 所有list
 */
class ResFollowerInfoMessage(list: List<FollowerBean>)

/**
 *
 */
class ResAllFollowerInfoMessage(attr : AttributeBean)