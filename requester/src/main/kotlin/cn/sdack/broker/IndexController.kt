package cn.sdack.broker

import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController
import reactor.core.publisher.Mono


/**
 *
 * @date 2022/8/16
 * @author sdack
 */
@RestController
class IndexController {

    @Autowired
    lateinit var roomService: RoomService

    @GetMapping("/rooms")
    fun index(): Mono<List<String>> {
        return roomService.getAll().collectList();
    }

}
