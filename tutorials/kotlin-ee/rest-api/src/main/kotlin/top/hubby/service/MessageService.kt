package top.hubby.service

import org.springframework.jdbc.core.JdbcTemplate
import org.springframework.jdbc.core.query
import org.springframework.stereotype.Service
import top.hubby.model.Message
import top.hubby.repository.MessageRepository
import java.util.*

@Service
class MessageService(val db: JdbcTemplate, val repository: MessageRepository) : IMessageService {

    override var test: String = "abs"

    override fun save(message: Message) {
        val id = message.id ?: UUID.randomUUID().toString();
        db.update("insert into messages values ( ?, ? )", id, message.text)
    }

    // 是第二个参数
    override fun findMessages(): List<Message> = repository.findAll().toList()

    override fun findMessageById(id: String) = db.query("select * from messages where id = ?", id) { response, _ ->
        Message(response.getString("id"), response.getString("text"))
    }
}