package cn.sdack.broker

import java.math.BigDecimal
import java.time.LocalDateTime

/**
 * {appId}-rooms app存在的房间
 * 房间 即是用户的好友列表也是 群组
 *
 * @date 2022/7/28
 * @author sdack
 */
class Rooms {

    var id: BigDecimal? = null

    var appId: Long = 0

    /**
     * 房间属于谁
     */
    var userId: BigDecimal = BigDecimal("0")

    var roomname: String = ""

    /**
     * 房间的系统等级
     */
    var level: Int = 0

    /**
     * 描述房间类型
     */
    var type: String = ""

    /**
     * 房间描述最大长度为 512 字符
     */
    var desc: String = ""


    /**
     * 指示房间内是否可以一对一聊天
     */
    var oneToOne: Int = 0

    /**
     * 房间最大用户数
     */
    var maxCount: Int = 200

    /**
     * 房间内在线用户数
     */
    var userCount: Int = 0

    /**
     * 指示当前用户是否禁用了通知。
     * 禁用等级通知
     */
    var lurk: Int = 0

    /**
     * 定义房间的标签
     */
    @Transient
    var tags: MutableList<String> = mutableListOf()

    /**
     * 是否勿扰 不推送APP通知消息
     */
    var disturb: Int = 0

    /**
     * 是否禁言
     */
    var muted: Int = 0

    /**
     * 申请加入房间是否审批 加好友是否同意
     */
    var applyJoin: Int = 0

    /**
     * 邀请用户入群时是否需要被邀用户同意
     */
    var applyNeed: Int = 0

    /**
     * 是否允许群成员邀请别人加入此群
     */
    var invites: Int = 0

    /**
     * 是否允许上传文件
     */
    var uped: Int = 0

    /**
     * 是否允许下载文件
     */
    var downed: Int = 0

    /**
     * 是否撤销消息
     */
    var revoke: Int = 0

    var v: Double = 1.0

    /**
     * 版本
     */
    var version: Int = 0

    var created: LocalDateTime? = null

    var modified: LocalDateTime? = null

    var del: LocalDateTime? = null

}
