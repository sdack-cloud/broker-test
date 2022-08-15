package cn.sdack.broker

import com.alibaba.rsocket.RSocketService
import org.springframework.stereotype.Service
import reactor.core.publisher.Flux

/**
 *
 * @date 2022/8/16
 * @author sdack
 */
@RSocketService(serviceInterface = RoomService::class)
@Service
class RoomServiceImpl: RoomService {

    override fun getAll(): Flux<String> {
        return Flux.just("1","2")
    }
}
