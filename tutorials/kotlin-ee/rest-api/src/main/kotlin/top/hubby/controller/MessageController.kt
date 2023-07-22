package top.hubby.controller

import org.springframework.web.bind.annotation.*
import top.hubby.logger
import top.hubby.model.Message
import top.hubby.model.Person
import top.hubby.service.MessageService

@RestController
class MessageController(val service: MessageService) {
    // private val logger = LoggerFactory.getLogger(MessageController::class.java)

    @GetMapping("/hello")
    fun index(@RequestParam("name") name: String): String {
        logger().info("name: {}", name)
        return "Hello, $name!"
    }

    @GetMapping("/person")
    fun index() = listOf(
        Person(1L, "zack", 18),
        Person(id = 2, age = 18, name = "tim"),
    )

    @GetMapping("/")
    fun get() = service.findMessages()

    @PostMapping("/")
    fun post(@RequestBody message: Message) = service.save(message)


    @GetMapping("/{id}")
    fun findMessageById(@PathVariable id: String) = service.findMessageById(id)
}