package top.hubby.service

import top.hubby.model.Message

interface IMessageService {
    var test: String   //抽象属性


    fun save(message: Message)

    fun findMessages(): List<Message>

    fun findMessageById(id: String): List<Message>
}