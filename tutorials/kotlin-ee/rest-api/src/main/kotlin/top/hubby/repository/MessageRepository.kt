package top.hubby.repository

import org.springframework.data.repository.CrudRepository
import top.hubby.model.Message

interface MessageRepository : CrudRepository<Message, String> {}