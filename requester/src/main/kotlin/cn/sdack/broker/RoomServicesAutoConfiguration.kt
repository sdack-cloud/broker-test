package cn.sdack.broker

import com.alibaba.rsocket.invocation.RSocketRemoteServiceBuilder
import com.alibaba.rsocket.metadata.RSocketMimeType
import com.alibaba.rsocket.upstream.UpstreamManager
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration

/**
 *
 * @date 2022/8/14
 * @author sdack
 */
@Configuration
class RoomServicesAutoConfiguration {


    @Bean
    fun roomService( upstreamManager: UpstreamManager): RoomService {
        return RSocketRemoteServiceBuilder
            .client(RoomService::class.java)
            .upstreamManager(upstreamManager)
            .acceptEncodingType(RSocketMimeType.Json)
            .build()
    }

}
