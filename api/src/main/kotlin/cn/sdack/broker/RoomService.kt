package cn.sdack.broker

import reactor.core.publisher.Flux

/**
 *
 * @date 2022/8/16
 * @author sdack
 */
interface RoomService {

    fun getAll(): Flux<String>
}
